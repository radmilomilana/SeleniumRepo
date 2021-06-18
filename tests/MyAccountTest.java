package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {
	
	@BeforeMethod
	public void beforeEveryTest() {
		driver.navigate().to("http://automationpractice.com/");
		loginForm(excelReader.getStringData("TC3", 7, 2), excelReader.getStringData("TC3", 8, 2));
		
	}
	@Test
	public void myAccountTest() {
		myAccountPage.myAccountButtonClick();
		
		String actual = myAccountPage.homeButton();
		assertEquals(actual, excelReader.getStringData("TC7", 9, 2));
		
	}
	@AfterMethod
	public void everytimeAfterTestIsDone() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
