package com.alex.alexadmin.dao;

import java.util.List;

import com.alex.alexadmin.model.SysUserRole;

/**
 *-------------------------------
 * 用户角色 (SysUserRoleMapper)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
public interface SysUserRoleMapper {

    /**
     * @description 添加用户角色
     * @param record
     * @return
    */
    int add(SysUserRole record);

    /**
     * @description 删除用户角色
     * @param id
     * @return
    */
    int delete(Long id);

    /**
     * @description 修改用户角色
     * @param record
     * @return
    */
    int update(SysUserRole record);

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    SysUserRole findById(Long id);

    /**
     *@description 基础分页查询
     *@return
    */
    List<SysUserRole> findPage();
}
