package Seleniumclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_uploadfile_pop_up {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://smallpdf.com/pdf-to-word");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Users/ambul/OneDrive/Documents/SUHAIL PASHA D.pdf");
}
}
