package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	public ReadConfig() throws IOException
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream("com.bookmyshow/src/main/java/resources/config.properties");
			prop= new Properties();
			prop.load(fis);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		}
	public String getURL()
	{
		return prop.getProperty("url");
	}
	
	}
	
	


