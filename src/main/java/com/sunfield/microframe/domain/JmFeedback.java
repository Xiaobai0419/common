package com.sunfield.microframe.domain;

import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * jm_feedback bean
 * @author sunfield coder
 */
@ApiModel(value="JmFeedback", description="")
public class JmFeedback extends BaseDomain{

	@ApiModelProperty(value="评论人ID", dataType="String")
	private String userId;

	@ApiModelProperty(value="评论人手机号", dataType="String")
	private String mobile;

	@ApiModelProperty(value="评论人昵称", dataType="String")
	private String nickName;

	@ApiModelProperty(value="内容", dataType="String")
	private String content;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}