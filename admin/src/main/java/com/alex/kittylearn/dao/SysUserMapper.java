package com.alex.kittylearn.dao;

import java.util.List;

import com.alex.core.page.PageRequest;
import com.alex.kittylearn.model.SysUser;

/**
 *-------------------------------
 * 用户管理 (SysUserMapper)
 *------------------------
 * author: alex
 * createDate: 2019-12-11 14:00:38
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
public interface SysUserMapper {

    /**
     * @description 添加用户管理
     * @param record
     * @return
    */
    int add(SysUser record);

    /**
     * @description 删除用户管理
     * @param id
     * @return
    */
    int delete(Long id);

    /**
     * @description 修改用户管理
     * @param record
     * @return
    */
    int update(SysUser record);

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    SysUser findById(Long id);

    /**
     *@description 基础分页查询
     *@param pageRequest
     *@return
    */
    List<SysUser> findPage(PageRequest pageRequest);
}
