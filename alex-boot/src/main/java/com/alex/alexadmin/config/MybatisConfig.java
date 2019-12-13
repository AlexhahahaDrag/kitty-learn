package com.alex.alexadmin.config;

import com.alex.alexadmin.config.dds.DynamicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Description: mybatis configuration class
 * Author:     alex
 * CreateDate: 2019/12/10 19:11
 * Version:    1.0
 *
*/
@Configuration
@MapperScan("com.alex.**.dao")
public class MybatisConfig {

    @Autowired
    private DruidConfig druidConfig;

    @Bean("master")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.master.druid")
    public DataSource master() {
        return DataSourceBuilder.create().build();
    }

    @Bean("slave")
    @ConfigurationProperties(prefix = "spring.datasource.slave.druid")
    public DataSource slave() {
        return DataSourceBuilder.create().build();
    }

    @Bean("DynamicDataSource")
    public DataSource dynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map<Object, Object> dataSourceMap = new HashMap<>(2);
        dataSourceMap.put("master", master());
        dataSourceMap.put("slave", slave());
        //将master作为默认数据源
        dynamicDataSource.setDefaultDataSource(master());
        dynamicDataSource.setDataSources(dataSourceMap);
        return dynamicDataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        //配置数据源,此处配置为关键配置，如果没有将 dynamicDataSource作为数据源则不能实现切换
        sessionFactoryBean.setDataSource(dynamicDataSource());
        sessionFactoryBean.setTypeAliasesPackage("com.alex.**.model");//扫描model
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:**/sqlmap/*.xml"));//扫描mapper
        return sessionFactoryBean;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dynamicDataSource());
    }
}
