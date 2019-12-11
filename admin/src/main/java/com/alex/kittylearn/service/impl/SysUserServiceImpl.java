package com.alex.kittylearn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.core.page.MybatisPageHelper;
import com.alex.core.page.PageRequest;
import com.alex.core.page.PageResult;

import com.alex.kittylearn.model.SysUser;
import com.alex.kittylearn.dao.SysUserMapper;
import com.alex.kittylearn.service.SysUserService;

/**
 *-------------------------------
 * 用户管理 (SysUserServiceImpl)
 *------------------------
 * author: alex
 * createDate: 2019-12-11 14:00:38
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int saveOrUpdate(SysUser record) {
        if (record.getId() == null || record.getId() == 0)
            return sysUserMapper.add(record);
        return sysUserMapper.update(record);
    }

    @Override
    public int delete(SysUser record) {
        return sysUserMapper.delete(record.getId());
    }

    @Override
    public int delete(List<SysUser> records) {
        for(SysUser sysUser : records)
            delete(sysUser);
        return 1;
    }

    @Override
    public SysUser findById(Long id) {
        return sysUserMapper.findById(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysUserMapper);
    }
}
