package Advanced_selenium;

import org.testng.annotations.Test;

public class chrometest extends chromeTC {
@Test
public void launch(){
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
}
}
