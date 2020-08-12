//import org.openqa.selenium.Alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupsAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.xpath(".//*[@id='bookingflightTab']/div[2]/div[1]/ul[1]/li[2]/a")).click();
		Thread.sleep(5000L);
		//driver.findElement(By.xpath(".//*[@id='globalModal']/div/div/div[3]/button")).click();
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}

}
