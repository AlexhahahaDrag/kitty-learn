package com.alex.alexadmin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
/**
 *-------------------------------
 * 角色机构 (SysRoleDept)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:17:08
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
@ApiModel(value="SysRoleDept对象", description="角色机构")
public class SysRoleDept {

    @ApiModelProperty(value = "编号")
    private Long id;

    @ApiModelProperty(value = "角色ID")
    private Long roleId;

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

    public Long getId() {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId (Long roleId) {
        this.roleId = roleId;
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
}
