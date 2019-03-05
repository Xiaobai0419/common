package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="UpdateFriendStatusParams", description="更新是否可以加我好友状态入参")
public class UpdateFriendStatusParams {

    @ApiModelProperty(value="用户ID", dataType="String")
    private String id;

    @ApiModelProperty(value="是否可以加我为好友(0:是;1:否)", dataType="Integer")
    private Integer friendStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getFriendStatus() {
        return friendStatus;
    }

    public void setFriendStatus(Integer friendStatus) {
        this.friendStatus = friendStatus;
    }
}
