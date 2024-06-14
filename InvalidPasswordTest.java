package RealProjectBTESHRM.RealProjectCode;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidPasswordTest extends LaunchedApplication{
  @Test
  public void InvalidPassword() {
	  driver.get("http://182.76.176.205/hrm/login.php");
		driver.findElement(By.cssSelector("input[name =txtUserName]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name =txtPassword]")).sendKeys("Anku123");
		driver.findElement(By.cssSelector("input[name =Submit]")).click();
  
}
}
