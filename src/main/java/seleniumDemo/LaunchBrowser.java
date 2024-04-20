package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {



		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
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
		Select dd1 = new Select (owner);
		dd1.selectByVisibleText("Sole Proprietorship");
		WebElement source = driver.findElementById("dataSourceId");
		Select dd2 = new Select (source);
		dd2.selectByIndex(1);
		WebElement mkc = driver.findElementById("marketingCampaignId");
		Select dd3 = new Select (mkc);
		dd3.selectByValue("CATRQ_AUTOMOBILE");
		//Alert
		driver.findElementByLinkText("Merge Accounts").click();
		driver.findElementByLinkText("Merge").click();
		String smj = driver.switchTo().alert().getText();
		System.out.println(smj);
		driver.switchTo().alert().accept();
		//driver.findElementByClassName("smallSubmit").click();
		
		//Get Title of the page
		//System.out.println(driver.getTitle());
		
		//Get current url of the page
		//System.out.println(driver.getCurrentUrl());

	}

}
