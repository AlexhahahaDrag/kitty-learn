package com.alex.alexadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.alexcore.page.MybatisPageHelper;
import com.alex.alexcore.page.PageRequest;
import com.alex.alexcore.page.PageResult;

import com.alex.alexadmin.model.SysRoleMenu;
import com.alex.alexadmin.dao.SysRoleMenuMapper;
import com.alex.alexadmin.service.SysRoleMenuService;

/**
 *-------------------------------
 * 角色菜单 (SysRoleMenuServiceImpl)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Service
public class SysRoleMenuServiceImpl implements SysRoleMenuService {

    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;

    @Override
    public int save(SysRoleMenu record) {
        if (record.getId() == null || record.getId() == 0)
            return sysRoleMenuMapper.add(record);
        return sysRoleMenuMapper.update(record);
    }

    @Override
    public int delete(SysRoleMenu record) {
        return sysRoleMenuMapper.delete(record.getId());
    }

    @Override
    public int delete(List<SysRoleMenu> records) {
        for(SysRoleMenu sysRoleMenu : records)
            delete(sysRoleMenu);
        return 1;
    }

    @Override
    public SysRoleMenu findById(Long id) {
        return sysRoleMenuMapper.findById(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysRoleMenuMapper);
    }
}
