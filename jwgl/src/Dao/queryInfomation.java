package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import Entity.teacherDao;

@Repository
public class queryInfomation {
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	
	public teacherDao findUserById(String idNumber) {
			String sql = "select * from teacher_info where idNumber = ?";
			final teacherDao teacher = new teacherDao();
			jdbcTemplate.query(sql, new Object[] {idNumber},new RowCallbackHandler(){
				public void processRow(ResultSet rs) throws SQLException {
					teacher.setIdNumber(rs.getString("idNumber"));
					teacher.setAddress(rs.getString("address"));
					teacher.setSex(rs.getString("sex"));
					teacher.setEducation(rs.getString("education"));
					teacher.setIdCard(rs.getString("idCard"));
					teacher.setName(rs.getString("name"));
					teacher.setNation(rs.getString("nation"));
					teacher.setNativePlace(rs.getString("nativePlace"));
					teacher.setPhone(rs.getString("phone"));
					teacher.setPoliticalStatus(rs.getString("politicalStatus"));
					teacher.setPrize(rs.getString("prize"));
				}
			});
			return teacher;
	}
}
