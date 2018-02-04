package web2017.team3.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import web2017.team3.domain.ZWTFileBean;

public class ZWTMyRowMapper implements RowMapper<ZWTFileBean> {

	@Override
	public ZWTFileBean mapRow(ResultSet rs, int num) throws SQLException {
		 //从结果集里把数据得到
		int fileid=rs.getInt("fileid");
		 String fileName=rs.getString("fileName");
		 String filePath=rs.getString("filePath");
		 String fileDesc=rs.getString("fileDesc");
		 String fileType=rs.getString("fileType");
		 String fileOwnerName=rs.getString("fileOwnerName");
		 Date fileuploadDate=rs.getDate("fileuploadDate");
		
		 //把数据封装到对象里
		 ZWTFileBean file=new ZWTFileBean();
		 file.setFileid(fileid);
		 file.setFileName(fileName);
		 file.setFileDesc(fileDesc);
		 file.setFilePath(filePath);
		 file.setFileType(fileType);
		 file.setFileOwnerName(fileOwnerName);
		 file.setFileuploadDate(fileuploadDate);
		 return file;
		 }
		
		

}
