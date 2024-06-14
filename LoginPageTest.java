package RealProjectBTESHRM.RealProjectCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class LoginPageTest extends LaunchedApplication {
  @Test
  public void LoginPage() {
	  driver.get("http://182.76.176.205/hrm/login.php");
		driver.findElement(By.cssSelector("input[name =txtUserName]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name =txtPassword]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name =Submit]")).click();
  driver.quit();
  }

}



