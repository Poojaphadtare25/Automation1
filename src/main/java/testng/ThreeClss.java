package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class ThreeClss {
	@Test
	public void ram() {
		 System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		 ChromeDriver  driver=new ChromeDriver();
		 
		 driver.get("https://www.testandquiz.com/selenium/testing.html");
			
		 System.out.println(driver.getCurrentUrl());
		 
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Pooja");
		 
		 driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
	}
}
	
		
	

				
				
				
				
				
				
				
				
	
	
		

