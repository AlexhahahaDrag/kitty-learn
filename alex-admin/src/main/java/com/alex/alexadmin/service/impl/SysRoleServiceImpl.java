package com.alex.alexadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.alexcore.page.MybatisPageHelper;
import com.alex.alexcore.page.PageRequest;
import com.alex.alexcore.page.PageResult;

import com.alex.alexadmin.model.SysRole;
import com.alex.alexadmin.dao.SysRoleMapper;
import com.alex.alexadmin.service.SysRoleService;

/**
 *-------------------------------
 * 角色管理 (SysRoleServiceImpl)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public int save(SysRole record) {
        if (record.getId() == null || record.getId() == 0)
            return sysRoleMapper.add(record);
        return sysRoleMapper.update(record);
    }

    @Override
    public int delete(SysRole record) {
        return sysRoleMapper.delete(record.getId());
    }

    @Override
    public int delete(List<SysRole> records) {
        for(SysRole sysRole : records)
            delete(sysRole);
        return 1;
    }

    @Override
    public SysRole findById(Long id) {
        return sysRoleMapper.findById(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysRoleMapper);
    }
}
