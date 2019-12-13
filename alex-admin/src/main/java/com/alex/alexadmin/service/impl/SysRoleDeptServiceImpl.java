package com.alex.alexadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.alexcore.page.MybatisPageHelper;
import com.alex.alexcore.page.PageRequest;
import com.alex.alexcore.page.PageResult;

import com.alex.alexadmin.model.SysRoleDept;
import com.alex.alexadmin.dao.SysRoleDeptMapper;
import com.alex.alexadmin.service.SysRoleDeptService;

/**
 *-------------------------------
 * 角色机构 (SysRoleDeptServiceImpl)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Service
public class SysRoleDeptServiceImpl implements SysRoleDeptService {

    @Autowired
    private SysRoleDeptMapper sysRoleDeptMapper;

    @Override
    public int save(SysRoleDept record) {
        if (record.getId() == null || record.getId() == 0)
            return sysRoleDeptMapper.add(record);
        return sysRoleDeptMapper.update(record);
    }

    @Override
    public int delete(SysRoleDept record) {
        return sysRoleDeptMapper.delete(record.getId());
    }

    @Override
    public int delete(List<SysRoleDept> records) {
        for(SysRoleDept sysRoleDept : records)
            delete(sysRoleDept);
        return 1;
    }

    @Override
    public SysRoleDept findById(Long id) {
        return sysRoleDeptMapper.findById(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysRoleDeptMapper);
    }
}
