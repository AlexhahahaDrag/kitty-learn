package com.alex.alexadmin.dao;

import java.util.List;

import com.alex.alexadmin.model.SysRoleDept;

/**
 *-------------------------------
 * 角色机构 (SysRoleDeptMapper)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
public interface SysRoleDeptMapper {

    /**
     * @description 添加角色机构
     * @param record
     * @return
    */
    int add(SysRoleDept record);

    /**
     * @description 删除角色机构
     * @param id
     * @return
    */
    int delete(Long id);

    /**
     * @description 修改角色机构
     * @param record
     * @return
    */
    int update(SysRoleDept record);

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    SysRoleDept findById(Long id);

    /**
     *@description 基础分页查询
     *@return
    */
    List<SysRoleDept> findPage();
}
