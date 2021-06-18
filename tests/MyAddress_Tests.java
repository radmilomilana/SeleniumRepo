package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAddress_Tests extends BaseTest{
	
	@BeforeMethod
	public void beforeEveryTest() {
		driver.navigate().to("http://automationpractice.com/");
		loginForm(excelReader.getStringData("TC3", 7, 2), excelReader.getStringData("TC3", 8, 2));
		myAccountPage.myAccountButtonClick();
		myAccountPage.myAddressesButtonClick();
	}
	/*@Test(priority = 0)
	public void updateAddressTest(){
	
		myAddressPage.updateAddressClick();
		myAddressPage.newAddress(excelReader.getStringData("TC11", 9, 2));
		myAddressPage.saveUpdateButtonClick();
		
		String actual = myAddressPage.myAddressesHeader();
		assertEquals(actual, excelReader.getStringData("TC11", 13, 1));
		
	}
	@Test (priority = 5)
	public void addAddressTest() {
		
		myAddressPage.addAddressClick();
		myAddressPage.addAdress(excelReader.getStringData("TC10", 9, 2));
		myAddressPage.addCity(excelReader.getStringData("TC10", 10, 2));
		myAddressPage.selectState(excelReader.getStringData("TC10", 11, 2));
		myAddressPage.addZipCode(String.valueOf(excelReader.getIntData("TC10", 12, 2)));
		myAddressPage.selectCountry(String.valueOf(excelReader.getIntData("TC10", 13, 2)));
		myAddressPage.addPhoneNumber(String.valueOf(excelReader.getIntData("TC10", 14, 2)));
		myAddressPage.assignAnAddress(excelReader.getStringData("TC10", 15, 2));
		myAddressPage.saveUpdateButtonClick();
		
		String actual = myAddressPage.myAddressesHeader();
		assertEquals(actual, excelReader.getStringData("TC10", 19, 1));
		
	}*/

	@Test(priority = 10)
	public void deleteAddressTest() {

		myAddressPage.deleteAddressClick();
		myAddressPage.confirmDeletingAddress();

		String actual = myAddressPage.messageAfterDeletingAddress();
		assertEquals(actual, excelReader.getStringData("TC9", 12, 1));

	}

	@AfterMethod
	public void afterEveryTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}