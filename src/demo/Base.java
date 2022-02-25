package demo;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
		// Path of APP
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");

		DesiredCapabilities cap = new DesiredCapabilities(); // this class sends JSON info to Appium server
		if(device.equals("emulator")) {
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MyEmulator2");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		}
		else if(device.equals("real")) {
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		}																		// Android updated its internal
																				// framework to uiautomator2 and through
																				// Appium code, we need to tell that we
																				// need to access uiautomator2 elements
																				// of Android.
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://127.0.0.1:4723/wd/hub"), cap); // parameters are connectiontoserverlink,cap ; wd -webdriver
		return driver;
	}

}