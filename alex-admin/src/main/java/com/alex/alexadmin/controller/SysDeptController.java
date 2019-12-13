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

import com.alex.alexadmin.model.SysDept;
import com.alex.alexadmin.service.SysDeptService;

/**
 *-------------------------------
 * 机构管理 (SysDeptController)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:01:19
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
 @Api(value ="SysDeptController", tags={"机构管理"})
 @RestController
 @RequestMapping("/sysDept")
public class SysDeptController {

    @Autowired
    private SysDeptService sysDeptService;

    /**
     * @description 保存/修改机构管理
     * @param record
     * @return
    */
    @ApiOperation(value = "保存机构管理")
    @PostMapping(value = "/save")
    @RequiresPermissions("sys:sysDept:save")
    public HttpResult save(@RequestBody SysDept record) {
        return HttpResult.ok(sysDeptService.save(record));
    }

    /**
     * @description 删除机构管理
     * @param records
     * @return
    */
    @ApiOperation(value = "删除机构管理")
    @PostMapping(value = "/delete")
    @RequiresPermissions("sys:sysDept:delete")
    public HttpResult delete(@RequestBody List<SysDept> records) {
        return HttpResult.ok(sysDeptService.delete(records));
    }

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    @ApiOperation(value = "通过id查询机构管理")
    @GetMapping(value = "/findById")
    @RequiresPermissions("sys:sysDept:view")
    public HttpResult findById(@RequestParam("id") Long id) {
        return HttpResult.ok(sysDeptService.findById(id));
    }

    /**
     *@description 基础分页查询
     *@param pageRequest
     *@return
    */
    @ApiOperation(value = "分页查询机构管理")
    @PostMapping(value = "/findPage")
    @RequiresPermissions("sys:sysDept:view")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysDeptService.findPage(pageRequest));
    }
}
