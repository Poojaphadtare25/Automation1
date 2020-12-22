package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActnClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//WebElement obj = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		//WebElement obj1 = driver.findElement(By.xpath("//span[text()='Find a Gift']"));
		//Actions a=new Actions(driver);
		//a.moveToElement(obj).moveToElement(obj1).click().build().perform();

		
	
		WebElement obj = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		WebElement obj1 = driver.findElement(By.xpath("//span[text()='Your Orders']"));
	    Actions a=new Actions(driver);
	    a.moveToElement(obj).moveToElement(obj1).click().build().perform();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("poojaphadtare25@gmail.com");
	    driver.findElement(By.xpath("//input[@id='continue']")).click();
	    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Pooja@2505");
	    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
	    WebElement text = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       // text.sendKeys("iphone 11");
       // Actions b=new Actions(driver);
       // b.moveToElement(text).sendKeys("iphone 11").perform();
        text.click();
        text.sendKeys("iphone11");
	
	}

}
