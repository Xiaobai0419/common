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

	@ApiModelProperty(value="行业分值，用于用户行业的redis zset分值", dataType="Integer")
	private Integer score = 0;

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

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