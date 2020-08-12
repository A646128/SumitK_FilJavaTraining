package com.guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By username=By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input");
	By password=By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input");
	By login=By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]");
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterIntoLoginPage(String uid, String pass)
	{
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
	}
}
