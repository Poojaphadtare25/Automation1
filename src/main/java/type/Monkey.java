package type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Monkey {
	@Test
	 public void mh()
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
        ChromeDriver driver=new  ChromeDriver();
        driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");
        
        System.out.println(driver.getTitle());
		
        System.out.println(driver.getCurrentUrl());
        
        WebElement text = driver.findElement(By.id("firstName"));
		text.sendKeys("Pooja");
		
		WebElement lnme = driver.findElement(By.id("lastName"));
		lnme.sendKeys("Phadtare");
		
	}

}
