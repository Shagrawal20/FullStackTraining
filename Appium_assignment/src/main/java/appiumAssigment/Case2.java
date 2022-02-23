package appiumAssigment;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;


public class Case2 extends BaseSet{
	@Test
	public  void  case2() throws MalformedURLException, InterruptedException {
	Screen_Page page=new Screen_Page();
	TouchAction touch=new TouchAction(BaseSet.driver);
	touch.tap(tapOptions().withElement(element(page.viewlistElement.get(11)))).perform();
	Thread.sleep(2000);
	System.out.println("Done selecting viewer");
	TouchAction touch1=new TouchAction(driver);
	touch1.tap(tapOptions().withElement(element(page.controlslistElement.get(4)))).perform();
	System.out.println("Done selecting Controls");
	Thread.sleep(2000);
	TouchAction touch2=new TouchAction(driver);
	touch2.tap(tapOptions().withElement(element(page.holoorOldThemelistElement.get(5)))).perform();
	System.out.println("done Holo or Old Theme");
	Thread.sleep(2000);
	//Selecting the second checkbox
	if(page.checkbox2Click.isSelected())
	{
		System.out.println("Checkbox is selected");
	}
	else {
		page.checkbox2Click.click();
	}
	Thread.sleep(2000);
	//Radio Button
	page.radio2ButtonClick.click();
	Thread.sleep(2000);
	page.starButtonClick.click();
	Thread.sleep(2000);
	page.toggle1ButtonClick.click();
	Thread.sleep(2000);
	System.out.println("Test Case2 Successfully Completed");
	}
}
