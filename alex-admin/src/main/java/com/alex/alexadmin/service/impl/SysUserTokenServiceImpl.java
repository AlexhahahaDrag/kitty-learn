package com.alex.alexadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.alexcore.page.MybatisPageHelper;
import com.alex.alexcore.page.PageRequest;
import com.alex.alexcore.page.PageResult;

import com.alex.alexadmin.model.SysUserToken;
import com.alex.alexadmin.dao.SysUserTokenMapper;
import com.alex.alexadmin.service.SysUserTokenService;

/**
 *-------------------------------
 * 用户Token (SysUserTokenServiceImpl)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Service
public class SysUserTokenServiceImpl implements SysUserTokenService {

    @Autowired
    private SysUserTokenMapper sysUserTokenMapper;

    @Override
    public int save(SysUserToken record) {
        if (record.getId() == null || record.getId() == 0)
            return sysUserTokenMapper.add(record);
        return sysUserTokenMapper.update(record);
    }

    @Override
    public int delete(SysUserToken record) {
        return sysUserTokenMapper.delete(record.getId());
    }

    @Override
    public int delete(List<SysUserToken> records) {
        for(SysUserToken sysUserToken : records)
            delete(sysUserToken);
        return 1;
    }

    @Override
    public SysUserToken findById(Long id) {
        return sysUserTokenMapper.findById(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysUserTokenMapper);
    }
}
