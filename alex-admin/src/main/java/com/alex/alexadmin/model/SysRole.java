package com.alex.alexadmin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
/**
 *-------------------------------
 * 角色管理 (SysRole)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:17:08
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
@ApiModel(value="SysRole对象", description="角色管理")
public class SysRole {

    @ApiModelProperty(value = "编号")
    private Long id;

    @ApiModelProperty(value = "角色名称")
    private String name;

    @ApiModelProperty(value = "备注")
    private String remark;

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
    public String getRemark() {
        return remark;
    }

    public void setRemark (String remark) {
        this.remark = remark;
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
