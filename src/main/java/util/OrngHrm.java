package util;

	import java.io.IOException;
import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class OrngHrm extends TakeImages  {
		public static ChromeDriver driver;
		public static Iterator<String> i,k,m;
		public static Set<String> all;
	    public static String parent,child,child1,child2;
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Manual\\Automation\\seleniumSoftwares\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			TakeImages pics=new TakeImages();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			pics.snap(driver);
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			String parent=driver.getWindowHandle();
			System.out.println(parent);
			
			driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("(//a[@target='_blank'])[3]")).click();
			pics.snap(driver);

		
			 all = driver.getWindowHandles();
	    	  Iterator<String> i=all.iterator();
	      	while(i.hasNext())
	    	{
	    		String child=i.next();
	   
	    		if(!child.equals(parent));
	    		{
	    		driver.switchTo().window(child);
	    		}
	    		System.out.println(driver.getTitle());
	    		System.out.println(driver.getCurrentUrl());
	    	}
	            driver.switchTo().window(parent);
	    
	    
	       driver.findElement(By.xpath("//a[@target='_blank'][3]")).click();
	       pics.snap(driver);
	         all = driver.getWindowHandles();
		     Iterator<String> k=all.iterator();
		     while(k.hasNext())
		       {
			String child1=k.next();
	        if(!child1.equals(parent));
			   {
			driver.switchTo().window(child1);
			   }
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		  }
		
		// driver.findElement(By.xpath("//a[@target='_blank'][4]")).click();
		// all = driver.getWindowHandles();
		//  Iterator<String> m=all.iterator();
		//  while(m.hasNext())
		//  {
		//	String child2=m.next();

		//	if(!child2.equals(parent));
		//	{
		//	driver.switchTo().window(child2);
		//	}
		//	System.out.println(driver.getTitle());
		//	System.out.println(driver.getCurrentUrl());
		//}

		
		  driver.switchTo().window(parent);
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		
	}



