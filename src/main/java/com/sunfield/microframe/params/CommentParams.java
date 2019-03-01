package com.sunfield.microframe.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="CommentParams", description="评论入参")
public class CommentParams {

    @ApiModelProperty(value="评论分类(1:资讯;2:能源圈;3:访谈)", dataType="Integer")
    private Integer type;

    @ApiModelProperty(value="归属ID", dataType="String")
    private String parentId;

    @ApiModelProperty(value="评论人ID", dataType="String")
    private String userId;

    @ApiModelProperty(value="内容", dataType="String")
    private String content;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

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
