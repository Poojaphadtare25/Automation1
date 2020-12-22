package datadriven;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dtdriven {
	@Test(dataProvider="mango")
	public void rama(String name1,String name2)
	{

	System.setProperty("webdriver.chrome.driver","D:\\\\\\\\\\\\\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
			driver.findElement(By.id("firstName")).sendKeys(name1);
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(name2);



	}
	@DataProvider(name="mango")
	public static Object[][] krisha()
	{


	Object[][] data = null ;

			try {			
				XSSFWorkbook workbook = new XSSFWorkbook("D:\\\\excel\\\\morning.xlsx");
				XSSFSheet sheet = workbook.getSheetAt(0);	

				// get the number of rows
				int rowCount = sheet.getLastRowNum();
				// get the number of columns
				int columnCount = sheet.getRow(0).getLastCellNum();

				data = new String[rowCount][columnCount];

				// loop through the rows
				for(int i=1; i <rowCount+1; i++){
					try {
						XSSFRow row = sheet.getRow(i);
						for(int j=0; j <columnCount; j++){ // loop through the columns
							try {
								String cellValue = "";
								try{
									cellValue = row.getCell(j).getStringCellValue();
								}catch(NullPointerException e){

								}
								data[i-1][j]  = cellValue; // add to the data array
							} catch (Exception e) {
								e.printStackTrace();
							}				
						}

					} catch (Exception e) {
						e.printStackTrace();
					}
				}	
				workbook.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

			return data;


	}
	}

