package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.OtherDao;
import Entity.Course;
import Entity.Score;
import Entity.SelectCourse;
import Entity.StudentTeacher;
import Entity.User;

@Service
public class OtherService {
	@Autowired
	private OtherDao otherdao;
	
	//�ɼ���ѯ
	public List<Score> queryscore(String studentid){
		return otherdao.queryscore(studentid);
	}
	
	//�α��ѯ
	public List<Course> querycourse(String studentid){
		return otherdao.querycourse(studentid);
	}
	
	//���ѡ����Ϣ
	public List<SelectCourse> getselectcourseinfor(){
		return otherdao.getselectcourseinfor();
	}
	
	//ѧ��ѡ��
	public int selectcourse(String studentid,String courseid,String subjectname,int time,String place,String teachername,int currentnumber,String coursetime,String academy){
		return otherdao.selectcourse(studentid,courseid,subjectname,time,place,teachername,currentnumber,coursetime,academy);
	}
	
	//ѧ����ѡ
	public int quitcourse(String studentid,String courseid,String subjectname,int time,String place,String teachername,int currentnumber,String coursetime,String academy){
		return otherdao.quitcourse(studentid,courseid,subjectname,time,place,teachername,currentnumber,coursetime,academy);
	}
	
	//ѧ�����̻��ѧ���ͽ�ʦ��ϵ
	public List<StudentTeacher> getstudentteacherinfor(String studentid){
		return otherdao.getstudentteacherinfor(studentid);
	}
	
	//ѧ������
	public int evaluation(String studentid,String subjectname,String teachername,String topic1,String topic2,String topic3,String topic4,String option1,String option2,String option3,String option4,String comment,int mark,String academy){
		return otherdao.evaluation(studentid,subjectname,teachername,topic1,topic2,topic3,topic4,option1,option2,option3,option4,comment,mark,academy);
	}
	
	//��ø�����Ϣ
	public User getpersonalinfor(String studentid){
		return otherdao.getpersonalinfor(studentid);
	}
	
	//������Ϣ�޸�
	public void personalmodify(String studentid,String studentname,String password,int phone,String email,String fathername,int fatherphone,String idcard,int banknumber,int studysystem){
		otherdao.personalmodify(studentid,studentname,password,phone,email,fathername,fatherphone,idcard,banknumber,studysystem);
	}
}
