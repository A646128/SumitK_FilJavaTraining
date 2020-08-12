package com.guru99.Testcases;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.guru99.pages.LoginPage;

public class VerifyGuru99Login 
{
	@Test
	public void verifyValidlogin()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().window().setPosition(new Point(-2000,0));
		driver.get("http://demo.guru99.com/v4/index.php");
		LoginPage login = new LoginPage(driver);
		login.enterIntoLoginPage("mngr102922","jyqurUn");
	}
}
