package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UpdateCardParams", description="更新名片入参")
public class UpdateCardParams {

    @ApiModelProperty(value="用户ID", dataType="String")
    private String id;

    @ApiModelProperty(value="名片url", dataType="String")
    private String cardPicUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardPicUrl() {
        return cardPicUrl;
    }

    public void setCardPicUrl(String cardPicUrl) {
        this.cardPicUrl = cardPicUrl;
    }
}
