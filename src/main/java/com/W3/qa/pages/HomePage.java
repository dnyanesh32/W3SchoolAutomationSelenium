package com.W3.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.W3.qa.testbase.TestBase;

public class HomePage extends TestBase  {
	
	
	
	
	@FindBy (xpath ="//button[contains(text(),'Log out')]")
	WebElement logout;
	
	@FindBy (xpath = "//a[contains(text(),'Paid courses')]")
	WebElement paidcourse;
	
	@FindBy (xpath = "//a[contains(text(),'Settings')]")
	WebElement setting;
	
	
	@FindBy (xpath = "//a[contains(text(),'Billing')]")
	WebElement billing;
	
	@FindBy (xpath = "//a[contains(text(),'My learning')]")
	WebElement mylearning;
	
	@FindBy (id= "profile-name")
	WebElement profilename;
	
	
	public HomePage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean verifyLogOutButton()
	{
		
			
			boolean flag = logout.isDisplayed();
			
			return flag;
		
	}
	public PaidCourse clickOnPaidCourses()
	{
		paidcourse.click();
		
		return new PaidCourse();
		
	}
	
	public SettingPage clickOnSettings()
	{
		setting.click();
		
		return new SettingPage();
		
	}
	public Billing clickOnbilling()
	{
		billing.click();
		return new Billing();
		
	}
	public MyLearning clickOnMyLearning()
	{
		mylearning.click();
		return new MyLearning();
		
	}
	public boolean validateProfileName()
	{
		return profilename.isDisplayed();
	}
	

}
