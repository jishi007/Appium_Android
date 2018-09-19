package screen;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.ApplicationHelper;
import common.RegisterHelper;
import common.SignInHelper;
import common.WelcomeHelper;
import io.appium.java_client.MobileElement;
import org.testng.Assert;

public class WelcomeScreen {
	MobileElement imgLogo;
	MobileElement btnSignIn;
	MobileElement btnRegister;
	MobileElement lbSignInTitle;
	MobileElement btnBackSignIn;
	MobileElement lbRegisterTitle;
	MobileElement btnBackRegister;

	private Screen screen = new Screen();

	// The annotated method will be run before any test method belonging to the
	// classes inside the <test> tag is run.
	@BeforeTest
	public void setUpBeforeTest() throws Exception {
		// launch app
		screen.launchApp();
	}

	// The annotated method will be run after all the test methods belonging to the
	// classes inside the tag have run.
	@AfterTest
	public void setUpAfterTest() throws Exception {
		// quit app
		screen.quitApp();
	}

	// The annotated method will be run before each test method.
	@BeforeMethod
	public void setUpBeforeMethod() throws Exception {
		// sign in if necessary

	}

	// The annotated method will be run after each test method.
	@AfterMethod
	public void setUpAfterMethod() throws Exception {
		// log out if necessary
	}

	// verify UI
	@Test(priority = 1)
	public void verifyWelcomeScreenIsDisplayed() throws Exception {
		screen.verifyWelcomeScreenIsDisplayed();
	}

	// verify functional
	@Test(priority = 2)
	public void tapOnSignInButtonToOpenSignInScreen() throws Exception {
		screen.tapOnSignInButton();

		screen.verifySigInScreenIsDisplayed();
	}

	@Test(priority = 3)
	public void tapOnRegisterButtonToOpenRegisterScreen() throws Exception {
		screen.tapOnRegisterButton();

		screen.verifyRegisterScreenIsDisplayed();
	}

	class Screen {
		public void launchApp() throws Exception {
			ApplicationHelper.launchApp();
		}

		public void quitApp() throws Exception {
			ApplicationHelper.quitApp();
		}

		public void verifyWelcomeScreenIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(WelcomeHelper.getLogoImage());
			System.out.println("Logo is displayed");
			ApplicationHelper.checkElementIsDisplayed(WelcomeHelper.getSignInButton());
			System.out.println("Sign In button is displayed");
			ApplicationHelper.checkElementIsDisplayed(WelcomeHelper.getRegisterButton());
			System.out.println("Register button is displayed");
			System.out.println("Verify Welcome screen is displayed!!!");
		}

		public void tapOnSignInButton() throws Exception {
			WelcomeHelper.openSignInScreen(WelcomeHelper.getSignInButton());
		}

		public void tapOnRegisterButton() throws Exception {
			WelcomeHelper.openRegisterScreen(WelcomeHelper.getRegisterButton());
		}

		public void verifySigInScreenIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(SignInHelper.getSignInTitle());
			Assert.assertEquals(SignInHelper.getSignInTitle().getText(), "Sign In");
			System.out.println("Verify Sign In screen is displayed when tap on Sign In button!!!");
			SignInHelper.tapOnBackButton(SignInHelper.getBackButton());
		}

		public void verifyRegisterScreenIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(RegisterHelper.getRegisterTitle());
			Assert.assertEquals(RegisterHelper.getRegisterTitle().getText(), "Verification");
			System.out.println("Verify Register screen is displayed when tap on Register button!!!");
			RegisterHelper.tapOnBackButton(RegisterHelper.getBackButton());
		}
	}
}
