import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com/");
		/*driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kumar07sumit@yahoo.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("sky.1992");
		driver.findElement(By.xpath(".//*[@id='u_0_0']")).click();*/
		driver.findElement(By.id("email")).sendKeys("kumar07sumit@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("sky.1992");
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		

	}

}
