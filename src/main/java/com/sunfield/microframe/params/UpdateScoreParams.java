package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;

@ApiModel(value="UpdateScoreParams", description="更新积分入参")
public class UpdateScoreParams {

    public UpdateScoreParams(){}

    public UpdateScoreParams(String id,Integer num){
        this.id=id;
        this.num=num;
    }

    @ApiModelProperty(value="用户ID", dataType="String")
    private String id;

    @ApiModelProperty(value="积分增量(增加为正数，减少为负数)", dataType="Integer")
    private Integer num;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
