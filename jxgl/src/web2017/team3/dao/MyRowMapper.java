package web2017.team3.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web2017.team3.domain.Teacher;

public class MyRowMapper implements RowMapper<Teacher> {

	public Teacher mapRow(ResultSet rs, int num) throws SQLException {
		 //浠庣粨鏋滈泦閲屾妸鏁版嵁寰楀埌
		int tid=rs.getInt("tid");
		 String tname=rs.getString("tname");
		 String mail=rs.getString("mail");
		 String tel=rs.getString("tel");
		 int dpn=rs.getInt("dpn");
		
		 //鎶婃暟鎹皝瑁呭埌瀵硅薄閲�
		 Teacher tea=new Teacher();
		 tea.setTid(tid);
		 tea.setTname(tname);
		 tea.setMail(mail);
		 tea.setTel(tel);
		 tea.setDpn(dpn);
		 return tea;
		 }
		
		

}