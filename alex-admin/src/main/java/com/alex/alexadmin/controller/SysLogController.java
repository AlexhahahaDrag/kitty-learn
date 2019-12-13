package com.alex.alexadmin.controller;

import java.util.List;

import io.swagger.annotations.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alex.alexcore.http.HttpResult;
import com.alex.alexcore.page.PageRequest;

import com.alex.alexadmin.model.SysLog;
import com.alex.alexadmin.service.SysLogService;

/**
 *-------------------------------
 * 系统日志 (SysLogController)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:19
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Api(value ="SysLogController", tags={"系统日志"})
 @RestController
 @RequestMapping("/sysLog")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    /**
     * @description 保存/修改系统日志
     * @param record
     * @return
    */
    @ApiOperation(value = "保存系统日志")
    @PostMapping(value = "/save")
    @RequiresPermissions("sys:sysLog:save")
    public HttpResult save(@RequestBody SysLog record) {
        return HttpResult.ok(sysLogService.save(record));
    }

    /**
     * @description 删除系统日志
     * @param records
     * @return
    */
    @ApiOperation(value = "删除系统日志")
    @PostMapping(value = "/delete")
    @RequiresPermissions("sys:sysLog:delete")
    public HttpResult delete(@RequestBody List<SysLog> records) {
        return HttpResult.ok(sysLogService.delete(records));
    }

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    @ApiOperation(value = "通过id查询系统日志")
    @GetMapping(value = "/findById")
    @RequiresPermissions("sys:sysLog:view")
    public HttpResult findById(@RequestParam("id") Long id) {
        return HttpResult.ok(sysLogService.findById(id));
    }

    /**
     *@description 基础分页查询
     *@param pageRequest
     *@return
    */
    @ApiOperation(value = "分页查询系统日志")
    @PostMapping(value = "/findPage")
    @RequiresPermissions("sys:sysLog:view")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysLogService.findPage(pageRequest));
    }
}
