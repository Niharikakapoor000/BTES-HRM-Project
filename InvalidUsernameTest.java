package RealProjectBTESHRM.RealProjectCode;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidUsernameTest extends LaunchedApplication {
  @Test
  public void invalidusername() {
	  driver.get("http://182.76.176.205/hrm/login.php");
		driver.findElement(By.cssSelector("input[name =txtUserName]")).sendKeys("Anku");
		driver.findElement(By.cssSelector("input[name =txtPassword]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name =Submit]")).click();
	  
  }
}
