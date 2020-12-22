package util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");
			driver.manage().window().maximize();
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='country']")));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@id='country']"))));
			WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
			Select s=new Select(country);
			
			//s.selectByIndex(8);
			//s.selectByValue("AO");
			s.selectByVisibleText("Angola");
			System.out.println(s.isMultiple());
			List<WebElement> allCountry = s.getOptions();
			System.out.println(allCountry.size());
			for(WebElement each:allCountry)
			{
				System.out.println(each.getText());
			}
			
			}

	}


