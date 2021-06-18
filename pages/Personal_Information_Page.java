package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Personal_Information_Page {
	WebDriver driver;
	WebElement myPersonalInformationButton;
	WebElement title;
	WebElement first_Name;
	WebElement last_Name;
	WebElement email_Address;
	WebElement current_Password;
	WebElement new_Password;
	WebElement confirmation_field;
	WebElement saveButton;
	WebElement messageAfterEditInfo;
	
	public Personal_Information_Page(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getMyPersonalInformationButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]"));
	}
	public WebElement getTitle() {
		return driver.findElement(By.id("id_gender2"));
	}
	public WebElement getFirst_Name() {
		return driver.findElement(By.id("firstname"));
	}
	public WebElement getLast_Name() {
		return driver.findElement(By.id("lastname"));
	}
	public WebElement getEmail_Address() {
		return driver.findElement(By.id("email"));
	}
	public WebElement getCurrent_Password() {
		return driver.findElement(By.id("old_passwd"));
	}
	public WebElement getNew_Password() {
		return driver.findElement(By.id("passwd"));
	}
	public WebElement getConfirmation_field() {
		return driver.findElement(By.id("confirmation"));
	}
	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[11]/button"));
	}
	
	public WebElement getMessageAfterEditInfo() {
		return driver.findElement(By.cssSelector(".alert.alert-success"));
	}
	public void myPersonalInformationButtonClick()  {
		this.getMyPersonalInformationButton().click();
	}
	public void titleCheck()  {
		this.getTitle().click();
	}
	public void firstNameInput(String firstName)  {
		this.getFirst_Name().clear();
		this.getFirst_Name().sendKeys(firstName);
	}
	public void lastNameInput(String lastName)  {
		this.getLast_Name().clear();
		this.getLast_Name().sendKeys(lastName);
	}
	public void emailInput(String email)  {
		this.getEmail_Address().clear();
		this.getEmail_Address().sendKeys(email);
	}
	public void currentPassInput(String currentPass)  {
		this.getCurrent_Password().clear();
		this.getCurrent_Password().sendKeys(currentPass);
	}
	public void newPassInput(String newPass)  {
		this.getNew_Password().clear();
		this.getNew_Password().sendKeys(newPass);
	}
	public void confirmationInput(String confirmation)  {
		this.getConfirmation_field().clear();
		this.getConfirmation_field().sendKeys(confirmation);
	}
	public void saveButtonClick() {
		this.getSaveButton().click();
	}
	public String afterEditMessage() {
		return this.getMessageAfterEditInfo().getText();
	}

}
