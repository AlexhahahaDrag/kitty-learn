package com.alex.alexcore.dds;

import java.lang.annotation.*;

/**
 * Description: 动态数据源注解
 * Author:     alex
 * CreateDate: 2019/12/12 19:14
 * Version:    1.0
 *
*/
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

    /**
     * Description: 数据源key值
     * Author:      alex
     * CreateDate:  2019/12/12 19:15
     * @param
     * @return
    */
    String value();
}
