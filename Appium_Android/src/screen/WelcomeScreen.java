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
	public void setUpBeforeTest() {
		// launch app
		screen.launchApp();
	}

	// The annotated method will be run after all the test methods belonging to the
	// classes inside the tag have run.
	@AfterTest
	public void setUpAfterTest() {
		// quit app
		screen.quitApp();
	}

	// The annotated method will be run before each test method.
	@BeforeMethod
	public void setUpBeforeMethod() {
		// sign in if necessary
		screen.getElementsWelcomeScreen();
	}

	// The annotated method will be run after each test method.
	@AfterMethod
	public void setUpAfterMethod() {
		// log out if necessary
	}

	// verify UI
	@Test(priority = 1)
	public void verifyWelcomeScreenIsDisplayed() {
		screen.checkLogoAppIsDisplayed();
		screen.checkSignInButtonIsDisplayed();
		screen.checkRegisterButtonIsDisplayed();
		System.out.println("Welcome screen is displayed");
	}

	// verify functional
	@Test(priority = 2)
	public void tapOnSignInButtonToOpenSignInScreen() {
		screen.tapOnSignInButton(btnSignIn);

		screen.verifySigInScreenIsDisplayed();

		screen.backToWelComeScreen();
	}

	@Test(priority = 3)
	public void tapOnRegisterButtonToOpenRegisterScreen() {
		screen.tapOnRegisterButton(btnRegister);

		screen.verifyRegisterScreenIsDisplayed();

		screen.backToWelComeScreen();
	}

	class Screen {
		public void launchApp() {
			try {
				ApplicationHelper.launchApp();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		public void quitApp() {
			try {
				ApplicationHelper.quitApp();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		public void getElementsWelcomeScreen() {
			imgLogo = WelcomeHelper.getLogoImage();
			btnSignIn = WelcomeHelper.getSignInButton();
			btnRegister = WelcomeHelper.getRegisterButton();
		}

		public void getElementsSignInScreen() {
			lbSignInTitle = SignInHelper.getSignInTitle();
			btnBackSignIn = SignInHelper.getBackButton();
		}

		public void getElementsRegisterScreen() {
			lbRegisterTitle = RegisterHelper.getRegisterTitle();
			btnBackRegister = RegisterHelper.getBackButton();
		}

		public void checkLogoAppIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(imgLogo);
			System.out.println("Logo is displayed");
		}

		public void checkSignInButtonIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(btnSignIn);
			System.out.println("Sign In button is displayed");
		}

		public void checkRegisterButtonIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(btnRegister);
			System.out.println("Register button is displayed");
		}

		public void tapOnSignInButton(MobileElement btnSignIn) {
			System.out.println("Be able to tap on Sign In button");
			WelcomeHelper.openSignInScreen(btnSignIn);
			getElementsSignInScreen();
		}

		public void tapOnRegisterButton(MobileElement btnRegister) {
			System.out.println("Be able to tap on Register button");
			WelcomeHelper.openRegisterScreen(btnRegister);
		}

		public void backToWelComeScreen() {
			if (btnBackSignIn.isDisplayed())
				SignInHelper.tapOnBackButton(btnBackSignIn);
			else
				RegisterHelper.tapOnBackButton(btnBackRegister);
		}

		public void verifySigInScreenIsDisplayed() {
			getElementsSignInScreen();
			ApplicationHelper.checkElementIsDisplayed(lbSignInTitle);
			Assert.assertEquals("Sign In", lbSignInTitle.getText());
			System.out.println("Sign In screen is displayed");
		}

		public void verifyRegisterScreenIsDisplayed() {
			getElementsRegisterScreen();
			ApplicationHelper.checkElementIsDisplayed(lbRegisterTitle);
			Assert.assertEquals("Verification", lbRegisterTitle.getText());
			System.out.println("Register screen is displayed");
		}
	}
}
