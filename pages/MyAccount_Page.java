package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount_Page {
	WebDriver driver;
	WebElement myAccountButton;
	WebElement homeButton;
	WebElement myPersonalInformationButton;
	WebElement myAddressesButton;
	WebElement myWishListsButton;
	public MyAccount_Page(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getMyAccountButton() {
		return driver.findElement(By.cssSelector(".account"));
	}
	public WebElement getHomeButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span"));
		//return driver.findElement(By.cssSelector(".btn.btn-default.button.button-small"));
	}
	public WebElement getMyPersonalInformationButton() {
		return driver.findElement(By.className("icon-user"));
	}
	public WebElement getMyAddressesButton() {
		return driver.findElement(By.className("icon-building"));
	}
	public WebElement getMyWishListsButton() {
		return driver.findElement(By.className("icon-heart"));
	}
	
	public void myAccountButtonClick() {
		this.getMyAccountButton().click();
	}
	public void myAddressesButtonClick() {
		this.getMyAddressesButton().click();
	}
	public void myPersonalInformationButtonClick() {
		this.getMyPersonalInformationButton().click();
	}
	public void myWishlistButtonClick() {
		this.getMyWishListsButton().click();
	}
	public String homeButton() {
		return this.getHomeButton().getText();
	}

}
