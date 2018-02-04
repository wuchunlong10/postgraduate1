package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.queryCourse;
import Entity.Course;

@Service
public class queryTeacherStudy {
	@Autowired
	private queryCourse queryCourse;
	
	public List<Course> queryTeachersStudy(String idNumber) {
		return queryCourse.queryCourseInfo(idNumber);
	}
}
