package web2017.team3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web2017.team3.controller.StudentRegist;
import web2017.team3.dao.StudentDao;
import web2017.team3.domain.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	
	public boolean hasMatchCount(String username,String password){
		return studentDao.hasMatchCount(username, password)>0;
	}
	
	public boolean isExistName(String username){
		return studentDao.isExistName(username);
	}

	public void insertStudent(StudentRegist stu) {
		studentDao.insertStudent(stu);
		
	}
	public void lookForPassword(String password,String username,String sex,String word){
		studentDao.lookForPassword(password,username,sex,word);
	}

	public Student getMatchCount(String username, String password) {
		Student stu = studentDao.getMatchCount(username,password);
		return stu;
	}
	
	
	public List<Student> searchAllStudent(){
		
		return studentDao.searchAllStudent();
	}
	
	//hxp
	public void saveStudent(Student student) {
		studentDao.saveOrUpdate(student);
		
	}

	public void updateStudent(Student student) {
		studentDao.saveOrUpdate(student);
	}

	public void deleteStudent(int userid) {
		studentDao.delete(userid);
	}

	public List<Student> findAllStudnt() { 
		return studentDao.searchAllStudent();
	}

	public Student findById(int userid) {
		
		return studentDao.findById(userid);
	}

	public Student findByUserNamePassword(String userName, String passWord) {
		return studentDao.findByUserNamePassword(userName, passWord);
	}
	
	public List<Student> findStudnt(String username) {
		return studentDao.findByUserName(username);
	}
	
	
}
