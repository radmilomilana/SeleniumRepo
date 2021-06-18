package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Tests extends BaseTest{
	
	@BeforeMethod
	public void everytimeBeforeTestStarts() {
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	@Test (priority = 0)
	public void logInWithValidCredentials() {
		String email = excelReader.getStringData("TC3", 7, 2);
		String password = String.valueOf(excelReader.getStringData("TC3", 8, 2));
		loginForm(email, password);
		
		String actualAssertMessage = loginPage.welcomeMessage();
		assertEquals(actualAssertMessage, excelReader.getStringData("TC3", 11, 1));
		
		
	}
	@Test (priority = 2)
	public void loginInvalidEmailAddress() throws InterruptedException {
		String email = excelReader.getStringData("TC4", 7, 2);
		String password = excelReader.getStringData("TC4", 8, 2);
		loginForm(email, password);
		
		String actualMessage = loginPage.wrongDataMessage();
		assertEquals(actualMessage, excelReader.getStringData("TC4", 12, 2));
		
	}
	
	@Test (priority = 3)
	public void loginInvalidPassword() throws InterruptedException {
		String email = excelReader.getStringData("TC4", 7, 3);
		String password = excelReader.getStringData("TC4", 8, 3);
		loginForm(email, password);
		
		String actualMessage = loginPage.wrongDataMessage();
		assertEquals(actualMessage, excelReader.getStringData("TC4", 13, 3));
				
	}
	@Test (priority = 1)
	public void loginEmptyData() throws InterruptedException  {
		String email = excelReader.getStringData("TC5", 7, 2);
		String password = excelReader.getStringData("TC5", 8, 2);
		loginForm(email, password);
		
		
		String actualMessage= loginPage.emptyDataMessage();
		assertEquals(actualMessage, excelReader.getStringData("TC5", 12, 1));
	}
	
	@Test
	public void logOutTest() {
		logInWithValidCredentials();
		loginPage.signOutButtonClick();
		
		String actualMessage= loginPage.checkForSignOut();
		assertEquals(actualMessage, excelReader.getStringData("TC6", 13, 1));
		
	}

	@AfterMethod
	public void everytimeAfterTestIsDone() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	public void loginForm(String email, String password) {
		loginPage.signInButtonTopRightCornerClick();
		loginPage.emailInput(email);
		loginPage.passwordInput(password);
		
		loginPage.signInClick();
		
	}
	
}
