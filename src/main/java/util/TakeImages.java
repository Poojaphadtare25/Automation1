package util;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeImages {
	public static int i=0;
	public void snap(WebDriver driver) throws IOException
	{
		Random r=new Random();
		if(r.nextInt()!=0)
		{
			i=i+1;
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		File dest=new File(".//pics//img"+i+".png"); 
		FileUtils.copyFile(src,dest);
		}
		
	}
	

}
