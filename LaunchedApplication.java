package RealProjectBTESHRM.RealProjectCode;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LaunchedApplication {
	static WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("http://182.76.176.205/hrm/login.php");
	}
	


	
	
	


	
@AfterSuite
	public void Closure()
{
	driver.quit();

	}
}

