package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class My_Addresses {

	WebDriver driver;
	WebElement addAddressButton;
	WebElement updateAddressButton;
	WebElement deleteAdressButton;
	WebElement address2ForUpdate;
	WebElement saveUpdateButton;
	WebElement myAddressesHeader;
	WebElement confirmDeletingAddress;
	WebElement messageAfterDeletingAddress;
	WebElement addAddress;
	org.openqa.selenium.support.ui.Select state;
	WebElement zipCode;
	org.openqa.selenium.support.ui.Select country;
	WebElement addHomePhone;
	WebElement assignAnAddress;
	
	public My_Addresses(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getAddAddressButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[2]/a"));
	}

	public WebElement getUpdateAddressButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]"));
	}

	public WebElement getDeleteAdressButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[2]"));
	}
	public WebElement getAddress2ForUpdate () { 
		return driver.findElement(By.id("address2"));
	}
	public WebElement getSaveUpdateButton() {
	return driver.findElement(By.id("submitAddress"));
	}
	
	public WebElement getMyAddressesHeader() {
		//return driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
		return driver.findElement(By.cssSelector(".page-heading"));
	}
	public WebElement getMessageAfterDeletingAddress() {
		//return driver.findElement(By.cssSelector(".p-indent"));
		return driver.findElement(By.cssSelector(".alert.alert-warning"));
	}
	public WebElement getAddAddress() {
		return driver.findElement(By.id("address1"));
	}

	public WebElement getAddCity() {
		return driver.findElement(By.id("city"));
	}

	public WebElement getAddState() {
		return driver.findElement(By.id("uniform-id_state"));
	}

	public WebElement getZipCode() {
		return driver.findElement(By.id("postcode"));
	}

	public WebElement getAddCountry() {
		return driver.findElement(By.id("uniform-id_country"));
	}

	public WebElement getAddHomePhone() {
		return driver.findElement(By.id("phone"));
	}

	public WebElement getAssignAnAddress() {
		return driver.findElement(By.id("alias"));
	}

	public void addAddressClick() {
		this.getAddAddressButton().click();
	}
	public void updateAddressClick() {
		this.getUpdateAddressButton().click();
	}
	public void newAddress(String address2) {
		this.getAddress2ForUpdate().clear();
		this.getAddress2ForUpdate().sendKeys(address2);
	}
	public void saveUpdateButtonClick() {
		this.getSaveUpdateButton().click();
	}
	public org.openqa.selenium.support.ui.Select getStateDrop() {
		state = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("id_state")));
		return state;
	}

	public org.openqa.selenium.support.ui.Select getCountryDrop() {
		country = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("id_country")));
		return country;
	}
	public String myAddressesHeader() {
		return this.getMyAddressesHeader().getText();
	}
	public void deleteAddressClick() {
		this.getDeleteAdressButton().click();
	}
	public void confirmDeletingAddress() {
		driver.switchTo().alert().accept();
		//driver.switchTo().activeElement().click();
	}
	public String messageAfterDeletingAddress() {
		return this.getMessageAfterDeletingAddress().getText();
	}
	public void addAdress(String address1) {
		this.getAddAddress().clear();
		this.getAddAddress().sendKeys(address1);
	}
	public void addCity(String city) {
		this.getAddCity().sendKeys(city);
	}
	
	public void addZipCode(String zipCode) {
		this.getZipCode().clear();
		this.getZipCode().sendKeys(zipCode);
	}
	public void addPhoneNumber(String phoneNumber) {
		this.getAddHomePhone().sendKeys(phoneNumber);
	}
	public void assignAnAddress(String assign) {
		this.getAssignAnAddress().sendKeys(assign);
	}
	public void selectState(String index) {
		this.getStateDrop().selectByVisibleText(index);
	}

	public void selectCountry(String index) {
		this.getCountryDrop().selectByValue(index);
	}
}
