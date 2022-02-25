package demo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends BaseClass {

	public static void main(String[] args) throws MalformedURLException{
		
	AndroidDriver<AndroidElement> driver = capabilities2();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
