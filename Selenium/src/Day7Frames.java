import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		System.out.println(driver.getPageSource());
		driver.manage().window().maximize();
		System.out.println(driver.getPageSource());
		driver.switchTo().frame(0);
		//driver.findElement(By.cssSelector("input[class='input_password')")).sendKeys("123456");
		driver.findElement(By.cssSelector(".input_password")).sendKeys("49232478");
		driver.switchTo().defaultContent();

	}

}
