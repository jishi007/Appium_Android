package common;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
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
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.setLogLevel(Level.INFO);
			System.out.println("Launch app successfully!!!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Can not launch app!!!", e);
		}
	}

	public static void quitApp() throws Exception {
		try {
			System.out.println("Prepare quit app...");
			driver.quit();
			System.out.println("Quit app successfully!!!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Can not quit app!!!", e);
		}
	}

	// Wait to do
	public static void WaitToDo(int sec) throws Exception {
		try {
			TimeUnit.SECONDS.sleep(sec);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getClass() + "|" + e.getMessage());
		}
	}

	public static boolean waitUtilElementIsDisplayed(MobileElement mobileElement, int timeout) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOf(mobileElement));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error! Element not found!!!", e);
		}
	}

	// get element by ID
	public static MobileElement getElement(String strElement) throws Exception {
		try {
			return driver.findElementById(strElement);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error! Element not found!!!", e);
		}
	}

	// get element by class
	public static MobileElement getElementByClass(String strElement) throws Exception {
		try {
			return driver.findElementByClassName(strElement);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error! Element not found!!!", e);
		}
	}

	// calculate center point of height of the screen
	public static int getCenterPointOfHeight() throws Exception {
		try {
			Dimension size = driver.manage().window().getSize();
			return (int) (size.getHeight() * 0.5);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	// calculate center point of width of the screen
	public static int getCenterPointOfWidth() throws Exception {
		try {
			Dimension size = driver.manage().window().getSize();
			return (int) (size.getWidth() * 0.5);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	// get location of element
	public static Point getLocationElement(MobileElement mobileElement) throws Exception {
		try {
			return mobileElement.getLocation();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	public static void checkElementIsDisplayed(MobileElement mobileElement) throws Exception {
		try {
			Assert.assertTrue(mobileElement.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error! Element not found!!!", e);
		}
	}

	public static void checkElementIsNotDisplayed(MobileElement mobileElement) throws Exception {
		try {
			Assert.assertFalse(mobileElement.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error! Element not found!!!", e);
		}
	}

	public static void checkElementIsEnable(MobileElement mobileElement) throws Exception {
		try {
			Assert.assertTrue(mobileElement.isEnabled());
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error! This element is not enable!!!", e);
		}
	}

	public static void checkElementIsDisable(MobileElement mobileElement) throws Exception {
		try {
			Assert.assertFalse(mobileElement.isEnabled());
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error! This element is not enable!!!", e);
		}
	}

	public static void clearTextField(MobileElement mobileElement) throws Exception {
		mobileElement.clear();
		driver.hideKeyboard();
	}

	public static void inputTextField(MobileElement mobileElement, String str) throws Exception {
		mobileElement.sendKeys(str);
		driver.hideKeyboard();
	}

	public static void tapButton(MobileElement mobileElement) throws Exception {
		checkElementIsEnable(mobileElement);
		mobileElement.click();
	}

	public static void scrollDown() throws Exception {
		int x = getCenterPointOfWidth();
		int startY = (int) (getCenterPointOfHeight() * 0.80);
		int endY = (int) (getCenterPointOfHeight() * 0.20);
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(x, startY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(x, endY)).release().perform();

	}
	
	public static void scrollUp() throws Exception {
		int x = getCenterPointOfWidth();
		int endY = (int) (getCenterPointOfHeight() * 0.80);
		int startY = (int) (getCenterPointOfHeight() * 0.20);
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(x, startY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(x, endY)).release().perform();

	}
}
