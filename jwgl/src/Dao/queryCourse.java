package Dao;

import static org.junit.Assert.assertNotNull;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import Entity.Course;

@Repository
public class queryCourse {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Course> queryCourseInfo(String idNumber) {
		final List cList = new ArrayList();
		String sql = "select SubjectName,Time,Place,TeacherName from teachercourseb where idNumber = ?";
		jdbcTemplate.query(sql,new Object[] {idNumber},new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				final Course course = new Course();
				course.setPlace(rs.getString("Place"));
				course.setSubjectName(rs.getString("SubjectName"));
				course.setTeacherName(rs.getString("TeacherName"));
				course.setTime(rs.getInt("Time"));
				cList.add(course);
			}
		});
		return cList;
	}
}
