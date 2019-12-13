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

import com.alex.alexadmin.model.SysUserRole;
import com.alex.alexadmin.service.SysUserRoleService;

/**
 *-------------------------------
 * 用户角色 (SysUserRoleController)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Api(value ="SysUserRoleController", tags={"用户角色"})
 @RestController
 @RequestMapping("/sysUserRole")
public class SysUserRoleController {

    @Autowired
    private SysUserRoleService sysUserRoleService;

    /**
     * @description 保存/修改用户角色
     * @param record
     * @return
    */
    @ApiOperation(value = "保存用户角色")
    @PostMapping(value = "/save")
    @RequiresPermissions("sys:sysUserRole:save")
    public HttpResult save(@RequestBody SysUserRole record) {
        return HttpResult.ok(sysUserRoleService.save(record));
    }

    /**
     * @description 删除用户角色
     * @param records
     * @return
    */
    @ApiOperation(value = "删除用户角色")
    @PostMapping(value = "/delete")
    @RequiresPermissions("sys:sysUserRole:delete")
    public HttpResult delete(@RequestBody List<SysUserRole> records) {
        return HttpResult.ok(sysUserRoleService.delete(records));
    }

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    @ApiOperation(value = "通过id查询用户角色")
    @GetMapping(value = "/findById")
    @RequiresPermissions("sys:sysUserRole:view")
    public HttpResult findById(@RequestParam("id") Long id) {
        return HttpResult.ok(sysUserRoleService.findById(id));
    }

    /**
     *@description 基础分页查询
     *@param pageRequest
     *@return
    */
    @ApiOperation(value = "分页查询用户角色")
    @PostMapping(value = "/findPage")
    @RequiresPermissions("sys:sysUserRole:view")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysUserRoleService.findPage(pageRequest));
    }
}
