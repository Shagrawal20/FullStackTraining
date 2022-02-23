package appiumAssigment;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.List;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;


public class Case1 extends BaseSet{
	@Test
	public  void  case1() throws MalformedURLException, InterruptedException {
			Screen_Page page=new Screen_Page();
			TouchAction touch=new TouchAction(BaseSet.driver);
			touch.tap(tapOptions().withElement(element(page.viewlistElement.get(11)))).perform();
			System.out.println("Done selecting viewer");
			TouchAction touch1=new TouchAction(BaseSet.driver);
			touch1.tap(tapOptions().withElement(element(page.chronometerlistElement.get(3)))).perform();
			System.out.println("Done selecting Chronometer");
			page.startButtonClick.click();
			Thread.sleep(2000);
			String timer=page.getTimer.getText();
			System.out.println("Start Timer is "+timer);
			page.stopButtonClick.click();
			Thread.sleep(2000);
			page.resetButtonClick.click();
			String timer1=page.getTimer.getText();
			System.out.println("Reset Timer is "+timer1);
			Thread.sleep(2000);
			System.out.println("Test Case1 Successfully Completed");
	}
}
