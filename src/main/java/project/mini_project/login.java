package project.mini_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class login {
		WebDriver driver;
		By UserIcon =By.xpath("/html/body/div[1]/div/header/div[2]/div/div/div/div/div[3]/div[2]");
		By Email =By.xpath("//*[@id=\"dropdown-customer\"]/div[2]/div/form/div[1]/div[1]/input");
		By Password = By.xpath("//*[@id=\"dropdown-customer\"]/div[2]/div/form/div[1]/div[2]/input");
		By LOGIN= By.xpath("//*[@id=\"dropdown-customer\"]/div[2]/div/form/div[1]/div[3]/input");
		
		public void login1()
		{
			
			driver.findElement( UserIcon).click();
			 driver.findElement(Email).sendKeys("www.ajayachu.237@gmail.com");
			 driver.findElement(Password).sendKeys("ajayachu1328");
			 driver.findElement(LOGIN).click();
	}
	}
	 
	 



