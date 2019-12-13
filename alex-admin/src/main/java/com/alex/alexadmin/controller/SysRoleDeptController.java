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

import com.alex.alexadmin.model.SysRoleDept;
import com.alex.alexadmin.service.SysRoleDeptService;

/**
 *-------------------------------
 * 角色机构 (SysRoleDeptController)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Api(value ="SysRoleDeptController", tags={"角色机构"})
 @RestController
 @RequestMapping("/sysRoleDept")
public class SysRoleDeptController {

    @Autowired
    private SysRoleDeptService sysRoleDeptService;

    /**
     * @description 保存/修改角色机构
     * @param record
     * @return
    */
    @ApiOperation(value = "保存角色机构")
    @PostMapping(value = "/save")
    @RequiresPermissions("sys:sysRoleDept:save")
    public HttpResult save(@RequestBody SysRoleDept record) {
        return HttpResult.ok(sysRoleDeptService.save(record));
    }

    /**
     * @description 删除角色机构
     * @param records
     * @return
    */
    @ApiOperation(value = "删除角色机构")
    @PostMapping(value = "/delete")
    @RequiresPermissions("sys:sysRoleDept:delete")
    public HttpResult delete(@RequestBody List<SysRoleDept> records) {
        return HttpResult.ok(sysRoleDeptService.delete(records));
    }

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    @ApiOperation(value = "通过id查询角色机构")
    @GetMapping(value = "/findById")
    @RequiresPermissions("sys:sysRoleDept:view")
    public HttpResult findById(@RequestParam("id") Long id) {
        return HttpResult.ok(sysRoleDeptService.findById(id));
    }

    /**
     *@description 基础分页查询
     *@param pageRequest
     *@return
    */
    @ApiOperation(value = "分页查询角色机构")
    @PostMapping(value = "/findPage")
    @RequiresPermissions("sys:sysRoleDept:view")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysRoleDeptService.findPage(pageRequest));
    }
}
