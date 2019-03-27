package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UpdateStatusParams", description="更新用户状态入参")
public class UpdateStatusParams {

    public UpdateStatusParams() {
    }

    public UpdateStatusParams(String id, String status) {
        this.id = id;
        this.status = status;
    }

    @ApiModelProperty(value="用户ID", dataType="String")
    private String id;

    @ApiModelProperty(value="状态（0正常 1删除 2停用）", dataType="String")
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
