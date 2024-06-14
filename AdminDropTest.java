package RealProjectBTESHRM.RealProjectCode;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AdminDropTest extends LaunchedApplication {
 
  @Test
  public void AdminDrop() {
	  driver.get("http://182.76.176.205/hrm/login.php");
		driver.findElement(By.cssSelector("input[name =txtUserName]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name =txtPassword]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name =Submit]")).click();

		Actions ac = new Actions(driver);
		WebElement Admin_Element = driver.findElement(By.cssSelector("li[id =admin]"));
		ac.moveToElement(Admin_Element).build().perform();
		List<WebElement>admin_list = driver.findElements(By.cssSelector("li[id =admin]"));

		Iterator<WebElement> itr = admin_list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
  }
}

          // Add your assertions or other actions her
