package Control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import Entity.User;
import Service.LoginService;

@Controller

public class LoginRequest {
	@Autowired
	private LoginService loginservice;
	@RequestMapping(value="/index.html")
	public ModelAndView index(){
		return new ModelAndView("role_login");
	}
	
	//�û���¼
	@RequestMapping(value="/loginCheck.html")
	public ModelAndView logincheck(HttpServletRequest request,User user,Model model){
		String rol = request.getParameter("userStatus");
		String loc = request.getParameter("loc");
		/*if(rol.equals("manager")){   //����Ա��½
			return new ModelAndView("adminhomepage");
		}*/
		if(rol.equals("manager")){   //����Ա��½
			if(user.getStudentId().equals("")  && user.getPassWord() .equals("") ) {
				return new ModelAndView("role_login", "error", "�������˺ţ�");
			} else if (!user.getStudentId().equals("")  && user.getPassWord() .equals("") ) {
				return new ModelAndView("role_login", "error", "���������룡");
			} else {
				return new ModelAndView("adminhomepage");
			}
		}
		else if(rol.equals("student")){	//ѧ����¼
			int flag=loginservice.logincheck(user.getStudentId(),user.getPassWord(),loc);
			if(flag<=0){
				return new ModelAndView("role_login", "error", "�û������������");
			}
			else{
				 user=loginservice.loginbystudentid(user.getStudentId());
				 model.addAttribute("user", user);
				 request.getSession().setAttribute("user", user);
				 return new ModelAndView("StudentHomePage");
			}
		}else{	//��ʦ��¼
			if(user.getStudentId().equals("")  && user.getPassWord() .equals("") ) {
				return new ModelAndView("role_login", "error", "�������˺ţ�");
			} else if (!user.getStudentId().equals("")  && user.getPassWord() .equals("") ) {
				return new ModelAndView("role_login", "error", "���������룡");
			} else {
				return new ModelAndView("main");
			}
		}

	}
}
