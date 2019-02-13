package com.sunfield.microframe.domain;

import com.sunfield.microframe.domain.base.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * jm_app_version bean
 * @author sunfield coder
 */
@ApiModel(value="JmAppVersion", description="")
public class JmAppVersion extends BaseDomain{

	@ApiModelProperty(value="版本号", dataType="Integer")
	private Integer version;
	
	@ApiModelProperty(value="版本名称", dataType="String")
	private String versionName;
	
	@ApiModelProperty(value="版本描述", dataType="String")
	private String versionDescription;
	
	@ApiModelProperty(value="跳转url", dataType="String")
	private String url;
	
	@ApiModelProperty(value="强制更新(0:强制;1:不强制)", dataType="String")
	private String forceUpdateStatus;
	
	
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	
	public String getVersionDescription() {
		return versionDescription;
	}

	public void setVersionDescription(String versionDescription) {
		this.versionDescription = versionDescription;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getForceUpdateStatus() {
		return forceUpdateStatus;
	}

	public void setForceUpdateStatus(String forceUpdateStatus) {
		this.forceUpdateStatus = forceUpdateStatus;
	}
	
}