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

import com.alex.alexadmin.model.SysRole;
import com.alex.alexadmin.service.SysRoleService;

/**
 *-------------------------------
 * 角色管理 (SysRoleController)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Api(value ="SysRoleController", tags={"角色管理"})
 @RestController
 @RequestMapping("/sysRole")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    /**
     * @description 保存/修改角色管理
     * @param record
     * @return
    */
    @ApiOperation(value = "保存角色管理")
    @PostMapping(value = "/save")
    @RequiresPermissions("sys:sysRole:save")
    public HttpResult save(@RequestBody SysRole record) {
        return HttpResult.ok(sysRoleService.save(record));
    }

    /**
     * @description 删除角色管理
     * @param records
     * @return
    */
    @ApiOperation(value = "删除角色管理")
    @PostMapping(value = "/delete")
    @RequiresPermissions("sys:sysRole:delete")
    public HttpResult delete(@RequestBody List<SysRole> records) {
        return HttpResult.ok(sysRoleService.delete(records));
    }

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    @ApiOperation(value = "通过id查询角色管理")
    @GetMapping(value = "/findById")
    @RequiresPermissions("sys:sysRole:view")
    public HttpResult findById(@RequestParam("id") Long id) {
        return HttpResult.ok(sysRoleService.findById(id));
    }

    /**
     *@description 基础分页查询
     *@param pageRequest
     *@return
    */
    @ApiOperation(value = "分页查询角色管理")
    @PostMapping(value = "/findPage")
    @RequiresPermissions("sys:sysRole:view")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysRoleService.findPage(pageRequest));
    }
}
