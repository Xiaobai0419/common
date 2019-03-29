package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UpdateCardStatusParams", description="更新名片认证状态入参")
public class UpdateCardStatusParams {

    public UpdateCardStatusParams() {
    }

    public UpdateCardStatusParams(String id, Integer cardStatus, String remarks) {
        this.id = id;
        this.cardStatus = cardStatus;
        this.remarks = remarks;
    }

    @ApiModelProperty(value="用户ID", dataType="String")
    private String id;

    @ApiModelProperty(value="名片认证状态（0：未认证；1：认证中；2：已认证；3：已驳回）", dataType="Integer")
    private Integer cardStatus;

    @ApiModelProperty(value="备注", dataType="String")
    private  String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(Integer cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
