import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9tablerowcolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.news18.com/");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("group_1"));
		List<WebElement> noofrows=table.findElements(By.tagName("tr"));
		System.out.println("No of rows is " + noofrows.size());
		int i=0;
		for(WebElement eachrow:noofrows)
		{
			List<WebElement> noofcolumns=eachrow.findElements(By.tagName("td"));
			i++;
			System.out.println("No of columns present in "+i+"th row is "+noofcolumns.size());
			for(WebElement text:noofcolumns)
			{
				System.out.println(text.getText());
			}
			
		}
		
	}

}
