package com.rr.hrm.domain;

import java.io.Serializable;
import java.util.Date;

public class Document implements Serializable {
	private Integer id;
	private String title; // 标题
	private String fileName; // 文件名
	// 文件，缺Spring依赖，先注释掉
	//private MultipartFile file;
	private String remark; // 描述
	private Date createDate; // 上传时间
	private User user;  // 上传人
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
