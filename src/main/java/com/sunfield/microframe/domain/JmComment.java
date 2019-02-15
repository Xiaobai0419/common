package com.sunfield.microframe.domain;

import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * jm_comment bean
 * @author sunfield coder
 */
@ApiModel(value="JmComment", description="")
public class JmComment extends BaseDomain{

	@ApiModelProperty(value="评论分类(1:资讯;2:能源圈;3:访谈)", dataType="Integer")
	private Integer type;
	
	@ApiModelProperty(value="归属ID", dataType="String")
	private String parentId;
	
	@ApiModelProperty(value="评论人ID", dataType="String")
	private String userId;

	@ApiModelProperty(value="评论人昵称", dataType="String")
	private String nickName;

	@ApiModelProperty(value="评论人头像", dataType="String")
	private String headPicUrl;

	@ApiModelProperty(value="被回复人ID", dataType="String")
	private String replyUserId;
	
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHeadPicUrl() {
		return headPicUrl;
	}

	public void setHeadPicUrl(String headPicUrl) {
		this.headPicUrl = headPicUrl;
	}

	public String getReplyUserId() {
		return replyUserId;
	}

	public void setReplyUserId(String replyUserId) {
		this.replyUserId = replyUserId;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}