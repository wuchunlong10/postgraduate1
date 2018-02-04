package Control;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Calendar;  
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javassist.bytecode.Descriptor.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Entity.Course;
import Entity.Evaluate;
import Entity.SelectCourse;
import Entity.User;
import Entity.StudentTeacher;
import Service.OtherService;
@Controller
public class OtherRequest {
	@Autowired
	private OtherService otherservice;
	@RequestMapping(value="/shouye.html")
	public ModelAndView shouye(){
		return new ModelAndView("index");
	}
	//成绩查询
	@RequestMapping(value="/queryscore.html")
	public ModelAndView queryscore(HttpServletRequest request,User user){
		List list = new ArrayList();
		list = otherservice.queryscore(user.getStudentId());
		request.getSession().setAttribute("scorelist", list);
		return new ModelAndView("QueryScore");
	}
	
	//课表查询
	@RequestMapping(value="/querycourse.html")
	public ModelAndView querycourse(HttpServletRequest request,User user){
		List list = new ArrayList();
		list = otherservice.querycourse(user.getStudentId());
		for(int i=0;i<list.size();i++){
			Course course = (Course) list.get(i);
			int time = course.getTime();
			if(time==11){
				request.getSession().setAttribute("time11", time);
				request.getSession().setAttribute("subjectname11", course.getSubjectName());
				request.getSession().setAttribute("place11", course.getPlace());
				request.getSession().setAttribute("teachername11", course.getTeacherName());
				
				request.getSession().setAttribute("time12", "");
				request.getSession().setAttribute("subjectname12", "");
				request.getSession().setAttribute("place12", "");
				request.getSession().setAttribute("teachername12", "");
				
				request.getSession().setAttribute("time13", time);
				request.getSession().setAttribute("subjectname13", "");
				request.getSession().setAttribute("place13", "");
				request.getSession().setAttribute("teachername13", "");
				
				request.getSession().setAttribute("time14", "");
				request.getSession().setAttribute("subjectname14", "");
				request.getSession().setAttribute("place14", "");
				request.getSession().setAttribute("teachername15", "");
				
				request.getSession().setAttribute("time15", "");
				request.getSession().setAttribute("subjectname15", "");
				request.getSession().setAttribute("place15", "");
				request.getSession().setAttribute("teachername15", "");
				
				request.getSession().setAttribute("time21", "");
				request.getSession().setAttribute("subjectname21", "");
				request.getSession().setAttribute("place21", "");
				request.getSession().setAttribute("teachername21", "");
				
				request.getSession().setAttribute("time22", "");
				request.getSession().setAttribute("subjectname22", "");
				request.getSession().setAttribute("place22", "");
				request.getSession().setAttribute("teachername22", "");
				
				request.getSession().setAttribute("time23", "");
				request.getSession().setAttribute("subjectname23", "");
				request.getSession().setAttribute("place23", "");
				request.getSession().setAttribute("teachername23", "");
				
				request.getSession().setAttribute("time24", "");
				request.getSession().setAttribute("subjectname24", "");
				request.getSession().setAttribute("place24", "");
				request.getSession().setAttribute("teachername24", "");
				
				request.getSession().setAttribute("time25", "");
				request.getSession().setAttribute("subjectname25", "");
				request.getSession().setAttribute("place25", "");
				request.getSession().setAttribute("teachername25", "");
				
				request.getSession().setAttribute("time31", "");
				request.getSession().setAttribute("subjectname31", "");
				request.getSession().setAttribute("place31", "");
				request.getSession().setAttribute("teachername31", "");
				request.getSession().setAttribute("time32", "");
				request.getSession().setAttribute("subjectname32", "");
				request.getSession().setAttribute("place32", "");
				request.getSession().setAttribute("teachername32", "");
				request.getSession().setAttribute("time33", "");
				request.getSession().setAttribute("subjectname33", "");
				request.getSession().setAttribute("place33", "");
				request.getSession().setAttribute("teachername33", "");
				request.getSession().setAttribute("time34", "");
				request.getSession().setAttribute("subjectname34", "");
				request.getSession().setAttribute("place34", "");
				request.getSession().setAttribute("teachername34", "");
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
				
			}
			else if(time==12){
				request.getSession().setAttribute("time12", time);
				request.getSession().setAttribute("subjectname12", course.getSubjectName());
				request.getSession().setAttribute("place12", course.getPlace());
				request.getSession().setAttribute("teachername12", course.getTeacherName());
				
				
				request.getSession().setAttribute("time13", time);
				request.getSession().setAttribute("subjectname13", "");
				request.getSession().setAttribute("place13", "");
				request.getSession().setAttribute("teachername13", "");
				
				request.getSession().setAttribute("time14", "");
				request.getSession().setAttribute("subjectname14", "");
				request.getSession().setAttribute("place14", "");
				request.getSession().setAttribute("teachername15", "");
				
				request.getSession().setAttribute("time15", "");
				request.getSession().setAttribute("subjectname15", "");
				request.getSession().setAttribute("place15", "");
				request.getSession().setAttribute("teachername15", "");
				
				request.getSession().setAttribute("time21", "");
				request.getSession().setAttribute("subjectname21", "");
				request.getSession().setAttribute("place21", "");
				request.getSession().setAttribute("teachername21", "");
				
				request.getSession().setAttribute("time22", "");
				request.getSession().setAttribute("subjectname22", "");
				request.getSession().setAttribute("place22", "");
				request.getSession().setAttribute("teachername22", "");
				
				request.getSession().setAttribute("time23", "");
				request.getSession().setAttribute("subjectname23", "");
				request.getSession().setAttribute("place23", "");
				request.getSession().setAttribute("teachername23", "");
				
				request.getSession().setAttribute("time24", "");
				request.getSession().setAttribute("subjectname24", "");
				request.getSession().setAttribute("place24", "");
				request.getSession().setAttribute("teachername24", "");
				
				request.getSession().setAttribute("time25", "");
				request.getSession().setAttribute("subjectname25", "");
				request.getSession().setAttribute("place25", "");
				request.getSession().setAttribute("teachername25", "");
				
				request.getSession().setAttribute("time31", "");
				request.getSession().setAttribute("subjectname31", "");
				request.getSession().setAttribute("place31", "");
				request.getSession().setAttribute("teachername31", "");
				request.getSession().setAttribute("time32", "");
				request.getSession().setAttribute("subjectname32", "");
				request.getSession().setAttribute("place32", "");
				request.getSession().setAttribute("teachername32", "");
				request.getSession().setAttribute("time33", "");
				request.getSession().setAttribute("subjectname33", "");
				request.getSession().setAttribute("place33", "");
				request.getSession().setAttribute("teachername33", "");
				request.getSession().setAttribute("time34", "");
				request.getSession().setAttribute("subjectname34", "");
				request.getSession().setAttribute("place34", "");
				request.getSession().setAttribute("teachername34", "");
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==13){
				request.getSession().setAttribute("time13", time);
				request.getSession().setAttribute("subjectname13", course.getSubjectName());
				request.getSession().setAttribute("place13", course.getPlace());
				request.getSession().setAttribute("teachername13", course.getTeacherName());
				
				request.getSession().setAttribute("time14", "");
				request.getSession().setAttribute("subjectname14", "");
				request.getSession().setAttribute("place14", "");
				request.getSession().setAttribute("teachername15", "");
				
				request.getSession().setAttribute("time15", "");
				request.getSession().setAttribute("subjectname15", "");
				request.getSession().setAttribute("place15", "");
				request.getSession().setAttribute("teachername15", "");
				
				request.getSession().setAttribute("time21", "");
				request.getSession().setAttribute("subjectname21", "");
				request.getSession().setAttribute("place21", "");
				request.getSession().setAttribute("teachername21", "");
				
				request.getSession().setAttribute("time22", "");
				request.getSession().setAttribute("subjectname22", "");
				request.getSession().setAttribute("place22", "");
				request.getSession().setAttribute("teachername22", "");
				
				request.getSession().setAttribute("time23", "");
				request.getSession().setAttribute("subjectname23", "");
				request.getSession().setAttribute("place23", "");
				request.getSession().setAttribute("teachername23", "");
				
				request.getSession().setAttribute("time24", "");
				request.getSession().setAttribute("subjectname24", "");
				request.getSession().setAttribute("place24", "");
				request.getSession().setAttribute("teachername24", "");
				
				request.getSession().setAttribute("time25", "");
				request.getSession().setAttribute("subjectname25", "");
				request.getSession().setAttribute("place25", "");
				request.getSession().setAttribute("teachername25", "");
				
				request.getSession().setAttribute("time31", "");
				request.getSession().setAttribute("subjectname31", "");
				request.getSession().setAttribute("place31", "");
				request.getSession().setAttribute("teachername31", "");
				request.getSession().setAttribute("time32", "");
				request.getSession().setAttribute("subjectname32", "");
				request.getSession().setAttribute("place32", "");
				request.getSession().setAttribute("teachername32", "");
				request.getSession().setAttribute("time33", "");
				request.getSession().setAttribute("subjectname33", "");
				request.getSession().setAttribute("place33", "");
				request.getSession().setAttribute("teachername33", "");
				request.getSession().setAttribute("time34", "");
				request.getSession().setAttribute("subjectname34", "");
				request.getSession().setAttribute("place34", "");
				request.getSession().setAttribute("teachername34", "");
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==14){
				request.getSession().setAttribute("time14", time);
				request.getSession().setAttribute("subjectname14", course.getSubjectName());
				request.getSession().setAttribute("place14", course.getPlace());
				request.getSession().setAttribute("teachername14", course.getTeacherName());
				
				
				request.getSession().setAttribute("time15", "");
				request.getSession().setAttribute("subjectname15", "");
				request.getSession().setAttribute("place15", "");
				request.getSession().setAttribute("teachername15", "");
				
				request.getSession().setAttribute("time21", "");
				request.getSession().setAttribute("subjectname21", "");
				request.getSession().setAttribute("place21", "");
				request.getSession().setAttribute("teachername21", "");
				
				request.getSession().setAttribute("time22", "");
				request.getSession().setAttribute("subjectname22", "");
				request.getSession().setAttribute("place22", "");
				request.getSession().setAttribute("teachername22", "");
				
				request.getSession().setAttribute("time23", "");
				request.getSession().setAttribute("subjectname23", "");
				request.getSession().setAttribute("place23", "");
				request.getSession().setAttribute("teachername23", "");
				
				request.getSession().setAttribute("time24", "");
				request.getSession().setAttribute("subjectname24", "");
				request.getSession().setAttribute("place24", "");
				request.getSession().setAttribute("teachername24", "");
				
				request.getSession().setAttribute("time25", "");
				request.getSession().setAttribute("subjectname25", "");
				request.getSession().setAttribute("place25", "");
				request.getSession().setAttribute("teachername25", "");
				
				request.getSession().setAttribute("time31", "");
				request.getSession().setAttribute("subjectname31", "");
				request.getSession().setAttribute("place31", "");
				request.getSession().setAttribute("teachername31", "");
				request.getSession().setAttribute("time32", "");
				request.getSession().setAttribute("subjectname32", "");
				request.getSession().setAttribute("place32", "");
				request.getSession().setAttribute("teachername32", "");
				request.getSession().setAttribute("time33", "");
				request.getSession().setAttribute("subjectname33", "");
				request.getSession().setAttribute("place33", "");
				request.getSession().setAttribute("teachername33", "");
				request.getSession().setAttribute("time34", "");
				request.getSession().setAttribute("subjectname34", "");
				request.getSession().setAttribute("place34", "");
				request.getSession().setAttribute("teachername34", "");
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==15){
				request.getSession().setAttribute("time15", time);
				request.getSession().setAttribute("subjectname15", course.getSubjectName());
				request.getSession().setAttribute("place15", course.getPlace());
				request.getSession().setAttribute("teachername15", course.getTeacherName());
				
				
				request.getSession().setAttribute("time21", "");
				request.getSession().setAttribute("subjectname21", "");
				request.getSession().setAttribute("place21", "");
				request.getSession().setAttribute("teachername21", "");
				
				request.getSession().setAttribute("time22", "");
				request.getSession().setAttribute("subjectname22", "");
				request.getSession().setAttribute("place22", "");
				request.getSession().setAttribute("teachername22", "");
				
				request.getSession().setAttribute("time23", "");
				request.getSession().setAttribute("subjectname23", "");
				request.getSession().setAttribute("place23", "");
				request.getSession().setAttribute("teachername23", "");
				
				request.getSession().setAttribute("time24", "");
				request.getSession().setAttribute("subjectname24", "");
				request.getSession().setAttribute("place24", "");
				request.getSession().setAttribute("teachername24", "");
				
				request.getSession().setAttribute("time25", "");
				request.getSession().setAttribute("subjectname25", "");
				request.getSession().setAttribute("place25", "");
				request.getSession().setAttribute("teachername25", "");
				
				request.getSession().setAttribute("time31", "");
				request.getSession().setAttribute("subjectname31", "");
				request.getSession().setAttribute("place31", "");
				request.getSession().setAttribute("teachername31", "");
				request.getSession().setAttribute("time32", "");
				request.getSession().setAttribute("subjectname32", "");
				request.getSession().setAttribute("place32", "");
				request.getSession().setAttribute("teachername32", "");
				request.getSession().setAttribute("time33", "");
				request.getSession().setAttribute("subjectname33", "");
				request.getSession().setAttribute("place33", "");
				request.getSession().setAttribute("teachername33", "");
				request.getSession().setAttribute("time34", "");
				request.getSession().setAttribute("subjectname34", "");
				request.getSession().setAttribute("place34", "");
				request.getSession().setAttribute("teachername34", "");
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==21){
				request.getSession().setAttribute("time21", time);
				request.getSession().setAttribute("subjectname21", course.getSubjectName());
				request.getSession().setAttribute("place21", course.getPlace());
				request.getSession().setAttribute("teachername21", course.getTeacherName());
				
				request.getSession().setAttribute("time22", "");
				request.getSession().setAttribute("subjectname22", "");
				request.getSession().setAttribute("place22", "");
				request.getSession().setAttribute("teachername22", "");
				
				request.getSession().setAttribute("time23", "");
				request.getSession().setAttribute("subjectname23", "");
				request.getSession().setAttribute("place23", "");
				request.getSession().setAttribute("teachername23", "");
				
				request.getSession().setAttribute("time24", "");
				request.getSession().setAttribute("subjectname24", "");
				request.getSession().setAttribute("place24", "");
				request.getSession().setAttribute("teachername24", "");
				
				request.getSession().setAttribute("time25", "");
				request.getSession().setAttribute("subjectname25", "");
				request.getSession().setAttribute("place25", "");
				request.getSession().setAttribute("teachername25", "");
				
				request.getSession().setAttribute("time31", "");
				request.getSession().setAttribute("subjectname31", "");
				request.getSession().setAttribute("place31", "");
				request.getSession().setAttribute("teachername31", "");
				request.getSession().setAttribute("time32", "");
				request.getSession().setAttribute("subjectname32", "");
				request.getSession().setAttribute("place32", "");
				request.getSession().setAttribute("teachername32", "");
				request.getSession().setAttribute("time33", "");
				request.getSession().setAttribute("subjectname33", "");
				request.getSession().setAttribute("place33", "");
				request.getSession().setAttribute("teachername33", "");
				request.getSession().setAttribute("time34", "");
				request.getSession().setAttribute("subjectname34", "");
				request.getSession().setAttribute("place34", "");
				request.getSession().setAttribute("teachername34", "");
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==22){
				request.getSession().setAttribute("time22", time);
				request.getSession().setAttribute("subjectname22", course.getSubjectName());
				request.getSession().setAttribute("place22", course.getPlace());
				request.getSession().setAttribute("teachername22", course.getTeacherName());
				
				request.getSession().setAttribute("time23", "");
				request.getSession().setAttribute("subjectname23", "");
				request.getSession().setAttribute("place23", "");
				request.getSession().setAttribute("teachername23", "");
				
				request.getSession().setAttribute("time24", "");
				request.getSession().setAttribute("subjectname24", "");
				request.getSession().setAttribute("place24", "");
				request.getSession().setAttribute("teachername24", "");
				
				request.getSession().setAttribute("time25", "");
				request.getSession().setAttribute("subjectname25", "");
				request.getSession().setAttribute("place25", "");
				request.getSession().setAttribute("teachername25", "");
				
				request.getSession().setAttribute("time31", "");
				request.getSession().setAttribute("subjectname31", "");
				request.getSession().setAttribute("place31", "");
				request.getSession().setAttribute("teachername31", "");
				request.getSession().setAttribute("time32", "");
				request.getSession().setAttribute("subjectname32", "");
				request.getSession().setAttribute("place32", "");
				request.getSession().setAttribute("teachername32", "");
				request.getSession().setAttribute("time33", "");
				request.getSession().setAttribute("subjectname33", "");
				request.getSession().setAttribute("place33", "");
				request.getSession().setAttribute("teachername33", "");
				request.getSession().setAttribute("time34", "");
				request.getSession().setAttribute("subjectname34", "");
				request.getSession().setAttribute("place34", "");
				request.getSession().setAttribute("teachername34", "");
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==23){
				request.getSession().setAttribute("time23", time);
				request.getSession().setAttribute("subjectname23", course.getSubjectName());
				request.getSession().setAttribute("place23", course.getPlace());
				request.getSession().setAttribute("teachername24", course.getTeacherName());
				
				
				request.getSession().setAttribute("time24", "");
				request.getSession().setAttribute("subjectname24", "");
				request.getSession().setAttribute("place24", "");
				request.getSession().setAttribute("teachername24", "");
				
				request.getSession().setAttribute("time25", "");
				request.getSession().setAttribute("subjectname25", "");
				request.getSession().setAttribute("place25", "");
				request.getSession().setAttribute("teachername25", "");
				
				request.getSession().setAttribute("time31", "");
				request.getSession().setAttribute("subjectname31", "");
				request.getSession().setAttribute("place31", "");
				request.getSession().setAttribute("teachername31", "");
				request.getSession().setAttribute("time32", "");
				request.getSession().setAttribute("subjectname32", "");
				request.getSession().setAttribute("place32", "");
				request.getSession().setAttribute("teachername32", "");
				request.getSession().setAttribute("time33", "");
				request.getSession().setAttribute("subjectname33", "");
				request.getSession().setAttribute("place33", "");
				request.getSession().setAttribute("teachername33", "");
				request.getSession().setAttribute("time34", "");
				request.getSession().setAttribute("subjectname34", "");
				request.getSession().setAttribute("place34", "");
				request.getSession().setAttribute("teachername34", "");
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==24){
				request.getSession().setAttribute("time24", time);
				request.getSession().setAttribute("subjectname24", course.getSubjectName());
				request.getSession().setAttribute("place24", course.getPlace());
				request.getSession().setAttribute("teachername24", course.getTeacherName());
				
				
				request.getSession().setAttribute("time25", "");
				request.getSession().setAttribute("subjectname25", "");
				request.getSession().setAttribute("place25", "");
				request.getSession().setAttribute("teachername25", "");
				
				request.getSession().setAttribute("time31", "");
				request.getSession().setAttribute("subjectname31", "");
				request.getSession().setAttribute("place31", "");
				request.getSession().setAttribute("teachername31", "");
				request.getSession().setAttribute("time32", "");
				request.getSession().setAttribute("subjectname32", "");
				request.getSession().setAttribute("place32", "");
				request.getSession().setAttribute("teachername32", "");
				request.getSession().setAttribute("time33", "");
				request.getSession().setAttribute("subjectname33", "");
				request.getSession().setAttribute("place33", "");
				request.getSession().setAttribute("teachername33", "");
				request.getSession().setAttribute("time34", "");
				request.getSession().setAttribute("subjectname34", "");
				request.getSession().setAttribute("place34", "");
				request.getSession().setAttribute("teachername34", "");
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==25){
				request.getSession().setAttribute("time25", time);
				request.getSession().setAttribute("subjectname25", course.getSubjectName());
				request.getSession().setAttribute("place25", course.getPlace());
				request.getSession().setAttribute("teachername25", course.getTeacherName());
				
				
				request.getSession().setAttribute("time31", "");
				request.getSession().setAttribute("subjectname31", "");
				request.getSession().setAttribute("place31", "");
				request.getSession().setAttribute("teachername31", "");
				request.getSession().setAttribute("time32", "");
				request.getSession().setAttribute("subjectname32", "");
				request.getSession().setAttribute("place32", "");
				request.getSession().setAttribute("teachername32", "");
				request.getSession().setAttribute("time33", "");
				request.getSession().setAttribute("subjectname33", "");
				request.getSession().setAttribute("place33", "");
				request.getSession().setAttribute("teachername33", "");
				request.getSession().setAttribute("time34", "");
				request.getSession().setAttribute("subjectname34", "");
				request.getSession().setAttribute("place34", "");
				request.getSession().setAttribute("teachername34", "");
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==31){
				request.getSession().setAttribute("time31", time);
				request.getSession().setAttribute("subjectname31", course.getSubjectName());
				request.getSession().setAttribute("place31", course.getPlace());
				request.getSession().setAttribute("teachername31", course.getTeacherName());
				
				request.getSession().setAttribute("time32", "");
				request.getSession().setAttribute("subjectname32", "");
				request.getSession().setAttribute("place32", "");
				request.getSession().setAttribute("teachername32", "");
				request.getSession().setAttribute("time33", "");
				request.getSession().setAttribute("subjectname33", "");
				request.getSession().setAttribute("place33", "");
				request.getSession().setAttribute("teachername33", "");
				request.getSession().setAttribute("time34", "");
				request.getSession().setAttribute("subjectname34", "");
				request.getSession().setAttribute("place34", "");
				request.getSession().setAttribute("teachername34", "");
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==32){
				request.getSession().setAttribute("time32", time);
				request.getSession().setAttribute("subjectname32", course.getSubjectName());
				request.getSession().setAttribute("place32", course.getPlace());
				request.getSession().setAttribute("teachername32", course.getTeacherName());
				
				request.getSession().setAttribute("time33", "");
				request.getSession().setAttribute("subjectname33", "");
				request.getSession().setAttribute("place33", "");
				request.getSession().setAttribute("teachername33", "");
				request.getSession().setAttribute("time34", "");
				request.getSession().setAttribute("subjectname34", "");
				request.getSession().setAttribute("place34", "");
				request.getSession().setAttribute("teachername34", "");
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==33){
				request.getSession().setAttribute("time33", time);
				request.getSession().setAttribute("subjectname33", course.getSubjectName());
				request.getSession().setAttribute("place33", course.getPlace());
				request.getSession().setAttribute("teachername33", course.getTeacherName());
				
				request.getSession().setAttribute("time34", "");
				request.getSession().setAttribute("subjectname34", "");
				request.getSession().setAttribute("place34", "");
				request.getSession().setAttribute("teachername34", "");
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==34){
				request.getSession().setAttribute("time34", time);
				request.getSession().setAttribute("subjectname34", course.getSubjectName());
				request.getSession().setAttribute("place34", course.getPlace());
				request.getSession().setAttribute("teachername34", course.getTeacherName());
				
				request.getSession().setAttribute("time35", "");
				request.getSession().setAttribute("subjectname35", "");
				request.getSession().setAttribute("place35", "");
				request.getSession().setAttribute("teachername35", "");
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==35){
				request.getSession().setAttribute("time35", time);
				request.getSession().setAttribute("subjectname35", course.getSubjectName());
				request.getSession().setAttribute("place35", course.getPlace());
				request.getSession().setAttribute("teachername35", course.getTeacherName());
				
				
				request.getSession().setAttribute("time41", "");
				request.getSession().setAttribute("subjectname41", "");
				request.getSession().setAttribute("place41", "");
				request.getSession().setAttribute("teachername41", "");
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==41){
				request.getSession().setAttribute("time41", time);
				request.getSession().setAttribute("subjectname41", course.getSubjectName());
				request.getSession().setAttribute("place41", course.getPlace());
				request.getSession().setAttribute("teachername41", course.getTeacherName());
				
				request.getSession().setAttribute("time42", "");
				request.getSession().setAttribute("subjectname42", "");
				request.getSession().setAttribute("place42", "");
				request.getSession().setAttribute("teachername42", "");
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==42){
				request.getSession().setAttribute("time42", time);
				request.getSession().setAttribute("subjectname42", course.getSubjectName());
				request.getSession().setAttribute("place42", course.getPlace());
				request.getSession().setAttribute("teachername42", course.getTeacherName());
				
				request.getSession().setAttribute("time43", "");
				request.getSession().setAttribute("subjectname43", "");
				request.getSession().setAttribute("place43", "");
				request.getSession().setAttribute("teachername43", "");
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==43){
				request.getSession().setAttribute("time43", time);
				request.getSession().setAttribute("subjectname43", course.getSubjectName());
				request.getSession().setAttribute("place43", course.getPlace());
				request.getSession().setAttribute("teachername43", course.getTeacherName());
				
				request.getSession().setAttribute("time44", "");
				request.getSession().setAttribute("subjectname44", "");
				request.getSession().setAttribute("place44", "");
				request.getSession().setAttribute("teachername44", "");
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==44){
				request.getSession().setAttribute("time44", time);
				request.getSession().setAttribute("subjectname44", course.getSubjectName());
				request.getSession().setAttribute("place44", course.getPlace());
				request.getSession().setAttribute("teachername44", course.getTeacherName());
				
				request.getSession().setAttribute("time45", "");
				request.getSession().setAttribute("subjectname45", "");
				request.getSession().setAttribute("place45", "");
				request.getSession().setAttribute("teachername45", "");
			}
			else if(time==45){
				request.getSession().setAttribute("time45", time);
				request.getSession().setAttribute("subjectname45", course.getSubjectName());
				request.getSession().setAttribute("place45", course.getPlace());
				request.getSession().setAttribute("teachername45", course.getTeacherName());
			}
		}
		return new ModelAndView("QueryCourse");
	}
	
