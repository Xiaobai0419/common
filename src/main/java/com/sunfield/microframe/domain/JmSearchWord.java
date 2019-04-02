package com.sunfield.microframe.domain;

import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * jm_search_word bean
 * @author sunfield coder
 */
@ApiModel(value="JmSearchWord", description="")
public class JmSearchWord extends BaseDomain{

	@ApiModelProperty(value="关键词", dataType="String")
	private String content;
	
	@ApiModelProperty(value="排序", dataType="Integer")
	private Integer sort;
	
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
}