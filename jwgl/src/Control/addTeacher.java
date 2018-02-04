package Control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Entity.teacherDao;
import Service.addTeacherService;

@Controller
public class addTeacher {
	@Autowired
	private addTeacherService addTeacherService;
	
	@RequestMapping(value = "/addTeacherNum.html")
	public  String addTeachers() {
		return "addTeacherInfo";
	}

	@RequestMapping(value = "/addTeacherInfo.html")
	public ModelAndView addTeacherInfo(HttpServletRequest request,teacherDao teacher) {
		teacher.getAddress();
		teacher.getEducation();
		teacher.getName();
		teacher.getNation();
		teacher.getNativePlace();
		teacher.getPhone();
		teacher.getPoliticalStatus();
		teacher.getPrize();
		teacher.getSex();
		teacher.getIdCard();
		teacher.getIdNumber();
		teacher.getSubjectName();
		addTeacherService.addTeacherInfoService(teacher);
		return new ModelAndView("message","message","添加成功！");
	}
	
}
