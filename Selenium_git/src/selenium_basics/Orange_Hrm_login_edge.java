package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Orange_Hrm_login_edge {


	 @Test
	  public void logininalidUsernamePassword() throws InterruptedException {

	    System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver1.exe");
       WebDriver driver =new EdgeDriver();

         driver.get("https://opensource-demo.orangehrmlive.com");
         driver.findElement(By.id("txtUsername")).click();                                        //locator id
	     driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");         // locator x-path
	     driver.findElement(By.name("txtPassword")).click();                                     // locator name
	     driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");   // locator CssSelector
	     driver.findElement(By.id("btnLogin")).click();


	     Thread.sleep(2000);
	     driver.quit();

	 }

}
