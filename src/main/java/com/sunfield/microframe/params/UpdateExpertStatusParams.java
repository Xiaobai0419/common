package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UpdateExpertStatusParams", description="更新专家状态入参")
public class UpdateExpertStatusParams {

    @ApiModelProperty(value="用户ID", dataType="String")
    private String id;

    @ApiModelProperty(value="专家认证状态（0：未认证；1：认证中；2：已认证；3：已驳回）", dataType="Integer")
    private Integer expertStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getExpertStatus() {
        return expertStatus;
    }

    public void setExpertStatus(Integer expertStatus) {
        this.expertStatus = expertStatus;
    }
}
