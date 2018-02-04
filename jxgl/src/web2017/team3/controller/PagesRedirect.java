package web2017.team3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class PagesRedirect {
	
	@RequestMapping(value="imgUpload.html")
	public ModelAndView fileUpload(){
		return new ModelAndView("imgUpload");
	}
	@RequestMapping(value="searchStudentInfo.html")
	public ModelAndView searchStudentInfo(){
		return new ModelAndView("searchStudentInfo");
	}
	@RequestMapping(value="lookAlbum.html")
	public ModelAndView lookAlbum(){
		return new ModelAndView("lookAlbum");
	}
	
	@RequestMapping(value="/addStudent.html")
	public ModelAndView searchPassword(){
		return new ModelAndView("addStudent");
	}
	@RequestMapping(value="/message.html")
	public ModelAndView message(){
		return new ModelAndView("addMsg");
	}
}
