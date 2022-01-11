package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calculator_operations {

	  WebDriver driver;
	
	
	 @BeforeTest
	  public void Setup() throws InterruptedException {

	    System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
       driver =new ChromeDriver();

		
		 driver.get("https://juliemr.github.io/protractor-demo/");
		 /*
		 * driver.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("2343"
		 * ); driver.findElement(By.cssSelector("input[ng-model='second']")).sendKeys(
		 * "1234"); driver.findElement(By.cssSelector("#gobutton")).click();
		 * 
		 * 
		 * Thread.sleep(2000);
		 */
	    // driver.quit();

	 }
	 
	 
	 @Test
	  public void Basic_operations1() throws InterruptedException {

	  
       
       driver.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("2343");
       driver.findElement(By.cssSelector("input[ng-model='second']")).sendKeys("1234");
       driver.findElement(By.cssSelector("#gobutton")).click();


	     Thread.sleep(2000);
	    // driver.quit();

	 }

	 @Test
	  public void Basic_operations2() throws InterruptedException {

	  
      
      driver.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("5467");
      driver.findElement(By.cssSelector("input[ng-model='second']")).sendKeys("1234");
      driver.findElement(By.cssSelector("#gobutton")).click();


	     Thread.sleep(2000);
	    // driver.quit();

	 }


}
