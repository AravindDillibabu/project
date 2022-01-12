package project.mini_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.mini_project.login;

public class logintest {
	
	@Test
	public void logintest1() 
	{
		
	System.setProperty("webdriver.chrome.driver",
	 "C:\\Users\\wwwaj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver= new ChromeDriver();
	 login loginpage = new login();
	 driver.manage().window().maximize();
	 driver.get("https://dearpet.in/");
	 loginpage.login1();
	 String actualURL= driver.getCurrentUrl();
	 String expectedURL= "https://dearpet.in/account";
	 Assert.assertEquals(actualURL, expectedURL);
	 
	 
	}
	}


