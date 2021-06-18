package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.Create_An_Account;
import pages.LoginPage;
import pages.MyAccount_Page;
import pages.My_Addresses;
import pages.Personal_Information_Page;
import pages.Wishlist_Page;

public class BaseTest {
	WebDriver driver;
	LoginPage loginPage;
	Excel_Reader excelReader;
	Personal_Information_Page personal_InfoPage;
	Create_An_Account createAccountPage;
	MyAccount_Page myAccountPage;
	My_Addresses myAddressPage;
	Wishlist_Page wishList;
	
	@BeforeClass
	public  void atBeginningBeforeAllTests() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
		excelReader = new Excel_Reader("data/TestPlan.xlsx");
		personal_InfoPage = new Personal_Information_Page(driver);
		createAccountPage = new Create_An_Account(driver);
		myAccountPage = new MyAccount_Page(driver);
		myAddressPage = new My_Addresses(driver);
		wishList = new Wishlist_Page(driver);
		
		
	}
	public void loginForm(String email, String password) {
		loginPage.signInButtonTopRightCornerClick();
		loginPage.emailInput(email);
		loginPage.passwordInput(password);
		
		loginPage.signInClick();
	}

	@AfterClass
	public void atTheEndOfAllTests() {
		driver.close();
	}
	

}
