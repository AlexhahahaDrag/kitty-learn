package com.alex.alexadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.alexcore.page.MybatisPageHelper;
import com.alex.alexcore.page.PageRequest;
import com.alex.alexcore.page.PageResult;

import com.alex.alexadmin.model.SysUserRole;
import com.alex.alexadmin.dao.SysUserRoleMapper;
import com.alex.alexadmin.service.SysUserRoleService;

/**
 *-------------------------------
 * 用户角色 (SysUserRoleServiceImpl)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Service
public class SysUserRoleServiceImpl implements SysUserRoleService {

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public int save(SysUserRole record) {
        if (record.getId() == null || record.getId() == 0)
            return sysUserRoleMapper.add(record);
        return sysUserRoleMapper.update(record);
    }

    @Override
    public int delete(SysUserRole record) {
        return sysUserRoleMapper.delete(record.getId());
    }

    @Override
    public int delete(List<SysUserRole> records) {
        for(SysUserRole sysUserRole : records)
            delete(sysUserRole);
        return 1;
    }

    @Override
    public SysUserRole findById(Long id) {
        return sysUserRoleMapper.findById(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysUserRoleMapper);
    }
}
