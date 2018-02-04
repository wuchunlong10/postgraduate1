package web2017.team3.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web2017.team3.dao.StudentDao;
import web2017.team3.domain.Student;

public class StudentDaoTest {
	String xml = "applicationContext.xml";
	ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
	StudentDao ss = (StudentDao) ac.getBean("studentDao");
	@Test
	public void testFindAll() {
		List<Student> findAll = ss.searchAllStudent();
		for (Student student : findAll) {
			System.out.println(student);
		}
	}

}
