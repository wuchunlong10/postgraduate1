package web2017.team3.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web2017.team3.domain.Message;

public class MyRowMapper2 implements RowMapper<Message> {

	@Override
	public Message mapRow(ResultSet rs, int num) throws SQLException {
		//
		int messageid = rs.getInt("messageid");
		String title = rs.getString("title");
		String context = rs.getString("context");
		String lefttime = rs.getString("lefttime");
		String wholeft = rs.getString("wholeft");
		String reply = rs.getString("reply");
		//
		Message msg = new Message();
		msg.setContext(context);
		msg.setMessageid(messageid);
		msg.setLefttime(lefttime);
		msg.setTitle(title);
		msg.setWholeft(wholeft);
		msg.setReply(reply);
		return msg;
	}

}