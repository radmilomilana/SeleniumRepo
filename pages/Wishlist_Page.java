package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wishlist_Page {
	WebDriver driver;
	WebElement newWishListNameField;
	WebElement saveWishList;
	WebElement deleteWishList;
	WebElement directLink;
	WebElement homeButton;
	
	public Wishlist_Page(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getNewWishListNameField() {
		return driver.findElement(By.id("name"));
	}
	public WebElement getSaveWishList() {
		return driver.findElement(By.id("submitWishlist"));
	}
	
	public WebElement getDirectLink() {
		return driver.findElement(By.xpath("//*[@id=\"block-history\"]/table/thead/tr/th[5]"));
		
	}
	public WebElement getDeleteWishList() {
	return driver.findElement(By.cssSelector(".wishlist_delete"));
	}
	public WebElement getHomeButton() {
		return driver.findElement(By.xpath("//*[@id=\"mywishlist\"]/ul/li[2]/a"));
	}

	public void addNameForNewWishList (String nameOfWishList) {
		this.getNewWishListNameField().clear();
		this.getNewWishListNameField().sendKeys(nameOfWishList);
	}
	public void wishListSaveButtonClick() {
		this.getSaveWishList().click();
	}
	public String directList() {
		return this.getDirectLink().getText();
	}
	public void deleteWishListClick() {
		this.getDeleteWishList().click();
	}
	public String HomeButtonText() {
		return this.getHomeButton().getText();
	}
	
}
