package Seleniumclassic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class workingwith_windowhandle_s {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	String s=driver.getWindowHandle();
	System.out.println(s);
	driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	Set<String> window=driver.getWindowHandles();
	System.out.println(window);
	for(String l:window){
		if(s.equals(l)){
			driver.switchTo().window(l);
			// driver.close();
		}
		else{
			driver.switchTo().window(l);
			driver.close();
		}
	}
	
	
}
}
