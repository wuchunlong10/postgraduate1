package Control;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Entity.CourseOpen;
import Entity.Evaluate;
import Entity.Exam;
import Entity.ExamSeats;
import Entity.SelectCourse;
import Entity.TeacherCourse;
import Entity.User;
import Service.ManagerService;

@Controller
public class ManagerRequest {

	@Autowired
	private ManagerService managerService;
	
	//��ȡѧ���б�
	@RequestMapping(value="/getStudentInforlist.html")
	public ModelAndView getStudentInforlist(HttpServletRequest request){
		List list=new ArrayList();
		list=managerService.getStudentInforlist();
		request.getSession().setAttribute("StudentInforlist",list);
		return new ModelAndView("StudentInforlist");		
	}
	
	//��ȡѧ����Ϣ
	@RequestMapping(value="/getStudentInfor.html")
	public ModelAndView getStudentInfor(HttpServletRequest request,User user){
		user=managerService.getStudentInfor(user.getStudentId());
		request.getSession().setAttribute("StudentInfor",user);
		return new ModelAndView("StudentInfor");		
	}
	//�޸�ѧ����Ϣ
	@RequestMapping(value="/StudentInforAlter.html")
	public ModelAndView StudentInforAlter(User user){
		managerService.StudentInforAlter(user.getStudentId(),user.getStudentName(),user.getClass1(),user.getPassWord(),user.getPhone(),user.getEmail(),user.getFatherName(),user.getFatherPhone(),user.getIdCard(),user.getBankNumber(),user.getStatus(),user.getShape(),user.getEducation(),user.getStudySystem());
	    return new ModelAndView("StudentInforAlter_success");
	}
	//��ȡѧԺ�����б�
	@RequestMapping(value="/getAcademyList.html")
	public ModelAndView  getAcademyList(HttpServletRequest request){
		List list=new ArrayList();
		list=managerService.getAcademyList();
		request.getSession().setAttribute("AcademyList", list);
		return new ModelAndView("AcademyList");
	}
	//��ѧԺ�����б���ȡ���Ӧ������
	@RequestMapping(value="/getPingGuInfor.html")
	public ModelAndView  getPingGuInfor(HttpServletRequest request,Evaluate evaluate){
		List list=new ArrayList();
		System.out.println(evaluate.getAcademy());
		list=managerService.getPingGuInfor(evaluate.getAcademy());
		request.getSession().setAttribute("PingGuInfor", list);
		return new ModelAndView("PingGuInfor");
	}

	 //��ȡ��ʦ���е����н�ʦ��������Ŀ
	@RequestMapping(value="/getTeacherNameSubjectName.html")
	public ModelAndView getTeacherNameSubjectName(HttpServletRequest request){
		List list=new ArrayList();
		list=managerService.getTeacherNameSubjectName();
		request.getSession().setAttribute("TeacherNameSubjectName", list);
		return new ModelAndView("TeacherNameSubjectName");
	}
	//��ȡ�γ̱����Ѿ��źõĿα���Ϣ
	@RequestMapping(value="/getCourseTableInfor.html")
	public ModelAndView getCourseTableInfor(HttpServletRequest request){
		List list=new ArrayList();
		list=managerService.getCourseTableInfor();
		request.getSession().setAttribute("CourseTableInfor", list);
		return new ModelAndView("CourseTableInfor");
	}
	//�ڿα��в������ݣ������жϺ��ſ�
	@RequestMapping(value="/getCourseTable.html")
	public ModelAndView CourseTableText(HttpServletRequest request,TeacherCourse teacherCourse){
		String term=teacherCourse.getTerm();
		String idnumber=teacherCourse.getIdNumber();
		String subjectname=teacherCourse.getSubjectName();
		int coursenumber=teacherCourse.getCourseNumber();
		int time=teacherCourse.getTime();
		String place=teacherCourse.getPlace();
		String teachername=teacherCourse.getTeacherName();
		int flag=managerService.CourseTableText(term, idnumber, subjectname, coursenumber, time, place, teachername);
	    if(flag>0){
	    	return new ModelAndView("DealCourseTable_success");
	    }
	    else{
	    	return new ModelAndView("DealCourseTable_fail");
	    }
	}
	//��ѡ�ο��ű��л�ȡ�ɿ��ſγ̵������Ϣ
	@RequestMapping(value="/getCourseOpenInfor.html")
	public ModelAndView getCourseOpenInfor(HttpServletRequest request){
		List list=new ArrayList();
		list=managerService.getCourseOpenInfor();
		request.getSession().setAttribute("CourseOpenInfor", list);
		return new ModelAndView("CourseOpenInfor");
	}
	
