package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test2 {
	@Test()
    public void abd() {
			System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
			driver.manage().window().maximize();
		
			//WebElement country = driver.findElement(By.xpath("//button[@id='printAll']"));
			//System.out.println(country.getText());
			WebElement day = driver.findElement(By.xpath("//select[@id='select-demo']"));
			Select s= new Select(day);
			s.selectByIndex(2);
		}
	}


