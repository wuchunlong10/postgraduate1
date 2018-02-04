package web2017.team3.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import web2017.team3.domain.Student;
import web2017.team3.domain.Teacher;
import web2017.team3.service.StudentService;
import web2017.team3.service.TeacherCommand;
import web2017.team3.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	private TeacherService tea;
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/loginCheck2.html")
	public ModelAndView loginCheck2(HttpServletRequest request,Teacher tt){
		System.out.println(tt.getTid()+"*******"+tt.getTpassword());
		boolean isValidUser = 
				tea.hasMatchUser(tt.getTid(),tt.getTpassword());
		if (!isValidUser) {
			return new ModelAndView("login2", "error", "教师编号或密码错误");
		} else {
			Teacher teacher = tea.findTeacherByTid(tt.getTid());
			System.out.println(teacher);
			request.getSession().setAttribute("teacher", teacher);
			return new ModelAndView("main2");
		}
		
	}
	
	@RequestMapping(value="/showAllTeacher.html")
	public ModelAndView searchteacher(HttpServletRequest request){
		List forums = new ArrayList();
		forums=tea.searchteacher();
		request.getSession().setAttribute("forums", forums);
		return new ModelAndView("showAllTeacher");
	}
	@RequestMapping(value="showallstudent.html")
	public ModelAndView showallstudent(HttpServletRequest request, Model model) throws ServletException, IOException {
		//TODO
		List<Student> list = studentService.findAllStudnt();
		model.addAttribute("list", list);
		return new ModelAndView("showStudent");
	}
	@RequestMapping(value="liuyanban.html")
	public ModelAndView liuyanban(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return new ModelAndView("liuyanban");
	}
	
	@RequestMapping(value="deleteTeacherByID.html")
	public ModelAndView deleteTeacherByID(HttpServletRequest request,TeacherCommand teacher1){
		int tid=teacher1.getTid();
		System.out.println(tid);
		tea.delete(tid);
		return new ModelAndView("delete");
		}
	
	@RequestMapping(value="add.html")
	public ModelAndView add(){
		return new ModelAndView("add");
		}
	@RequestMapping(value="addTeacher.html")
	public ModelAndView addTeacher(HttpServletRequest request,TeacherCommand teacher1){
		Teacher teacher=new Teacher();
		teacher.setTid(teacher1.getTid());
		teacher.setTname(teacher1.getTname());
		teacher.setTpassword(teacher1.getTpassword());
		teacher.setMail(teacher1.getMail());
		teacher.setTel(teacher1.getTel());
		teacher.setDpn(teacher1.getDpn());
		teacher.setAge(teacher1.getAge());
		teacher.setSex(teacher1.getSex());
		teacher.setAddress(teacher1.getAddress());
		tea.addTeacher(teacher);
		return new ModelAndView("main");
		}
	@RequestMapping("modify1.html")
	public ModelAndView ModifyPage(TeacherCommand teacher1,HttpServletRequest request){
		Teacher teacher2=tea.findTeacherByTid(teacher1.getTid());
		request.getSession().setAttribute("teachermodify", teacher2);
		return new ModelAndView("modify");
		}
	
	@RequestMapping("modify2.html")
	public ModelAndView ModifyTell(TeacherCommand teacher1){
		tea.update(teacher1.getTname(),teacher1.getMail(),teacher1.getTel(),teacher1.getDpn(),teacher1.getAge(),teacher1.getSex(),teacher1.getAddress(),teacher1.getTid());
		return new ModelAndView("main");
		}
	
	@RequestMapping(value="Logout.html")
	public ModelAndView Logout(HttpServletRequest request, HttpServletResponse response,HttpSession session) throws ServletException, IOException {
		
		return new ModelAndView("exit");
	}
	@RequestMapping("Change2.html")
	public ModelAndView change2(TeacherCommand teacher,Map<String,Object> map){
		return new ModelAndView("changpassword2");
		}
	@RequestMapping("Changepassword2.html")
	public ModelAndView changepassword2(TeacherCommand teacher){
		System.out.println(teacher.getTid());
		System.out.println(teacher.getTpassword());
		tea.updatepas(teacher.getTpassword(),teacher.getTid());
		return new ModelAndView("main2");
		}
	
	@RequestMapping(value="accurate.html")
	public ModelAndView accurate(HttpServletRequest request,Teacher t){
		int flag=tea.accuratematch(t.getTname());
		if(flag>0)
		{
			Teacher t1=tea.accurate(t.getTname());
			request.getSession().setAttribute("useraccurate", t1);
			return new ModelAndView("accurate_result");
		}
		else{
			return new ModelAndView("main");
		}
	}

}
