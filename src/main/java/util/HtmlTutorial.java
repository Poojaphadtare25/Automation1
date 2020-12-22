package util;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Manual\\Automation\\seleniumSoftwares\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/html/default.asp");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.xpath("//a[@title='Facebook']")).click();
		Set<String> all = driver.getWindowHandles();
		Iterator<String> i = all.iterator();
		while(i.hasNext())
		{
			String child=i.next();
			if(!child.equals(parent))
			{
				driver.switchTo().window(child);
			}
			System.out.println(driver.getTitle());
    		System.out.println(driver.getCurrentUrl());
		}
		driver.switchTo().window(parent);
	}

}
