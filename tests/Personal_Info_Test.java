package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Personal_Info_Test extends BaseTest{
	

	@BeforeMethod
	public void everytimeBeforeTestStarts() {
		driver.navigate().to("http://automationpractice.com/index.php");
		loginForm(excelReader.getStringData("TC3", 7, 2), excelReader.getStringData("TC3", 8, 2));
		
	}

	@Test
	public void editPersonalInformationTest() {
		
		myAccountPage.myAccountButtonClick();
		myAccountPage.myPersonalInformationButtonClick();
		personal_InfoPage.titleCheck();
		personal_InfoPage.firstNameInput(excelReader.getStringData("TC8", 8, 2));
		personal_InfoPage.lastNameInput(excelReader.getStringData("TC8", 9, 2));
		personal_InfoPage.emailInput(excelReader.getStringData("TC8", 10, 2));
		personal_InfoPage.currentPassInput(excelReader.getStringData("TC8", 11, 2));
		personal_InfoPage.newPassInput(excelReader.getStringData("TC8", 12, 2));
		personal_InfoPage.confirmationInput(excelReader.getStringData("TC8", 13, 2));
		personal_InfoPage.saveButtonClick();
		
		String actual = personal_InfoPage.afterEditMessage();
		assertEquals(actual, excelReader.getStringData("TC8", 18, 1));
	}
	@AfterMethod
	public void afterEveryTest() {
		driver.manage().deleteAllCookies();
	}
	
}
