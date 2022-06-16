package Seleniumclassic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle_demowebshop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		String s=driver.getWindowHandle();
		WebElement dFB=driver.findElement(By.xpath("//a[text()='Facebook']"));
		dFB.click();
		Thread.sleep(4000);
		Set<String> FB=driver.getWindowHandles();
		for(String l:FB){
			if(!s.equals(l)){
				driver.switchTo().window(l);
				driver.close();
			}
			/*else{
				driver.switchTo().window(l);
				driver.close();
			}*/
		}
		
		
	}
}
