package util;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
	@Test()
	public void ram() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		 ChromeDriver  driver=new ChromeDriver();
		 driver.get("https://www.testandquiz.com/selenium/testing.html");
			
		 //driver.findElement(By.linkText("This is a link")).click();
		 //driver.findElement(By.xpath("//a[text()='This is a link']")).click();
		 System.out.println(driver.getCurrentUrl());
		 
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Pooja");
		 
		 driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
		 
	}

}
