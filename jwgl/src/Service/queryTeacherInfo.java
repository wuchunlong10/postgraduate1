package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.queryInfomation;
import Entity.teacherDao;

@Service
public class queryTeacherInfo {
	@Autowired
	private queryInfomation queryInfomation;
	
	public teacherDao queryTeacherInfomation(String idNumber) {
		teacherDao teacher;
		teacher = queryInfomation.findUserById(idNumber);
		return teacher;
	}
}
