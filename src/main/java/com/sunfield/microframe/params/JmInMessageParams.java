package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import com.sunfield.microframe.domain.base.BaseDomain;

/**
 * jm_in_message bean
 * @author sunfield coder
 */
@ApiModel(value="JmInMessageParams", description="")
public class JmInMessageParams extends BaseDomain{

	@ApiModelProperty(value="标题", dataType="String")
	private String title;
	
	@ApiModelProperty(value="内容", dataType="String")
	private String content;
	
	@ApiModelProperty(value="关联的业务id", dataType="String")
	private String relId;
	
	@ApiModelProperty(value="用户id", dataType="String")
	private String userId;
	
	@ApiModelProperty(value="状态【0：未发送，1：已发送】", dataType="String")
	private String pushStatus;
	
	@ApiModelProperty(value="读取状态【0：未读，1：已读】", dataType="String")
	private String readStatus;
	
	@ApiModelProperty(value="推送种类【1：系统消息，10：专家认证，11：专家回答，12提问提醒，13：加好友，14：加入部落，15：会议开始前提醒，16：提现通知】", dataType="String")
	private String messageType;
	
	
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
	
	public String getPushStatus() {
		return pushStatus;
	}

	public void setPushStatus(String pushStatus) {
		this.pushStatus = pushStatus;
	}
	
	public String getReadStatus() {
		return readStatus;
	}

	public void setReadStatus(String readStatus) {
		this.readStatus = readStatus;
	}
	
	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	
}