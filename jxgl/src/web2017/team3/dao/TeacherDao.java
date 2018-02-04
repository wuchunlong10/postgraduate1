package web2017.team3.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import web2017.team3.domain.Teacher;
@Repository
public class TeacherDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean isExistName(String username){
		String sql = "select count(*) from t_teacher where tname = ?";
		System.out.println(sql);
		return jdbcTemplate.queryForObject(sql, new Object[]{username},Integer.class)>0;
	}
	
	public int hasMatchCount(String username, String password) {
		String sql = " SELECT count(*) FROM t_teacher WHERE tname = ? and tpassword= ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{username,password},Integer.class);
	}

	public List<Teacher> searchAllTeacher() {
		String sqlStr = " SELECT * FROM t_teacher";
		final List<Teacher> list = new ArrayList<Teacher>();
		jdbcTemplate.query(sqlStr, new RowCallbackHandler() {
			public void processRow(ResultSet rs) throws SQLException {
						Teacher teacher = new Teacher();
						teacher.setTid(rs.getInt("tid"));
						teacher.setTname(rs.getString("tname"));
						teacher.setTpassword(rs.getString("tpassword"));
						teacher.setSex(rs.getString("sex"));
						teacher.setWord(rs.getString("word"));
						teacher.setAge(rs.getInt("age"));
						teacher.setMail(rs.getString("mail"));
						teacher.setAddress(rs.getString("address"));
						teacher.setAge(rs.getInt("dpn"));
						list.add(teacher);
					}
				});
		return list;
	}

	public Teacher getMatchCount(String username, String password) {
		String sql = "select * from t_teacher where tname = ? and tpassword = ?";
		final Teacher teacher = new Teacher();
		Object[] obj = new Object[]{username,password};
		jdbcTemplate.query(sql, obj, new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				teacher.setTid(rs.getInt(1));
				teacher.setTname(rs.getString("tname"));
				teacher.setTpassword(rs.getString("tpassword"));
				teacher.setAge(rs.getInt("age"));
				teacher.setSex(rs.getString("sex"));
				teacher.setWord(rs.getString("word"));
			}
		});
		return teacher;
	}

	public int getMatchCount(int tid, String tpassword) {
		String sqlStr = " SELECT tid FROM t_teacher "
				+ " WHERE  tpassword= ?";
		final Teacher teacher = new Teacher();
		jdbcTemplate.query(sqlStr, new Object[] {tpassword },
				new RowCallbackHandler() {
			public void processRow(ResultSet rs) throws SQLException {
						teacher.setTid(rs.getInt("tid"));
					}
				});
		return teacher.getTid();
	}

	
	
		public List<Teacher> searchteacher(){
			String sql="SELECT tid,tname,mail,tel,dpn,age,sex,address FROM t_teacher";
			final List forums = new ArrayList();
			jdbcTemplate.query(sql,
			new RowCallbackHandler() {
				public void processRow(ResultSet rs) throws SQLException{
					Teacher tea = new Teacher();
					tea.setTid(rs.getInt("tid"));
					tea.setTname(rs.getString("tname"));
					tea.setMail(rs.getString("mail"));
					tea.setTel(rs.getString("tel"));
					tea.setDpn(rs.getInt("dpn"));
					tea.setAge(rs.getInt("age"));
					tea.setSex(rs.getString("sex"));
					tea.setAddress(rs.getString("address"));
					
					
					forums.add(tea);
				}
			});
			return forums;
		}
	 public Teacher findTeacherByTid(int tid) {
			String sqlStr = "SELECT * FROM t_teacher WHERE tid =?";
			final Teacher teacher = new Teacher();
			jdbcTemplate.query(sqlStr, new Object[] { tid }, new RowCallbackHandler() {

				public void processRow(ResultSet rs) throws SQLException {
					// TODO Auto-generated method stub
					teacher.setTid(rs.getInt("tid"));
					teacher.setTpassword(rs.getString("tpassword"));
					teacher.setTname(rs.getString("tname"));
					teacher.setMail(rs.getString("mail"));
					teacher.setTel(rs.getString("tel"));
					teacher.setDpn(rs.getInt("dpn"));
					teacher.setAge(rs.getInt("age"));
					teacher.setSex(rs.getString("sex"));
					teacher.setAddress(rs.getString("address"));
					

				}
			});
			return teacher;
		}
	 public void addTeacher(final Teacher teacher){
	        String sql="insert into t_teacher(tid,tname,tpassword,mail,tel,dpn,age,sex,address) values(?,?,?,?,?,?,?,?,?)";
	        jdbcTemplate.update(sql, new PreparedStatementSetter() {
	            public void setValues(PreparedStatement ps) throws SQLException {
	            	ps.setInt(1,teacher.getTid());
	                ps.setString(2,teacher.getTname());
	                ps.setString(3,teacher.getTpassword());
	                ps.setString(4,teacher.getMail());
	                ps.setString(5,teacher.getTel());
	                ps.setInt(6,teacher.getDpn());
	                ps.setInt(7,teacher.getAge());
	                ps.setString(8,teacher.getSex());
	                ps.setString(9,teacher.getAddress());
	                
	                
	            }
	        });
	    }
	    public Teacher getTeacher(int tid){
	        String sql="select tname,mail,tel,dpn,age,sex,address from t_teacher where tid=?";
	        Teacher teacher=jdbcTemplate.queryForObject(sql,new Object[]{tid},new BeanPropertyRowMapper<Teacher>(Teacher.class));
	        return teacher;
	    }

	    public void update(String tname,String mail,String tel,int dpn,int age,String sex,String address,int tid){
	    	String sql="update t_teacher set tname='"+tname+"',mail='"+mail+"',tel='"+tel+"',dpn='"+dpn+"',age='"+age+"',sex='"+sex+"',address='"+address+"' where tid='"+tid+"'";
	        jdbcTemplate.update(sql);
	    }

	    public void delete(int tid){
	        String sql="delete from t_teacher where tid=?";
	        jdbcTemplate.update(sql,new Object[]{tid});
	    }
	    public void updatepas(String tpassword,int tid){
	    	String sql="update t_teacher set tpassword='"+tpassword+"' where tid='"+tid+"'";
	    	System.out.println(sql);
	        jdbcTemplate.update(sql);
	    }
	    
	    public int accuratematch(String tname){
			String sql="SELECT count(*) FROM t_teacher WHERE tname=?";
			Object[] info=new Object[]{tname};
			int i =  jdbcTemplate.queryForObject(sql, info, Integer.class);
			return i;
		}
		public Teacher accurate(String tname){
			String sql="SELECT * FROM t_teacher WHERE tname=?";
			Object[] info=new Object[]{tname};
			final Teacher  t= new Teacher();
			jdbcTemplate.query(sql,info,new RowCallbackHandler() {
				public void processRow(ResultSet rs) throws SQLException{
					t.setTid(rs.getInt("tid"));
					t.setTname(rs.getString("tname"));
					t.setTpassword(rs.getString("tpassword"));
					t.setMail(rs.getString("mail"));
					t.setTel(rs.getString("tel"));
					t.setDpn(rs.getInt("dpn"));
					t.setAge(rs.getInt("age"));
					t.setSex(rs.getString("sex"));
					t.setAddress(rs.getString("address"));
					
				}
			});
			return t;
		}

}
