package util;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Medplusmrt1 extends TakeImages {
	public static ChromeDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Manual\\Automation\\seleniumSoftwares\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		TakeImages im=new TakeImages();
		driver.get("https://www.medplusmart.com/");
		im.snap(driver);
		
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		System.out.println(driver.getTitle());
		Set<String> all = driver.getWindowHandles();
		Iterator<String> i=all.iterator();
		while(i.hasNext())
		{
		String child= i.next();
		if(!child.equals(parent));
		{
		driver.switchTo().window(child);
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		im.snap(driver);
	}
		
		driver.findElement(By.xpath("//a[@target='_blank'][2]")).click();
		Set<String>   al= driver.getWindowHandles();
		     Iterator<String> k=al.iterator();
		     while(k.hasNext())
		       {
			String child1=k.next();
	        if(!child1.equals(parent));
			   {
			driver.switchTo().window(child1);
			   }
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.switchTo().window(parent);
				}
		    driver.findElement(By.xpath("//li[@id='miniCartDiv']")).click();
			im.snap(driver);
		  }
	}


