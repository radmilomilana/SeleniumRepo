package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	WebElement signInButtonTopRightCorner;
	WebElement emailField;
	WebElement passwordField;
	WebElement signInButton;
	WebElement actualAssertMessage;
	WebElement invalidDataMessage;
	WebElement signOutButton;
	WebElement messageAfterSignOut;
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSignInButtonTopRightCorner() {
		return driver.findElement(By.cssSelector(".login"));
	}

	public WebElement getEmailField() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("passwd"));
	}

	public WebElement getSignInButton() {
		return driver.findElement(By.id("SubmitLogin"));
	}
	public WebElement getActualAssertMessage() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
	}
	public WebElement getEmptyDataMessage() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol"));
	}
	public WebElement getWrongDataMessage() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol"));
	}
	public WebElement getSignOutButton() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
	}
	
	public WebElement getMessageAfterSignOut() {
		return driver.findElement(By.cssSelector(".page-heading"));
	}

	public void signInButtonTopRightCornerClick() {
		this.getSignInButtonTopRightCorner().click();
	}
	public void emailInput(String email) {
		this.getEmailField().clear();
		this.getEmailField().sendKeys(email);
	}
	public void passwordInput(String pass) {
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(pass);
	}
	public void signInClick() {
		this.getSignInButton().click();
	}
	public String welcomeMessage() {
		return this.getActualAssertMessage().getText();
	}
	public String emptyDataMessage() {
		return this.getEmptyDataMessage().getText();
	}
	public String wrongDataMessage() {
		return this.getWrongDataMessage().getText();
	}
	public void signOutButtonClick() {
		this.getSignOutButton().click();
	}
	public String checkForSignOut() {
		return this.getMessageAfterSignOut().getText();
	}

	
}
