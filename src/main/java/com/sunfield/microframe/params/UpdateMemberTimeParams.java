package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UpdateMemberTimeParams", description="更新会员期限入参")
public class UpdateMemberTimeParams {

    public UpdateMemberTimeParams(){}

    public UpdateMemberTimeParams(String id,Integer month){
        this.id=id;
        this.month=month;
    }

    @ApiModelProperty(value="用户ID", dataType="String")
    private String id;

    @ApiModelProperty(value="购买时长", dataType="Integer")
    private Integer month;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }
}