	//获得选课信息
	@RequestMapping(value="/getselectcourseinfor.html")
	public ModelAndView getselectcourseinfor(HttpServletRequest request) throws ParseException{
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
	    String now=formatter.format(new Date());//将当前时间转换成String
	    String begin="2017-12-08";
	    String end="2018-12-14"; //为了在考核期间该功能正常使用，将结束日期设置为此
	    Date date=formatter.parse(now);//将当前时间转为date
	    Date begindate=formatter.parse(begin);//将起始时间转换成date;
	    Date enddate=formatter.parse(end);//将结束时间转换成date;
        Calendar calendar = Calendar.getInstance();  //得到日历
        calendar.setTime(date);//把当前时间赋给日历
        calendar.add(Calendar.DAY_OF_MONTH,0);
        Date n = calendar.getTime();   //得到n前的时间
        if (n.getTime() >begindate.getTime()&&n.getTime()<enddate.getTime()) {
			List selectcourselist = new ArrayList();
			selectcourselist = otherservice.getselectcourseinfor();
			request.getSession().setAttribute("selectcourselist", selectcourselist);
			return new ModelAndView("SelectCourse");
        }
        else return new ModelAndView("time_error");
	}
	
	//学生选课
	@RequestMapping(value="/selectcourse.html")
	public ModelAndView selectcourse(HttpServletRequest request,User user,SelectCourse selectcourse){
        	int currentnumber = selectcourse.getCurrentNumber();
    		int totlenumber = selectcourse.getTotleNumber();
    		int flag;
    		if(currentnumber>=totlenumber){
    			return new ModelAndView("fail_number");
    		}
    		else{
    			flag=otherservice.selectcourse(user.getStudentId(),selectcourse.getCourseId(),selectcourse.getSubjectName(),selectcourse.getTime(),selectcourse.getPlace(),selectcourse.getTeacherName(),selectcourse.getCurrentNumber(),selectcourse.getCourseTime(),selectcourse.getAcademy());
    			if(flag>0){
    				return new ModelAndView("selectcourse_success");
    			}
    			else return new ModelAndView("selectcourse_fail_reselect");
    		}
	}
	
