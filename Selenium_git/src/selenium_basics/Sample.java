package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	 @Test
	 public void nop_Commers_login () throws InterruptedException
	 {

		 WebDriverManager.chromedriver().setup();

         WebDriver driver =new ChromeDriver();
         driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

         WebElement Username= driver.findElement(By.xpath("//input[@name='Email']"));          // X-path by name
         Username.clear();
         Username.sendKeys("admin@yourstore.com");

         WebElement Password = driver.findElement(By.xpath("//input[@class='password']"));     // X-path by class
         Password.clear();
         Password.sendKeys("admin");

         WebElement Login_button = driver.findElement(By.xpath("//button[text()='Log in']"));  // X-path by text()
         Login_button.click();
         Thread.sleep(2000);
         System.out.println(driver.getTitle());

         String Expected_Title= "Dashboard / nopCommerce administration";
         String Actual_title = driver.getTitle();

         Assert.assertEquals(Actual_title, Expected_Title);


         Thread.sleep(2000);
      // driver.findElement(By.xpath("(//i[contains(@class,'right fas fa-angle-left ')])[4]")).click();

         driver.findElement(By.xpath("(//a[@class='nav-link']/p/i)[4]")).click();
         Thread.sleep(2000);
      // driver.findElement(By.xpath("//p[text()=' Customers']")).click();
         driver.findElement(By.xpath("(//ul[@class='nav nav-treeview']/li/a/p)[16]")).click();
         driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

         System.out.println(driver.getTitle());
         Assert.assertTrue(true, "Add a new customer / nopCommerce administration");


         driver.findElement(By.cssSelector("a.nav-link")).click();
       //  driver.findElement(By.xpath("//a[text()='Logout']")).click();
         Thread.sleep(2000);
        //  driver.quit();





	 }


}
