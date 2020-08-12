package com.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {
	WebDriver driver;
	@FindBy(how=How.XPATH,using="html/body/form/table/tbody/tr[1]/td[2]/input")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.XPATH,using="html/body/form/table/tbody/tr[2]/td[2]/input")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using="html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	@CacheLookup
	WebElement login;
	
	public LoginPageNew(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterLoginPage1(String uid, String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		login.click();
		
	}
	
}
