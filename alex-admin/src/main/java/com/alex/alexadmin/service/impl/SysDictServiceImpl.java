package com.alex.alexadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.alexcore.page.MybatisPageHelper;
import com.alex.alexcore.page.PageRequest;
import com.alex.alexcore.page.PageResult;

import com.alex.alexadmin.model.SysDict;
import com.alex.alexadmin.dao.SysDictMapper;
import com.alex.alexadmin.service.SysDictService;

/**
 *-------------------------------
 * 字典表 (SysDictServiceImpl)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:19
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Service
public class SysDictServiceImpl implements SysDictService {

    @Autowired
    private SysDictMapper sysDictMapper;

    @Override
    public int save(SysDict record) {
        if (record.getId() == null || record.getId() == 0)
            return sysDictMapper.add(record);
        return sysDictMapper.update(record);
    }

    @Override
    public int delete(SysDict record) {
        return sysDictMapper.delete(record.getId());
    }

    @Override
    public int delete(List<SysDict> records) {
        for(SysDict sysDict : records)
            delete(sysDict);
        return 1;
    }

    @Override
    public SysDict findById(Long id) {
        return sysDictMapper.findById(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysDictMapper);
    }
}
