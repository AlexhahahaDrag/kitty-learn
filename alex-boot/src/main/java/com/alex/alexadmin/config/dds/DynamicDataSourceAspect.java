package com.alex.alexadmin.config.dds;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Description: 动态数据源切换处理器
 * Author:     alex
 * CreateDate: 2019/12/12 19:16
 * Version:    1.0
 *
*/
@Aspect
@Order(-1)
@Component
public class DynamicDataSourceAspect {

    /**
     * Description: 切换数据源
     * Author:      alex
     * CreateDate:  2019/12/12 19:18
     * @param
     * @return
    */
    @Before("@annotation(dataSource)")
    public void switchDataSource(JoinPoint point, DataSource dataSource) {
        if (!DynamicDataSourceContextHolder.containDataSource(dataSource.value()))
            System.out.println("DataSource[{}] doesn't exist, use default DataSource[{}]" + dataSource.value());
        else {
            //切换数据源
            DynamicDataSourceContextHolder.setDataSourceKey(dataSource.value());
            System.out.println("Switch DataSource to [" + DynamicDataSourceContextHolder.getDataSourceKey()
                    + "] in Method [" + point.getSignature() + "]");
        }
    }

    /**
     * Description: 重置数据源
     * Author:      alex
     * CreateDate:  2019/12/12 19:34
     * @param
     * @return
    */
    @After("@annotation(dataSource)")
    public void restoreDataSource(JoinPoint point, DataSource dataSource) {
        DynamicDataSourceContextHolder.clearDataSourceKey();
        System.out.println("Restore DataSource to [" + DynamicDataSourceContextHolder.getDataSourceKey()
                + "] in Method [" + point.getSignature() + "]");
    }
}
