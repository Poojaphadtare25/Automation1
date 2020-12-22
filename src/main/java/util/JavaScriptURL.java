package util;

  import org.openqa.selenium.JavascriptExecutor;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;

    public class JavaScriptURL {

    public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String url = js.executeScript("return document.URL").toString();
        System.out.println(url);
        
        String title = js.executeScript("return document.title").toString();
        System.out.println(title);
        
        js.executeScript("history.go(0)");
        
        js.executeScript("document.getElementById('fname').value='ramarao';");
        
        js.executeScript("document.getElementById('idOfButton').click();");
        
        js.executeScript("document.getElementById('male').checked=true;");
     
    
    }
    


}
