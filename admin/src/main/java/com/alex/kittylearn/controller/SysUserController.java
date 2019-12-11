package com.alex.kittylearn.controller;

import java.util.List;

import com.alex.core.http.HttpResult;
import com.alex.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alex.kittylearn.model.SysUser;
import com.alex.kittylearn.service.SysUserService;

/**
 *-------------------------------
 * 用户管理 (SysUserController)
 *------------------------
 * author: alex
 * createDate: 2019-12-10 19:33:51
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
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
    @PostMapping(value = "/saveOrUpdate")
    public HttpResult saveOrUpdate(@RequestBody SysUser record) {
        return HttpResult.ok(sysUserService.saveOrUpdate(record));
    }

    /**
     * @description 删除用户管理
     * @param records
     * @return
    */
    @PostMapping(value = "/delete")
    public HttpResult delete(@RequestBody List<SysUser> records) {
        return HttpResult.ok(sysUserService.delete(records));
    }

    /**
     *@description 根据主键查询
     *@param id
     *@return
    */
    @GetMapping(value = "/findById")
    public HttpResult findById(@RequestParam("id") Long id) {
        return HttpResult.ok(sysUserService.findById(id));
    }

    /**
     *@description 基础分页查询
     *@param pageRequest
     *@return
    */
    @PostMapping(value = "/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysUserService.findPage(pageRequest));
    }
}
