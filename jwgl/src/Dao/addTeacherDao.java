package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import Entity.teacherDao;

@Repository
public class addTeacherDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;



	public  String addTeacherNum(String year,String college) {
		String number = null;
		String sql = "insert into teacher_number(year,college,number) values(?,?,1)";
		String sql1 = "select * from teacher_number where number = '1'";
		String sql2 = "update teacher_number set number = ? where id = ?";
		System.out.println("test1");
		System.out.println(year + college);
		Object[] args=new Object[] {year,college};
		final teacherDao teacher = new teacherDao();
		int i  = jdbcTemplate.update(sql,args);
		jdbcTemplate.query(sql1,new Object[]{},new RowCallbackHandler() {
			public void processRow(ResultSet rs) throws SQLException {
				teacher.setId(rs.getInt("id"));
				teacher.setYear(rs.getString("year"));
				teacher.setCollege(rs.getString("college"));
			}
		});
		if(teacher.getId() < 10) {
			jdbcTemplate.update(sql2,new Object[]{teacher.getYear() + teacher.getCollege() + "00" + teacher.getId(),teacher.getId()});
			number = teacher.getYear() + teacher.getCollege() + "00" + teacher.getId();
		} else if(teacher.getId() < 100) {
			jdbcTemplate.update(sql2,new Object[]{teacher.getYear() + teacher.getCollege() + "0" + teacher.getId(),teacher.getId()});
			number = teacher.getYear() + teacher.getCollege() + "0" + teacher.getId();
		} else {
			jdbcTemplate.update(sql2,new Object[]{teacher.getYear() + teacher.getCollege() + teacher.getId(),teacher.getId()});
			number = teacher.getYear() + teacher.getCollege() + teacher.getId();
		}
		teacher.setIdNumber(number); 
		return number;
	}
	
	public  void addTeacherInfo(teacherDao teacher) {
		System.out.println(teacher.getIdNumber());		String sql = "update teacher_info set address='" + teacher.getAddress() + "',education='" + teacher.getEducation() + "',phone='"
				+ teacher.getPhone() + "',prize='" + teacher.getPrize() + "',nation='" + teacher.getNation() + "',politicalStatus='" + teacher.getPoliticalStatus() + "',nativePlace='" + teacher.getNativePlace() + "',sex='" + teacher.getSex() + "',idCard='" + teacher.getIdCard() + "' where idNumber='"+ teacher.getIdNumber() +"'";
		jdbcTemplate.update(sql);
	}
}
