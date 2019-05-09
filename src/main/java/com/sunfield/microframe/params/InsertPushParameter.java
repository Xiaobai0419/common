package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="InsertPushParameter", description="")
public class InsertPushParameter {

    @ApiModelProperty(value="标题", dataType="String")
    private String title;

    @ApiModelProperty(value="内容", dataType="String")
    private String content;

    @ApiModelProperty(value="关联的业务id", dataType="String")
    private String relId;

    @ApiModelProperty(value="用户id", dataType="String")
    private String userId;

    @ApiModelProperty(value="推送种类【1：系统消息，10：专家认证，11：专家回答，12提问提醒，13：加好友，14：加入部落，15：会议开始前提醒，16：提现通知】", dataType="String")
    private String messageType;


    public InsertPushParameter(){}

    public InsertPushParameter(String title,String content,String relId,String userId,String messageType){
        this.title=title;
        this.content=content;
        this.relId=relId;
        this.userId=userId;
        this.messageType=messageType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRelId() {
        return relId;
    }

    public void setRelId(String relId) {
        this.relId = relId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
