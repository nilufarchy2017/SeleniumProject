package testNGParameteriseTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
		public void createAccount() {
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahm\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			//ChromeDriver driver = new ChromeDriver();
			
					
					WebDriverManager.chromedriver().setup();
					ChromeDriver driver = new ChromeDriver();
	
					/*driver.get("http://leaftaps.com/opentaps/control/login");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					driver.findElementById("username").sendKeys("DemoSalesManager");
					driver.findElementById("password").sendKeys("crmsfa");
					driver.findElementByClassName("decorativeSubmit").click();
					driver.findElementByLinkText("CRM/SFA").click();*/
					
					//Create account
					driver.findElementByLinkText("Create Account").click();
					driver.findElementById("accountName").sendKeys("CBC1");
					driver.findElementByName("officeSiteName").sendKeys("ABC.com");
					driver.findElementById("groupNameLocal").sendKeys("cvs");
					driver.findElementByName("description").sendKeys("Testing Software");
					WebElement intial = driver.findElementById("initialTeamPartyId");
					Select dd = new Select (intial);
					dd.selectByValue("DemoSalesTeam1");
					WebElement owner = driver.findElementByName("ownershipEnumId");

}
}