package Control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataBaseSelect {
	
	public void select(HttpServletRequest request){
		String rol = request.getParameter("loc");
		DriverManagerDataSource oracleDataSource = new DriverManagerDataSource();
		oracleDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		oracleDataSource.setUsername("group9");
		oracleDataSource.setPassword("admin");
		if("loc1".equals(rol)){
			oracleDataSource.setUrl("jdbc:oracle:thin:@192.168.197.187:1521:m1");
		}else if("loc2".equals(rol)){
			oracleDataSource.setUrl("jdbc:oracle:thin:@192.168.197.200:1521:m1");
		}else{
			oracleDataSource.setUrl("jdbc:oracle:thin:@192.168.197.205:1521:m1");
		}
	}
}

