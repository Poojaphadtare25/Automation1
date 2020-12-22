package type;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rabbit {
	 @Test
	public void kr()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	 }

}
