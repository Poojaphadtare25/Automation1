package util;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModifirKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
        WebElement txt = driver.findElement(By.xpath("//input[@id='fname']"));
        
        Actions a=new Actions(driver); 
        a.keyDown(txt,Keys.SHIFT).sendKeys("rama").keyUp( Keys.SHIFT).sendKeys("rao").build().perform(); 	
        a.contextClick(txt).perform();
        
        WebElement src = driver.findElement(By.xpath("//img[@id='sourceImage']"));
        WebElement dest = driver.findElement(By.xpath("//div[@id='targetDiv']"));
        a.dragAndDrop(src, dest).build().perform();
	}

	//	Actions a=new Actions(driver);
     //    a.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
	
	
	

}

