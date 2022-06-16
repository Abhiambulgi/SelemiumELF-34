package Advanced_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium. WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGIN_PAGE {

	public LOGIN_PAGE(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(className="ico-login")
	 private WebElement loginlink;
	public void login(){
		loginlink.click();
	}
	
	@FindBy(xpath="//input[@class='email']")
	private WebElement EmailTF;
	public void email(String email){
		EmailTF.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@class='password']")
	 private WebElement PasswordTF;
	public void password(String password){
		PasswordTF.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@value='Log in']")
	 private WebElement loginbutton;
	public void logout(){
		loginbutton.click();
	}
	public WebElement getLoginlink() {
		return loginlink;
	}
	public WebElement getEmailTF() {
		return EmailTF;
	}
	public WebElement getPasswordTF() {
		return PasswordTF;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public void setLoginlink(WebElement loginlink) {
		this.loginlink = loginlink;
	}
	public void setEmailTF(WebElement emailTF) {
		EmailTF = emailTF;
	}
	public void setPasswordTF(WebElement passwordTF) {
		PasswordTF = passwordTF;
	}
	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}
	
	
	
	

}
