package com.alex.alexadmin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
/**
 *-------------------------------
 * 菜单管理 (SysMenu)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:17:08
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
@ApiModel(value="SysMenu对象", description="菜单管理")
public class SysMenu {

    @ApiModelProperty(value = "编号")
    private Long id;

    @ApiModelProperty(value = "菜单名称")
    private String name;

    @ApiModelProperty(value = "父菜单ID，一级菜单为0")
    private Long parentId;

    @ApiModelProperty(value = "菜单URL,类型：1.普通页面（如用户管理， /sys/user） 2.嵌套完整外部页面，以http(s)开头的链接 3.嵌套服务器页面，使用iframe:前缀+目标URL(如SQL监控， iframe:/druid/login.html, iframe:前缀会替换成服务器地址)")
    private String url;

    @ApiModelProperty(value = "授权(多个用逗号分隔，如：sys:user:add,sys:user:edit)")
    private String perms;

    @ApiModelProperty(value = "类型   0：目录   1：菜单   2：按钮")
    private Integer type;

    @ApiModelProperty(value = "菜单图标")
    private String icon;

    @ApiModelProperty(value = "排序")
    private Integer orderNum;

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
    public Long getParentId() {
        return parentId;
    }

    public void setParentId (Long parentId) {
        this.parentId = parentId;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl (String url) {
        this.url = url;
    }
    public String getPerms() {
        return perms;
    }

    public void setPerms (String perms) {
        this.perms = perms;
    }
    public Integer getType() {
        return type;
    }

    public void setType (Integer type) {
        this.type = type;
    }
    public String getIcon() {
        return icon;
    }

    public void setIcon (String icon) {
        this.icon = icon;
    }
    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum (Integer orderNum) {
        this.orderNum = orderNum;
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
}
