package Orange;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class autoit1Test {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://kalyanavaibhavam.com/");
		 driver.findElement(By.xpath(".//*[@id='navbarResponsive']/ul/li[4]/ul/li/a")).click();
		 driver.findElement(By.xpath(".//*[@id='exampleInputEmail2']")).sendKeys("koplu10@gmail.com");
		 driver.findElement(By.xpath(".//*[@id='exampleInputPassword2']")).sendKeys("123456");
		 driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		 
		 driver.findElement(By.xpath("//button[text()='  Upload Image']")).click();
		 driver.findElement(By.xpath("//input[@type='file']")).click();
		 Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\raj1.exe");
		 
		 driver.findElement(By.xpath(".//*[@id='exampleModal']/div/div/div[2]/form/div/div/button[2]")).submit();
  }
}
