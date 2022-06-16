package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class openie {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.opera.driver","./softwares/operadriver.exe");
	WebDriver driver=new OperaDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	Thread.sleep(2000);
	driver.quit();
}
}
