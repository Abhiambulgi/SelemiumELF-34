package Advanced_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {

	public Welcomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(className="ico-register")
	 private WebElement registerlink;
	public void reg(){
		registerlink.click();
	}
	
	@FindBy(className="ico-login")
	 private WebElement loginlink;
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
	
	public WebElement getRegisterlink() {
		return registerlink;
	}
	public void setRegisterlink(WebElement registerlink) {
		this.registerlink = registerlink;
	}
	public WebElement getLoginlink() {
		return loginlink;
	}
	public void setLoginlink(WebElement loginlink) {
		this.loginlink = loginlink;
	}
	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}
	public void setShoppingcartlink(WebElement shoppingcartlink) {
		this.shoppingcartlink = shoppingcartlink;
	}
	public WebElement getWishlistlink() {
		return wishlistlink;
	}
	public void setWishlistlink(WebElement wishlistlink) {
		this.wishlistlink = wishlistlink;
	}
	public WebElement getSearchTF() {
		return searchTF;
	}
	public void setSearchTF(WebElement searchTF) {
		this.searchTF = searchTF;
	}
	public WebElement getSearchbutton() {
		return searchbutton;
	}
	public void setSearchbutton(WebElement searchbutton) {
		this.searchbutton = searchbutton;
	}
	public WebElement getBookslink() {
		return bookslink;
	}
	public void setBookslink(WebElement bookslink) {
		this.bookslink = bookslink;
	}
	public WebElement getComputerslink() {
		return computerslink;
	}
	public void setComputerslink(WebElement computerslink) {
		this.computerslink = computerslink;
	}
	public WebElement getElectronicslink() {
		return electronicslink;
	}
	public void setElectronicslink(WebElement electronicslink) {
		this.electronicslink = electronicslink;
	}
	public WebElement getApparelShoeslink() {
		return ApparelShoeslink;
	}
	public void setApparelShoeslink(WebElement apparelShoeslink) {
		ApparelShoeslink = apparelShoeslink;
	}
	public WebElement getDigitaldownloadslink() {
		return Digitaldownloadslink;
	}
	public void setDigitaldownloadslink(WebElement digitaldownloadslink) {
		Digitaldownloadslink = digitaldownloadslink;
	}
	public WebElement getJewelryslink() {
		return Jewelryslink;
	}
	public void setJewelryslink(WebElement jewelryslink) {
		Jewelryslink = jewelryslink;
	}
	public WebElement getGiftCardsslink() {
		return GiftCardsslink;
	}
	public void setGiftCardsslink(WebElement giftCardsslink) {
		GiftCardsslink = giftCardsslink;
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
	
	
}
