package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import Entity.Evaluate;

@Repository
public class queryPingjiao {
		@Autowired
		private JdbcTemplate jdbcTemplate;
	
		public List<Evaluate> queryCourse(String idNumber) {
			String sql = "select SubjectNumber,SubjectName from teacher_teach where idNumber = ?";	
			final List<Evaluate> sList = new ArrayList<Evaluate>();
			jdbcTemplate.query(sql,new Object[] {idNumber},new RowCallbackHandler(){
				public void processRow(ResultSet rs) throws SQLException {
				final Evaluate evaluate = new Evaluate();
				evaluate.setSubjectName(rs.getString("SubjectName"));
				evaluate.setSubjectNumber(rs.getInt("SubjectNumber"));
				sList.add(evaluate);
				}
			});
			System.out.println("test1");
			return sList;
		}
		
		public  List<Evaluate> queryPingJiao(String SubjectName) {
			final List<Evaluate> eList = new ArrayList<Evaluate>();
			String sql = "select Commen,Mark,Option1,Option2,Option3,Option4,Topic1,Topic2,Topic3,Topic4 from evaluationb where SubjectName = ?";
			jdbcTemplate.query(sql,new Object[] {SubjectName},new RowCallbackHandler(){
				public void processRow(ResultSet rs) throws SQLException {
				final Evaluate evaluate = new Evaluate();
				evaluate.setMark(rs.getInt("Mark"));
				evaluate.setComment(rs.getString("Commen"));
				evaluate.setOption1(rs.getString("Option1"));
				evaluate.setOption2(rs.getString("Option2"));
				evaluate.setOption3(rs.getString("Option3"));
				evaluate.setOption4(rs.getString("Option4"));
				evaluate.setTopic1(rs.getString("Topic1"));
				evaluate.setTopic2(rs.getString("Topic2"));
				evaluate.setTopic3(rs.getString("Topic3"));
				evaluate.setTopic4(rs.getString("Topic4"));
				System.out.println(rs.getString("Commen"));
				eList.add(evaluate);
				}
			});
			return eList;
		}
}
