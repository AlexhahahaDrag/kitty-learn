package com.alex.alexadmin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

/**
 *-------------------------------
 * 用户管理 (SysUser)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:17:08
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
@ApiModel(value="SysUser对象", description="用户管理")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    public SysUser(String name, String password) {
        super();
        this.name = name;
        this.password = password;
    }

    public SysUser() {
    }

    @ApiModelProperty(value = "编号")
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "盐")
    private String salt;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "状态  0：禁用   1：正常")
    private Integer status;

    @ApiModelProperty(value = "机构ID")
    private Long deptId;

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
    @ApiModelProperty(value = "是否删除  -1：已删除  0：正常")
    private Integer delFlag;


    public Long getId() {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }
    public String getSalt() {
        return salt;
    }

    public void setSalt (String salt) {
        this.salt = salt;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile (String mobile) {
        this.mobile = mobile;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus (Integer status) {
        this.status = status;
    }
    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId (Long deptId) {
        this.deptId = deptId;
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
    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag (Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "{ name = " + getName() + ", password = " + getPassword() + "}";
    }
}
