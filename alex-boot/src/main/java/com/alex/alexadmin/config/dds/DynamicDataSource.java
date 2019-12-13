package com.alex.alexadmin.config.dds;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.Map;

/**
 * Description: 动态数据源实现类
 * Author:     alex
 * CreateDate: 2019/12/12 18:51
 * Version:    1.0
 *
*/
public class DynamicDataSource extends AbstractRoutingDataSource {

    /**
     * Description:
     * 如果不希望数据源在启动配置的时候就加载好，可以定制这个方法，从任何你希望的地方读取并返回数据源
     * 比如数据库、文件、外部接口等读取数据源信息，并返回DataSource对象
     * Author:      alex
     * CreateDate:  2019/12/12 18:52
     * @param
     * @return
    */
    @Override
    protected DataSource determineTargetDataSource() {
        return super.determineTargetDataSource();
    }

    /**
     * 如果希望所有数据源在启动配置时就加载好，这里通过设置数据源Key值来切换数据，定制这个方法
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceKey();
    }

    /**
     * 设置默认数据源
     * @param defaultDataSource
     */
    public void setDefaultDataSource(Object defaultDataSource) {
        super.setDefaultTargetDataSource(defaultDataSource);
    }

    /**
     * 设置数据源
     * @param dataSources
     */
    public void setDataSources(Map<Object, Object> dataSources) {
        super.setTargetDataSources(dataSources);
        // 将数据源的 key 放到数据源上下文的 key 集合中，用于切换时判断数据源是否有效
        DynamicDataSourceContextHolder.addDataSourceKeys(dataSources.keySet());
    }
}
