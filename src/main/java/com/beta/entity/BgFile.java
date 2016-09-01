package com.beta.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BgFile {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private String blogFileId;
	private String fileName;
	private String fileUrl;
	
	public String getBlogFileId() {
		return blogFileId;
	}
	public void setBlogFileId(String blogFileId) {
		this.blogFileId = blogFileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	
}
