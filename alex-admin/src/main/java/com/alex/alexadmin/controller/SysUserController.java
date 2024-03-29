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

import com.alex.alexadmin.model.SysUser;
import com.alex.alexadmin.service.SysUserService;

/**
 *-------------------------------
 * 用户管理 (SysUserController)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Api(value ="SysUserController", tags={"用户管理"})
 @RestController
 @RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * @description 保存/修改用户管理
     * @param record
     * @return
    */
    @ApiOperation(value = "保存用户管理")
    @PostMapping(value = "/save")
    @RequiresPermissions("sys:sysUser:save")
    public HttpResult save(@RequestBody SysUser record) {
        return HttpResult.ok(sysUserService.save(record));
    }

    /**
     * @description 删除用户管理
     * @param records
     * @return
    */
    @ApiOperation(value = "删除用户管理")
    @PostMapping(value = "/delete")
    @RequiresPermissions("sys:sysUser:delete")
    public HttpResult delete(@RequestBody List<SysUser> records) {
        return HttpResult.ok(sysUserService.delete(records));
    }

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    @ApiOperation(value = "通过id查询用户管理")
    @GetMapping(value = "/findById")
    @RequiresPermissions("sys:sysUser:view")
    public HttpResult findById(@RequestParam("id") Long id) {
        return HttpResult.ok(sysUserService.findById(id));
    }

    /**
     *@description 基础分页查询
     *@param pageRequest
     *@return
    */
    @ApiOperation(value = "分页查询用户管理")
    @PostMapping(value = "/findPage")
    @RequiresPermissions("sys:sysUser:view")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysUserService.findPage(pageRequest));
    }
}
