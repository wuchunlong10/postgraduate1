package web2017.team3.controller;

import java.util.Date;

public class ZWTFileCommond {
	private Integer fileid;
	// 文件名
	private String fileName;
	// 文件的路径
	private String filePath;
	// 文件的描述
	private String fileDesc;

	private String fileType;
	private int fileOwnerID;
	private Date fileuploadDate;
	public Integer getFileid() {
		return fileid;
	}
	public void setFileid(Integer fileid) {
		this.fileid = fileid;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileDesc() {
		return fileDesc;
	}
	public void setFileDesc(String fileDesc) {
		this.fileDesc = fileDesc;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public int getFileOwnerID() {
		return fileOwnerID;
	}
	public void setFileOwnerID(int fileOwnerID) {
		this.fileOwnerID = fileOwnerID;
	}
	public Date getFileuploadDate() {
		return fileuploadDate;
	}
	public void setFileuploadDate(Date fileuploadDate) {
		this.fileuploadDate = fileuploadDate;
	}
}
