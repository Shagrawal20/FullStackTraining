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

public class Case4 extends BaseSet{
	@Test
	public  void  case4() throws MalformedURLException, InterruptedException {
		Screen_Page page=new Screen_Page();
		TouchAction touch=new TouchAction(BaseSet.driver);
		touch.tap(tapOptions().withElement(element(page.viewlistElement.get(11)))).perform();
		Thread.sleep(2000);
		System.out.println("Done selecting viewer");
		TouchAction touch1=new TouchAction(BaseSet.driver);
		touch1.tap(tapOptions().withElement(element(page.ExpandablelistElement.get(8)))).perform();
		System.out.println("Done Expandable List");
		TouchAction touch2=new TouchAction(driver);
		touch2.tap(tapOptions().withElement(element(page.CustomAdapterlistElement.get(0)))).perform();
		System.out.println("done Custom Adapter");
		
		for(MobileElement eachElement: (List<MobileElement>)page.ExpandablelistElement) {
			System.out.println(eachElement.getAttribute("text"));
		}
		
		TouchAction touch3=new TouchAction(driver);
		//List<MobileElement> listElement3=(List<MobileElement>)driver.findElementsByClassName("android.widget.TextView");
		//page.ExpandableNamelistElement
		String peopleNamesXPATH = "//*[@text='People Names']";
		String dogNamesXPATH = "//*[@text='Dog Names']";
		String catNamesXPATH = "//*[@text='Cat Names']";
		String fishNamesXPATH = "//*[@text='Fish Names']";
		
		touch3.tap(tapOptions().withElement(element((MobileElement)page.PeopleNames))).perform();	
		
		for(MobileElement peopleNames : page.ExpandablelistElement) {
			if(peopleNames.getAttribute("text").equals("Arnold"))
				System.out.println("Arnold is verified");
			if(peopleNames.getAttribute("text").equals("Barry"))
				System.out.println("Barry is verified");
			if(peopleNames.getAttribute("text").equals("Chuck"))
				System.out.println("Chuck is verified");
			if(peopleNames.getAttribute("text").equals("David"))
				System.out.println("David is verified");
		}
		
		touch3.tap(tapOptions().withElement(element((MobileElement)page.PeopleNames))).perform();
		
		touch3.tap(tapOptions().withElement(element((MobileElement)page.dogNames))).perform();	
		
		
		for(MobileElement dogNames : page.ExpandablelistElement) {
			if(dogNames.getAttribute("text").equals("Ace"))
				System.out.println("Ace is verified");
			if(dogNames.getAttribute("text").equals("Bandit"))
				System.out.println("Bandit is verified");
			if(dogNames.getAttribute("text").equals("Cha-Cha"))
				System.out.println("Cha-Cha is verified");
			if(dogNames.getAttribute("text").equals("Deuce"))
				System.out.println("Deuce is verified");
		}
		
		touch3.tap(tapOptions().withElement(element((MobileElement)page.dogNames))).perform();		
		
		touch3.tap(tapOptions().withElement(element((MobileElement)page.catNames))).perform();	
		
		
		for(MobileElement catNames : page.ExpandablelistElement) {
			if(catNames.getAttribute("text").equals("Fluffy"))
				System.out.println("Fluffy is verified");
			if(catNames.getAttribute("text").equals("Snuggles"))
				System.out.println("Snuggles is verified");
		}
		
		touch3.tap(tapOptions().withElement(element((MobileElement)page.catNames))).perform();	
		
		
		touch3.tap(tapOptions().withElement(element((MobileElement)page.fishNames))).perform();	
		
		
		for(MobileElement fishNames : page.ExpandablelistElement) {
			if(fishNames.getAttribute("text").equals("Goldy"))
				System.out.println("Goldy is verified");
			if(fishNames.getAttribute("text").equals("Bubbles"))
				System.out.println("Bubbles is verified");
		}
		
		touch3.tap(tapOptions().withElement(element((MobileElement)page.fishNames))).perform();	
		
		System.out.println("Test Case4 Successfully Completed");
	
	}
		
}
