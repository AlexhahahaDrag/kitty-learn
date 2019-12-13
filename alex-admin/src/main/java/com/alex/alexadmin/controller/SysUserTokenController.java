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

import com.alex.alexadmin.model.SysUserToken;
import com.alex.alexadmin.service.SysUserTokenService;

/**
 *-------------------------------
 * 用户Token (SysUserTokenController)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:20
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Api(value ="SysUserTokenController", tags={"用户Token"})
 @RestController
 @RequestMapping("/sysUserToken")
public class SysUserTokenController {

    @Autowired
    private SysUserTokenService sysUserTokenService;

    /**
     * @description 保存/修改用户Token
     * @param record
     * @return
    */
    @ApiOperation(value = "保存用户Token")
    @PostMapping(value = "/save")
    @RequiresPermissions("sys:sysUserToken:save")
    public HttpResult save(@RequestBody SysUserToken record) {
        return HttpResult.ok(sysUserTokenService.save(record));
    }

    /**
     * @description 删除用户Token
     * @param records
     * @return
    */
    @ApiOperation(value = "删除用户Token")
    @PostMapping(value = "/delete")
    @RequiresPermissions("sys:sysUserToken:delete")
    public HttpResult delete(@RequestBody List<SysUserToken> records) {
        return HttpResult.ok(sysUserTokenService.delete(records));
    }

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    @ApiOperation(value = "通过id查询用户Token")
    @GetMapping(value = "/findById")
    @RequiresPermissions("sys:sysUserToken:view")
    public HttpResult findById(@RequestParam("id") Long id) {
        return HttpResult.ok(sysUserTokenService.findById(id));
    }

    /**
     *@description 基础分页查询
     *@param pageRequest
     *@return
    */
    @ApiOperation(value = "分页查询用户Token")
    @PostMapping(value = "/findPage")
    @RequiresPermissions("sys:sysUserToken:view")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysUserTokenService.findPage(pageRequest));
    }
}
