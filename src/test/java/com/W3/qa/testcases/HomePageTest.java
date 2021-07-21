package com.W3.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.W3.qa.pages.Billing;
import com.W3.qa.pages.HomePage;
import com.W3.qa.pages.LoginPage;
import com.W3.qa.pages.MyLearning;
import com.W3.qa.pages.PaidCourse;
import com.W3.qa.pages.SettingPage;
import com.W3.qa.testbase.TestBase;
import com.W3.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	
	

	LoginPage loginpage;
	HomePage homepage;
	SettingPage setting;
	Billing billing;
	MyLearning mylearning;
	PaidCourse paidcourse;
	
	//TestUtil testutil;
	
	public HomePageTest()
	{
		super();
		
	}
	
	//Test Cases should be seprated there should not be dependancy.
	@BeforeMethod()
	public void setUp() {
		initialization();
		//testutil = new TestUtil();
		loginpage = new LoginPage();
		setting = new SettingPage();
		billing = new Billing();
		mylearning = new MyLearning();
		paidcourse = new PaidCourse();
	homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	
	
	@Test(priority=1)
	public void homePageTitle()
	{
		String title = homepage.verifyHomePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Log in - W3Schools" , "HomePage Title is not matched");
	}
	

	@Test(priority=2)
	public void profileNameTest()
	{
		//testutil.switchToFrame();
		Assert.assertTrue(homepage.validateProfileName());
		
	}
	
	
	@Test(priority=3)
	public void logoutbuttontest()
	{
		Assert.assertTrue(homepage.verifyLogOutButton());
		
		
	}
	
	@Test(priority = 4)
	public void clickonSettingPageTest()
	{
		setting = homepage.clickOnSettings();
		
	}
	
	@Test(priority = 5)
	public void clickonBillingTest()
	{
		
		billing = homepage.clickOnbilling();
	}
	
	
	@Test(priority = 6)
	public void clickonMyLeaningTest()
	{
		
		mylearning = homepage.clickOnMyLearning();
	}
	@Test(priority = 7)
	public void clickonPaidCourseTest()
	{
		
		paidcourse = homepage.clickOnPaidCourses();
	}
	
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}

}
