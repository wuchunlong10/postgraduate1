package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.LoginDao;
import Entity.User;

@Service
public class LoginService {
	@Autowired
	private LoginDao logindao;
	public int logincheck(String studentid,String password,String loc){
		return logindao.logincheck(studentid,password,loc);
	}
	public User loginbystudentid(String studentid){
		return logindao.loginbystudentid(studentid);
	}
}
