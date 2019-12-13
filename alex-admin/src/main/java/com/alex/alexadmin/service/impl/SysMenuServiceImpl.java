package com.alex.alexadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.alexcore.page.MybatisPageHelper;
import com.alex.alexcore.page.PageRequest;
import com.alex.alexcore.page.PageResult;

import com.alex.alexadmin.model.SysMenu;
import com.alex.alexadmin.dao.SysMenuMapper;
import com.alex.alexadmin.service.SysMenuService;

/**
 *-------------------------------
 * 菜单管理 (SysMenuServiceImpl)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Override
    public int save(SysMenu record) {
        if (record.getId() == null || record.getId() == 0)
            return sysMenuMapper.add(record);
        return sysMenuMapper.update(record);
    }

    @Override
    public int delete(SysMenu record) {
        return sysMenuMapper.delete(record.getId());
    }

    @Override
    public int delete(List<SysMenu> records) {
        for(SysMenu sysMenu : records)
            delete(sysMenu);
        return 1;
    }

    @Override
    public SysMenu findById(Long id) {
        return sysMenuMapper.findById(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysMenuMapper);
    }
}
