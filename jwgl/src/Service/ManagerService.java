package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.ManagerDao;
import Entity.CourseOpen;
import Entity.Evaluate;
import Entity.Exam;
import Entity.ExamSeats;
import Entity.SelectCourse;
import Entity.Teacher;
import Entity.TeacherCourse;
import Entity.User;

@Service
public class ManagerService {
    
	@Autowired
	 private ManagerDao  managerDao;
	  //获得学生列表
	 public List<User> getStudentInforlist(){
		return managerDao.getStudentInforlist();
	 }
	 
	 //获取学生信息
	 public User getStudentInfor(String studentid){
		 return managerDao.getStudentInfor(studentid);
	 }
	 //修改学生信息
	 public void  StudentInforAlter(String studentid,String studentname,String class1,String password,int phone,String email,String fathername,int fatherphone,String idcard,int banknumber,String status,String shape,String education,int studysystem){
		  managerDao.StudentInforAlter(studentid, studentname, class1, password, phone, email, fathername, fatherphone, idcard, banknumber, status, shape, education, studysystem);
	 }
	//获取学院名称列表
	public List<Evaluate> getAcademyList(){
		return managerDao.getAcademyList();
	}
	//按学院名称列表，获取相对应的数据
	public List<Evaluate> getPingGuInfor(String academy){
	    return managerDao.getPingGuInfor(academy);			
	}
	  //获取教师表中的所有教师姓名及科目
	 public List<Teacher>  getTeacherNameSubjectName(){
		 return managerDao.getTeacherNameSubjectName();
	 }
	//获取课程表中已经排好的课表信息
	 public List<TeacherCourse>  getCourseTableInfor(){
		 return managerDao.getCourseTableInfor();
	 }
	//在课表中插入数据，进行判断后，排课
	 public int  CourseTableText(String term,String idnumber,String subjectname,int coursenumber,int time,String place,String teachername ){
		 return managerDao.CourseTableText(term, idnumber, subjectname, coursenumber, time, place, teachername);
	 }
	//从选课开放表中获取可开放课程的相关信息
	 public List<CourseOpen>  getCourseOpenInfor(){
		 return managerDao.getCourseOpenInfor();
	 }

	//增加学生可选课的内容
	 public int InsertOpenCourse(String courseid,String subjectname,int time,String place,String teachername,int currentnumber,int totlenumber,String starttime,String endtime,String coursetime,String academy){
		 return managerDao.InsertOpenCourse(courseid, subjectname, time, place, teachername, currentnumber, totlenumber, starttime, endtime, coursetime, academy);
	 }
	//在选课开放表中增加要开放的课程
	 public int InsertCourse(String courseid,String subjectname,int time,String place,String teachername,int currentnumber,int totlenumber,String starttime,String endtime,int coursetime,String academy){
		 return managerDao.InsertCourse(courseid, subjectname, time, place, teachername, currentnumber, totlenumber, starttime, endtime, coursetime, academy);
	 }
	//获取学生可选课表的内容
	 public List<SelectCourse> getSelectCourseInfor(){
		 return managerDao.getSelectCourseInfor();
		}
	 
	 //开始编排考场
	   public int SetExam(String examplace,int examnumber,String examteacherlist,String examsubjectname){
		   return managerDao.SetExam(examplace, examnumber, examteacherlist, examsubjectname);
	   }
	   //查看编排成功后的考场
	   public List<Exam> getExamInfor(){
		   return managerDao.getExamInfor();
	   }
	   
	   //考生信息编排
	   public int bianpai(String examplace,String studentid,String studentname,String examseats){
		  return managerDao.bianpai(examplace,studentid,studentname,examseats);
	   }
	   //查看编排成功的考生信息
	   public List<ExamSeats> getExamStudentInfor(){
		   return managerDao.getExamStudentInfor();
	   }
	   
}
