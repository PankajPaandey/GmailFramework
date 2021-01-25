package coreFramework;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import coreFramework.constants.constantType;

public class constants {

	
public static enum constantType {
	Locator("Locator.properties"),
	Project_Link("Project_Link.properties");
	
	private String constantType;
	
	constantType(String constantType){
		this.constantType=constantType;
	}
	
	public String getConstanType() {
		return constantType;
	}
};

public static Set<Object> getAvailableKeys(constantType constantType) throws Exception{
	 
	Properties properties= new Properties();
	Set<Object> key= new HashSet<>();
	File propertiesFile = new File("src/test/resources/Property/"+constantType.getConstanType());
	if(propertiesFile.exists()) {
		try(FileInputStream fis= new FileInputStream(propertiesFile)){
			properties.load(fis);
			key= properties.keySet();
		}catch(Exception e){
			System.out.println("file not found"+constantType);
		}
	}else {
		System.out.println("file not found"+constantType);
	}
	return key;
}

public static String getConstantValue(constantType constantType,String constantName)throws Exception{
	Properties properties = new Properties();
	File propertiesFile = new File("src/test/resources/Property/"+constantType.getConstanType());
	if(propertiesFile.exists()) {
		try(FileInputStream fis= new FileInputStream(propertiesFile)){
			properties.load(fis);
			if(properties.containsKey(constantName.trim())) {
				return properties.getProperty(constantName);
			}else {
				throw new Exception(String.format("%s key is not present in %s file",constantName,constantType));
			}
		}catch(Exception e){
			throw new Exception(String.format("Error occured while reading %s key from %s file. Error - %s", constantName,constantType,e.getMessage()));
		}
	}else {
		throw new Exception(String.format("%s file is not present", constantType.getConstanType()));
	}	
}
}
