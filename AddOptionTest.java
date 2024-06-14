package RealProjectBTESHRM.RealProjectCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddOptionTest extends LaunchedApplication {

    @Test
    public void loginTest() {
    // Enter credentials and login
    	driver.findElement(By.cssSelector("input[name =txtUserName]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name =txtPassword]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name =Submit]")).click();
    }
    @Test(priority = 2)
    public void hover_toadmin() {
        // Navigate to Qualification Education
    	Actions ac = new Actions(driver);
    	WebElement Admin_Element = driver.findElement(By.cssSelector("li[id =admin]"));
        ac.moveToElement(Admin_Element).build().perform();
    }
		

     @Test(priority = 3)
     public void qualification_1() {
     Actions ac =new Actions(driver);
  WebElement Qualification = driver.findElement(By.xpath("//*[@class=\"l2_link parent qualifications\"]/*[text() = \"Qualification\"]"));
    	 ac.moveToElement(Qualification).build().perform();   
     }
     @Test(priority = 4)
     public void education() {
    	 Actions ac = new Actions(driver);
    	 WebElement Education = driver.findElement(By.xpath("//*[@id='admin']/ul/li[3]/ul/li/a"));
    	 ac.moveToElement(Education).build().perform();  
         // Perform actions on the found element, such as clicking it or getting its text
         System.out.println("Link text: " + Education.getText());
         Education.click();
         
     }
     
    	 
       @Test(priority = 5)
       public void frame_1() {
    	   WebElement iframe = driver.findElement(By.cssSelector("#rightMenu"));
    	// Switch to the iframe
    	driver.switchTo().frame(iframe);
		
		}
    	   
       
@Test(priority = 6)
public void AddOption() {
	 WebElement addButtonCss =  driver.findElement(By.cssSelector("input[value='Add']"));
     addButtonCss.click();
     driver.findElement (By.id("txtUni")).sendKeys("MVN University");
     	driver.findElement(By.name("txtDeg")).sendKeys("BETCH IT");
		driver.findElement(By.cssSelector("input[value='Save']")).click();
	}

	
}





	
	

