package com.alex.alexadmin.dao;

import java.util.List;

import com.alex.alexadmin.model.SysRoleMenu;

/**
 *-------------------------------
 * 角色菜单 (SysRoleMenuMapper)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
public interface SysRoleMenuMapper {

    /**
     * @description 添加角色菜单
     * @param record
     * @return
    */
    int add(SysRoleMenu record);

    /**
     * @description 删除角色菜单
     * @param id
     * @return
    */
    int delete(Long id);

    /**
     * @description 修改角色菜单
     * @param record
     * @return
    */
    int update(SysRoleMenu record);

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    SysRoleMenu findById(Long id);

    /**
     *@description 基础分页查询
     *@return
    */
    List<SysRoleMenu> findPage();
}
