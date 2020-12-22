package util;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Manual\\Automation\\seleniumSoftwares\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
	
	//Alert al=driver.switchTo().alert();
	//al.accept();
	  
    //WebElement sh=driver.findElement(By.xpath("//a[text()='Yes please!']"));
	//sh.click();
	//al.accept();
	}

}
