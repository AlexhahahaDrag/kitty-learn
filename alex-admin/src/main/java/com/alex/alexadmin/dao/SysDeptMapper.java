package com.alex.alexadmin.dao;

import java.util.List;

import com.alex.alexadmin.model.SysDept;

/**
 *-------------------------------
 * 机构管理 (SysDeptMapper)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:19
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
public interface SysDeptMapper {

    /**
     * @description 添加机构管理
     * @param record
     * @return
    */
    int add(SysDept record);

    /**
     * @description 删除机构管理
     * @param id
     * @return
    */
    int delete(Long id);

    /**
     * @description 修改机构管理
     * @param record
     * @return
    */
    int update(SysDept record);

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    SysDept findById(Long id);

    /**
     *@description 基础分页查询
     *@return
    */
    List<SysDept> findPage();
}
