package com.alex.alexadmin.dao;

import java.util.List;

import com.alex.alexadmin.model.SysLog;

/**
 *-------------------------------
 * 系统日志 (SysLogMapper)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:19
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
public interface SysLogMapper {

    /**
     * @description 添加系统日志
     * @param record
     * @return
    */
    int add(SysLog record);

    /**
     * @description 删除系统日志
     * @param id
     * @return
    */
    int delete(Long id);

    /**
     * @description 修改系统日志
     * @param record
     * @return
    */
    int update(SysLog record);

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    SysLog findById(Long id);

    /**
     *@description 基础分页查询
     *@return
    */
    List<SysLog> findPage();
}
