package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdminTest extends NewTest{
  @Test(priority=1)
  public void f1() {
	  driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
	  driver.findElement(By.xpath("//*[@id='btnAdd']")).click();
	  driver.findElement(By.xpath("//*[@id='systemUser_employeeName_empName']")).sendKeys("John Smith");
	  driver.findElement(By.xpath("//*[@id='systemUser_userName']")).sendKeys("rajkumar");
	  
	  WebElement raj=driver.findElement(By.xpath("//*[@id='systemUser_userType']"));
	  Select sel=new Select(raj);
	  sel.selectByValue("2");
	  driver.findElement(By.xpath("//*[@id='systemUser_password']")).sendKeys("wexos123");
	  driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']")).sendKeys("wexos123");
	  driver.findElement(By.xpath("//*[@id='btnSave']")).click();
	  
	  
	  
  }
}
