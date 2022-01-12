package project.mini_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import project.mini_project.order;

@Test
public class ordertest {
	
	public void ordertest1() 
	{
		
	System.setProperty("webdriver.chrome.driver",
	 "C:\\Users\\wwwaj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver= new ChromeDriver();
	 order buy = new order();
	 driver.manage().window().maximize();
	 driver.get("https://dearpet.in/account");
	 buy.orderlist1();
	 String actualURL= driver.getCurrentUrl();
	 String expectedURL= "https://dearpet.in/53124759744/checkouts/068f1a3f9bdbe36a89f4540307efd5e6?_ga=2.148887863.1297572417.1641895428-893407628.1641895427";
	 Assert.assertEquals(actualURL, expectedURL);
	 
	}

}
