package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author wangnan
 * @Date 2019/5/7 17:35
 */
@ApiModel(value="UpdateAlipayNameParams", description="更新支付宝账号入参")
public class UpdateAlipayNameParams {

    @ApiModelProperty(value="用户ID", dataType="String")
    private String id;

    @ApiModelProperty(value="支付宝账号", dataType="String")
    private String alipayName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlipayName() {
        return alipayName;
    }

    public void setAlipayName(String alipayName) {
        this.alipayName = alipayName;
    }
}
