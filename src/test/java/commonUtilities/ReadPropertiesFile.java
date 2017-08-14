package commonUtilities;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadPropertiesFile {
	private static java.util.Properties propObj = new java.util.Properties();
	
	/**
	*@author 			: Abhishek
	*@createdDate		: 16th April 2017 5:30+ IST
	*@lastUpdatedDate	: 16th April 2017 5:30+ IST
	*@version			: 0.1
	*Description		: This method is used to read config.properties file and return the value of the key passed.
	*Change History		: -	initial definition
	*/	
	public static String returnValueOfKey(String Key) throws IOException{
		try{
			FileInputStream fs = new FileInputStream("config.properties");
			propObj.load(fs);
			String value = propObj.getProperty(Key);
			fs.close();
			return value;
		}
		catch(IOException e){
			throw e;
		}
	}
	
	/**
	*@author 			: Abhishek
	*@createdDate		: 16th April 2017 5:30+ IST
	*@lastUpdatedDate	: 16th April 2017 5:30+ IST
	*@version			: 0.1
	*Description		: This method is used to read testData.properties file by name and return the value of the key passed.
	*Change History		: - initial definition
	*/	
	public static String returnValueOfKey(String filename,String Key) throws IOException{
		try{
			System.out.println(returnTestDataFrameworkPath()+filename);
			FileInputStream fs = new FileInputStream(returnTestDataFrameworkPath()+filename);
			propObj.load(fs);
			String value = propObj.getProperty(Key);
			fs.close();
			return value;
		}
		catch(IOException e){
			throw e;
		}
	}
	
	/**
	*@author 			: Abhishek
	*@createdDate		: 16th April 2017 5:30+ IST
	*@lastUpdatedDate	: 16th April 2017 5:30+ IST
	*@version			: 0.1
	*Description		: This method is a private method used to read testDataPath from config.properties only.
	*Change History		: -	Initial definition
	*/	
	private static String returnTestDataFrameworkPath() throws IOException{
		return returnValueOfKey("testDataPath");
	}
	
}
