package com.alex.alexadmin.config.dds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Description: 动态数据源上下文
 * Author:     alex
 * CreateDate: 2019/12/12 19:00
 * Version:    1.0
 *
*/
public class DynamicDataSourceContextHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>() {
        /**
         * Description: master数据源的key作为默认数据源的key
         * Author:      alex
         * CreateDate:  2019/12/12 19:03
         * @param
         * @return
        */
        @Override
        protected String initialValue() {
            return "master";
        }
    };

    /**
     * Description: 数据源的key集合，用于切换判断数据源是否存在
     * Author:      alex
     * CreateDate:  2019/12/12 19:05
     * @param
     * @return
    */
    public static List<Object> dataSourceKeys = new ArrayList<>();

    /**
     * Description: 切换数据源
     * Author:      alex
     * CreateDate:  2019/12/12 19:06
     * @param
     * @return
    */
    public static void setDataSourceKey(String key) {
        contextHolder.set(key);
    }

    /**
     * Description: 获取数据源
     * Author:      alex
     * CreateDate:  2019/12/12 19:07
     * @param
     * @return
    */
    public static String getDataSourceKey() {
        return contextHolder.get();
    }

    /**
     * Description: 重置数据源
     * Author:      alex
     * CreateDate:  2019/12/12 19:08
     * @param
     * @return
    */
    public static void clearDataSourceKey() {
        contextHolder.remove();
    }

    /**
     * Description: 判断是否包含数据源
     * Author:      alex
     * CreateDate:  2019/12/12 19:30
     * @param
     * @return
    */
    public static boolean containDataSource(String key){
        return dataSourceKeys.contains(key);
    }

    /**
     * Description: 添加数据源keys
     * Author:      alex
     * CreateDate:  2019/12/12 19:09
     * @param
     * @return
    */
    public static boolean addDataSourceKeys(Collection<? extends Object> keys) {
        return dataSourceKeys.addAll(keys);
    }
}
