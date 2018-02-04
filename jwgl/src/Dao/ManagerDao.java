package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import Entity.CourseOpen;
import Entity.Evaluate;
import Entity.Exam;
import Entity.ExamSeats;
import Entity.SelectCourse;
import Entity.Teacher;
import Entity.TeacherCourse;
import Entity.User;
	@Repository
	public class ManagerDao {
		@Autowired
		private JdbcTemplate jdbcTemplate;
		HttpServletRequest request;
		//��ȡѧ���б�
		public List<User> getStudentInforlist(){
			String sql="SELECT * FROM studentb";
			final List list=new ArrayList();
			jdbcTemplate.query(sql,new RowCallbackHandler() {
				
				public void processRow(ResultSet rs) throws SQLException {
					// TODO Auto-generated method stub
					final User user=new User();
					user.setStudentId(rs.getString("StudentId"));
					user.setStudentName(rs.getString("StudentName"));
					list.add(user);
				}
			});
			return list;
		}
		
		//��ȡѧ����Ϣ
		public User getStudentInfor(String studentid){
			
			String sql="select * from studentb where StudentId=? ";
			Object[] infor=new Object[]{studentid};
			final User user=new User();
			jdbcTemplate.query(sql, infor,new RowCallbackHandler() {
				
				public void processRow(ResultSet rs) throws SQLException {
					// TODO Auto-generated method stub
					user.setStudentId(rs.getString("StudentId"));
					user.setStudentName(rs.getString("StudentName"));
					user.setClass1(rs.getString("Class"));
					user.setPassWord(rs.getString("PassWord"));
					user.setPhone(rs.getInt("Phone"));
					user.setEmail(rs.getString("Email"));
					user.setFatherName(rs.getString("FatherName"));
					user.setFatherPhone(rs.getInt("FatherPhone"));
					user.setIdCard(rs.getString("IdCard"));
					user.setBankNumber(rs.getInt("BankNumber"));
					user.setStatus(rs.getString("Status"));
					user.setShape(rs.getString("Shape"));
					user.setEducation(rs.getString("Education"));
					user.setStudySystem(rs.getInt("StudySystem"));
				}
			});
			return user;
		}
		
		//�޸�ѧ����Ϣ
		public void StudentInforAlter(String studentid,String studentname,String class1,String password,int phone,String email,String fathername,int fatherphone,String idcard,int banknumber,String status,String shape,String education,int studysystem){
			String sql="UPDATE studentb SET Class='"+class1+"',PassWord='"+password+"',Phone='"+phone+"',Email='"+email+"',FatherName='"+fathername+"',FatherPhone='"+fatherphone+"',IdCard='"+idcard+"',BankNumber='"+banknumber+"',Status='"+status+"',Shape='"+shape+"',Education='"+education+"',StudySystem='"+studysystem+"' where StudentId='"+studentid+"'";
		    jdbcTemplate.update(sql);
		}
		
		//��ȡѧԺ�����б�
		public List<Evaluate> getAcademyList(){
			String sql="select * from evaluationb";

			final List list=new ArrayList();
			jdbcTemplate.query(sql, new RowCallbackHandler() {
				
				public void processRow(ResultSet rs) throws SQLException {
					// TODO Auto-generated method stub
					 int flag=0;
				    final 	Evaluate evaluate=new Evaluate();
				    evaluate.setAcademy(rs.getString("Academy"));
				    for(int i=0;i<list.size();i++){
				    	Evaluate ev2=(Evaluate) list.get(i) ;
					    	if(rs.getString("Academy").equals(ev2.getAcademy()))
					    	{
					    		flag=1;
					    	}
				   
				    	}
				    if(flag==0)
				    	list.add(evaluate);
				}
			});
			return list;
		}
		//��ѧԺ�����б���ȡ���Ӧ������
		public List<Evaluate> getPingGuInfor(String academy){
			String sql="select * from evaluationb  where Academy=? order by Mark desc";
			//String sql2="SELECT AVG(Mark) as 'con' FROM evaluationb WHERE Academy=?";
			Object[] infor=new Object[]{academy};
			final List list=new ArrayList();
			jdbcTemplate.query(sql,infor,new RowCallbackHandler() {
				
				public void processRow(ResultSet rs) throws SQLException {
					// TODO Auto-generateethod stub
					final Evaluate evaluate=new Evaluate();
					evaluate.setTeacherName(rs.getString("TeacherName"));
				   	evaluate.setMark(rs.getInt("Mark"));
				   	list.add(evaluate);
				}
			});
			return list;
		}
     //��ȡ��ʦ���е����н�ʦ��������Ŀ
		public List<Teacher> getTeacherNameSubjectName(){
		  String sql="select * from teacher_info";
		  final List list=new ArrayList();
		  jdbcTemplate.query(sql, new RowCallbackHandler() {
			
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
			   final Teacher teacher=new Teacher();
			   teacher.setSubjectName(rs.getString("subjectname"));
			   teacher.setName(rs.getString("name"));
		       list.add(teacher);
			}
		});
		return list;
		}
	  //��ȡ�γ̱����Ѿ��źõĿα���Ϣ
		public List<TeacherCourse> getCourseTableInfor(){
			String sql="select * from teachercourseb";
			final List list=new ArrayList();
			jdbcTemplate.query(sql, new RowCallbackHandler() {
				
				public void processRow(ResultSet rs) throws SQLException {
					// TODO Auto-generated method stub
				  final TeacherCourse teacherCourse=new TeacherCourse();
				  teacherCourse.setTerm(rs.getString("Term"));
				  teacherCourse.setIdNumber(rs.getString("IdNumber"));
				  teacherCourse.setSubjectName(rs.getString("SubjectName"));
				  teacherCourse.setCourseNumber(rs.getInt("CourseNumber"));
				  teacherCourse.setTime(rs.getInt("Time"));
				  teacherCourse.setPlace(rs.getString("Place"));
				  teacherCourse.setTeacherName(rs.getString("TeacherName"));
				  list.add(teacherCourse);
				}
			});
			return list;
		}
		//�ڿα��в������ݣ������жϺ��ſ�
		public int CourseTableText(String term,String idnumber,String subjectname,int coursenumber,int time,String place,String teachername ){
			int flag=1;
			String sql="select * from teachercourseb";
			final List list=new ArrayList();
			jdbcTemplate.query(sql, new RowCallbackHandler() {
				
				public void processRow(ResultSet rs) throws SQLException {
					// TODO Auto-generated method stub
					final TeacherCourse teacherCourse=new TeacherCourse();
				  teacherCourse.setTerm(rs.getString("Term"));
				  teacherCourse.setIdNumber(rs.getString("IdNumber"));
				  teacherCourse.setSubjectName(rs.getString("SubjectName"));
                  teacherCourse.setCourseNumber(rs.getInt("CourseNumber"));
                  teacherCourse.setTime(rs.getInt("Time"));
				  teacherCourse.setPlace(rs.getString("Place"));
				  teacherCourse.setTeacherName(rs.getString("TeacherName"));
				  list.add(teacherCourse);	
		}
   });
			    for(int i=0;i<list.size();i++){
			    	TeacherCourse teacherCourse2=(TeacherCourse) list.get(i) ;
			    	if(teachername.equals(teacherCourse2.getTeacherName())&&subjectname.equals(teacherCourse2.getSubjectName())){
			    		flag=0;
			    		break;
			    	}
			    }
			    if(flag==0){
			    	return flag;
			    }
			    else{
			    	String sql2="insert into teachercourseb (Term,idNumber,SubjectName,CourseNumber,Time,Place,TeacherName) values(?,?,?,?,?,?,?)";
			        Object[]  infor2=new Object[]{term,idnumber,subjectname,coursenumber,time,place,teachername};
			        jdbcTemplate.update(sql2,infor2);
			        return flag;
			    }
    }
		//��ѡ�ο��ű��л�ȡ�ɿ��ſγ̵������Ϣ
		public List<CourseOpen>  getCourseOpenInfor(){
			String sql="select * from courseopen";
			final List list=new ArrayList();
			jdbcTemplate.query(sql, new RowCallbackHandler() {
				
				public void processRow(ResultSet rs) throws SQLException {
					// TODO Auto-generated method stub
					final CourseOpen courseOpen=new CourseOpen();
					 courseOpen.setCourseId(rs.getString("CourseId"));
				     courseOpen.setSubjectName(rs.getString("SubjectName"));
				     courseOpen.setTime(rs.getInt("Time"));
				     courseOpen.setPlace(rs.getString("Place"));
				     courseOpen.setTeacherName(rs.getString("TeacherName"));
				     courseOpen.setCurrentNumber(rs.getInt("CurrentNumber"));
				     courseOpen.setTotleNumber(rs.getInt("TotleNumber"));
				     courseOpen.setStartTime(rs.getString("StartTime"));
				     courseOpen.setEndTime(rs.getString("EndTime"));
				     courseOpen.setCourseTime(rs.getInt("CourseTime"));
				     courseOpen.setAcademy(rs.getString("Academy"));
				     list.add(courseOpen);
				}
			});
			return list;
		}
		//����ѧ����ѡ�ε�����
		public int InsertOpenCourse(String courseid,String subjectname,int time,String place,String teachername,int currentnumber,int totlenumber,String starttime,String endtime,String coursetime,String academy){
		  int flag=1;
		  String sql="select * from selectcourseb";
		  final List list=new ArrayList();
		  jdbcTemplate.query(sql, new RowCallbackHandler() {
			
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
			     final  SelectCourse selectCourse=new SelectCourse();
			     selectCourse.setCourseId(rs.getString("CourseId"));
			     selectCourse.setSubjectName(rs.getString("SubjectName"));
			     selectCourse.setTime(rs.getInt("Time"));
			     selectCourse.setPlace(rs.getString("Place"));
			     selectCourse.setTeacherName(rs.getString("TeacherName"));
			     selectCourse.setCurrentNumber(rs.getInt("CurrentNumber"));
			     selectCourse.setTotleNumber(rs.getInt("TotleNumber"));
			     selectCourse.setStartTime(rs.getString("StartTime"));
			     selectCourse.setEndTime(rs.getString("EndTime"));
			     selectCourse.setCourseTime(rs.getString("CourseTime"));
			     selectCourse.setAcademy(rs.getString("Academy"));
			     list.add(selectCourse);
			}
		});
		  for(int i=0;i<list.size();i++){
			  SelectCourse selectCourse2=(SelectCourse)list.get(i);
				if(teachername.equals(selectCourse2.getTeacherName())||subjectname.equals(selectCourse2.getSubjectName())){
					flag=0;
				    break;
				}
		  }
		  if(flag==0){
		    	return flag;
		    }
		    else{
		    	String sql2="insert into selectcourseb (CourseId,SubjectName,Time,Place,TeacherName,CurrentNumber,TotleNumber,StartTime,EndTime,CourseTime,Academy) values(?,?,?,?,?,?,?,?,?,?,?)";
		        Object[]  infor2=new Object[]{courseid,subjectname,time,place,teachername,currentnumber,totlenumber,starttime,endtime,coursetime,academy};
		        jdbcTemplate.update(sql2,infor2);
		        return flag;
		    }
		}
		//��ѡ�ο��ű�������Ҫ���ŵĿγ�
		public int InsertCourse(String courseid,String subjectname,int time,String place,String teachername,int currentnumber,int totlenumber,String starttime,String endtime,int coursetime,String academy){
			  int flag=1;
			  String sql="select * from courseopen";
			  final List list=new ArrayList();
			  jdbcTemplate.query(sql, new RowCallbackHandler() {
				
				public void processRow(ResultSet rs) throws SQLException {
					// TODO Auto-generated method stub
				     final  CourseOpen courseOpen=new CourseOpen();
				     courseOpen.setCourseId(rs.getString("CourseId"));
				     courseOpen.setSubjectName(rs.getString("SubjectName"));
				     courseOpen.setTime(rs.getInt("Time"));
				     courseOpen.setPlace(rs.getString("Place"));
				     courseOpen.setTeacherName(rs.getString("TeacherName"));
				     courseOpen.setCurrentNumber(rs.getInt("CurrentNumber"));
				     courseOpen.setTotleNumber(rs.getInt("TotleNumber"));
				     courseOpen.setStartTime(rs.getString("StartTime"));
				     courseOpen.setEndTime(rs.getString("EndTime"));
				     courseOpen.setCourseTime(rs.getInt("CourseTime"));
				     courseOpen.setAcademy(rs.getString("Academy"));
				     list.add(courseOpen);
				}
			});
			  for(int i=0;i<list.size();i++){
				  CourseOpen courseOpen2=(CourseOpen)list.get(i);
					if(teachername.equals(courseOpen2.getTeacherName())||subjectname.equals(courseOpen2.getSubjectName())){
						flag=0;
					    break;
					}
			  }
			  if(flag==0){
			    	return flag;
			    }
			    else{
			    	String sql2="insert into courseopen (CourseId,SubjectName,Time,Place,TeacherName,CurrentNumber,TotleNumber,StartTime,EndTime,CourseTime,Academy) values(?,?,?,?,?,?,?,?,?,?,?)";
			        Object[]  infor2=new Object[]{courseid,subjectname,time,place,teachername,currentnumber,totlenumber,starttime,endtime,coursetime,academy};
			        jdbcTemplate.update(sql2,infor2);
			        return flag;
			    }
			}
		//��ȡѧ����ѡ�α������
				public List<SelectCourse> getSelectCourseInfor(){
				  String sql="select * from selectcourseb";
				  final List list=new ArrayList();
				  jdbcTemplate.query(sql, new RowCallbackHandler() {
					
					public void processRow(ResultSet rs) throws SQLException {
						// TODO Auto-generated method stub
					     final 	SelectCourse selectCourse=new SelectCourse();
					  /*   selectCourse.setCourseId(rs.getString("CourseId"));*/
					     selectCourse.setSubjectName(rs.getString("SubjectName"));
					     selectCourse.setTime(rs.getInt("Time"));
					     selectCourse.setPlace(rs.getString("Place"));
					     selectCourse.setTeacherName(rs.getString("TeacherName"));
					     selectCourse.setCurrentNumber(rs.getInt("CurrentNumber"));
					     selectCourse.setTotleNumber(rs.getInt("TotleNumber"));
					     list.add(selectCourse);
					}
				});
				  return list;
            }
				
	   //��ʼ���ſ���
	   public int SetExam(String examplace,int examnumber,String examteacherlist,String examsubjectname){
		   int flag=1;
		   String sql="select * from examb";
		    final List list=new ArrayList();
		   jdbcTemplate.query(sql, new RowCallbackHandler() {
			
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
			  final Exam exam=new Exam();
			  exam.setExamPlace(rs.getString("ExamPlace"));
			  exam.setExamNumber(rs.getInt("ExamNumber"));
			  exam.setExamTeacherList(rs.getString("ExamTeacherList"));
			  exam.setExamSubjectName(rs.getString("ExamSubjectName"));
			  list.add(exam);
			}
	});
		   for(int i=0;i<list.size();i++){
				Exam exam2=(Exam)list.get(i);
				if(examsubjectname.equals(exam2.getExamSubjectName())&&examplace.equals(exam2.getExamPlace())&&examnumber==exam2.getExamNumber()&&examteacherlist.equals(exam2.getExamTeacherList())){
					flag=0;
				    break;
				}
		  }
		  if(flag==0){
		    	return flag;
		    }
		    else{
		    	String sql2="insert into examb (ExamPlace,ExamNumber,ExamTeacherList,ExamSubjectName) values(?,?,?,?)";
		        Object[]  infor2=new Object[]{examplace,examnumber,examteacherlist,examsubjectname};
		        jdbcTemplate.update(sql2,infor2);
		        return flag;
		    }
		}
	   //�鿴���ųɹ���Ŀ�����Ϣ
	   public List<Exam> getExamInfor(){
		   String sql="select * from examb";
		    final List list=new ArrayList();
		   jdbcTemplate.query(sql, new RowCallbackHandler() {
			
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
			  final Exam exam=new Exam();
			  exam.setExamPlace(rs.getString("ExamPlace"));
			  exam.setExamNumber(rs.getInt("ExamNumber"));
			  exam.setExamTeacherList(rs.getString("ExamTeacherList"));
			  exam.setExamSubjectName(rs.getString("ExamSubjectName"));
			  list.add(exam);
			}
	      });
		   return list;
	   }
	   //������Ϣ����
	   public int  bianpai(String examplace,String studentid,String studentname,String examseats){
		   int flag=1;
		   String sql="select * from examseatsb";
		    final List list=new ArrayList();
		   jdbcTemplate.query(sql, new RowCallbackHandler() {
			
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
			  final ExamSeats examSeats=new ExamSeats();
			   examSeats.setExamPlace(rs.getString("ExamPlace"));
			   examSeats.setStudentId(rs.getString("StudentId"));
			   examSeats.setStudentName(rs.getString("StudentName"));
			   examSeats.setExamSeats(rs.getString("ExamSeats"));
			  list.add(examSeats);
			}
	});
		   for(int i=0;i<list.size();i++){
			   ExamSeats examSeats2=(ExamSeats)list.get(i);
				if(examplace.equals(examSeats2.getExamPlace())&&studentid.equals(examSeats2.getStudentId())&&studentname.equals(examSeats2.getStudentName())&&examseats.equals(examSeats2.getExamSeats())){
					flag=0;
				    break;
				}
		  }
		  if(flag==0){
		    	return flag;
		    }
		    else{
		    	String sql1="INSERT INTO examseatsb values(?,?,?,?)";
		    	Object[] infor= new Object[]{examplace,studentid,studentname,examseats};
			    jdbcTemplate.update(sql1, infor);
		        return flag;
		    }
		  }
	   //�鿴���ųɹ��Ŀ�����Ϣ
	   public List<ExamSeats> getExamStudentInfor(){
		   String sql="select * from examseatsb";
		   final List list=new ArrayList();
		   jdbcTemplate.query(sql, new RowCallbackHandler() {
			
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
			  final ExamSeats  examSeats=new ExamSeats();
			  examSeats.setExamPlace(rs.getString("ExamPlace"));
			  examSeats.setStudentId(rs.getString("StudentId"));
			  examSeats.setStudentName(rs.getString("StudentName"));
			  examSeats.setExamSeats(rs.getString("ExamSeats"));
			  list.add(examSeats);
			}
		});
		   return list;
	   }
	   
	  
	}


