package demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BaseClass {

	public static AndroidDriver<AndroidElement> capabilities2() throws MalformedURLException {
		File appDir = new File("src");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MyEmulator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "20"); //How long (in seconds) Appium will wait for a new command from the client before assuming the client quit and ending the session
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.vending"); // Google Play Store
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.finsky.activities.MainActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap); 
		return driver;
	}

}
