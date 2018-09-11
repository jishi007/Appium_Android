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
		screen.getElementsWelcomeScreen();
	}

	// The annotated method will be run after each test method.
	@AfterMethod
	public void setUpAfterMethod() {
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
		screen.tapOnSignInButton(btnSignIn);

		screen.verifySigInScreenIsDisplayed();

		screen.backToWelComeScreen();
	}

	@Test(priority = 3)
	public void tapOnRegisterButtonToOpenRegisterScreen() throws Exception {
		screen.tapOnRegisterButton(btnRegister);

		screen.verifyRegisterScreenIsDisplayed();

		screen.backToWelComeScreen();
	}

	class Screen {
		public void launchApp() throws Exception {
			ApplicationHelper.launchApp();
		}

		public void quitApp() throws Exception {
			ApplicationHelper.quitApp();
		}

		public void getElementsWelcomeScreen() throws Exception {
			imgLogo = WelcomeHelper.getLogoImage();
			btnSignIn = WelcomeHelper.getSignInButton();
			btnRegister = WelcomeHelper.getRegisterButton();
			System.out.println("Welcome screen is displayed");
		}

		public void getElementsSignInScreen() throws Exception {
			lbSignInTitle = SignInHelper.getSignInTitle();
			btnBackSignIn = SignInHelper.getBackButton();
		}

		public void getElementsRegisterScreen() throws Exception {
			lbRegisterTitle = RegisterHelper.getRegisterTitle();
			btnBackRegister = RegisterHelper.getBackButton();
		}
		
		public void verifyWelcomeScreenIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(imgLogo);
			System.out.println("Logo is displayed");
			ApplicationHelper.checkElementIsDisplayed(btnSignIn);
			System.out.println("Sign In button is displayed");
			ApplicationHelper.checkElementIsDisplayed(btnRegister);
			System.out.println("Register button is displayed");
			System.out.println("Verify Welcome screen is displayed!!!");
		}

		public void tapOnSignInButton(MobileElement btnSignIn) throws Exception {			
			WelcomeHelper.openSignInScreen(btnSignIn);
			getElementsSignInScreen();
		}

		public void tapOnRegisterButton(MobileElement btnRegister) throws Exception {
			WelcomeHelper.openRegisterScreen(btnRegister);
		}

		public void backToWelComeScreen() throws Exception {
			if (btnBackSignIn.isDisplayed())
				SignInHelper.tapOnBackButton(btnBackSignIn);
			else
				RegisterHelper.tapOnBackButton(btnBackRegister);
		}

		public void verifySigInScreenIsDisplayed() throws Exception {
			getElementsSignInScreen();
			ApplicationHelper.checkElementIsDisplayed(lbSignInTitle);
			Assert.assertEquals("Sign In", lbSignInTitle.getText());
			System.out.println("Verify Sign In screen is displayed when tap on Sign In button!!!");
		}

		public void verifyRegisterScreenIsDisplayed() throws Exception {
			getElementsRegisterScreen();
			ApplicationHelper.checkElementIsDisplayed(lbRegisterTitle);
			Assert.assertEquals("Verification", lbRegisterTitle.getText());	
			System.out.println("Verify Register screen is displayed when tap on Register button!!!");
		}
	}
}
