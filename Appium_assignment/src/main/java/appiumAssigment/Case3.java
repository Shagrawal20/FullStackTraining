package appiumAssigment;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;


public class Case3 extends BaseSet{
	@Test
	public  void  case3() throws MalformedURLException, InterruptedException {
		Screen_Page page=new Screen_Page();
		TouchAction touch=new TouchAction(BaseSet.driver);
		touch.tap(tapOptions().withElement(element(page.viewlistElement.get(11)))).perform();
		Thread.sleep(2000);
		System.out.println("Done selecting viewer");
		TouchAction touch1=new TouchAction(driver);
		touch1.tap(tapOptions().withElement(element(page.dateWidgetslistElement.get(6)))).perform();
		System.out.println("Done Date Widgets");
		Thread.sleep(2000);
		TouchAction touch2=new TouchAction(driver);
		touch2.tap(tapOptions().withElement(element(page.dialoglistElement.get(0)))).perform();
		System.out.println("Done Dialog");
		Thread.sleep(2000);
		page.datePickerClick.click();
		Thread.sleep(2000);
		DateFormat dateFormat = new SimpleDateFormat("dd");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		
		 System.out.println(date1);
		 int k=Integer.parseInt(date1);
		 int j=k+1;
		 String s=String.valueOf(j);
		 System.out.println("s is"+s);
		
		String xpath="//*[@text='" + s + "']"; 
		driver.findElement(By.xpath(xpath)).click();
		System.out.println("touched date " + s);
		Thread.sleep(5000);
		page.dateButtonClick.click();
		String dates=page.selectedDateTextClick.getText();
		System.out.println("Date is "+dates);
		Thread.sleep(2000);
		System.out.println("Test Case3 Successfully Completed");
		
	}
		
	
}
