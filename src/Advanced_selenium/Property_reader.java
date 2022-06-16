package Advanced_selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_reader {
	public static String key;
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./Testdata/cofig.properties");
	Properties property=new Properties();
	property.load(fis);
	System.out.println(working_with_propertyfile.getProperty(key));
}
}

