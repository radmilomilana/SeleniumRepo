package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WishList_Test extends BaseTest{
	
	@BeforeMethod
	public void everytimeBeforeTestStarts() {
		driver.navigate().to("http://automationpractice.com/index.php");
		loginForm(excelReader.getStringData("TC3", 7, 2), excelReader.getStringData("TC3", 8, 2));
		myAccountPage.myAccountButtonClick();
		myAccountPage.myWishlistButtonClick();
		
	}
	@Test (priority = 0)
	public void addWishListTest() {
		wishList.addNameForNewWishList(excelReader.getStringData("TC12", 8, 2));
		wishList.wishListSaveButtonClick();
		
		String actual = wishList.directList();
		assertEquals(actual, excelReader.getStringData("TC12", 12, 1));
		
	}
	@Test (priority = 5)
	public void addWishListMultipleTest() {
		wishList.addNameForNewWishList(excelReader.getStringData("TC13", 8, 2));
		wishList.wishListSaveButtonClick();
		wishList.addNameForNewWishList(excelReader.getStringData("TC13", 10, 2));
		wishList.wishListSaveButtonClick();
		
		String actual = wishList.directList();
		assertEquals(actual, excelReader.getStringData("TC13", 13, 2));
		
	}
	
	@Test (priority = 10)
	public void deleteWishListTest() throws InterruptedException {
		wishList.deleteWishListClick();
		Thread.sleep(3000);
		driver.switchTo().activeElement().click();
		
		String actual = wishList.HomeButtonText();
		assertEquals(actual, excelReader.getStringData("TC14", 14, 1));
		
	}
		
	
	@AfterMethod
	public void everytimeAfterTestIsDone() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

}
