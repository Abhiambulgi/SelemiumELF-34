package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectall_options_at_a_time {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ambul/Downloads/demo.html");
		WebElement drop=driver.findElement(By.id("standard_cars"));
		Select dropdown=new Select(drop);
		List<WebElement> options=dropdown.getOptions();
		for(int i=0;i<options.size(); i++){
			Select dropdown1=new Select(driver.findElement(By.id("standard_cars")));
			Thread.sleep(1000);
			dropdown1.selectByIndex(i);
		}
		driver.quit();
	}
	}