	//����ѧ����ѡ�ε�����
	@RequestMapping(value="/InsertOpenCourse.html")
	public ModelAndView InsertOpenCourse(HttpServletRequest request,SelectCourse selectCourse){
		String courseid=selectCourse.getCourseId();
		int time=selectCourse.getTime();
		String place=selectCourse.getPlace();
		int currentnumber=selectCourse.getCurrentNumber();
		String subjectname=selectCourse.getSubjectName();
		String teachername=selectCourse.getTeacherName();
		int totlenumber=selectCourse.getTotleNumber();
		String starttime=selectCourse.getStartTime();
		String endtime=selectCourse.getEndTime();
		String coursetime=selectCourse.getCourseTime();
		String academy=selectCourse.getAcademy();
		int flag=managerService.InsertOpenCourse(courseid, subjectname, time, place, teachername, currentnumber, totlenumber, starttime, endtime, coursetime, academy);
	    if(flag>0){
	    	return new ModelAndView("OpenCourse_success");
	    }
	    else{
	    	return new ModelAndView("OpenCourse_fail");
	    }
	}
	
	//��ѡ�ο��ű�������Ҫ���ŵĿγ�
	@RequestMapping(value="/InsertCourse.html")
    public  ModelAndView InsertCourse(HttpServletRequest request,CourseOpen courseOpen){
    	String courseid=courseOpen.getCourseId();
		int time=courseOpen.getTime();
		String place=courseOpen.getPlace();
		int currentnumber=courseOpen.getCurrentNumber();
		String subjectname=courseOpen.getSubjectName();
		String teachername=courseOpen.getTeacherName();
		int totlenumber=courseOpen.getTotleNumber();
		String starttime=courseOpen.getStartTime();
		String endtime=courseOpen.getEndTime();
		int coursetime=courseOpen.getCourseTime();
		String academy=courseOpen.getAcademy();
		int flag=managerService.InsertCourse(courseid, subjectname, time, place, teachername, currentnumber, totlenumber, starttime, endtime, coursetime, academy);
	    if(flag>0){
	    	return new ModelAndView("InsertOpenCourse_success");
	    }
	    else{
	    	return new ModelAndView("InsertOpenCourse_fail");
	    }
    }
	//��ȡѧ����ѡ�α������
	@RequestMapping(value="/getSelectCourseInfor.html")
    public  ModelAndView  getSelectCourseInfor(HttpServletRequest request){
    	List list=new ArrayList();
    	list=managerService.getSelectCourseInfor();
    	request.getSession().setAttribute("SelectCourseInfor", list);
    	return new ModelAndView("SelectCourseInfor");
    }
	
	 //��ʼ���ſ���
	@RequestMapping(value="/SetExam.html")
	public ModelAndView SetExam(HttpServletRequest request,Exam exam){
		String examplace=exam.getExamPlace();
		int examnumber=exam.getExamNumber();
		String examteacherlist=exam.getExamTeacherList();
		String examsubjectname=exam.getExamSubjectName();
		
		int flag=managerService.SetExam(examplace, examnumber, examteacherlist, examsubjectname);
	    if(flag>0){
	    	return new ModelAndView("SetExam_success");
	    }
	    else{
	    	return new ModelAndView("SetExam_fail");
	    }
	}
	//�鿴���ųɹ���Ŀ���
	@RequestMapping(value="/getExamInfor.html")
	public ModelAndView getExamInfor(HttpServletRequest request){
		List list=new ArrayList();
		list=managerService.getExamInfor();
		request.getSession().setAttribute("ExamInfor", list);
		return new ModelAndView("ExamInfor");
	}
	
	//������Ϣ����
	@RequestMapping(value="/bianpai.html")
	public ModelAndView bianpai(HttpServletRequest request,ExamSeats es){
	    int flag=managerService.bianpai(es.getExamPlace(),es.getStudentId(),es.getStudentName(),es.getExamSeats());
		if(flag>0){
	    return new ModelAndView("bianpai_success");
	    }
		else{
		return new ModelAndView("bianpai_fail");
		}
		}
	 //�鿴���ųɹ��Ŀ�����Ϣ
	@RequestMapping(value="/getExamStudentInfor.html")
	 public  ModelAndView  getExamStudentInfor(HttpServletRequest request){
		 List list=new ArrayList();
		 list=managerService.getExamStudentInfor();
		 request.getSession().setAttribute("ExamStudentInfor", list);
		 return new ModelAndView("ExamStudentInfor");
	 }
   }
