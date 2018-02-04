package Control;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Entity.Course;
import Service.queryTeacherStudy;

@Controller
public class queryStudyTeacher {
	@Autowired
	private queryTeacherStudy queryTeacherStudy;
	
	@RequestMapping(value = "/queryStudyInfo.html")
	public ModelAndView querycourse(HttpServletRequest request,String idNumber){
		List<Course> list = new ArrayList<Course>();
  	list = queryTeacherStudy.queryTeachersStudy("201703056");
		for(int i=0;i<list.size();i++){
			Course course = (Course) list.get(i);
			int time = course.getTime();
			if(time==11){
				request.getSession().setAttribute("time11", time);
				request.getSession().setAttribute("subjectname11", course.getSubjectName());
				request.getSession().setAttribute("place11", course.getPlace());
				request.getSession().setAttribute("teachername11", course.getTeacherName());
			}
			else if(time==12){
				request.getSession().setAttribute("time12", time);
				request.getSession().setAttribute("subjectname12", course.getSubjectName());
				request.getSession().setAttribute("place12", course.getPlace());
				request.getSession().setAttribute("teachername12", course.getTeacherName());
			}
			else if(time==13){
				request.getSession().setAttribute("time13", time);
				request.getSession().setAttribute("subjectname13", course.getSubjectName());
				request.getSession().setAttribute("place13", course.getPlace());
				request.getSession().setAttribute("teachername13", course.getTeacherName());
			}
			else if(time==14){
				request.getSession().setAttribute("time14", time);
				request.getSession().setAttribute("subjectname14", course.getSubjectName());
				request.getSession().setAttribute("place14", course.getPlace());
				request.getSession().setAttribute("teachername14", course.getTeacherName());
			}
			else if(time==15){
				request.getSession().setAttribute("time15", time);
				request.getSession().setAttribute("subjectname15", course.getSubjectName());
				request.getSession().setAttribute("place15", course.getPlace());
				request.getSession().setAttribute("teachername15", course.getTeacherName());
			}
			else if(time==21){
				request.getSession().setAttribute("time21", time);
				request.getSession().setAttribute("subjectname21", course.getSubjectName());
				request.getSession().setAttribute("place21", course.getPlace());
				request.getSession().setAttribute("teachername21", course.getTeacherName());
			}
			else if(time==22){
				request.getSession().setAttribute("time22", time);
				request.getSession().setAttribute("subjectname22", course.getSubjectName());
				request.getSession().setAttribute("place22", course.getPlace());
				request.getSession().setAttribute("teachername22", course.getTeacherName());
			}
			else if(time==23){
				request.getSession().setAttribute("time23", time);
				request.getSession().setAttribute("subjectname23", course.getSubjectName());
				request.getSession().setAttribute("place23", course.getPlace());
				request.getSession().setAttribute("teachername24", course.getTeacherName());
			}
			else if(time==24){
				request.getSession().setAttribute("time24", time);
				request.getSession().setAttribute("subjectname24", course.getSubjectName());
				request.getSession().setAttribute("place24", course.getPlace());
				request.getSession().setAttribute("teachername24", course.getTeacherName());
			}
			else if(time==25){
				request.getSession().setAttribute("time25", time);
				request.getSession().setAttribute("subjectname25", course.getSubjectName());
				request.getSession().setAttribute("place25", course.getPlace());
				request.getSession().setAttribute("teachername25", course.getTeacherName());
			}
			else if(time==31){
				request.getSession().setAttribute("time31", time);
				request.getSession().setAttribute("subjectname31", course.getSubjectName());
				request.getSession().setAttribute("place31", course.getPlace());
				request.getSession().setAttribute("teachername31", course.getTeacherName());
			}
			else if(time==32){
				request.getSession().setAttribute("time32", time);
				request.getSession().setAttribute("subjectname32", course.getSubjectName());
				request.getSession().setAttribute("place32", course.getPlace());
				request.getSession().setAttribute("teachername32", course.getTeacherName());
			}
			else if(time==33){
				request.getSession().setAttribute("time33", time);
				request.getSession().setAttribute("subjectname33", course.getSubjectName());
				request.getSession().setAttribute("place33", course.getPlace());
				request.getSession().setAttribute("teachername33", course.getTeacherName());
			}
			else if(time==34){
				request.getSession().setAttribute("time34", time);
				request.getSession().setAttribute("subjectname34", course.getSubjectName());
				request.getSession().setAttribute("place34", course.getPlace());
				request.getSession().setAttribute("teachername34", course.getTeacherName());
			}
			else if(time==35){
				request.getSession().setAttribute("time35", time);
				request.getSession().setAttribute("subjectname35", course.getSubjectName());
				request.getSession().setAttribute("place35", course.getPlace());
				request.getSession().setAttribute("teachername35", course.getTeacherName());
			}
			else if(time==41){
				request.getSession().setAttribute("time41", time);
				request.getSession().setAttribute("subjectname41", course.getSubjectName());
				request.getSession().setAttribute("place41", course.getPlace());
				request.getSession().setAttribute("teachername41", course.getTeacherName());
			}
			else if(time==42){
				request.getSession().setAttribute("time42", time);
				request.getSession().setAttribute("subjectname42", course.getSubjectName());
				request.getSession().setAttribute("place42", course.getPlace());
				request.getSession().setAttribute("teachername42", course.getTeacherName());
			}
			else if(time==43){
				request.getSession().setAttribute("time43", time);
				request.getSession().setAttribute("subjectname43", course.getSubjectName());
				request.getSession().setAttribute("place43", course.getPlace());
				request.getSession().setAttribute("teachername43", course.getTeacherName());
			}
			else if(time==44){
				request.getSession().setAttribute("time44", time);
				request.getSession().setAttribute("subjectname44", course.getSubjectName());
				request.getSession().setAttribute("place44", course.getPlace());
				request.getSession().setAttribute("teachername44", course.getTeacherName());
			}
			else if(time==45){
				request.getSession().setAttribute("time45", time);
				request.getSession().setAttribute("subjectname45", course.getSubjectName());
				request.getSession().setAttribute("place45", course.getPlace());
				request.getSession().setAttribute("teachername45", course.getTeacherName());
			}
		}
		return new ModelAndView("queryCourse3");
	}
}
