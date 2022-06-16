package Advanced_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class working_with_propertyfile  {
public static String getProperty(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./Testdata/config.properties");
	Properties property=new Properties();
	property.load(fis);
	return(property.getProperty(key));
	//System.out.println(property.getProperty("LOGIN"));
	 
}
}
