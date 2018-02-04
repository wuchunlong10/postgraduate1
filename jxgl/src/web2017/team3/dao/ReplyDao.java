package web2017.team3.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import web2017.team3.domain.Message;
import web2017.team3.domain.Reply;

@Repository
public class ReplyDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	   public List<Reply> getAllReply(){
	        final List<Reply> replylist = new ArrayList<Reply>();
	        String sql = "SELECT * FROM reply";
	        jdbcTemplate.query(sql, new RowCallbackHandler(){

				@Override
				public void processRow(ResultSet rs) throws SQLException {
					Reply reply = new Reply();
					reply.setContext(rs.getString("context"));                
	                replylist.add(reply);
				}
	        	
	        });
	        
	        return replylist;        
	    }
	   
	   public  void addMsg(final Message msg){
	  		jdbcTemplate.update("insert into message(context,wholeft,title) VALUES(?,?,?) ",
					new PreparedStatementSetter() {
						@Override
						public void setValues(PreparedStatement ps) throws SQLException {
							ps.setString(1, msg.getContext());
							//ps.setString(2, msg.getLefttime());
							ps.setString(2, msg.getWholeft());
							ps.setString(3, msg.getTitle());
						}
						
					});
			
	  		//System.out.println("userdao,addmsg");
	  	 }

	  	public ArrayList<Message> ShowAllMessage() {
			String sqlStr = "SELECT * FROM  message";
			final ArrayList<Message> msglist = new ArrayList<Message>();
			 jdbcTemplate.query(sqlStr, new RowCallbackHandler() {
				
				@Override
				public void processRow(ResultSet rs) throws SQLException {
					Message message = new Message();
					message.setContext(rs.getString("context"));
					message.setLefttime(rs.getString("lefttime"));
					message.setMessageid(rs.getInt("messageid"));
					message.setTitle(rs.getString("title"));
					message.setWholeft(rs.getString("wholeft"));
					message.setReply(rs.getString("reply"));
					msglist.add(message);
				}
			});
			//System.out.println("userdao,showallmessage");
			return msglist;
		}

	  	public Reply ShowAllreply(){
	  		
	  		String sqlStr="SELECT * FROM reply";
	  		final Reply reply=new Reply();
	  		jdbcTemplate.query(sqlStr,  new RowCallbackHandler() {

				public void processRow(ResultSet rs) throws SQLException {
					
					reply.setContext(rs.getString("context"));
				
					
				}
				
			});
			return reply;
			
		}
		
	  	public void addReply(final Reply reply,final int messageid) {

	  		jdbcTemplate.update("insert into reply(context,messageid)VALUES(?,?)",
					new PreparedStatementSetter() {
						@Override
						public void setValues(PreparedStatement ps) throws SQLException {
							ps.setString(1, reply.getContext());
							ps.setInt(2,messageid);
							
						}
						
					});
			
	  		System.out.println("reply.getcontext:"+reply.getContext());
	  	}
	  	
	  	public void deleteMsgByID(int messageid) {
	  		jdbcTemplate.update("DELETE FROM message WHERE messageid =?", new Object[] { messageid });
					
			
		System.out.println("userdao,delete");

	  	}
	  	
	  	
	  	public Message findMsgByMsgId(final int messageid) {
			String sqlStr = "SELECT * FROM message WHERE messageid =?";
			final Message msg= new Message();
			jdbcTemplate.query(sqlStr, new Object[] { messageid }, 
					
					new RowCallbackHandler() {

				public void processRow(ResultSet rs) throws SQLException {
					// TODO Auto-generated method stub
					msg.setMessageid(messageid);
					msg.setContext(rs.getString("context"));
					msg.setLefttime(rs.getString("lefttime"));
					msg.setTitle(rs.getString("title"));
					msg.setWholeft(rs.getString("wholeft"));
					System.out.println("userdao,findmsgbyid");
				}
				
			});
			return msg;
			
		}
		
	  	public void ModifyMsg(final String NewMsg, final int messageid) {
			jdbcTemplate.update("UPDATE message SET context = ? WHERE messageid =?", new PreparedStatementSetter() {
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					// TODO Auto-generated method stub
					ps.setString(1, NewMsg);
					
					ps.setInt(2, messageid);
					System.out.println("userdao,modifymsg");
				}
			});
		}
	  	
	  	public void addReplyinmsg(Reply reply,int messageid) {
	  		String sqlStr="update message set reply=? where messageid=?";
	  		Object[] args = { reply.getContext(),messageid };
	  		jdbcTemplate.update(sqlStr,args);
			
	  		
	  	}

}
