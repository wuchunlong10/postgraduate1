package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.addTeacherDao;
import Entity.teacherDao;

@Service
public class addTeacherService {
	@Autowired
	private addTeacherDao addTeacherDao;
	
	public String addTeacherNumService(String year,String college) {
		String number = addTeacherDao.addTeacherNum(year, college);
		return number;
	}
	public void addTeacherInfoService(teacherDao teacher) {
		addTeacherDao.addTeacherInfo(teacher);
	}
}
