package web2017.team3.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import web2017.team3.domain.Admin;
import web2017.team3.domain.Student;
import web2017.team3.domain.Teacher;
import web2017.team3.service.AdminService;
import web2017.team3.service.StudentService;
import web2017.team3.service.TeacherService;

@Controller
public class LoginController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;

	@Autowired
	private AdminService adminService;

	@RequestMapping(value = "/login.html")
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}

	@RequestMapping(value = "/loginCheck.html")
	public ModelAndView loginCommand(HttpSession session,
			LoginCommand loginCommand) throws IOException {
		boolean isValidate = false;
		String checkcode1 = (String) session.getAttribute("checkcode");
		System.out.println("checkcode1 = " + checkcode1);
		System.out.println("yzm=====loginCommand.getYzm()="
				+ loginCommand.getYzm());
		System.out.println("LoginType=====loginCommand.getLoginType()="
				+ loginCommand.getLoginType());
		System.out.println("-----------------");
		System.out.println("checkcode1.equalsIgnoreCase(loginCommand.getYzm())"
				+ checkcode1.equalsIgnoreCase(loginCommand.getYzm()));
		if (checkcode1.equalsIgnoreCase(loginCommand.getYzm())) {
			System.out.println("验证码正确~");
			if ("student".equals(loginCommand.getLoginType())) {
				System.out.println("学生身份进来了");
				isValidate = studentService.hasMatchCount(
						loginCommand.getUsername(), loginCommand.getPassword());
				System.out
						.println("===是否有该用户====isValidate======" + isValidate);
				if (isValidate) {
					Student student = studentService.getMatchCount(
							loginCommand.getUsername(),
							loginCommand.getPassword());
					session.setAttribute("student", student);
					System.out.println("用户名为 " + student.getUsername()
							+ "  信息  " + student);
					System.out.println("-----");
					SimpleDateFormat sdf = new SimpleDateFormat(
							"yyyy-MM-dd HH:mm:ss");
					Date date = new Date();
					String formatDate = sdf.format(date);
					session.setAttribute("date", formatDate);
					return new ModelAndView("student");
				} else {
					return new ModelAndView("login", "error", "账号与密码不匹配");
				}
			} else if ("teacher".equals(loginCommand.getLoginType())) {
				isValidate = teacherService.hasMatchCount(
						loginCommand.getUsername(), loginCommand.getPassword());
				if (isValidate) {
					Teacher teacher = teacherService.getMatchCount(
							loginCommand.getUsername(),
							loginCommand.getPassword());
					session.setAttribute("teacher", teacher);
					System.out.println("--------" + teacher + "------------");
					session.setAttribute("teacher", teacher);
					return new ModelAndView("main2");
				} else {
					return new ModelAndView("login", "error", "账号与密码不匹配");
				}
			} else {
				System.out.println(loginCommand.getUsername() + "   "
						+ loginCommand.getPassword());
				isValidate = adminService.hasMatchCount(
						loginCommand.getUsername(), loginCommand.getPassword());
				System.out.println("isValidate:" + isValidate);
				if (isValidate) {
					Admin admin = adminService.getMatchCount(
							loginCommand.getUsername(),
							loginCommand.getPassword());
					session.setAttribute("admin", admin);
					return new ModelAndView("main");
				} else {
					return new ModelAndView("login", "error", "账号与密码不匹配");
				}
			}
		}
		return new ModelAndView("login", "error", "请重新输入验证码");
	}

	@RequestMapping(value = "/main.html")
	public ModelAndView main() {
		return new ModelAndView("main");
	}

	@RequestMapping(value = "/main3.html")
	public ModelAndView main3() {
		return new ModelAndView("main3");
	}

	@RequestMapping(value = "/register.html")
	public ModelAndView add() {
		return new ModelAndView("register");
	}

	@RequestMapping(value = "/addManager.html")
	public ModelAndView addManager(HttpServletRequest request,
			LoginCommand login) {
		Admin manager = new Admin();
		manager.setName(login.getUsername());
		manager.setPassword(login.getPassword());
		adminService.addManager(manager);
		return new ModelAndView("login");
	}

	@RequestMapping("/Change.html")
	public ModelAndView Change(LoginCommand log, Map<String, Object> map) {
		// String name=log.getName();
		// Manager manager=managerService.findByName(name);
		// map.put("manager",manager);
		return new ModelAndView("changpassword");
	}

	@RequestMapping("/Changepassword.html")
	public ModelAndView Changepassword(LoginCommand log) {
		System.out.println(log.getPassword());
		System.out.println(log.getUsername());
		adminService.update(log.getUsername(), log.getPassword());
		return new ModelAndView("main");
	}

}