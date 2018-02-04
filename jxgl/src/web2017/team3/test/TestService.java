package web2017.team3.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web2017.team3.controller.StudentRegist;
import web2017.team3.domain.Student;
import web2017.team3.service.StudentService;


public class TestService {
	String xml = "applicationContext.xml";
	ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
	StudentService ss = (StudentService) ac.getBean("studentService");
	
	
	@Test
	public void TestHasMatchCount(){
		boolean b = ss.hasMatchCount("admin", "123");
		System.out.println(b);
	}
	
	@Test
	public void testIsExistName(){
		ss.isExistName("admin");
		boolean b = ss.isExistName("admin");
		System.out.println(b);
	}
	
	@Test
	public void testUpdatePassword(){
		//TODO     testUpdatePAssword      ���ǲ�������
		StudentRegist sr = new StudentRegist();
		sr.setPassword("222");
		sr.setUsername("1111");
		sr.setSex("nv");
		sr.setWord("cba");
//		ss.lookForPassword(sr);
	}
	
	@Test
	public void insertStudent(){
		StudentRegist stu = new StudentRegist();
		stu.setUsername("tom");
		stu.setPassword("123");
		stu.setSex("��");
		stu.setWord("abc");
		System.out.println(stu);
		ss.insertStudent(stu);
	}
	
	@Test
	public void TestSearchAll(){
		List<Student> list = ss.searchAllStudent();
		if(list.size()>0){
			System.out.println("--------list.size()="+list.size());
			System.out.println(list);
		}
	}
	
	
	
	
}
