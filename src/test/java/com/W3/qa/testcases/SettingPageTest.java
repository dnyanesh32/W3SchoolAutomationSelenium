package com.W3.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.W3.qa.pages.Billing;
import com.W3.qa.pages.HomePage;
import com.W3.qa.pages.LoginPage;
import com.W3.qa.pages.MyLearning;
import com.W3.qa.pages.PaidCourse;
import com.W3.qa.pages.SettingPage;
import com.W3.qa.testbase.TestBase;
import com.W3.qa.util.TestUtil;

public class SettingPageTest extends TestBase {
	
	
	LoginPage loginpage;
	HomePage homepage;
	SettingPage setting;
	String sheetName = "Setting";
	//TestUtil testutil;
	
	public SettingPageTest()
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
	homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	setting = homepage.clickOnSettings();
	
	}

	
	@DataProvider()
	public Object[][]  getW3SettingTestdata()
	{
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=1, dataProvider="getW3SettingTestdata")
	public void updateProfileTest(String Firstname,String Lastname)
	{
		setting.updateProfile(Firstname, Lastname);
		
		
	}
	
	@Test(priority = 2)
	public void firstNameTest()
	{
		boolean fname  = setting.verifyFirstName();
		Assert.assertTrue(fname);
		
	}
	
	
	
	
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}

}
