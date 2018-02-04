package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import Entity.User;

@Repository
public class LoginDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Autowired
	@Qualifier("oracleDataSource")
	private BasicDataSource basicDataSource;
	
	@Autowired
	@Qualifier("oracleDataSource2")
	private BasicDataSource basicDataSource2;
	
	@Autowired
	@Qualifier("oracleDataSource3")
	private BasicDataSource basicDataSource3;
	
	public int logincheck(String studentid,String password,String rol){
		if(rol.equals("loc1")){
			jdbctemplate.setDataSource(basicDataSource);
		}
		else if(rol.equals("loc2")){
			jdbctemplate.setDataSource(basicDataSource2);
		}
		else{
			jdbctemplate.setDataSource(basicDataSource3);
		}
		String sql="SELECT count(*) FROM studentb WHERE StudentId=? AND PassWord=?";
		Object[] infor = new Object[]{studentid,password};
		System.out.println(infor);
		System.out.println(jdbctemplate);
		return jdbctemplate.queryForInt(sql, infor);
	}
	public int teacherCheck(String studentid,String password,String rol){
		if(rol.equals("loc1")){
			jdbctemplate.setDataSource(basicDataSource);
		}
		else if(rol.equals("loc2")){
			jdbctemplate.setDataSource(basicDataSource2);
		}
		else{
			jdbctemplate.setDataSource(basicDataSource3);
		}
		String sql="SELECT count(*) FROM teacher_info WHERE StudentId=? AND PassWord=?";
		Object[] infor = new Object[]{studentid,password};
		System.out.println(infor);
		System.out.println(jdbctemplate);
		return jdbctemplate.queryForInt(sql, infor);
	}
	
	public User loginbystudentid(String studentid){
		String sql="SELECT * FROM studentb WHERE StudentId=?";
		Object[] infor= new Object[]{studentid};
		final User user = new User();
		jdbctemplate.query(sql, infor, new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				user.setStudentId(rs.getString("StudentId"));
				user.setStudentName(rs.getString("StudentName"));
			}
		});
		return user;
	}
}
