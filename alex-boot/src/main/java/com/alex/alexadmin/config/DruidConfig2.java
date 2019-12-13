package com.alex.alexadmin.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.sql.DataSource;

/**
 * Description: druid config配置类
 * http://localhost:30041/druid/login.html
 * Author:     alex
 * CreateDate: 2019/12/12 16:54
 * Version:    1.0
 *
*/
@Configuration
@EnableConfigurationProperties({DruidDataSourceProperties2.class})
public class DruidConfig2 {

    @Autowired
    private DruidDataSourceProperties2 properties;

    @Bean
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(properties.getDriverClassName());
        druidDataSource.setUrl(properties.getJdbcUrl());
        druidDataSource.setUsername(properties.getUsername());
        druidDataSource.setPassword(properties.getPassword());
        druidDataSource.setInitialSize(properties.getInitialSize());
        druidDataSource.setMinIdle(properties.getMinIdle());
        druidDataSource.setMaxActive(properties.getMaxActive());
        druidDataSource.setMaxWait(properties.getMaxWait());
        druidDataSource.setTimeBetweenEvictionRunsMillis(properties.getTimeBetweenEvictionRunsMillis());
        druidDataSource.setMinEvictableIdleTimeMillis(properties.getMinEvictableIdleTimeMillis());
        druidDataSource.setValidationQuery(properties.getValidationQuery());
        druidDataSource.setTestWhileIdle(properties.isTestWhileIdle());
        druidDataSource.setTestOnBorrow(properties.isTestOnBorrow());
        druidDataSource.setTestOnReturn(properties.isTestOnReturn());
        druidDataSource.setPoolPreparedStatements(properties.isPoolPreparedStatements());
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(properties.getMaxPoolPreparedStatementPerConnectionSize());
        try {
            druidDataSource.setFilters(properties.getFilters());
            druidDataSource.init();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return druidDataSource;
    }

    /**
     * Description: 注册servlet信息，配置监控视图
     * Author:      alex
     * CreateDate:  2019/12/12 17:07
    */
    @Bean
    @ConditionalOnMissingBean
    public ServletRegistrationBean<Servlet> druidServlet() {
        ServletRegistrationBean<Servlet> servletServletRegistrationBean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");

        //白名单
        servletServletRegistrationBean.addInitParameter("allow", "192.168.1.195");
        //ip 黑名单 共存时deny大于allow
        servletServletRegistrationBean.addInitParameter("deny", "192.168.1.119");
        //登录时查看信息的账号和密码，用于登录druid监控后台
        servletServletRegistrationBean.addInitParameter("loginUsername", "admin");
        servletServletRegistrationBean.addInitParameter("loginPassword", "admin");
        //是否能够重置数据
        servletServletRegistrationBean.addInitParameter("resetEnable", "true");
        return servletServletRegistrationBean;
    }

    /**
     * Description: 注册filter信息，监控器拦截器
     * Author:      alex
     * CreateDate:  2019/12/12 17:13
    */
    @Bean
    @ConditionalOnMissingBean
    public FilterRegistrationBean<Filter> filterRegistrationBean() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        //忽略资源
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gig,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
