package Advanced_selenium;

import org.testng.annotations.Test;

public class firefoxtest extends firefoxTC {
	@Test
	public void launchbrowser(){
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
	}
}
