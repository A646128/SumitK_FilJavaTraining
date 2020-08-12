import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9CookiesScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Set<Cookie> abc = driver.manage().getCookies();
		System.out.println(abc.size());
		driver.manage().deleteAllCookies();
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\screenshot.png"));
	}
	
/* OR
EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
 
File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
 
FileUtils.copyFile(srcFile, new File(imgPath)); */


}
