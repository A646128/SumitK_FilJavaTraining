import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		/*driver.get("https://www.goindigo.in/");
		//driver.findElement(By.xpath(".//*[@id='bookingflightTab']/div[2]/div[1]/ul[1]/li[2]/a")).click();
		WebElement address=driver.findElement(By.xpath("html/body/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/span[1]/label/select"));
		Select abc= new Select(address);
		abc.selectByVisibleText("Goa");*/
		driver.get("http://www.spicejet.com/");
		//driver.findElement(By.xpath(".//*[@id='buttons']/ul/li[1]/a/span[2]")).click();
		//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td[2]/label")).click();
		WebElement ab=driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']"));
		Select sb=new Select(ab);
		sb.selectByVisibleText("2 Adults");
		
		
	}

}