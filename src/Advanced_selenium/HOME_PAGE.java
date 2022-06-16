package Advanced_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOME_PAGE {

	public HOME_PAGE(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(className="ico-register")
	private WebElement registerlink;
	public void reg(){
		registerlink.click();
	}
	
	@FindBy(className="ico-login")
	 private  WebElement loginlink;
	public void log(){
		loginlink.click();
	}
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	 private WebElement shoppingcartlink;
	public void cart(){
		shoppingcartlink.click();
	}
	
	@FindBy(xpath="//span[text()='Wishlist']")
	 private WebElement wishlistlink;
	public void wish(){
		wishlistlink.click();
	}
	
	
	@FindBy(xpath="//input[@id='small-searchterms']")
	 private WebElement searchTF;
	public void search(String search){
		searchTF.sendKeys(search);
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbutton;
	public void searchbutton(){
		searchbutton.click();
	}
	
	@FindBy(partialLinkText="BOOKS")
    private WebElement bookslink;
	public void book(){
		bookslink.click();
	}
	
	@FindBy(partialLinkText="COMPUTERS")
	 private WebElement computerslink;
	public void computer(){
		computerslink.click();
	}
	
	@FindBy(partialLinkText="ELECTRONICS")
	 private WebElement electronicslink;
	public void electronics(){
		electronicslink.click();
	}
	
	@FindBy(partialLinkText="Apparel & Shoes")
	 private WebElement ApparelShoeslink;
	public void appareal(){
		ApparelShoeslink.click();
	}
	
	@FindBy(partialLinkText="Digital downloads")
	 private WebElement Digitaldownloadslink;
	public void digital(){
		Digitaldownloadslink.click();
	}
	
	@FindBy(partialLinkText="Jewelry")
	 private WebElement Jewelryslink;
	public void jewlry(){
		Jewelryslink.click();
	}
	
	@FindBy(partialLinkText="Gift Cards")
	 private WebElement GiftCardsslink;
	public void giftcard(){
		GiftCardsslink.click();
	}
	
	@FindBy(className="ico-logout")
    private WebElement logoutlink;
	public void logout(){
		logoutlink.click();
	}
	public WebElement getRegisterlink() {
		return registerlink;
	}
	public WebElement getLoginlink() {
		return loginlink;
	}
	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}
	public WebElement getWishlistlink() {
		return wishlistlink;
	}
	public WebElement getSearchTF() {
		return searchTF;
	}
	public WebElement getSearchbutton() {
		return searchbutton;
	}
	public WebElement getBookslink() {
		return bookslink;
	}
	public WebElement getComputerslink() {
		return computerslink;
	}
	public WebElement getElectronicslink() {
		return electronicslink;
	}
	public WebElement getApparelShoeslink() {
		return ApparelShoeslink;
	}
	public WebElement getDigitaldownloadslink() {
		return Digitaldownloadslink;
	}
	public WebElement getJewelryslink() {
		return Jewelryslink;
	}
	public WebElement getGiftCardsslink() {
		return GiftCardsslink;
	}
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	public void setRegisterlink(WebElement registerlink) {
		this.registerlink = registerlink;
	}
	public void setLoginlink(WebElement loginlink) {
		this.loginlink = loginlink;
	}
	public void setShoppingcartlink(WebElement shoppingcartlink) {
		this.shoppingcartlink = shoppingcartlink;
	}
	public void setWishlistlink(WebElement wishlistlink) {
		this.wishlistlink = wishlistlink;
	}
	public void setSearchTF(WebElement searchTF) {
		this.searchTF = searchTF;
	}
	public void setSearchbutton(WebElement searchbutton) {
		this.searchbutton = searchbutton;
	}
	public void setBookslink(WebElement bookslink) {
		this.bookslink = bookslink;
	}
	public void setComputerslink(WebElement computerslink) {
		this.computerslink = computerslink;
	}
	public void setElectronicslink(WebElement electronicslink) {
		this.electronicslink = electronicslink;
	}
	public void setApparelShoeslink(WebElement apparelShoeslink) {
		ApparelShoeslink = apparelShoeslink;
	}
	public void setDigitaldownloadslink(WebElement digitaldownloadslink) {
		Digitaldownloadslink = digitaldownloadslink;
	}
	public void setJewelryslink(WebElement jewelryslink) {
		Jewelryslink = jewelryslink;
	}
	public void setGiftCardsslink(WebElement giftCardsslink) {
		GiftCardsslink = giftCardsslink;
	}
	public void setLogoutlink(WebElement logoutlink) {
		this.logoutlink = logoutlink;
	}

}
