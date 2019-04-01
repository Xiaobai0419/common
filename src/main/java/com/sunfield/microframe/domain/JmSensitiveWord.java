package com.sunfield.microframe.domain;

import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * jm_sensitive_word bean
 * @author sunfield coder
 */
@ApiModel(value="JmSensitiveWord", description="")
public class JmSensitiveWord extends BaseDomain{

	@ApiModelProperty(value="敏感词内容", dataType="String")
	private String content;

	@NotBlank(message="敏感词内容不能为空")
	@Length(min=0, max=64, message="敏感词内容长度不能超过 64 个字符")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}