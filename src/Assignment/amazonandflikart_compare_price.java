package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonandflikart_compare_price {

public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	    WebDriver  driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com/");
	    Actions act=new Actions(driver);
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		WebElement search=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		search.sendKeys("realme 9i (Prism Blue, 64 GB)");
		search.sendKeys(Keys.ENTER);
		WebElement cli=driver.findElement(By.xpath("//div[text()='realme 9i (Prism Blue, 64 GB)']/../../..//div[contains(text(),'₹13,499')]"));
		cli.click();
		String fv=cli.getText();
		if(cli.isDisplayed())
		{
			System.out.println("flipkart value "+fv);
		}
		/*String amazon=driver.getWindowHandle();
		Set<String> wb=driver.getWindowHandles();
		for(String a1:wb){
			if(amazon.equals(a1)==false){
				driver.close();
				driver.switchTo().window(a1);
				
			}
		}*/
		driver.close();
		WebDriver  driver1 = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		WebElement search1=driver.findElement(By.id("twotabsearchtextbox"));search1.sendKeys("realme 9i (Prism Blue, 64 GB)");search1.sendKeys(Keys.ENTER);
		WebElement search2=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
	    search2.click();
	    WebElement search3=driver.findElement(By.xpath("//span[text()='13,695']"));search2.isDisplayed();
	    String av=search3.getText();
	    if(search3.isDisplayed()){
	    	System.out.println("amazon value "+av);
	    }
	    String flip="";
	    for(int i=0; i<fv.length(); i++){
	    char ch=fv.charAt(i);
	    if(Character.isDigit(ch)){
	    	flip=flip+ch;
	    }
	    }
	    String aman="";
	    for(int i=0; i<fv.length(); i++){
	    char ch=fv.charAt(i);
	    if(Character.isDigit(ch)){
	    	aman=aman+ch;
	    }
	    }
	   if(Integer.parseInt(flip)>Integer.parseInt(aman)){
		   System.out.println("Buy Amzon Product");
	   }
	   else{
		   System.out.println("Buy Flipkart Product");
	   }
		
	    }

} 
	    
	    


