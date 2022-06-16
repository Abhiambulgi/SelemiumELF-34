package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openedge {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	Thread.sleep(2000);
	driver.quit();
}
}
