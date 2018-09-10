package common;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApplicationHelper {
	public static AppiumDriver<MobileElement> driver = null;

	public static void launchApp() throws Exception {
		try {
		System.out.println("Prepare launch app...");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, ElementDeclaration.deviceName);
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, ElementDeclaration.platformName);
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, ElementDeclaration.platformVersion);
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, ElementDeclaration.appPackage);
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ElementDeclaration.appActivity);
		caps.setCapability("noReset", "true");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.setLogLevel(Level.INFO);
		System.out.println("Launch app successfully");
		}
		catch (Exception e) {
			e.getMessage();
			System.out.println("Can not launch app!!!");
		}
	}  

	public static void quitApp() throws Exception {
		try {
		System.out.println("Prepare quit app...");
		driver.quit();
		System.out.println("Quit app successfully");
		}
		catch (Exception e) {
			e.getMessage();
			System.out.println("Error! Can not quit app!!!");
		}
	}

	// get element by ID
	public static MobileElement getElement(String strElement) {
		MobileElement mobileElement = driver.findElementById(strElement);
		if(mobileElement != null)
			return mobileElement;
		else { 
			System.out.println("Error! This element is not existed!!!");
			return null;
		}
	}

	// get element by class
	public static MobileElement getElementByClass(String strElement) {
		MobileElement mobileElement = driver.findElementByClassName(strElement);
		if(mobileElement != null)
			return mobileElement;
		else { 
			System.out.println("Error! This element is not existed!!!");
			return null;
		} 
	}

	public static void checkElementIsDisplayed(MobileElement mobileElement) {
		if(mobileElement != null)
			Assert.assertTrue(mobileElement.isDisplayed());
		else 
			System.out.println("Error! This element is not displayed!!!");		
	}

	public static void checkElementIsEnable(MobileElement mobileElement) {
		if(mobileElement != null)
			Assert.assertTrue(mobileElement.isEnabled());
		else 
			System.out.println("Error! This element is not enable!!!");	
	}

	public static void enterValidCredential(MobileElement mobileElement, String str) {
		checkElementIsDisplayed(mobileElement);
		mobileElement.sendKeys(str);
		driver.hideKeyboard();
	}

	public static void tapButton(MobileElement mobileElement) {
		checkElementIsDisplayed(mobileElement);
		checkElementIsEnable(mobileElement);
		mobileElement.click();
	}
}
