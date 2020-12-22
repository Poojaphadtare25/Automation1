package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://tus.io/demo.html");

driver.manage().window().maximize();
WebElement uplod = driver.findElement(By.xpath("//input[@id='js-file-input']"));
uplod.click();
uplod.sendKeys("C:\\Pooja_ss");
	}
	

}
