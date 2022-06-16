package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_all_options_dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ambul/Downloads/demo.html");
		WebElement drop=driver.findElement(By.id("standard_cars"));
		Select dropdown=new Select(drop);
		List<WebElement> options=dropdown.getOptions();
		for(WebElement wb:options){
			System.out.println(wb.getText());
		}
		driver.quit();
	}
	}

