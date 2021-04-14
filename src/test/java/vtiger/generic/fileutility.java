package vtiger.generic;

import java.io.FileInputStream;
import java.util.Properties;

public class fileutility 
{

//read data from property file
public String readdatapropfile(String key) 
{
	FileInputStream fs=new FileInputStream(path);
	Properties p=new Properties();
	p.load(fs);
	String value=p.getProperty(key);
	return value;
			
	
}

}
