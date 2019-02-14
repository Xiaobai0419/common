package com.sunfield.microframe.domain;

import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * jm_sensitive_word bean
 * @author sunfield coder
 */
@ApiModel(value="JmSensitiveWord", description="")
public class JmSensitiveWord extends BaseDomain{

	@ApiModelProperty(value="敏感词内容", dataType="String")
	private String content;
	
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}