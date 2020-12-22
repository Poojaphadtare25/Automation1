package groups;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MangoTest {
	@Test(groups= {"sanity"})
	public void mh()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	 }
	}


