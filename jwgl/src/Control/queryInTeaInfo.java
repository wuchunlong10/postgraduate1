package Control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Entity.teacherDao;
import Service.queryTeacherInfo;

@Controller
public class queryInTeaInfo {
	@Autowired
	private queryTeacherInfo queryTeacherInfo;
	
	@RequestMapping(value = "queryInfo.html")
	public ModelAndView queryTeaInfo(HttpServletRequest request,String idNumber) {
		teacherDao teacher;
		teacher = queryTeacherInfo.queryTeacherInfomation("201703056");
		System.out.println(teacher.getName());
		System.out.println(teacher.getSex());
		request.getSession().setAttribute("teacher", teacher);
		return new  ModelAndView("queryInfomation");
	}
}
