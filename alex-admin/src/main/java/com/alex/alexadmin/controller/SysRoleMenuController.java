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

import com.alex.alexadmin.model.SysRoleMenu;
import com.alex.alexadmin.service.SysRoleMenuService;

/**
 *-------------------------------
 * 角色菜单 (SysRoleMenuController)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Api(value ="SysRoleMenuController", tags={"角色菜单"})
 @RestController
 @RequestMapping("/sysRoleMenu")
public class SysRoleMenuController {

    @Autowired
    private SysRoleMenuService sysRoleMenuService;

    /**
     * @description 保存/修改角色菜单
     * @param record
     * @return
    */
    @ApiOperation(value = "保存角色菜单")
    @PostMapping(value = "/save")
    @RequiresPermissions("sys:sysRoleMenu:save")
    public HttpResult save(@RequestBody SysRoleMenu record) {
        return HttpResult.ok(sysRoleMenuService.save(record));
    }

    /**
     * @description 删除角色菜单
     * @param records
     * @return
    */
    @ApiOperation(value = "删除角色菜单")
    @PostMapping(value = "/delete")
    @RequiresPermissions("sys:sysRoleMenu:delete")
    public HttpResult delete(@RequestBody List<SysRoleMenu> records) {
        return HttpResult.ok(sysRoleMenuService.delete(records));
    }

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    @ApiOperation(value = "通过id查询角色菜单")
    @GetMapping(value = "/findById")
    @RequiresPermissions("sys:sysRoleMenu:view")
    public HttpResult findById(@RequestParam("id") Long id) {
        return HttpResult.ok(sysRoleMenuService.findById(id));
    }

    /**
     *@description 基础分页查询
     *@param pageRequest
     *@return
    */
    @ApiOperation(value = "分页查询角色菜单")
    @PostMapping(value = "/findPage")
    @RequiresPermissions("sys:sysRoleMenu:view")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysRoleMenuService.findPage(pageRequest));
    }
}
