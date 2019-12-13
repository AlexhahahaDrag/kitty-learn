package com.alex.alexadmin.dao;

import java.util.List;

import com.alex.alexadmin.model.SysMenu;

/**
 *-------------------------------
 * 菜单管理 (SysMenuMapper)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
public interface SysMenuMapper {

    /**
     * @description 添加菜单管理
     * @param record
     * @return
    */
    int add(SysMenu record);

    /**
     * @description 删除菜单管理
     * @param id
     * @return
    */
    int delete(Long id);

    /**
     * @description 修改菜单管理
     * @param record
     * @return
    */
    int update(SysMenu record);

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    SysMenu findById(Long id);

    /**
     *@description 基础分页查询
     *@return
    */
    List<SysMenu> findPage();
}
