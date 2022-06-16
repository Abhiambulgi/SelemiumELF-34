package Seleniumclassic;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_webelements_demo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com");
    List<WebElement>l=driver.findElements(By.xpath("//input[@type='radio']"));
      for(WebElement b:l){
		b.click();
}
	/*for(int i=0; i<=l.size()-1; i++){
		l.get(i).click();
	}
	*/
}
}
