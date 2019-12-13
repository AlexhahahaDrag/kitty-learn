package com.alex.alexadmin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
/**
 *-------------------------------
 * 系统日志 (SysLog)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:17:08
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
@ApiModel(value="SysLog对象", description="系统日志")
public class SysLog {

    @ApiModelProperty(value = "编号")
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "用户操作")
    private String operation;

    @ApiModelProperty(value = "请求方法")
    private String method;

    @ApiModelProperty(value = "请求参数")
    private String params;

    @ApiModelProperty(value = "执行时长(毫秒)")
    private Long time;

    @ApiModelProperty(value = "IP地址")
    private String ip;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GTM+8")
    @ApiModelProperty(value = "创建时间")
    private java.util.Date createTime;
    @ApiModelProperty(value = "更新人")
    private String lastUpdateBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GTM+8")
    @ApiModelProperty(value = "更新时间")
    private java.util.Date lastUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName (String userName) {
        this.userName = userName;
    }
    public String getOperation() {
        return operation;
    }

    public void setOperation (String operation) {
        this.operation = operation;
    }
    public String getMethod() {
        return method;
    }

    public void setMethod (String method) {
        this.method = method;
    }
    public String getParams() {
        return params;
    }

    public void setParams (String params) {
        this.params = params;
    }
    public Long getTime() {
        return time;
    }

    public void setTime (Long time) {
        this.time = time;
    }
    public String getIp() {
        return ip;
    }

    public void setIp (String ip) {
        this.ip = ip;
    }
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy (String createBy) {
        this.createBy = createBy;
    }
    public java.util.Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime (java.util.Date createTime) {
        this.createTime = createTime;
    }
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy (String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }
    public java.util.Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime (java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
