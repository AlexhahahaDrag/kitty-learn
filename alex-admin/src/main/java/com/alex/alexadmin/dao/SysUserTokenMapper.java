package com.alex.alexadmin.dao;

import java.util.List;

import com.alex.alexadmin.model.SysUserToken;

/**
 *-------------------------------
 * 用户Token (SysUserTokenMapper)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
public interface SysUserTokenMapper {

    /**
     * @description 添加用户Token
     * @param record
     * @return
    */
    int add(SysUserToken record);

    /**
     * @description 删除用户Token
     * @param id
     * @return
    */
    int delete(Long id);

    /**
     * @description 修改用户Token
     * @param record
     * @return
    */
    int update(SysUserToken record);

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    SysUserToken findById(Long id);

    /**
     *@description 基础分页查询
     *@return
    */
    List<SysUserToken> findPage();
}
