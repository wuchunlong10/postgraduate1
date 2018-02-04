package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import Entity.ClassInfo;
import Entity.Course;

@Repository
public class addScoreDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Course> queryCourse(String idNumber) {
		String sql = "select SubjectName from teacher_teach where idNumber = ?";	
		final List<Course> CList = new ArrayList<Course>();
		jdbcTemplate.query(sql,new Object[] {idNumber},new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
			final Course course= new Course();
			course.setSubjectName(rs.getString("SubjectName"));
			CList.add(course);
			}
		});
		return CList;
	}
	
	public List<ClassInfo> queryClass(String SubjectName) {
		String sql = "select Class from classtable where SubjectName = ?";
		final List<ClassInfo> ClassList = new ArrayList<ClassInfo>();
		jdbcTemplate.query(sql,new Object[] {SubjectName},new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
			final ClassInfo classInfo= new ClassInfo();
			classInfo.setClassInfo(rs.getString("Class"));
			ClassList.add(classInfo);
			}
		});
		System.out.println("test1");
		return ClassList;
	}
	
	public List<ClassInfo> nameList(String ClassInfo,String SubjectName) {
		String sql = "select StudentId,SubjectName,StudentName from scoreb where Class = ? and SubjectName = ?";
		final List<ClassInfo> nameList = new ArrayList<ClassInfo>();
		jdbcTemplate.query(sql,new Object[] {ClassInfo,SubjectName},new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
			final ClassInfo classInfo= new ClassInfo();
			classInfo.setStudentId(rs.getString("StudentId"));
			classInfo.setSubjectName(rs.getString("SubjectName"));
			classInfo.setName(rs.getString("StudentName"));
			nameList.add(classInfo);
			}
		});
		return nameList;
	}
	
	public void addScore(List<ClassInfo> addList) {
		String sql = "update scoreb set Score = ?,Gpa = ? where SubjectName = ? and StudentId =?";
		for(int i = 0;i < addList.size();i ++) {
			System.out.println(addList.get(i).getScore());
			System.out.println(addList.get(i).getSubjectName());
			System.out.println(addList.get(i).getStudentId());
			System.out.println(addList.get(i).getGpa());
			jdbcTemplate.update(sql,new Object[] {addList.get(i).getScore(),	addList.get(i).getGpa(),addList.get(i).getSubjectName(),addList.get(i).getStudentId()});
		}
	}
}
