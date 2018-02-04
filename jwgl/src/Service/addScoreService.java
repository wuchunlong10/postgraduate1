package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.addScoreDao;
import Entity.ClassInfo;
import Entity.Course;

@Service
public class addScoreService {
	@Autowired
	private addScoreDao addScoreDao;
	
	public List<Course> queryCourseList(String idNumber) {
		return addScoreDao.queryCourse(idNumber);
	}
	
	public List<ClassInfo> queryClassList(String SubjectName) {
		return addScoreDao.queryClass(SubjectName);
	}
	
	public List<ClassInfo> queryNameList(String  classInfo,String SubjectName) {
		return addScoreDao.nameList(classInfo,SubjectName);
	}
	
	public void  addScore(List<ClassInfo> addList) {
		addScoreDao.addScore(addList);
	}
}
