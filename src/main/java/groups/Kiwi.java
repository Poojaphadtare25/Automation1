package groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Kiwi {
	@Test(groups= {"sanity"})
	public void ap()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		WebElement drop = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		Select s=new Select(drop);
		  // s.selectByIndex(2);
		  // s.selectByValue("Manual");
		 s.selectByVisibleText("Manual Testing");
	}

}
