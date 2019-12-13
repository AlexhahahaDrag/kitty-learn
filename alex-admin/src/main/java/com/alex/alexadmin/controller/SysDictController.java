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

import com.alex.alexadmin.model.SysDict;
import com.alex.alexadmin.service.SysDictService;

/**
 *-------------------------------
 * 字典表 (SysDictController)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:19
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Api(value ="SysDictController", tags={"字典表"})
 @RestController
 @RequestMapping("/sysDict")
public class SysDictController {

    @Autowired
    private SysDictService sysDictService;

    /**
     * @description 保存/修改字典表
     * @param record
     * @return
    */
    @ApiOperation(value = "保存字典表")
    @PostMapping(value = "/save")
    @RequiresPermissions("sys:sysDict:save")
    public HttpResult save(@RequestBody SysDict record) {
        return HttpResult.ok(sysDictService.save(record));
    }

    /**
     * @description 删除字典表
     * @param records
     * @return
    */
    @ApiOperation(value = "删除字典表")
    @PostMapping(value = "/delete")
    @RequiresPermissions("sys:sysDict:delete")
    public HttpResult delete(@RequestBody List<SysDict> records) {
        return HttpResult.ok(sysDictService.delete(records));
    }

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    @ApiOperation(value = "通过id查询字典表")
    @GetMapping(value = "/findById")
    @RequiresPermissions("sys:sysDict:view")
    public HttpResult findById(@RequestParam("id") Long id) {
        return HttpResult.ok(sysDictService.findById(id));
    }

    /**
     *@description 基础分页查询
     *@param pageRequest
     *@return
    */
    @ApiOperation(value = "分页查询字典表")
    @PostMapping(value = "/findPage")
    @RequiresPermissions("sys:sysDict:view")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysDictService.findPage(pageRequest));
    }
}
