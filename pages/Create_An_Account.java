package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Create_An_Account {
	WebDriver driver;
	WebElement signInButtonTopRightCorner;
	WebElement emailField;
	WebElement createAnAccountButton;
	WebElement afterCreatingAccountMessage;
	WebElement wrongEmailAddressMessage;
	WebElement title;
	WebElement first_Name;
	WebElement last_Name;
	WebElement password;
	WebElement firstNameAgain;
	WebElement lastNameAgain;
	WebElement address;
	WebElement city;
	org.openqa.selenium.support.ui.Select state;
	WebElement mobilePhoneNumber;
	WebElement assignAnAddress;
	WebElement registerButton;
	WebElement postalCode;
	org.openqa.selenium.support.ui.Select country;
	WebElement myAccountMessage;

	public Create_An_Account(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getSignInButtonTopRightCorner() {
		return driver.findElement(By.cssSelector(".login"));
	}

	public WebElement getEmailField() {
		return driver.findElement(By.id("email_create"));
	}

	public WebElement getCreateAnAccountButton() {
		return driver.findElement(By.id("SubmitCreate"));
	}

	public WebElement getAfterCreatingAccountMessage() {
		return driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/h3"));
		// return driver.findElement(By.cssSelector(".page-subheading"));
	}

	public WebElement getWrongEmailAddressMessage() {
		return driver.findElement(By.id("create_account_error"));
	}

	public void signInButtonTopRightCornerClick() {
		this.getSignInButtonTopRightCorner().click();
	}

	public void emailInputField(String email) {
		this.getEmailField().clear();
		this.getEmailField().sendKeys(email);
	}

	public void createAnAccountButtonClick() {
		this.getCreateAnAccountButton().click();
	}

	public String afterCreatingAccountMessage() {
		return this.getAfterCreatingAccountMessage().getText();
	}

	public String wrongEmailAddressMessage() {
		return this.getWrongEmailAddressMessage().getText();
	}

	public WebElement getTitle() {
		return driver.findElement(By.id("id_gender2"));
	}

	public WebElement getFirst_Name() {
		return driver.findElement(By.id("customer_firstname"));
	}

	public WebElement getLast_Name() {
		return driver.findElement(By.id("customer_lastname"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("passwd"));
	}

	public WebElement getFirstNameAgain() {
		return driver.findElement(By.id("firstname"));
	}

	public WebElement getLastNameAgain() {
		return driver.findElement(By.id("lastname"));
	}
	// country drop
	// WebElement country_dropDown = driver.findElement(By.id("id_country"));
	// org.openqa.selenium.support.ui.Select countryDrop = new
	// org.openqa.selenium.support.ui.Select(country_dropDown);

	public WebElement getAddress() {
		return driver.findElement(By.id("address1"));
	}

	public WebElement getCity() {
		return driver.findElement(By.id("city"));
	}

	public org.openqa.selenium.support.ui.Select getStateDrop() {
		state = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("id_state")));
		return state;
	}

	public org.openqa.selenium.support.ui.Select getCountryDrop() {
		country = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("id_country")));
		return country;
	}

	public WebElement getState() {
		return driver.findElement(By.id("uniform-id_state"));
	}

	public WebElement getPostalCode() {
		return driver.findElement(By.id("postcode"));
	}

	public WebElement getMobilePhoneNumber() {
		return driver.findElement(By.id("phone_mobile"));
	}

	public WebElement getAssignAnAddress() {
		return driver.findElement(By.id("alias"));
	}

	public WebElement getRegisterButton() {
		return driver.findElement(By.id("submitAccount"));
	}

	public WebElement getCountry() {
		return driver.findElement(By.id("id_country"));
	}
	public WebElement getMyAccountMessage() {
		return driver.findElement(By.cssSelector(".page-heading"));
	}

	public void titleCheck() {
		this.getTitle().click();
	}

	public void inputFirstNameinField(String name) {
		this.getFirst_Name().clear();
		this.getFirst_Name().sendKeys(name);
	}

	public void inputLastNameinFielf(String lastName) {
		this.getLast_Name().clear();
		this.getLast_Name().sendKeys(lastName);
	}

	public void passwordInput(String password) {
		this.getPassword().clear();
		this.getPassword().sendKeys(password);
	}

	public void inputFirstnameAgain(String firstNameAgain) {
		this.getFirstNameAgain().clear();
		this.getFirstNameAgain().sendKeys(firstNameAgain);
	}

	public void inputLastNameAgain(String lastNameAgain) {
		this.getLastNameAgain().clear();
		this.getLastNameAgain().sendKeys(lastNameAgain);
	}

	public void addressInput(String address) {
		this.getAddress().clear();
		this.getAddress().sendKeys(address);
	}

	public void cityInput(String city) {
		this.getCity().clear();
		this.getCity().sendKeys(city);
	}

	public void addMobilePhone(String phoneNumber) {
		this.getMobilePhoneNumber().clear();
		this.getMobilePhoneNumber().sendKeys(phoneNumber);
	}

	public void assignAnAddress(String assignAddress) {
		this.getAssignAnAddress().clear();
		this.getAssignAnAddress().sendKeys(assignAddress);
	}

	public void registerButtonClick() {
		this.getRegisterButton().click();
	}

	public void postalCode(String postalCode) {
		this.getPostalCode().clear();
		this.getPostalCode().sendKeys(postalCode);
	}

	public void selectState(String index) {
		this.getStateDrop().selectByVisibleText(index);
	}

	public void selectCountry(String index) {
		this.getCountryDrop().selectByValue(index);
	}
	public String myAccountMessageText() {
		return this.getMyAccountMessage().getText();
	}
}
