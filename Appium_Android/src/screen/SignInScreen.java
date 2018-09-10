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
		screen.openSignInScreen();
	}

	// The annotated method will be run after each test method.
	@AfterMethod
	public void setUpAfterMethod() {
		// log out if necessary
	}

	// VERIFY UI SIGN IN SCREEN
	@Test(priority = 1)
	public void verifySignInScreenIsDisplayed() {
		screen.verifyUISignInScreen();

		screen.backToWelcomeScreen();
	}

	// VERIFY FUNCTIONAL SIGN IN SCREEN
	// User should be able to sign in with valid credentials
	@Test(priority = 2)
	public void signInWithValidCredentials() {
		screen.inputUsername(ElementDeclaration.strUsername);
		screen.inputPassword(ElementDeclaration.strPassword);

		screen.tapOnSignInButton();

		screen.verifyFeedScreenIsDisplayed();

		screen.logOut();
	}

	// User should not be allow to sign in with valid username & invalid password
	@Test(priority = 3)
	public void signInWithValidUsernameAndInvalidPassword() {
		screen.inputUsername(ElementDeclaration.strUsername);
		screen.inputPassword(ElementDeclaration.strInvalidPassword);

		screen.tapOnSignInButton();

		screen.alertLoginUnsuccessfully();

		screen.backToWelcomeScreen();
	}

	// User should not be allow to sign in with invalid username & valid password
	@Test(priority = 4)
	public void signInWithInvalidUsernameAndValidPassword() {
		screen.inputUsername(ElementDeclaration.strInvalidUsername);
		screen.inputPassword(ElementDeclaration.strPassword);

		screen.tapOnSignInButton();

		screen.alertLoginUnsuccessfully();

		screen.backToWelcomeScreen();
	}

	// User should not be allowed to Login with blank Username field
	@Test(priority = 5)
	public void signInWithBlankUsernameField() {
		screen.inputPassword(ElementDeclaration.strPassword);

		screen.tapOnSignInButton();

		screen.alertLoginUnsuccessfully();

		screen.backToWelcomeScreen();
	}

	// User should not be allowed to Login with blank Password field
	@Test(priority = 6)
	public void signInWithBlankPasswordField() {
		screen.inputUsername(ElementDeclaration.strUsername);

		screen.tapOnSignInButton();

		screen.alertLoginUnsuccessfully();

		screen.backToWelcomeScreen();
	}

	// User should be redirected to appropriate page when clicking on Forgot
	// Password
	@Test(priority = 7)
	public void redirectToForgotPasswordScreen() {
		screen.tapOnForgetPasswordButton();

		screen.verifyForgotPasswordScreenIsDisplayed();

		screen.backToSignInScreen();
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

		public void openSignInScreen() {
			MobileElement btnSignInWelcomeScreen = WelcomeHelper.getSignInButton();
			WelcomeHelper.openSignInScreen(btnSignInWelcomeScreen);
			getElementsSignInScreen();
		}

		public void getElementsSignInScreen() {
			lbSignInTitle = SignInHelper.getSignInTitle();
			txtUsername = SignInHelper.getUsernameField();
			txtPassword = SignInHelper.getPasswordField();
			btnForgotPassword = SignInHelper.getForfotPasswordButton();
			btnSignIn = SignInHelper.getSignInButton();
			btnBackToWelcomeScreen = SignInHelper.getBackButton();
		}

		public void getElementsAlertPopup() {
			lbAlertTitle = SignInHelper.getAlertTitle();
			lbAlertMessage = SignInHelper.getAlertMessage();
			btnAlertConfirm = SignInHelper.getAlertConfirmButton();
		}

		public void getElementsForgotPasswordScreen() {
			lbForgotPasswordTitle = ForgotPasswordHelper.getForgotPasswordTitle();
			btnBackToSignInScreen = ForgotPasswordHelper.getBackButton();
		}

		public void getElementsFeedScreen() {
			lbFeedTitle = FeedHelper.getFeedTitle();
			iconLeftMenu = FeedHelper.getLeftMenuIcon();
		}

		public void getElementsLeftMenu() {
			menuSetting = FeedHelper.getSettingMenu();
		}

		public void getElementsSettingMenu() {
			btnLogOut = FeedHelper.getLogOutButton();
		}

		public void getElementsConfirmPopup() {
			btnOK = FeedHelper.getOKLogOutButton();
			btnCancel = FeedHelper.getCancelLogOutButton();
		}

		public void checkSignInTitleIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(lbSignInTitle);
			System.out.println("Sign In title is displayed");
		}

		public void checkUsernameFieldIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(txtUsername);
			System.out.println("Username field is displayed");
		}

		public void checkPasswordFieldIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(txtPassword);
			System.out.println("Password field is displayed");
		}

		public void checkForgotPasswordButtonIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(btnForgotPassword);
			System.out.println("Forgot Password button is displayed");
		}

		public void checkSignInButtonIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(btnSignIn);
			System.out.println("Sign In button is displayed");
		}

		public void checkBackButtonIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(btnBackToWelcomeScreen);
			System.out.println("Back button is displayed");
		}

		public void verifyUISignInScreen() {
			checkSignInTitleIsDisplayed();
			checkUsernameFieldIsDisplayed();
			checkPasswordFieldIsDisplayed();
			checkForgotPasswordButtonIsDisplayed();
			checkSignInButtonIsDisplayed();
			checkBackButtonIsDisplayed();
			System.out.println("Verify UI Sign In screen");
		}

		public void inputUsername(String username) {
			SignInHelper.inputUsername(txtUsername, username);
			System.out.println("Input username: " + username);
		}

		public void inputPassword(String password) {
			SignInHelper.inputPassword(txtPassword, password);
			System.out.println("Input password: " + password);
		}

		public void tapOnSignInButton() {
			SignInHelper.tapOnSignInButton(btnSignIn);
		}

		public void logOut() {
			FeedHelper.openLeftMenu(iconLeftMenu);
			getElementsLeftMenu();
			FeedHelper.openSettingMenu(menuSetting);
			getElementsSettingMenu();
			FeedHelper.signOut(btnLogOut);
			getElementsConfirmPopup();
			FeedHelper.confirmSignOut(btnOK);
		}

		public void backToWelcomeScreen() {
			SignInHelper.tapOnBackButton(btnBackToWelcomeScreen);
		}

		public void backToSignInScreen() {
			SignInHelper.tapOnBackButton(btnBackToSignInScreen);
		}

		public void verifyFeedScreenIsDisplayed() {
			getElementsFeedScreen();
			ApplicationHelper.checkElementIsDisplayed(lbFeedTitle);
			Assert.assertEquals("New Feed", lbFeedTitle.getText());
			System.out.println("User should be able to sign in with valid credentials. Feed screen is displayed");
		}

		public void tapOnForgetPasswordButton() {
			SignInHelper.tapOnBackButton(btnForgotPassword);
		}

		public void verifyForgotPasswordScreenIsDisplayed() {
			getElementsForgotPasswordScreen();
			ApplicationHelper.checkElementIsDisplayed(lbForgotPasswordTitle);
			Assert.assertEquals("Forgot password?", lbForgotPasswordTitle.getText());
			System.out.println(
					"User should be redirected to appropriate page when clicking on Forgot Password. Forgot password screen is displayed");
		}

		public void alertLoginUnsuccessfully() {
			getElementsAlertPopup();
			ApplicationHelper.checkElementIsDisplayed(lbAlertMessage);
			SignInHelper.confirmAlertPopup(btnAlertConfirm);
			System.out.println("User should not be allow to sign in with valid username & invalid password");
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
