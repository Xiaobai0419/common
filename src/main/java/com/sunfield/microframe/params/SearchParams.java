package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="SearchParams", description="搜索入参")
public class SearchParams {

    @ApiModelProperty(value="当前页码", dataType="Integer")
    private Integer pageNumber;

    @ApiModelProperty(value="每页条数", dataType="Integer")
    private Integer pageSize;

    @ApiModelProperty(value="搜索关键字，多个关键字用空格分开", dataType="String")
    private String keyword;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
