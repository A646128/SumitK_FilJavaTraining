import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Day7MulWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		//driver.manage().window().setPosition(new Point(-2000, 0));
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[4]/div[1]/span")).click();
		Thread.sleep(2000L);
		Actions gold = new Actions(driver);
		gold.moveToElement(driver.findElement(By.cssSelector("a[href*='goldloan']"))).build().perform();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("a[href*='goldloan']")).sendKeys(Keys.ENTER);
		String ParentWindow = driver.getWindowHandle();
		for (String SubWindow:driver.getWindowHandles())
		{
			driver.switchTo().window(SubWindow);
		}
		System.out.println(driver.findElement(By.xpath(".//*[@id='form1']/div[3]/div[2]/p[1]")).getText());
		driver.switchTo().window(ParentWindow);
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[1]/input")).sendKeys("Sumit");
	
	}

}
