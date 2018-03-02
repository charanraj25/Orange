package Orange;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Autoit2Test {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://my.naukri.com/account/createaccount?othersrcp=16201&err=1");
	  driver.findElement(By.xpath("//button[@class='action-btn fresh']")).click();
	  driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("raja");
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chillaraja00@gmail.com");
	  driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("chillaraja00");
	  driver.findElement(By.xpath("//input[@name='number']")).sendKeys("9502752890");
	 /* WebElement drop=driver.findElement(By.xpath("(//input[@id=''])[1]"));
	  Select drop1=new Select(drop);
	  drop1.selectByValue("2");*/
	  driver.findElement(By.xpath("(//input[@id=''])[1]")).click();
	  driver.findElement(By.xpath("//span[text()='Anantapur']")).click();
	  driver.findElement(By.xpath("//span[@class='uploadCV']")).click();
	  Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\raj2.exe");
	  driver.findElement(By.xpath("//button[text()='Register Now']")).click();
	  
  }
}
