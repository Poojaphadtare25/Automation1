package reports;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Re2
{
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	public static String path;
	public static int i=0;
	@BeforeSuite
	public void begin(){
		report= new ExtentReports("C:\\Users\\Avinash\\eclipse-workspace\\SeleniumAutomation\\HtmlReport\\Report2.html", true);
		report.addSystemInfo("Environment", "Qa3");
		report.addSystemInfo("author", "pooja");
		report.addSystemInfo("Userstory", "Us6002");
	test=report.startTest("To verify testandquiz functionality");
	}
@Test
public void script() throws IOException
{
	   System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       
      driver.get("https://www.testandquiz.com/selenium/testing.html");
      test.log(LogStatus.PASS,"IHG WebPage is Loading"+test.addScreenCapture(snap()));

      driver.manage().window().maximize();
      test.log(LogStatus.PASS,"IHG WebPage is maximizing"+test.addScreenCapture(snap()));
 
      
      WebElement drop = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
      Select s=new Select(drop);
      // s.selectByIndex(2);
     // s.selectByValue("Manual");
      s.selectByVisibleText("Manual Testing");
	
}
public String snap() throws IOException
{
	Random r= new Random();
	String dummy=null;
if(r.nextInt()!=0)
{
	i=i+1;
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String path=".//pics//img"+i+".png";
	File dest=new File(path);
	FileUtils.copyFile(src, dest);
	dummy=dest.getAbsolutePath();
}
return dummy;
}

@AfterSuite()
public void finalEnd()
{
	report.endTest(test);
	report.flush();
}
	}

