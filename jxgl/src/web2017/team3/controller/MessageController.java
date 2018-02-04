package web2017.team3.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import web2017.team3.domain.Message;
import web2017.team3.domain.Reply;
import web2017.team3.service.MessageService;

@Controller
public class MessageController {
	@Autowired
	public MessageService userService;
	
	// 锟斤拷锟斤拷锟斤拷锟�
		@RequestMapping(value = "addMsg.html")
		public ModelAndView addMsg(HttpServletRequest request, MessageCommand msgcommand) {
			Message msg = new Message();
			
			msg.setContext(msgcommand.getContext());
			
			// msg.setLefttime(msgcommand.getLefttime());
			//msg.setMessageid(msgcommand.getMessageid());
			msg.setTitle(msgcommand.getTitle());
			msg.setWholeft(msgcommand.getWholeft());
			//System.out.println("logincontroller,addMsg");
			userService.addMsgSuccess(msg);
			// map.put("usr",user);
			return new ModelAndView("addSuccess");
		}

		// 锟斤拷示锟斤拷锟斤拷锟斤拷锟斤拷
		@RequestMapping(value = "ShowMessage.html")
		public ModelAndView ShowMessage(HttpServletRequest request, Map<String, Object> map) {
			ArrayList<Message> msgs = userService.ShowMsgList();
			//System.out.println("logincontroller,showmessage");
			map.put("msgList", msgs);
			return new ModelAndView("Showmsg");
		}
		
		
	//锟截革拷锟缴癸拷
		@RequestMapping(value="Reply.html")
		public ModelAndView ShowReply(HttpServletRequest request,MessageCommand msgCommand) {
			int messageid=msgCommand.getMessageid();
			request.setAttribute("messageid", messageid);
			return new ModelAndView("Reply");
			
		}
		@RequestMapping(value="addreply.html")
			public ModelAndView replyMessage(ReplyCommand replycommand, MessageCommand msgcommand,Map<String, Object> map) { 
				System.out.println("鍥炲鍐呭:"+replycommand.getContext()+","+"鍥炲ID:"+msgcommand.getMessageid());
				
				int messageid=msgcommand.getMessageid();
				System.out.println("addreply"+messageid);
				
				Reply reply=new Reply();
				reply.setContext(replycommand.getContext());
				userService.addReply(reply,messageid); 
				
				
				ArrayList<Message> msgs = userService.ShowMsgList();
				System.out.println(msgs);
				map.put("reply",userService.ShowReplyList());
				map.put("msgList", msgs);
				
			return new ModelAndView("Showmsg");
		}
		
		
		@RequestMapping(value="delmsg.html")
		public ModelAndView deleteMsgByID(MessageCommand msgcommand, Map<String, Object> map){
			// User user=loginCommand.
			System.out.println(msgcommand.getMessageid());
			int messageid=msgcommand.getMessageid();
			userService.deleteMsgByID(messageid);
			ArrayList<Message> msgs = userService.ShowMsgList();
			map.put("msgList", msgs);
			return new ModelAndView("Showmsg");
			}
		
		@RequestMapping(value="editmsg.html")
		public ModelAndView editpage(MessageCommand msgcommand,Map<String,Object> map) {
			int messageid=msgcommand.getMessageid();
			System.out.println(messageid);
			Message msg=userService.findMsgByMsgId(messageid);
			map.put("msg",msg);
			return new ModelAndView("editmsg");
		}
		
		@RequestMapping(value="editmsgdo.html")
		public ModelAndView editMsgByID(MessageCommand msgcommand,Map<String,Object> map) {
			
			userService.ModifyMsgBy(msgcommand.getContext(), msgcommand.getMessageid());
			System.out.println("messageid:"+msgcommand.getMessageid());
			ArrayList<Message> msgs = userService.ShowMsgList();
			map.put("msgList", msgs);
			return new ModelAndView("Showmsg");
		}
}
