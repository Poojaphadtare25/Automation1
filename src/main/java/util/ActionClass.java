package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
        WebElement clk = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
        Actions a=new Actions(driver);
        a.doubleClick(clk).perform();
        WebElement click = driver.findElement(By.xpath("//button[text()='Generate Confirm Box']"));
        Actions b=new Actions(driver);
        b.doubleClick(click).perform();
        
	}

}
