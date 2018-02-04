package web2017.team3.utils;

import java.util.HashMap;
import java.util.Map;

public class ZWTFileUploadAppProperties {
	
	private Map<String, String> properties = new HashMap<String, String>();
	
	private ZWTFileUploadAppProperties(){}
	
	private static ZWTFileUploadAppProperties instance = new ZWTFileUploadAppProperties();
	
	public static ZWTFileUploadAppProperties getInstance() {
		return instance;
	}
	
	public void addProperty(String propertyName, String propertyValue){
		properties.put(propertyName, propertyValue);
	}
	
	public String getProperty(String propertyName){
		return properties.get(propertyName);
	}
	
}
