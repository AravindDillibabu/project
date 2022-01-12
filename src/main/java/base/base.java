package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base {
	WebDriver driver;
	
	@BeforeMethod
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\wwwaj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://dearpet.in/");
	}
	@AfterMethod
	public void tearDown() {
	 driver.close();
}
	}
