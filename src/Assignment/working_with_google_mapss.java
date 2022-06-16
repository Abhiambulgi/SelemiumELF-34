package Assignment;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_google_mapss {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/maps/@12.9466368,77.594624,12z");
		driver.findElement(By.id("hArJGc")).click();
		driver.findElement(By.xpath("//input[@aria-controls='sbsg51']")).sendKeys("vijaynagar");
		driver.findElement(By.xpath("//input[@aria-controls='sbsg51']/../../../..//button[@aria-label='Search']")).click();
		driver.findElement(By.xpath("//input[@aria-controls='sbsg52']")).sendKeys("Bidar");
		driver.findElement(By.xpath("//input[@aria-controls='sbsg52']/../../../..//button[@aria-label='Search']")).click();
		try{
		if(driver.findElement(By.xpath("//button[contains(text(),'Send directions')]")).isDisplayed()){
			System.out.println("test case pass");
			}
		}
		catch(NoSuchElementException e){
			System.out.println("test case fail");
		}
	}
}

