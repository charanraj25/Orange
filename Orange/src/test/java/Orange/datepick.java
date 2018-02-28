package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class datepick extends NewTest{
  @Test(priority=3)
  public void date_pick() throws InterruptedException
  {
	  driver.findElement(By.xpath("//b [text()='Recruitment']")).click();
	  driver.findElement(By.xpath(".//*[@id='frmSrchCandidates']/fieldset/ol/li[7]/img")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]")).click();
	  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]/option[3]")).click();
	  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")).click();
	  /*WebElement ele=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span"));
	  Select sel=new Select(ele);
	  sel.selectByValue("Mar");
	  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[6]/a")).click();*/
  }
}
