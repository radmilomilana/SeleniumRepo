package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class CreateAnAccount_Tests extends BaseTest {

	@BeforeMethod
	public void everytimeBeforeTestStarts() {
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	
	@Test (priority = 0)
	public void createAnAccountValidEmailTest() throws InterruptedException {
		String email = excelReader.getStringData("TC1", 6, 2);
		createAnAccountForm(email);
		Thread.sleep(5000);
		String actualMessage = createAccountPage.afterCreatingAccountMessage();
		assertEquals(actualMessage, excelReader.getStringData("TC1", 10, 1));
		
	}
	@Test (priority = 1)
	public void createAnAccountInvalidEmailTest() throws InterruptedException {
		String email = excelReader.getStringData("TC1", 6, 3);
		createAnAccountForm(email);
		Thread.sleep(5000);
		String actualMessage = createAccountPage.wrongEmailAddressMessage();
		assertEquals(actualMessage, excelReader.getStringData("TC1", 10, 3));
		
	}
	@Test (priority = 2)
	public void createAnAccountWithPersonalInfoTest() throws InterruptedException {
		createAnAccountValidEmailTest();
		createAccountPage.titleCheck();
		createAccountPage.inputFirstNameinField(excelReader.getStringData("TC2", 9, 2));
		createAccountPage.inputLastNameinFielf(excelReader.getStringData("TC2", 10, 2));
		createAccountPage.passwordInput(excelReader.getStringData("TC2", 11, 2));
		createAccountPage.inputFirstnameAgain(excelReader.getStringData("TC2", 12, 2));
		createAccountPage.inputLastNameAgain(excelReader.getStringData("TC2", 13, 2));
		createAccountPage.addressInput(excelReader.getStringData("TC2", 14, 2));
		createAccountPage.cityInput(excelReader.getStringData("TC2", 15, 2));
		createAccountPage.selectState(String.valueOf(excelReader.getStringData("TC2", 16, 2)));
		createAccountPage.postalCode(String.valueOf(excelReader.getIntData("TC2", 17, 2)));
		createAccountPage.selectCountry(String.valueOf(excelReader.getIntData("TC2", 18, 2)));
		createAccountPage.addMobilePhone(String.valueOf(excelReader.getIntData("TC2", 19, 2)));
		createAccountPage.assignAnAddress(excelReader.getStringData("TC2", 20, 2));
		createAccountPage.registerButtonClick();
		
		String actual = createAccountPage.myAccountMessageText();
		assertEquals(actual, excelReader.getStringData("TC2", 23, 2));
		
	}
	
	public void createAnAccountForm(String email) {
		createAccountPage.signInButtonTopRightCornerClick();
		createAccountPage.emailInputField(email);
		createAccountPage.createAnAccountButtonClick();
		
		//WebDriverWait waitForUserToCreateAccount = new WebDriverWait(driver, 10);
		//WebElement afterCreatingAccount = waitForUserToCreateAccount.until(ExpectedConditions.visibilityOf(createAccountPage.getAfterCreatingAccountMessage()));
	}
	@AfterMethod
	public void afterEveryTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
