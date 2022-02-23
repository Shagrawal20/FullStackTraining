package appiumAssigment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseSet {
	public static AppiumDriver driver;
	@BeforeClass
 public void setup() throws InterruptedException, MalformedURLException
 {
		
	 System.out.println("Inside setup");
	 String sFile = "C:\\Users\\002KU9744\\Downloads\\ApiDemos-debug.apk";

		// To create an object of Desired Capabilities
		DesiredCapabilities capability = new DesiredCapabilities();
		// OS Name
		capability.setCapability("device", "Android");
		capability.setCapability(CapabilityType.BROWSER_NAME, "");
		// Mobile OS version. In My case its running on Android 4.2
		capability.setCapability(CapabilityType.VERSION, "11.0");
		capability.setCapability("app", sFile);
		// To Setup the device name
		capability.setCapability("deviceName", "Pixel 2 API 30 2");
		capability.setCapability("platformName", "Android");
		// set the package name of the app
		capability.setCapability("app-package", "io.appium.android.apis");
		// set the Launcher activity name of the app
		capability.setCapability("app-activity", ".ApiDemos");
		// driver object with new Url and Capabilities
	driver=new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		Thread.sleep(2000);
 }
 @AfterClass
 public void teardown() {
	 System.out.println("Inside teardown method");
	 driver.quit();
 }
 
}
