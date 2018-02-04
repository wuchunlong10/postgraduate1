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
	  //���ѧ���б�
	 public List<User> getStudentInforlist(){
		return managerDao.getStudentInforlist();
	 }
	 
	 //��ȡѧ����Ϣ
	 public User getStudentInfor(String studentid){
		 return managerDao.getStudentInfor(studentid);
	 }
	 //�޸�ѧ����Ϣ
	 public void  StudentInforAlter(String studentid,String studentname,String class1,String password,int phone,String email,String fathername,int fatherphone,String idcard,int banknumber,String status,String shape,String education,int studysystem){
		  managerDao.StudentInforAlter(studentid, studentname, class1, password, phone, email, fathername, fatherphone, idcard, banknumber, status, shape, education, studysystem);
	 }
	//��ȡѧԺ�����б�
	public List<Evaluate> getAcademyList(){
		return managerDao.getAcademyList();
	}
	//��ѧԺ�����б���ȡ���Ӧ������
	public List<Evaluate> getPingGuInfor(String academy){
	    return managerDao.getPingGuInfor(academy);			
	}
	  //��ȡ��ʦ���е����н�ʦ��������Ŀ
	 public List<Teacher>  getTeacherNameSubjectName(){
		 return managerDao.getTeacherNameSubjectName();
	 }
	//��ȡ�γ̱����Ѿ��źõĿα���Ϣ
	 public List<TeacherCourse>  getCourseTableInfor(){
		 return managerDao.getCourseTableInfor();
	 }
	//�ڿα��в������ݣ������жϺ��ſ�
	 public int  CourseTableText(String term,String idnumber,String subjectname,int coursenumber,int time,String place,String teachername ){
		 return managerDao.CourseTableText(term, idnumber, subjectname, coursenumber, time, place, teachername);
	 }
	//��ѡ�ο��ű��л�ȡ�ɿ��ſγ̵������Ϣ
	 public List<CourseOpen>  getCourseOpenInfor(){
		 return managerDao.getCourseOpenInfor();
	 }

	//����ѧ����ѡ�ε�����
	 public int InsertOpenCourse(String courseid,String subjectname,int time,String place,String teachername,int currentnumber,int totlenumber,String starttime,String endtime,String coursetime,String academy){
		 return managerDao.InsertOpenCourse(courseid, subjectname, time, place, teachername, currentnumber, totlenumber, starttime, endtime, coursetime, academy);
	 }
	//��ѡ�ο��ű�������Ҫ���ŵĿγ�
	 public int InsertCourse(String courseid,String subjectname,int time,String place,String teachername,int currentnumber,int totlenumber,String starttime,String endtime,int coursetime,String academy){
		 return managerDao.InsertCourse(courseid, subjectname, time, place, teachername, currentnumber, totlenumber, starttime, endtime, coursetime, academy);
	 }
	//��ȡѧ����ѡ�α������
	 public List<SelectCourse> getSelectCourseInfor(){
		 return managerDao.getSelectCourseInfor();
		}
	 
	 //��ʼ���ſ���
	   public int SetExam(String examplace,int examnumber,String examteacherlist,String examsubjectname){
		   return managerDao.SetExam(examplace, examnumber, examteacherlist, examsubjectname);
	   }
	   //�鿴���ųɹ���Ŀ���
	   public List<Exam> getExamInfor(){
		   return managerDao.getExamInfor();
	   }
	   
	   //������Ϣ����
	   public int bianpai(String examplace,String studentid,String studentname,String examseats){
		  return managerDao.bianpai(examplace,studentid,studentname,examseats);
	   }
	   //�鿴���ųɹ��Ŀ�����Ϣ
	   public List<ExamSeats> getExamStudentInfor(){
		   return managerDao.getExamStudentInfor();
	   }
	   
}
