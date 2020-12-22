package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolsQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demoqa.com/droppable/");
		 Actions a=new Actions(driver);
		 WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
         WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
         a.dragAndDrop(src, dest).build().perform();
		
         Actions b=new Actions(driver);
         driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']")).click();
         WebElement abc = driver.findElement(By.xpath("//div[@id='acceptable']"));
         WebElement xyz = driver.findElement(By.xpath("//div[@id='droppable']"));
         b.dragAndDrop(abc,xyz).build().perform();
	
	}

}
