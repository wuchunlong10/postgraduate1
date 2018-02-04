package web2017.team3.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import web2017.team3.domain.Admin;
@Repository
public class AdminDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean isExistName(String username){
		String sql = "select count(*) from t_admin where name = ?";
		System.out.println(sql);
		return jdbcTemplate.queryForObject(sql, new Object[]{username},Integer.class)>0;
	}
	
	public int hasMatchCount(String username, String password) {
		String sql = " SELECT count(*) FROM t_admin WHERE name =? and password= ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{username,password},Integer.class);
	}

	/*public List<Student> searchAllStudent() {
		String sqlStr = " SELECT * FROM t_admin";
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
	}*/
	
	public Admin getMatchCount(String username, String password) {
		String sql = "select * from t_admin where name = ? and password = ?";
		final Admin admin = new Admin();
		Object[] obj = new Object[]{username,password};
		jdbcTemplate.query(sql, obj, new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				admin.setId(rs.getInt("id"));
				admin.setName(rs.getString("name"));
				admin.setPassword(rs.getString("password"));
				admin.setAge(rs.getInt("age"));
				admin.setSex(rs.getString("sex"));
				admin.setWord(rs.getString("word"));
			}
		});
		return admin;
	}
	
	
//xfs
		public int getMatchCount1(String name, String password) {
			String sqlStr = " SELECT id FROM t_admin "
					+ " WHERE name =? and password= ?";
			final Admin manager = new Admin();
			jdbcTemplate.query(sqlStr, new Object[] { name,password },
					new RowCallbackHandler() {
				public void processRow(ResultSet rs) throws SQLException {
					manager.setId(rs.getInt("id"));
						}
					});
			return manager.getId();
		}

		public Admin findByName(String name) {
			String sqlStr = " SELECT * FROM t_admin WHERE name =? ";
			final Admin mar = new Admin();
			jdbcTemplate.query(sqlStr, new Object[] { name },
					new RowCallbackHandler() {
				public void processRow(ResultSet rs) throws SQLException {
							mar.setName(rs.getString("name"));
							mar.setPassword(rs.getString("password"));
						}
					});
			return mar;
		}
		public void addManager(final Admin manager){
	        String sql="insert into t_admin(name,password) values(?,?)";
	        jdbcTemplate.update(sql, new PreparedStatementSetter() {
	            public void setValues(PreparedStatement ps) throws SQLException {
	                ps.setString(1,manager.getName());
	                ps.setString(2,manager.getPassword());
	                
	                
	            }
	        });
	    }
		  public void update(String name,String password){
		    	String sql="update t_admin set password='"+password+"' where name='"+name+"'";
		    	System.out.println(sql);
		        jdbcTemplate.update(sql);
		    }
	
	
	
	
}