package type;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tiger extends Rabbit {
	@Test(dependsOnMethods= {"kr"})
	public void ap()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        driver.switchTo().frame("frame1");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		
	}

}
