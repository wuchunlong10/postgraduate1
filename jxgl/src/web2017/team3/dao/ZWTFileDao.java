package web2017.team3.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import web2017.team3.domain.ZWTFileBean;

@Repository
public class ZWTFileDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(List<ZWTFileBean> uploadFiles) {
		for (ZWTFileBean file : uploadFiles) {
			jdbcTemplate.update(
					"insert into zwt_file(fileName,filePath,fileDesc,fileType,fileOwnerName,fileuploadDate) values(?,?,?,?,?,?)",
					new PreparedStatementSetter() {
						@Override
						public void setValues(PreparedStatement ps) throws SQLException {
							ps.setString(1, file.getFileName());
							ps.setString(2, file.getFilePath());
							ps.setString(3, file.getFileDesc());
							ps.setString(4, "算法");
							ps.setString(5, "0");
							java.util.Date d = new java.util.Date();
							java.sql.Date date =new java.sql.Date(d.getTime());
							ps.setDate(6, date);
						}
					});
		}

	}

	public List<ZWTFileBean> findFileByType(String type) {
		// TODO Auto-generated method stub
		System.out.println("2");
		String sqlStr = "SELECT * FROM zwt_file where fileType=?";
		ArrayList<ZWTFileBean> fileList = (ArrayList<ZWTFileBean>) jdbcTemplate.query(sqlStr, new Object[] { type },
				new ZWTMyRowMapper());
		return fileList;
	}

	public List<ZWTFileBean> getAllFiles() {
		// TODO Auto-generated method stub
		String sqlStr = "SELECT * FROM zwt_file";
		ArrayList<ZWTFileBean> fileList = (ArrayList<ZWTFileBean>) jdbcTemplate.query(sqlStr, new ZWTMyRowMapper());
		return fileList;
	}

	public void deletefileByID(int fileid) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from zwt_file where fileid=?", new Object[] { fileid });
	}

	public ZWTFileBean findFileByFileid(int fileid) {
		// TODO Auto-generated method stub
		String sqlStr = "SELECT * FROM zwt_file where fileid=?";
		ZWTFileBean file = new ZWTFileBean();
		jdbcTemplate.query(sqlStr, new Object[] { fileid }, new RowCallbackHandler() {

			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				file.setFileid(fileid);
				file.setFileName(rs.getString("fileName"));
				file.setFilePath(rs.getString("filePath"));
			}
		});
		return file;
	}

	public List<ZWTFileBean> findFileByrecentDate() {
		// TODO Auto-generated method stub
		String sqlStr = null;
		//SELECT * FROM team3.zwt_file  where fileuploadDate > DATE_SUB(now(),INTERVAL 3 DAY)
		sqlStr = "SELECT * FROM zwt_file  where fileuploadDate > DATE_SUB(now(),INTERVAL 3 DAY)";
		ArrayList<ZWTFileBean> fileList = (ArrayList<ZWTFileBean>) jdbcTemplate.query(sqlStr, new ZWTMyRowMapper());
		return fileList;
	}

	public List<ZWTFileBean> findFileByfileName(String fileName) {
		// TODO Auto-generated method stub
		//SELECT * FROM team3.zwt_file where fileName like '%曾文韬%';  在数据库中可以直接查询到
		String sqlStr = "SELECT * FROM zwt_file where fileName like '%"+fileName+"%'";
		ArrayList<ZWTFileBean> fileList = (ArrayList<ZWTFileBean>) jdbcTemplate.query(sqlStr, 
												new ZWTMyRowMapper());
		System.out.println(fileList);
		return fileList;
	}
}
