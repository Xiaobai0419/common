package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="OnlyIdParameter", description="")
public class OnlyIdParameter {

    @ApiModelProperty(value="主键id",required=true)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
