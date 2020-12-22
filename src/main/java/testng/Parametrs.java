package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrs {
	@Test
	@Parameters({"username"})
	public void ind(String name1)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(name1);
		 
	    driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
		 
	    driver.findElement(By.xpath("//input[@id='male']")).click();
	}

}
