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
	
}