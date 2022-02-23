package appiumAssigment;

import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Screen_Page extends BaseSet{
	
	@FindBy(id="android:id/text1")
	public List<MobileElement> viewlistElement;
	
	@FindBy(id="android:id/text1")
	public List<MobileElement> chronometerlistElement;
	
	@FindBy(id="io.appium.android.apis:id/start")
	public MobileElement startButtonClick;
	
	@FindBy(id="io.appium.android.apis:id/chronometer")
	public MobileElement getTimer;
	
	@FindBy(id="io.appium.android.apis:id/stop")
	public MobileElement stopButtonClick;
	
	@FindBy(id="io.appium.android.apis:id/reset")
	public MobileElement resetButtonClick;
	
	@FindBy(id="android:id/text1")
	public List<MobileElement> controlslistElement;
	
	@FindBy(id="android:id/text1")
	public List<MobileElement> holoorOldThemelistElement;
	
	@FindBy(id="io.appium.android.apis:id/check2")
	public MobileElement checkbox2Click;
	
	@FindBy(id="io.appium.android.apis:id/radio2")
	public MobileElement radio2ButtonClick;
	
	@FindBy(id="io.appium.android.apis:id/star")
	public MobileElement starButtonClick;
	
	@FindBy(id="io.appium.android.apis:id/toggle1")
	public MobileElement toggle1ButtonClick;
	
	@FindBy(id="android:id/text1")
	public List<MobileElement> dateWidgetslistElement;
	
	@FindBy(id="android:id/text1")
	public List<MobileElement> dialoglistElement;
	
	@FindBy(id="io.appium.android.apis:id/pickDate")
	public MobileElement datePickerClick;
	
	@FindBy(id="android:id/button1")
	public MobileElement dateButtonClick;
	
	@FindBy(id="io.appium.android.apis:id/dateDisplay")
	public MobileElement selectedDateTextClick;
	
	@FindBy(id="android:id/text1")
	public List<MobileElement> ExpandablelistElement;
	
	@FindBy(id="android:id/text1")
	public List<MobileElement> CustomAdapterlistElement;
	
	@FindBy(className="android.widget.TextView")
	public List<MobileElement> ExpandableNamelistElement;
	
	@FindBy(xpath="//*[@text='People Names']")
	public MobileElement PeopleNames;
	
	
	@FindBy(xpath="//*[@text='Dog Names']")
	public MobileElement dogNames;
	
	@FindBy(xpath="//*[@text='Fish Names']")
	public MobileElement fishNames;
	
	@FindBy(xpath="//*[@text='Cat Names']")
	public MobileElement catNames;
	
	@FindBy(xpath="//*[@text='Views']")
	public MobileElement views;
	
	@FindBy(xpath="//*[@text='Tabs']")
	public MobileElement tab;
	
	@FindBy(xpath="//*[@text='2. Content By Factory']")
	public MobileElement contentByFactory;
	
	@FindBy(xpath="//*[@text='Tab1']")
	public MobileElement tab1;
	
	@FindBy(xpath="//*[@text='Tab2']")
	public MobileElement tab2;
	
	@FindBy(xpath="//*[@text='Tab3']")
	public MobileElement tab3;
	
	public Screen_Page() {
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
}
