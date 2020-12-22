package util;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Manual\\Automation\\seleniumSoftwares\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        WebElement Tab = driver.findElement(By.xpath("//h2[text()='HTML Table']/following::table"));
		List<WebElement> rows=Tab.findElements(By.tagName("tr"));
		//3. Iterate each and every row and we will get columns value.
		for(int i=1;i<rows.size();i++)
		{
		
		List<WebElement> columns=rows.get(1).findElements(By.tagName("td"));
		for (WebElement colum:columns)//int j=0;j<columns.size();j++
		{
		//WebElement name=columns.get(1);
			String name=colum.getText();
		if(name.equals("Germany"))
		{
		String comp = columns.get(0).getText();
		String cont=columns.get(1).getText();
		System.out.println(comp);
		System.out.println(cont);
			//.getStringvalue());
		}
		}
		//rows.get;
	}

	}
}
