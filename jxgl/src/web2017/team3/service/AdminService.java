package web2017.team3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mchange.v2.resourcepool.ResourcePool.Manager;

import web2017.team3.dao.AdminDao;
import web2017.team3.domain.Admin;

@Service
public class AdminService {
	@Autowired
	private AdminDao adminDao;
	
	public boolean hasMatchCount(String username,String password){
		return adminDao.hasMatchCount(username, password)>0;
	}
	
	public Admin getMatchCount(String username, String password) {
		return adminDao.getMatchCount(username,password);
	}
	
	////xfs
	public boolean hasMatchUser1(String name,String password){
		int matchCount=adminDao.getMatchCount1(name, password);
		return matchCount>0;
	}
	public Admin findByName(String Name) {
		return adminDao.findByName(Name);
	}
	 public void addManager(Admin manager){
		 adminDao.addManager(manager);
	    }
	 public void update(String name,String password){
		 adminDao.update(name,password);
		 }
	 //wan
}
