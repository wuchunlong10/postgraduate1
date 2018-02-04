package web2017.team3.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web2017.team3.dao.ReplyDao;
import web2017.team3.domain.Message;
import web2017.team3.domain.Reply;

@Service
public class MessageService {
	@Autowired
	private ReplyDao userDao;

	// �ɹ��������
	public void addMsgSuccess(Message msg) {
		userDao.addMsg(msg);
		// System.out.println("userservice,addmsgsuccess");
		// msg.getLefttime();
	}

	// ��ʾ��������
	public ArrayList<Message> ShowMsgList() {
		ArrayList<Message> msgs = userDao.ShowAllMessage();
		// System.out.println("userservice,showmsglist");
		System.out.println(msgs);
		return msgs;
	}

	public Reply ShowReplyList() {

		return userDao.ShowAllreply();
	}

	// �ɹ��ظ�
/*	public void addReply(Reply reply, int messageid) {
		userDao.addReply(reply, messageid);
		System.out.println("userservice,addreply");
	}*/
	public void addReply(Reply reply,int messageid) {
		userDao.addReply(reply,messageid);
		userDao.addReplyinmsg(reply, messageid);
		System.out.println("userservice,addreply");
	}


	// ɾ������
	public void deleteMsgByID(int messageid) {
		System.out.println("userservice,delete...");
		userDao.deleteMsgByID(messageid);
	}

	public Message findMsgByMsgId(int messageid) {
		System.out.println("userservice,findmsgbyid");
		return userDao.findMsgByMsgId(messageid);

	}

	public void ModifyMsgBy(String NewMsg, int messageid) {

		userDao.ModifyMsg(NewMsg, messageid);
	}
}
