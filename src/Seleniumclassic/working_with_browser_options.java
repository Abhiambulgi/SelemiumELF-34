package Seleniumclassic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class working_with_browser_options {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notificatios");
	option.addArguments("--headless");
	option.addArguments("start-maximized");
	WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.easemytrip.com/");
	System.out.println("browser running in background");
	
}
}
