import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		List<WebElement> abc=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(abc.size());
		abc.get(1).click();
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_txt_Fromdate']")).click();

		 System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		 
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_IndArm']")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		if (driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_txt_Todate']")).isDisplayed())
		{
			System.out.println("Round Trip Calender Displayed");
		}
		else
		{
			System.out.println("One Way is selected");
			abc.get(0).click();
			System.out.println("Round Trip is selected");
			System.out.println((driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_txt_Todate']")).isDisplayed()));
						
		}
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td[2]/label")).getText());
	
	}

	}

