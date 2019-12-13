package com.alex.alexadmin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
/**
 *-------------------------------
 * 字典表 (SysDict)
 *------------------------
 * author: alex
 * createDate: 2019-12-13 16:17:08
 * description: 我是由代码生成器生成
 * version: 1.0.0
 */
@ApiModel(value="SysDict对象", description="字典表")
public class SysDict {

    @ApiModelProperty(value = "编号")
    private Long id;

    @ApiModelProperty(value = "数据值")
    private String value;

    @ApiModelProperty(value = "标签名")
    private String label;

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "排序（升序）")
    private Double sort;

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
    @ApiModelProperty(value = "备注信息")
    private String remarks;

    @ApiModelProperty(value = "是否删除  -1：已删除  0：正常")
    private Integer delFlag;


    public Long getId() {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }
    public String getValue() {
        return value;
    }

    public void setValue (String value) {
        this.value = value;
    }
    public String getLabel() {
        return label;
    }

    public void setLabel (String label) {
        this.label = label;
    }
    public String getType() {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }
    public Double getSort() {
        return sort;
    }

    public void setSort (Double sort) {
        this.sort = sort;
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
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks (String remarks) {
        this.remarks = remarks;
    }
    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag (Integer delFlag) {
        this.delFlag = delFlag;
    }
}
