package appiumAssigment;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class Case5 extends BaseSet{

	@Test
	public  void  case5() throws MalformedURLException, InterruptedException {
		Screen_Page page=new Screen_Page();
		TouchAction touch=new TouchAction(BaseSet.driver);
		
		touch.tap(tapOptions().withElement(element((MobileElement)page.views))).perform();
		
		Boolean tabsIsVisible = false;
		while(tabsIsVisible == false) {
			for(MobileElement items : page.viewlistElement){
			
				if(items.getAttribute("text").equals("Tabs")) {
					touch.tap(tapOptions().withElement(element((MobileElement)page.tab))).perform();
					tabsIsVisible = true;
					break;
				}
			}			
			if(tabsIsVisible == false)
			{				
				Dimension windowSize = driver.manage().window().getSize();				
				touch.press(point(windowSize.width-50,windowSize.height-50)) .waitAction(waitOptions(Duration.ofSeconds(2)))
				  .moveTo(point(windowSize.width-50, windowSize.height-(windowSize.height-200)))
			      .release()
			      .perform();
			}
			else
			{
				break;
			}
		}
		touch.tap(tapOptions().withElement(element((MobileElement)page.contentByFactory))).perform();
		
		for(MobileElement tab : page.ExpandableNamelistElement)
		{
			if(tab.getAttribute("text").equals("TAB1"))
			{
				touch.tap(tapOptions().withElement(element(tab))).perform();
				List<MobileElement> texts=(List<MobileElement>)page.ExpandableNamelistElement;
				String toPrint = texts.get(texts.size()-1).getAttribute("text");
				System.out.println("Text for Tab1 is = " + toPrint);
			}
			if(tab.getAttribute("text").equals("TAB2"))
			{
				touch.tap(tapOptions().withElement(element(tab))).perform();
				List<MobileElement> texts=(List<MobileElement>)page.ExpandableNamelistElement;
				String toPrint = texts.get(texts.size()-1).getAttribute("text");
				System.out.println("Text for Tab2 is = " + toPrint);
			}
			if(tab.getAttribute("text").equals("TAB3"))
			{
				touch.tap(tapOptions().withElement(element(tab))).perform();
				List<MobileElement> texts=(List<MobileElement>)page.ExpandableNamelistElement;
				String toPrint = texts.get(texts.size()-1).getAttribute("text");
				System.out.println("Text for Tab3 is = " + toPrint);
				break;
			}
		}	
		System.out.println("Test Case5 Successfully Completed");
		driver.quit();
	}
}
