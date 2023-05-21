package readPropertiesData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/config.properties");//provide the path of properties file
		//read the data from prperty file
		Properties prop = new Properties();//create object of properties 
		prop.load(fis);//make the property file ready for read
		String username = prop.getProperty("username");
		System.out.println(username);
		
	}

}
