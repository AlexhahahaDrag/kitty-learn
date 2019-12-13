package com.alex.alexadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.alexcore.page.MybatisPageHelper;
import com.alex.alexcore.page.PageRequest;
import com.alex.alexcore.page.PageResult;

import com.alex.alexadmin.model.SysDept;
import com.alex.alexadmin.dao.SysDeptMapper;
import com.alex.alexadmin.service.SysDeptService;

/**
 *-------------------------------
 * 机构管理 (SysDeptServiceImpl)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:19
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Service
public class SysDeptServiceImpl implements SysDeptService {

    @Autowired
    private SysDeptMapper sysDeptMapper;

    @Override
    public int save(SysDept record) {
        if (record.getId() == null || record.getId() == 0)
            return sysDeptMapper.add(record);
        return sysDeptMapper.update(record);
    }

    @Override
    public int delete(SysDept record) {
        return sysDeptMapper.delete(record.getId());
    }

    @Override
    public int delete(List<SysDept> records) {
        for(SysDept sysDept : records)
            delete(sysDept);
        return 1;
    }

    @Override
    public SysDept findById(Long id) {
        return sysDeptMapper.findById(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysDeptMapper);
    }
}
