package com.guru99.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.guru99.pages.LoginPageNew;

import Helper.BrowserFactory;

public class VerifyGuru99LoginThruPageFactory 
{
	
	@Test
	public void VerifyLoginThuPageFactory()
	{
		WebDriver driver =BrowserFactory.startBrowser("Chrome","http://demo.guru99.com/v4/index.php");
		LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
		login_page.enterLoginPage1("mngr102922", "jyqurUn");
	}
}
