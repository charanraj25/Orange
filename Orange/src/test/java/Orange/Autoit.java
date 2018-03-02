package Orange;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autoit {
	WebDriver driver;
  @Test
  public void f2() throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vanamraj2011@gmail.com");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Raj@428428");
		 driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		 driver.findElement(By.xpath("//span[text()='Rajkumar']")).click();
		 driver.findElement(By.xpath(".//*[@id='js_46h']")).click();
		 Thread.sleep(5000);
		 Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\raj.exe");
		 
}
}
