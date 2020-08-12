import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		// Count of All Links of the Page 
		System.out.println("Total Links in Page is :");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Count of Footer Links 
		WebElement footer = driver.findElement(By.xpath(".//*[@id='hlGlobalFooter']"));
		System.out.println("Total Links in Footer Section is:");
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement col= driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("Links present in 2nd column of footer Section is");
		System.out.println(col.findElements(By.tagName("a")).size());
		String BeforeClicking = null;
		String AfterClicking = null;
		for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
		{
			System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				System.out.println(driver.getTitle());
				BeforeClicking=driver.getTitle();
				col.findElements(By.tagName("a")).get(i).click();
				break;
			} 
		}
		System.out.println(driver.getTitle());
		AfterClicking=driver.getTitle();
		if(BeforeClicking!=AfterClicking)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
