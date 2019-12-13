package com.alex.alexadmin.dao;

import java.util.List;

import com.alex.alexadmin.model.SysDict;

/**
 *-------------------------------
 * 字典表 (SysDictMapper)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:19
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
public interface SysDictMapper {

    /**
     * @description 添加字典表
     * @param record
     * @return
    */
    int add(SysDict record);

    /**
     * @description 删除字典表
     * @param id
     * @return
    */
    int delete(Long id);

    /**
     * @description 修改字典表
     * @param record
     * @return
    */
    int update(SysDict record);

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    SysDict findById(Long id);

    /**
     *@description 基础分页查询
     *@return
    */
    List<SysDict> findPage();
}
