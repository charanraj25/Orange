package Orange;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.testng.annotations.AfterTest;

public class LoginTest {
	
	
	 WebDriver driver;
  @Test(priority=0)
  public void f() {
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://opensource.demo.orangehrmlive.com/");
	 driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin");
	 driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	
	 
  }
 

}
