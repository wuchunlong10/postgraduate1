package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import Entity.teacherDao;

@Repository
public class modifyPersonDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public teacherDao getPersonalInfo(String  idNumber) {
		final teacherDao teacher = new teacherDao();
		String sql1 = "select * from teacher_info where idNumber = ?";
		jdbcTemplate.query(sql1, new Object[] {idNumber}, new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				teacher.setAddress(rs.getString("address"));
				teacher.setSubjectName(rs.getString("SubjectName"));
				teacher.setEducation(rs.getString("education"));
				teacher.setName(rs.getString("name"));
				teacher.setNation(rs.getString("nation"));
				teacher.setNativePlace(rs.getString("nativePlace"));
				teacher.setPhone(rs.getString("phone"));
				teacher.setPoliticalStatus(rs.getString("politicalStatus"));
				teacher.setPrize(rs.getString("prize"));
				teacher.setSex(rs.getString("sex"));
				teacher.setIdCard(rs.getString("idCard"));
				teacher.setIdNumber(rs.getString("idNumber"));
			}
		});
		return teacher;	
	}
	public void personalModify(String idNumber,String address,String education,String phone,String prize,String password) {
		String sql="update teacher_info set address='" + address + "',education='" + education + "',phone='"
				+ phone + "',prize='" + prize + "',mima='" + password +"' where idNumber='"+ idNumber +"'";
		jdbcTemplate.update(sql);
	}
}
