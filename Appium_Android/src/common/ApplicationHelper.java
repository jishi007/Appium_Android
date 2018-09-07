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

	public static void quitApp() {
		System.out.println("Prepare quit app...");
		driver.quit();
		System.out.println("Quit app successfully");
	}

	// get element by ID
	public static MobileElement getElement(String strElement) {
		return driver.findElementById(strElement);
	}

	// get element by class
	public static MobileElement getElementByClass(String strElement) {
		return driver.findElementByClassName(strElement);
	}

	public static void checkElementIsDisplayed(MobileElement mobileElement) {
		Assert.assertTrue(mobileElement.isDisplayed());
	}

	public static void checkElementIsEnable(MobileElement mobileElement) {
		Assert.assertTrue(mobileElement.isEnabled());
	}

	public static void enterValidCredential(MobileElement mobileElement, String str) {
		mobileElement.sendKeys(str);
		driver.hideKeyboard();
	}

	public static void tapButton(MobileElement mobileElement) {
		checkElementIsDisplayed(mobileElement);
		checkElementIsEnable(mobileElement);
		mobileElement.click();
	}
}
