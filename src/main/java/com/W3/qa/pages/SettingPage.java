package com.W3.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.W3.qa.testbase.TestBase;

public class SettingPage extends TestBase  {
	
	
	@FindBy(name= "first_name")
	WebElement firstname;
	
	@FindBy(name = "last_name")
	WebElement last_name;
	
	@FindBy (xpath ="//span[contains(text(),'Update profile')]")
	WebElement updateProfile;

	
public SettingPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean verifyFirstName()
	{
		return firstname.isDisplayed();
		
	}

	
	
	public void updateProfile(String fname , String lname)
	{
		firstname.clear();
		
		firstname.sendKeys(fname);
		
		last_name.clear();
		
		last_name.sendKeys(lname);
		updateProfile.click();
		WebElement element = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Profile updated successfully')]")));
		
		
	}
	
}
