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

import com.alex.alexadmin.model.SysMenu;
import com.alex.alexadmin.service.SysMenuService;

/**
 *-------------------------------
 * 菜单管理 (SysMenuController)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Api(value ="SysMenuController", tags={"菜单管理"})
 @RestController
 @RequestMapping("/sysMenu")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    /**
     * @description 保存/修改菜单管理
     * @param record
     * @return
    */
    @ApiOperation(value = "保存菜单管理")
    @PostMapping(value = "/save")
    @RequiresPermissions("sys:sysMenu:save")
    public HttpResult save(@RequestBody SysMenu record) {
        return HttpResult.ok(sysMenuService.save(record));
    }

    /**
     * @description 删除菜单管理
     * @param records
     * @return
    */
    @ApiOperation(value = "删除菜单管理")
    @PostMapping(value = "/delete")
    @RequiresPermissions("sys:sysMenu:delete")
    public HttpResult delete(@RequestBody List<SysMenu> records) {
        return HttpResult.ok(sysMenuService.delete(records));
    }

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    @ApiOperation(value = "通过id查询菜单管理")
    @GetMapping(value = "/findById")
    @RequiresPermissions("sys:sysMenu:view")
    public HttpResult findById(@RequestParam("id") Long id) {
        return HttpResult.ok(sysMenuService.findById(id));
    }

    /**
     *@description 基础分页查询
     *@param pageRequest
     *@return
    */
    @ApiOperation(value = "分页查询菜单管理")
    @PostMapping(value = "/findPage")
    @RequiresPermissions("sys:sysMenu:view")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysMenuService.findPage(pageRequest));
    }
}