	//学生退课
	@RequestMapping(value="/quitcourse.html")
	public ModelAndView quitcourse(User user,SelectCourse selectcourse){
		int flag;
		flag=otherservice.quitcourse(user.getStudentId(),selectcourse.getCourseId(),selectcourse.getSubjectName(),selectcourse.getTime(),selectcourse.getPlace(),selectcourse.getTeacherName(),selectcourse.getCurrentNumber(),selectcourse.getCourseTime(),selectcourse.getAcademy());
		if(flag>0){
			return new ModelAndView("quitcourse_success");
		}
		else{
			return new ModelAndView("quitcourse_fail");
		}
		
	}
	//学生评教获得学生和教师关系
	@RequestMapping(value="/getstudentteacherinfor.html")
	public ModelAndView getstudentteacherinfor(HttpServletRequest request,User user){
		List stutealist = new ArrayList();
		stutealist = otherservice.getstudentteacherinfor(user.getStudentId());
		request.getSession().setAttribute("stutealist", stutealist);
		return new ModelAndView("evaluate");
	}
	
	//学生评教
	@RequestMapping(value="/evaluation.html")
	public ModelAndView evaluation(HttpServletRequest request,User user,Evaluate eva){
		String studentid = user.getStudentId();
		String subjectname = eva.getSubjectName();
		String teachername = eva.getTeacherName();
		String topic1 = eva.getTopic1();
		String topic2 = eva.getTopic2();
		String topic3 = eva.getTopic3();
		String topic4 = eva.getTopic4();
		String option1 = eva.getOption1();
		String option2 = eva.getOption2();
		String option3 = eva.getOption3();
		String option4 = eva.getOption4();
		String comment = eva.getComment();
		String academy = eva.getAcademy();
		int mark = eva.getMark();
		int flag=otherservice.evaluation(studentid,subjectname,teachername,topic1,topic2,topic3,topic4,option1,option2,option3,option4,comment,mark,academy);
		if(flag>0){
			return new ModelAndView("evaluate_success");
		}
		else{
			return new ModelAndView("evaluate_fail");
		}
	}
	
	//获得个人信息
	@RequestMapping(value="/getpersonalinfor.html")
	public ModelAndView getpersonalinfor(HttpServletRequest request,User user){
		//List personalinfor = new ArrayList();
		user = otherservice.getpersonalinfor(user.getStudentId());
		request.getSession().setAttribute("personalinfor", user);
		return new ModelAndView("personalinfor_modify");
	}
	
	//个人信息修改
	@RequestMapping(value="/personalmodify.html")
		public ModelAndView personalmodify(User user){
			otherservice.personalmodify(user.getStudentId(),user.getStudentName(),user.getPassWord(),user.getPhone(),user.getEmail(),user.getFatherName(),user.getFatherPhone(),user.getIdCard(),user.getBankNumber(),user.getStudySystem());
			return new ModelAndView("modify_success");
		}
}
