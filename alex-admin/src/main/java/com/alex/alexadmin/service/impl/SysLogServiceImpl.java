package com.alex.alexadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.alexcore.page.MybatisPageHelper;
import com.alex.alexcore.page.PageRequest;
import com.alex.alexcore.page.PageResult;

import com.alex.alexadmin.model.SysLog;
import com.alex.alexadmin.dao.SysLogMapper;
import com.alex.alexadmin.service.SysLogService;

/**
 *-------------------------------
 * 系统日志 (SysLogServiceImpl)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:19
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public int save(SysLog record) {
        if (record.getId() == null || record.getId() == 0)
            return sysLogMapper.add(record);
        return sysLogMapper.update(record);
    }

    @Override
    public int delete(SysLog record) {
        return sysLogMapper.delete(record.getId());
    }

    @Override
    public int delete(List<SysLog> records) {
        for(SysLog sysLog : records)
            delete(sysLog);
        return 1;
    }

    @Override
    public SysLog findById(Long id) {
        return sysLogMapper.findById(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysLogMapper);
    }
}
