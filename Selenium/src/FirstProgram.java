import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver (); //Runtime Polymorphism
		  driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		  System.out.println(driver.getCurrentUrl());
		  System.out.println(driver.getTitle());
	}
	 	  
}
