package groups;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ircts {
	@Test
	public void ak()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctctourism.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		//driver.findElement(By.xpath("//a[@class='m-1 d-inline-block text-center ']")).click();
	}

  }
