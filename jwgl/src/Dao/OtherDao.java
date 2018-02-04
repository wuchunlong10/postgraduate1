package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import Entity.Course;
import Entity.Evaluate;
import Entity.Score;
import Entity.SelectCourse;
import Entity.StudentTeacher;
import Entity.User;

@Repository
public class OtherDao {
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	//成绩查询
	public List<Score> queryscore(String studentid){
		String sql="SELECT * FROM scoreb WHERE StudentId=?";
		Object[] infor = new Object[]{studentid};
		final List scorelist = new ArrayList();
		jdbctemplate.query(sql, infor, new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				final Score score = new Score();
				score.setStudentId(rs.getString("StudentId"));
				score.setSubjectName(rs.getString("SubjectName"));
				score.setCourseId(rs.getString("CourseId"));
				score.setScore(rs.getInt("Score"));
				score.setGpa(rs.getFloat("Gpa"));
				scorelist.add(score);
			}
		});
		return scorelist;
	}
	
	//课表查询
	public List<Course> querycourse(String studentid){
		String sql="SELECT * FROM courseb  WHERE StudentId=? ORDER BY Time ASC";
		Object[] infor = new Object[]{studentid};
		final List list = new ArrayList();
		jdbctemplate.query(sql, infor, new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				final Course course = new Course();
				course.setStudentId(rs.getString("StudentId"));
				course.setSubjectName(rs.getString("SubjectName"));
				course.setTime(rs.getInt("Time"));
				course.setPlace(rs.getString("Place"));
				course.setTeacherName(rs.getString("TeacherName"));
				list.add(course);
			}
		});
		return list;
	}
	
	//获得选课信息
	public List<SelectCourse> getselectcourseinfor(){
		String sql="SELECT * FROM selectcourseb";
		final List selectcourselist = new ArrayList();
		jdbctemplate.query(sql, new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				final SelectCourse selectcourse = new SelectCourse();
				selectcourse.setCourseId(rs.getString("CourseId"));
				selectcourse.setSubjectName(rs.getString("SubjectName"));
				selectcourse.setTime(rs.getInt("Time"));
				selectcourse.setPlace(rs.getString("Place"));
				selectcourse.setTeacherName(rs.getString("TeacherName"));
				selectcourse.setCurrentNumber(rs.getInt("CurrentNumber"));
				selectcourse.setTotleNumber(rs.getInt("TotleNumber"));
				selectcourse.setStartTime(rs.getString("StartTime"));
				selectcourse.setEndTime(rs.getString("EndTime"));
				selectcourse.setCourseTime(rs.getString("CourseTime"));
				selectcourse.setAcademy(rs.getString("Academy"));
				selectcourselist.add(selectcourse);
			}});
		return selectcourselist;
	}
	
	//学生选课
	public int selectcourse(String studentid,String courseid,String subjectname,int time,String place,String teachername,int currentnumber,String coursetime,String academy){
		int flag=1;
		String sql1="SELECT * FROM courseb WHERE StudentId=?";
		Object[] infor1 = new Object[]{studentid};
		final List list = new ArrayList();
		jdbctemplate.query(sql1, infor1, new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				final Course course = new Course();
				course.setStudentId(rs.getString("StudentId"));
				course.setSubjectName(rs.getString("SubjectName"));
				course.setTime(rs.getInt("Time"));
				course.setPlace(rs.getString("Place"));
				course.setTeacherName(rs.getString("TeacherName"));
				list.add(course);
			}
		});
		for(int i= 0;i<list.size();i++){
			Course course1 = (Course) list.get(i);
			if(subjectname.equals(course1.getSubjectName())&&time==course1.getTime()&&place.equals(course1.getPlace())&&teachername.equals(course1.getTeacherName())){
				flag=0;
				break;
			}
		}
		if(flag==0){
			return flag;
		}
		else{
			currentnumber = currentnumber+1;
			String sql2="INSERT INTO courseb (StudentId,SubjectName,Time,Place,TeacherName,CourseTime,Academy) VALUES (?,?,?,?,?,?,?)";
			String sql3="update selectcourseb set CurrentNumber='"+currentnumber+"' where CourseId='"+courseid+"'";
			String sql4="INSERT INTO stuteab (StudentId,TeacherName,SubjectName,Academy) VALUES (?,?,?,?)";
			Object[] infor2 = new Object[]{studentid,subjectname,time,place,teachername,coursetime,academy};
			Object[] infor4 = new Object[]{studentid,teachername,subjectname,academy};
			jdbctemplate.update(sql2, infor2);
			jdbctemplate.update(sql3);
			jdbctemplate.update(sql4, infor4);
			return flag;
		}
	}
	
	//学生退课
	public int quitcourse(String studentid,String courseid,String subjectname,int time,String place,String teachername,int currentnumber,String coursetime,String academy){
		int flag = 0;
		String sql1="SELECT * FROM courseb WHERE StudentId=?";
		Object[] infor1 = new Object[]{studentid};
		final List list = new ArrayList();
		jdbctemplate.query(sql1, infor1, new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				final Course course = new Course();
				course.setStudentId(rs.getString("StudentId"));
				course.setSubjectName(rs.getString("SubjectName"));
				course.setTime(rs.getInt("Time"));
				course.setPlace(rs.getString("Place"));
				course.setTeacherName(rs.getString("TeacherName"));
				list.add(course);
			}
		});
		for(int i= 0;i<list.size();i++){
			Course course1 = (Course) list.get(i);
			if(subjectname.equals(course1.getSubjectName())&&time==course1.getTime()&&place.equals(course1.getPlace())&&teachername.equals(course1.getTeacherName())){
				flag=1;
			}
			else
				flag=0;
		}
			if(flag==0){
				return flag;
			}
			else{
				currentnumber = currentnumber-1;
				String sql2="DELETE FROM courseb WHERE StudentId=? AND SubjectName=? AND Time=? AND Place=? AND TeacherName=?";
				String sql3="update selectcourseb set CurrentNumber='"+currentnumber+"' where CourseId='"+courseid+"'";
				String sql4="DELETE FROM stuteab WHERE StudentId=? AND TeacherName=? AND SubjectName=?";
				String sql5="DELETE FROM evaluationb WHERE StudentId=? AND TeacherName=? AND SubjectName=?";
				Object[] infor2 = new Object[]{studentid,subjectname,time,place,teachername};
				Object[] infor4= new Object[]{studentid,teachername,subjectname};
				jdbctemplate.update(sql2, infor2);
				jdbctemplate.update(sql3);
				jdbctemplate.update(sql4, infor4);
				jdbctemplate.update(sql5,infor4);
				return flag;
			}
}
	//学生评教获得学生和教师关系
	public List<StudentTeacher> getstudentteacherinfor(String studentid){
		String sql="SELECT * FROM stuteab WHERE StudentId = ?";
		Object[] infor = new Object[]{studentid};
		final List stutealist = new ArrayList();
		jdbctemplate.query(sql, infor,new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				final StudentTeacher stutea = new StudentTeacher();
				stutea.setSubjectName(rs.getString("SubjectName"));
				stutea.setTeacherName(rs.getString("TeacherName"));
				stutea.setAcademy(rs.getString("Academy"));
				stutealist.add(stutea);
			}
			});
		return stutealist;
	}
	
	//学生评教
	public int evaluation(String studentid,String subjectname,String teachername,String topic1,String topic2,String topic3,String topic4,String option1,String option2,String option3,String option4,String comment,int mark,String academy){
		int flag = 1;
		String sql1="SELECT * FROM evaluationb";
		final List list = new ArrayList();
		jdbctemplate.query(sql1, new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				final Evaluate e  = new Evaluate();
				e.setStudentId(rs.getString("StudentId"));
				e.setTeacherName(rs.getString("TeacherName"));
				list.add(e);
			}
		});
		for(int i= 0;i<list.size();i++){
			Evaluate e2 = (Evaluate) list.get(i);
			if(studentid.equals(e2.getStudentId())&&teachername.equals(e2.getTeacherName())){
				flag=0;
				break;
			}
		}
		if(flag==0){
			return flag;
		}
		else{
			String sql2="INSERT INTO evaluationb (StudentId,SubjectName,Academy,TeacherName,Topic1,Topic2,Topic3,Topic4,Option1,Option2,Option3,Option4,Commen,Mark) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			Object[] infor2 = new Object[]{studentid,subjectname,academy,teachername,topic1,topic2,topic3,topic4,option1,option2,option3,option4,comment,mark};
			jdbctemplate.update(sql2, infor2);
			return flag;
		}
	}
	
	//获得个人信息
	public User getpersonalinfor(String studentid){
		String sql="SELECT * FROM studentb WHERE StudentId = ?";
		Object[] infor = new Object[]{studentid};
		final User user = new User();
		jdbctemplate.query(sql, infor, new RowCallbackHandler(){
			public void processRow(ResultSet rs) throws SQLException {
				user.setStudentId(rs.getString("StudentId"));
				user.setStudentName(rs.getString("StudentName"));
				user.setPassWord(rs.getString("PassWord"));
				user.setEmail(rs.getString("Email"));
				user.setPhone(rs.getInt("Phone"));
				user.setIdCard(rs.getString("IdCard"));
				user.setBankNumber(rs.getInt("BankNumber"));
				user.setFatherName(rs.getString("FatherName"));
				user.setFatherPhone(rs.getInt("FatherPhone"));
				user.setStatus(rs.getString("Status"));
				user.setShape(rs.getString("Shape"));
				user.setEducation(rs.getString("Education"));
				user.setClass1(rs.getString("Class"));
				user.setStudySystem(rs.getInt("StudySystem"));
			}
		});
		return user;
	}
	
	//个人信息修改
	public void personalmodify(String studentid,String studentname,String password,int phone,String email,String fathername,int fatherphone,String idcard,int banknumber,int studysystem){
		String sql="update studentb set PassWord='"+password+"',Phone='"+phone+"',Email='"+email+"',FatherName='"+fathername+"',FatherPhone='"+fatherphone+"',IdCard='"+idcard+"',BankNumber='"+banknumber+"',StudySystem='"+studysystem+"' where StudentId='"+studentid+"'";
		jdbctemplate.update(sql);
	}
}
