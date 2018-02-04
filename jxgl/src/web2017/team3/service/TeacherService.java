package web2017.team3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web2017.team3.dao.TeacherDao;
import web2017.team3.domain.Teacher;

@Service
public class TeacherService {
	@Autowired
	private TeacherDao teacherDao;
	
	
	public boolean hasMatchCount(String username,String password){
		return teacherDao.hasMatchCount(username, password)>0;
	}

	public Teacher getMatchCount(String username, String password) {
		return teacherDao.getMatchCount(username,password);
	}
	
	
	////-----------xfs---------------------
		public boolean hasMatchUser(int tid, String tpassword) {
			int matchCount = teacherDao.getMatchCount(tid, tpassword);
			return matchCount > 0;
		}

		public List<Teacher> searchteacher() {
			return teacherDao.searchteacher();
		}


		public void addTeacher(Teacher teacher) {
			teacherDao.addTeacher(teacher);
		}

		public Teacher findTeacherByTid(int tid) {
			return teacherDao.findTeacherByTid(tid);
		}

		public Teacher getTeacher(int tid) {
			return teacherDao.getTeacher(tid);
		}

		public void update(String tname, String mail, String tel, int dpn, int age, String sex, String address, int tid) {
			teacherDao.update(tname, mail, tel, dpn, age, sex, address, tid);
		}

		public void delete(int tid) {
			teacherDao.delete(tid);
		}

		public void updatepas(String tpassword,int tid) {
			teacherDao.updatepas(tpassword, tid);
		}
		public int accuratematch(String tname){
			return teacherDao.accuratematch(tname);
		}
		public Teacher accurate(String tname){
			return teacherDao.accurate(tname);
		}

}
