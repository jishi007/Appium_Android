package screen;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.ApplicationHelper;
import common.ElementDeclaration;
import common.FeedHelper;
import common.ForgotPasswordHelper;
import common.SignInHelper;
import common.WelcomeHelper;
import io.appium.java_client.MobileElement;

public class SignInScreen {
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
		screen.openSignInScreen();
	}

	// The annotated method will be run after each test method.
	@AfterMethod
	public void setUpAfterMethod() {
		// log out if necessary
	}

	// VERIFY UI SIGN IN SCREEN
	@Test(priority = 1)
	public void verifySignInScreenIsDisplayed() throws Exception {
		screen.verifyUISignInScreen();

		screen.backToWelcomeScreen();
	}

	// VERIFY FUNCTIONAL SIGN IN SCREEN
	// User should be able to sign in with valid credentials
	@Test(priority = 2)
	public void signInWithValidCredentials() throws Exception {
		screen.inputUsername(ElementDeclaration.strUsername);
		screen.inputPassword(ElementDeclaration.strPassword);

		screen.tapOnSignInButton();

		screen.verifyFeedScreenIsDisplayed();

		screen.logOut();
	}

	// User should not be allow to sign in with valid username & invalid password
	@Test(priority = 3)
	public void signInWithValidUsernameAndInvalidPassword() throws Exception {
		screen.inputUsername(ElementDeclaration.strUsername);
		screen.inputPassword(ElementDeclaration.strInvalidPassword);

		screen.tapOnSignInButton();

		screen.alertLoginUnsuccessfully();

		screen.backToWelcomeScreen();
	}

	// User should not be allow to sign in with invalid username & valid password
	@Test(priority = 4)
	public void signInWithInvalidUsernameAndValidPassword() throws Exception {
		screen.inputUsername(ElementDeclaration.strInvalidUsername);
		screen.inputPassword(ElementDeclaration.strPassword);

		screen.tapOnSignInButton();

		screen.alertLoginUnsuccessfully();

		screen.backToWelcomeScreen();
	}

	// User should not be allowed to Login with blank Username field
	@Test(priority = 5)
	public void signInWithBlankUsernameField() throws Exception {
		screen.inputPassword(ElementDeclaration.strPassword);

		screen.tapOnSignInButton();

		screen.alertLoginUnsuccessfully();

		screen.backToWelcomeScreen();
	}

	// User should not be allowed to Login with blank Password field
	@Test(priority = 6)
	public void signInWithBlankPasswordField() throws Exception {
		screen.inputUsername(ElementDeclaration.strUsername);

		screen.tapOnSignInButton();

		screen.alertLoginUnsuccessfully();

		screen.backToWelcomeScreen();
	}

	// User should be redirected to appropriate page when clicking on Forgot
	// Password
	@Test(priority = 7)
	public void redirectToForgotPasswordScreen() throws Exception {
		screen.tapOnForgetPasswordButton();

		screen.verifyForgotPasswordScreenIsDisplayed();

		screen.backToSignInScreen();
	}

	class Screen {
		public void launchApp() throws Exception {
			ApplicationHelper.launchApp();
		}

		public void quitApp() throws Exception {
			ApplicationHelper.quitApp();
		}

		public void openSignInScreen() throws Exception {
			MobileElement btnSignInWelcomeScreen = WelcomeHelper.getSignInButton();
			WelcomeHelper.openSignInScreen(btnSignInWelcomeScreen);
			getElementsSignInScreen();
		}

		public void getElementsSignInScreen() throws Exception {
			lbSignInTitle = SignInHelper.getSignInTitle();
			txtUsername = SignInHelper.getUsernameField();
			txtPassword = SignInHelper.getPasswordField();
			btnForgotPassword = SignInHelper.getForfotPasswordButton();
			btnSignIn = SignInHelper.getSignInButton();
			btnBackToWelcomeScreen = SignInHelper.getBackButton();
		}

		public void getElementsAlertPopup() throws Exception {
			lbAlertTitle = SignInHelper.getAlertTitle();
			lbAlertMessage = SignInHelper.getAlertMessage();
			btnAlertConfirm = SignInHelper.getAlertConfirmButton();
		}

		public void getElementsForgotPasswordScreen() throws Exception {
			lbForgotPasswordTitle = ForgotPasswordHelper.getForgotPasswordTitle();
			btnBackToSignInScreen = ForgotPasswordHelper.getBackButton();
		}

		public void getElementsFeedScreen() throws Exception {
			lbFeedTitle = FeedHelper.getFeedTitle();
			iconLeftMenu = FeedHelper.getLeftMenuIcon();
		}

		public void getElementsLeftMenu() throws Exception {
			menuSetting = FeedHelper.getSettingMenu();
		}

		public void getElementsSettingMenu() throws Exception {
			btnLogOut = FeedHelper.getLogOutButton();
		}

		public void getElementsConfirmPopup() throws Exception {
			btnOK = FeedHelper.getOKLogOutButton();
			btnCancel = FeedHelper.getCancelLogOutButton();
		}

		public void checkSignInTitleIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(lbSignInTitle);
			System.out.println("Sign In title is displayed");
		}

		public void checkUsernameFieldIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(txtUsername);
			System.out.println("Username field is displayed");
		}

		public void checkPasswordFieldIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(txtPassword);
			System.out.println("Password field is displayed");
		}

		public void checkForgotPasswordButtonIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(btnForgotPassword);
			System.out.println("Forgot Password button is displayed");
		}

		public void checkSignInButtonIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(btnSignIn);
			System.out.println("Sign In button is displayed");
		}

		public void checkBackButtonIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(btnBackToWelcomeScreen);
			System.out.println("Back button is displayed");
		}

		public void verifyUISignInScreen() throws Exception {
			checkSignInTitleIsDisplayed();
			checkUsernameFieldIsDisplayed();
			checkPasswordFieldIsDisplayed();
			checkForgotPasswordButtonIsDisplayed();
			checkSignInButtonIsDisplayed();
			checkBackButtonIsDisplayed();
			System.out.println("Verify Sign In screen is displayed!!!");
		}

		public void inputUsername(String username) throws Exception {
			SignInHelper.inputUsername(txtUsername, username);
			System.out.println("Input username: " + username);
		}

		public void inputPassword(String password) throws Exception {
			SignInHelper.inputPassword(txtPassword, password);
			System.out.println("Input password: " + password);
		}

		public void tapOnSignInButton() throws Exception {
			SignInHelper.tapOnSignInButton(btnSignIn);
		}

		public void logOut() throws Exception {
			FeedHelper.logOut(iconLeftMenu);
		}

		public void backToWelcomeScreen() throws Exception {
			SignInHelper.tapOnBackButton(btnBackToWelcomeScreen);
		}

		public void backToSignInScreen() throws Exception {
			SignInHelper.tapOnBackButton(btnBackToSignInScreen);
		}

		public void verifyFeedScreenIsDisplayed() throws Exception {
			getElementsFeedScreen();
			ApplicationHelper.checkElementIsDisplayed(lbFeedTitle);
			Assert.assertEquals("New Feed", lbFeedTitle.getText());
			System.out.println("User should be able to sign in with valid credentials. Feed screen is displayed");
		}

		public void tapOnForgetPasswordButton() throws Exception {
			SignInHelper.tapOnBackButton(btnForgotPassword);
		}

		public void verifyForgotPasswordScreenIsDisplayed() throws Exception {
			getElementsForgotPasswordScreen();
			ApplicationHelper.checkElementIsDisplayed(lbForgotPasswordTitle);
			Assert.assertEquals("Forgot password?", lbForgotPasswordTitle.getText());
			System.out.println(
					"User should be redirected to appropriate page when clicking on Forgot Password. Forgot password screen is displayed");
		}

		public void alertLoginUnsuccessfully() throws Exception {
			getElementsAlertPopup();
			ApplicationHelper.checkElementIsDisplayed(lbAlertMessage);
			SignInHelper.confirmAlertPopup(btnAlertConfirm);
			System.out.println("User should not be allow to sign in with invalid username or invalid password");
		}
	}

	// Sign In screen
	MobileElement lbSignInTitle;
	MobileElement txtUsername;
	MobileElement txtPassword;
	MobileElement btnForgotPassword;
	MobileElement btnSignIn;
	MobileElement btnBackToWelcomeScreen;
	MobileElement lbAlertTitle;
	MobileElement lbAlertMessage;
	MobileElement btnAlertConfirm;
	// Forgot Password screen
	MobileElement lbForgotPasswordTitle;
	MobileElement btnBackToSignInScreen;
	// Feed screen
	MobileElement lbFeedTitle;
	MobileElement iconLeftMenu;
	// Left menu
	MobileElement menuSetting;
	// Menu Setting
	MobileElement btnLogOut;
	MobileElement btnOK;
	MobileElement btnCancel;

	private Screen screen = new Screen();
}
