package Control;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Entity.ClassInfo;
import Entity.Course;
import Service.addScoreService;

@Controller
public class addScoreRequest {
	@Autowired
	private addScoreService addScoreService;
	
	@RequestMapping(value = "addScore.html")
	public ModelAndView showCourseList(HttpServletRequest request,Course course) {
		List<Course> cList = addScoreService.queryCourseList("201703056");
		request.getSession().setAttribute("Clist", cList);
		return new ModelAndView("queryCourseList");
	}
	
	@RequestMapping(value = "queryClass.html")
	public ModelAndView showClassList(HttpServletRequest request,ClassInfo classInfo) {
		List<ClassInfo> classList = addScoreService.queryClassList(classInfo.getSubjectName());
		request.getSession().setAttribute("Classlist", classList);
		request.getSession().setAttribute("SubjectName", classInfo.getSubjectName());
		return new ModelAndView("ClassList");
	}
	
	@RequestMapping(value = "queryName.html")
	public ModelAndView showNameList(HttpServletRequest request,ClassInfo classInfo) {
		List<ClassInfo> nameList = addScoreService.queryNameList(classInfo.getClassInfo(),classInfo.getSubjectName());
		request.getSession().setAttribute("Namelist", nameList);
		request.getSession().setAttribute("Class", classInfo.getClassInfo());
		return new ModelAndView("NameList");
	}
	
	@RequestMapping(value = "test.html")
	public ModelAndView addStudentScore(HttpServletRequest request) {
		String[] Score = request.getParameterValues("Score");
		List<ClassInfo> ScoreList = (List<ClassInfo>) request.getSession().getAttribute("ScoreList");
		List<ClassInfo> addList = new ArrayList<ClassInfo>(); 
		for(int i = 0;i < ScoreList.size();i ++) {
			final ClassInfo classInfo = new ClassInfo();
			classInfo.setStudentId(ScoreList.get(i).getStudentId());
			classInfo.setSubjectName(ScoreList.get(i).getSubjectName());
			classInfo.setScore(Score[i]);
			int score = Integer.parseInt(Score[i]); 
			if( score >= 95 ) {
				classInfo.setGpa((float) 5.0);
			} else  if(score >= 90 && score <95){
				classInfo.setGpa((float) 4.5);
			} else  if(score >= 85 && score <90){
				classInfo.setGpa((float) 4.0);
			} else  if(score >= 85 && score <90){
				classInfo.setGpa((float) 3.5);
			}else  if(score >= 80 && score <85){
				classInfo.setGpa((float) 3.0);
			}else  if(score >= 75 && score <80){
				classInfo.setGpa((float) 2.5);
			} else {
				classInfo.setGpa((float) 2.0);
			}
			addList.add(classInfo);
		}
		addScoreService.addScore(addList);
		return new ModelAndView("message","message","成绩录入成功！");
	}
	
}
