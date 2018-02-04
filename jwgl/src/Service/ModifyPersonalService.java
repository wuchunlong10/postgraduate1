package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.modifyPersonDao;
import Entity.teacherDao;

@Service
public class ModifyPersonalService {
	@Autowired
	private modifyPersonDao modifyPersonDao;
	
	public void ModifyPersonalInfo(String idNumber,String address,String education,String phone,String prize) {
		modifyPersonDao.personalModify(idNumber, address, education, phone, prize);
	}
	
	public teacherDao getPersonalInfo(String idNumber) {
		return modifyPersonDao.getPersonalInfo(idNumber);
	}
}
