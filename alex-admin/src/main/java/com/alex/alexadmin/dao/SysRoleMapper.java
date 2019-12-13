package com.alex.alexadmin.dao;

import java.util.List;

import com.alex.alexadmin.model.SysRole;

/**
 *-------------------------------
 * 角色管理 (SysRoleMapper)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
public interface SysRoleMapper {

    /**
     * @description 添加角色管理
     * @param record
     * @return
    */
    int add(SysRole record);

    /**
     * @description 删除角色管理
     * @param id
     * @return
    */
    int delete(Long id);

    /**
     * @description 修改角色管理
     * @param record
     * @return
    */
    int update(SysRole record);

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    SysRole findById(Long id);

    /**
     *@description 基础分页查询
     *@return
    */
    List<SysRole> findPage();
}
