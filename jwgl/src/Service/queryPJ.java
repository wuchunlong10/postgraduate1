package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.queryPingjiao;
import Entity.Evaluate;

@Service
public class queryPJ {
	@Autowired
	private queryPingjiao qPingjiao;
	
	public List<Evaluate> queryPingJiao(String SubjectName) {
		List<Evaluate> eList = qPingjiao.queryPingJiao(SubjectName);
		return eList;
	}
	
	public List<Evaluate> queryCourseList(String idNumber) {
		return qPingjiao.queryCourse(idNumber);
	}
}
