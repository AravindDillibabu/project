package project.mini_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class order {
	
		WebDriver driver;
		WebElement or=driver.findElement(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div/div/div[2]/div/div/div/nav/ul/li[4]/a/span"));		
		WebElement ar=driver.findElement(By.xpath("//*[@id=\"swatch--6852176969920\"]/div[2]/button"));
		WebElement aa=driver.findElement(By.xpath("//*[@id=\"ajs\"]/div/div/div/div/div/div/div[1]/div/div[3]/a"));
		WebElement av=driver.findElement(By.xpath("//*[@id=\"continue_button\"]/span"));
		


		public void orderlist1()
		{
			or.click();
			ar.click();
			aa.click();
			av.click();
		}



		
	}

