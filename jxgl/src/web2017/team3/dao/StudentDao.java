package web2017.team3.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import web2017.team3.controller.StudentRegist;
import web2017.team3.domain.Student;
@Repository
public class StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean isExistName(String username){
		String sql = "select count(*) from t_student where username = ?";
		System.out.println(sql);
		return jdbcTemplate.queryForObject(sql, new Object[]{username},Integer.class)>0;
	}
	
	public int hasMatchCount(String username, String password) {
		String sql = " SELECT count(*) FROM t_student WHERE username =? and password= ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{username,password},Integer.class);
	}

	public List<Student> searchAllStudent() {
		String sqlStr = " SELECT * FROM t_student";
		final List<Student> list = new ArrayList<Student>();
		jdbcTemplate.query(sqlStr, new RowCallbackHandler() {
			public void processRow(ResultSet rs) throws SQLException {
						Student student = new Student();
						student.setUserid(rs.getInt("userid"));
						student.setUsername(rs.getString("username"));
						student.setPassword(rs.getString("password"));
						student.setSex(rs.getString("sex"));
						student.setWord(rs.getString("word"));
						student.setAge(rs.getInt("age"));
						list.add(student);
					}
				});
		return list;
	}

	public void insertStudent(StudentRegist stu) {
		String sql = "insert into t_student(username,password,sex,word) value(?,?,?,?)";
		jdbcTemplate.update(sql,new Object[]{stu.getUsername(),stu.getPassword(),stu.getSex(),stu.getWord()});
	}

	public void lookForPassword(String password,String username, String sex, String word) {
		String sql = "update t_student set password = ? where username=? and sex=? and word = ?";
		jdbcTemplate.update(sql,new Object[]{password,username,sex,word});
	}

	public Student getMatchCount(String username, String password) {
		String sql = "select * from t_student where username = ? and password = ?";
		final Student stu = new Student();
		Object[] obj = new Object[]{username,password};
		jdbcTemplate.query(sql, obj, new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				stu.setUserid(rs.getInt(1));
				stu.setUsername(rs.getString("username"));
				stu.setPassword(rs.getString("password"));
				stu.setAge(rs.getInt("age"));
				stu.setSex(rs.getString("sex"));
				stu.setWord(rs.getString("word"));
			}
		});
		return stu;
	}
	
	//hxp
	public void saveOrUpdate(Student student) {
		if(student.getUserid() == 0){
			String sqlStr = "insert into t_student(username,password,age,sex,birth,collage,major,nation,classname,intake,word) values(?,?,?,?,?,?,?,?,?,?,?)";
			Object[] args = {student.getUsername(),student.getPassword(),student.getAge(),
			                 student.getSex(),student.getBirth(),student.getCollage(),student.getMajor(),student.getNation(),
			                 student.getClassname(),student.getIntake(),student.getWord()		
			                 };
			jdbcTemplate.update(sqlStr, args);
		}else{
			String sqlStr = "update t_student set username=?,age=?,sex=?,birth=?,collage=?,major=?,nation=?,classname=?,intake=?,word=? where userid=?";
			Object[] args = {student.getUsername(),student.getAge(),
	                 student.getSex(),student.getBirth(),student.getCollage(),student.getMajor(),student.getNation(),
	                 student.getClassname(),student.getIntake(),student.getWord(),student.getUserid()		
	                 };
			jdbcTemplate.update(sqlStr, args);
		}
		
	}

	public List<Student> findAll() {
		
		final List<Student> list = new ArrayList<Student>();
		String sqlStr = "select * from t_student";
		List rows = jdbcTemplate.queryForList(sqlStr);
		for(int i = 0; i < rows.size(); i++){
			Map studentMap = (Map) rows.get(i);
			Student student = new Student();
			student.setUserid((Integer) studentMap.get("userid"));
			student.setUsername((String) studentMap.get("username"));
			student.setPassword((String) studentMap.get("password"));
			student.setAge((Integer) studentMap.get("age"));
			student.setBirth((String) studentMap.get("birth"));
			student.setClassname((String) studentMap.get("classname"));
			student.setCollage((String) studentMap.get("collage"));
			student.setIntake((String) studentMap.get("intake"));
			student.setMajor((String) studentMap.get("major"));
			student.setNation((String) studentMap.get("nation"));
			student.setSex((String) studentMap.get("sex"));
			student.setWord((String) studentMap.get("word"));
			list.add(student);
		}
		return list;
	}

	public Student findById(int userid) {
		String sqlStr = "select t_student.* from t_student where userid=?";
		final Student student = new Student();
		jdbcTemplate.query(sqlStr, new Object[]{userid}, new RowCallbackHandler() {  
            @Override  
            public void processRow(ResultSet rs) throws SQLException {  
            	student.setUserid(rs.getInt("userid"));
            	student.setUsername(rs.getString("username"));
            	student.setPassword(rs.getString("password"));
            	student.setAge(rs.getInt("age"));
            	student.setBirth(rs.getString("birth"));
            	student.setClassname(rs.getString("classname"));
            	student.setCollage(rs.getString("collage"));
            	student.setIntake(rs.getString("intake"));
            	student.setMajor(rs.getString("major"));
            	student.setNation(rs.getString("nation"));
            	student.setSex(rs.getString("sex"));
            	student.setWord(rs.getString("word"));
            	
            }  
        });  
		return student;
	}

	public void delete(int userid) {
		String sqlStr = "delete from t_student where userid=?";
		jdbcTemplate.update(sqlStr, new Object[]{userid});
		
	}

	public Student findByUserNamePassword(String userName, String passWord) {
		String sqlStr = "select t_student.* from t_student where username=? and password=?";
		final Student student = new Student();
		jdbcTemplate.query(sqlStr, new Object[]{userName ,passWord}, new RowCallbackHandler() {  
            @Override  
            public void processRow(ResultSet rs) throws SQLException {  
            	student.setUserid(rs.getInt("userid"));
            	student.setUsername(rs.getString("username"));
            	student.setPassword(rs.getString("password"));
            	student.setAge(rs.getInt("age"));
            	student.setBirth(rs.getString("birth"));
            	student.setClassname(rs.getString("classname"));
            	student.setCollage(rs.getString("collage"));
            	student.setIntake(rs.getString("intake"));
            	student.setMajor(rs.getString("major"));
            	student.setNation(rs.getString("nation"));
            	student.setSex(rs.getString("sex"));
            	student.setWord(rs.getString("word"));
            	
            }  
        });  
		return student;
	}

	public List<Student> findByUserName(String username) {
		final List<Student> list = new ArrayList<Student>();
		String sqlStr = "select t_student.* from t_student where username=?";
		List rows = jdbcTemplate.queryForList(sqlStr,new Object[]{username});
		for(int i = 0; i < rows.size(); i++){
			Map studentMap = (Map) rows.get(i);
			Student student = new Student();
			student.setUserid((Integer) studentMap.get("userid"));
			student.setUsername((String) studentMap.get("username"));
			student.setPassword((String) studentMap.get("password"));
			student.setAge((Integer) studentMap.get("age"));
			student.setBirth((String) studentMap.get("birth"));
			student.setClassname((String) studentMap.get("classname"));
			student.setCollage((String) studentMap.get("collage"));
			student.setIntake((String) studentMap.get("intake"));
			student.setMajor((String) studentMap.get("major"));
			student.setNation((String) studentMap.get("nation"));
			student.setSex((String) studentMap.get("sex"));
			student.setWord((String) studentMap.get("word"));
			list.add(student);
		}
		return list;
	}

}
