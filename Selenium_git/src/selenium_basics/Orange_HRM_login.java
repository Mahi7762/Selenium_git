package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class Orange_HRM_login {

	@Test
	public void HRM_login() throws InterruptedException{

	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");

    WebElement Username = driver.findElement(By.cssSelector("input#txtUsername"));
	Username.clear();
	Username.sendKeys("Admin");

	WebElement Password = driver.findElement(By.cssSelector("input#txtPassword"));
	Password.clear();
	Password.sendKeys("admin123");

	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Logout']"));
	Thread.sleep(2000);
	driver.close();

}
}
