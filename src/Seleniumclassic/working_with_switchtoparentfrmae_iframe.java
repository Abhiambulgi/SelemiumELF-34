package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_switchtoparentfrmae_iframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ambul/Downloads/iframe.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[contains(text(),'COVID')]")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@href='http://google.com']")).click();
}
}
