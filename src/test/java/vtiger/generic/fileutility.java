package vtiger.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fileutility 
{

//read data from property file
public String readdatapropfile(String key, String value) throws IOException 
{
	FileInputStream fs=new FileInputStream("C:/Users/SP KANNAN/Desktop/Selenium/Maven/src/test/java/vtiger/generic/vtiger.properties");
	Properties p=new Properties();
	p.load(fs);
	String value1=p.getProperty(key);
	return value1;
			
	
}

}
