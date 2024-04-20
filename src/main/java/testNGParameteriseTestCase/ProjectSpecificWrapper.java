package testNGParameteriseTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificWrapper {
	//Driver initialized
	public ChromeDriver driver;

	//public static void main(String[] args) {
		

	

@BeforeMethod
			public void createAccount() {
				
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				//ChromeDriver driver = new ChromeDriver();
				
						
						WebDriverManager.chromedriver().setup();
						ChromeDriver driver = new ChromeDriver();
		
						driver.get("http://leaftaps.com/opentaps/control/login");
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						driver.findElementById("username").sendKeys("DemoSalesManager");
						driver.findElementById("password").sendKeys("crmsfa");
						driver.findElementByClassName("decorativeSubmit").click();
						driver.findElementByLinkText("CRM/SFA").click();
						
}
						
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
						
						




	

