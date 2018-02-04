package web2017.team3.domain;

import java.util.Date;

public class ZWTFileBean {

	private Integer fileid;
	// 文件名
	private String fileName;
	// 文件的路径
	private String filePath;
	// 文件的描述
	private String fileDesc;

	private String fileType;
	private String fileOwnerName;
	private Date fileuploadDate;

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}



	public String getFileOwnerName() {
		return fileOwnerName;
	}

	public void setFileOwnerName(String fileOwnerName) {
		this.fileOwnerName = fileOwnerName;
	}

	public Date getFileuploadDate() {
		return fileuploadDate;
	}

	public void setFileuploadDate(Date fileuploadDate) {
		this.fileuploadDate = fileuploadDate;
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

	public ZWTFileBean() {
		// TODO Auto-generated constructor stub
	}

	public ZWTFileBean(String fileName, String filePath, String fileDesc, String fileType, String fileOwnerName,
			Date fileuploadDate) {
		super();
		this.fileName = fileName;
		this.filePath = filePath;
		this.fileDesc = fileDesc;
		this.fileType = fileType;
		this.fileOwnerName = fileOwnerName;
		this.fileuploadDate = fileuploadDate;
	}

	public ZWTFileBean(String fileName, String filePath, String fileDesc) {
		super();

		this.fileName = fileName;
		this.filePath = filePath;
		this.fileDesc = fileDesc;
	}

	public Integer getFileid() {
		return fileid;
	}

	public void setFileid(Integer fileid) {
		this.fileid = fileid;
	}

	@Override
	public String toString() {
		return "ZWTFileBean [fileid=" + fileid + ", fileName=" + fileName + ", filePath=" + filePath + ", fileDesc="
				+ fileDesc + ", fileType=" + fileType + ", fileOwnerName=" + fileOwnerName + ", fileuploadDate="
				+ fileuploadDate + "]";
	}

	
	

}
