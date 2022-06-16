package Seleniumclassic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Css_selector_fb {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
    driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
    String fn="abhi";
    String sn="ambulgi";
    String mno="1234567890";
    String pwd="Abhi@1234";
    WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='firstname']")));
    driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(fn);
    driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(sn);
    driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys(mno);
    driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys(pwd);
    driver.findElement(By.cssSelector("button[name='websubmit']")).click();
}
}
