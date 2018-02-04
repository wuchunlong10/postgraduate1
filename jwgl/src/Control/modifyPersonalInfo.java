package Control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Entity.teacherDao;
import Service.ModifyPersonalService;

@Controller
public class modifyPersonalInfo {
	@Autowired
	private ModifyPersonalService mService;
	
	@RequestMapping(value = "modifyInfo.html")
	public ModelAndView getPersonalInfomation(HttpServletRequest request,teacherDao teacher) {
		teacher = mService.getPersonalInfo("201703056");
		request.getSession().setAttribute("Info", teacher);
		return new ModelAndView("modifyTeacherInfo");
	}
	
	@RequestMapping(value = "modifyInfo3.html")
	public ModelAndView modifypersonalInfo(teacherDao teacher) {
		mService.ModifyPersonalInfo(teacher.getIdNumber(), teacher.getAddress(), teacher.getEducation(), teacher.getPhone(), teacher.getPrize());
		return new ModelAndView("message","message","修改成功！");
	}
}
