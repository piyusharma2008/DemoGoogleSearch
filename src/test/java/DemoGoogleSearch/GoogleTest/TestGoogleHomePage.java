package DemoGoogleSearch.GoogleTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import DemoGoogleSearch.GooglePages.GoogleHomePage;;

public class TestGoogleHomePage {

	public static void main(String args[])  {
		
		String Base = "https://www.google.com";
		String DriverPath = "D:\\Users\\diness\\Desktop\\Piyush Sharma\\geckodriver.exe"; 
		
		System.setProperty("webdriver.gecko.driver" ,DriverPath);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Base);
	     
			GoogleHomePage GMP = new GoogleHomePage(driver);
	    	GMP.EnterText("Test Automation");
			GMP.LinksData();	
	    
	    
		
	}
	
}
