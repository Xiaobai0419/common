package com.sunfield.microframe.domain;

import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * jm_industries bean
 * @author sunfield coder
 */
@ApiModel(value="JmIndustries", description="")
public class JmIndustries extends BaseDomain{

	@ApiModelProperty(value="行业类别", dataType="String")
	private String name;

	@ApiModelProperty(value="行业头像url", dataType="String")
	private String picUrl;

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}