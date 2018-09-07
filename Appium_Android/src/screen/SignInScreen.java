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
import common.SignInHelper;
import common.WelcomeHelper;
import io.appium.java_client.MobileElement;

public class SignInScreen {
	ElementDeclaration elementDeclaration = new ElementDeclaration();

	// Sign In screen
	MobileElement lbSignInTitle;
	MobileElement txtUsername;
	MobileElement txtPassword;
	MobileElement btnForgotPassword;
	MobileElement btnSignIn;
	MobileElement btnBack;
	//Feed screen
	MobileElement lbFeedTitle;
	MobileElement iconLeftMenu;
	//Left menu
	MobileElement menuSetting;
	//Menu Setting
	MobileElement btnLogOut;

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
		screen.openSignInScreen();
	}

	// The annotated method will be run after each test method.
	@AfterMethod
	public void setUpAfterMethod() throws Exception {
		// log out if necessary
	}

	// verify UI Sign In screen
	@Test(priority = 1)
	public void verifySignInScreenIsDisplayed() {
		screen.checkSignInTitleIsDisplayed();
		screen.checkUsernameFieldIsDisplayed();
		screen.checkPasswordFieldIsDisplayed();
		screen.checkForgotPasswordButtonIsDisplayed();
		screen.checkSignInButtonIsDisplayed();
		screen.checkBackButtonIsDisplayed();
		System.out.println("Sign In screen is displayed");
		
		SignInHelper.tapOnBackButton(btnBack);
	}

	// verify functional
	@Test(priority = 2)
	public void signInPass() {
		screen.inputUsername();
		screen.inputPassword();

		screen.tapOnSignInButton();

		screen.verifyFeedScreenIsDisplayed();
	}

	class Screen {
		public void launchApp() throws Exception {
			ApplicationHelper.launchApp();
		}

		public void quitApp() throws Exception {
			ApplicationHelper.quitApp();
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
			btnBack = SignInHelper.getBackButton();
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
			ApplicationHelper.checkElementIsDisplayed(btnBack);
			System.out.println("Back button is displayed");
		}

		public void inputUsername() {
			SignInHelper.inputUsername(txtUsername, ElementDeclaration.strUsername);
			System.out.println("Input username: " + ElementDeclaration.strUsername);
		}

		public void inputPassword() {
			SignInHelper.inputPassword(txtPassword, ElementDeclaration.strPassword);
			System.out.println("Input password: " + ElementDeclaration.strPassword);
		}

		public void tapOnSignInButton() {
			SignInHelper.tapOnSignInButton(btnSignIn);
		}
		
		public void signOut() {
			FeedHelper.signOut(btnSignOut);
		}
		
		public void verifyFeedScreenIsDisplayed() {
			getElementsFeedScreen();
			ApplicationHelper.checkElementIsDisplayed(lbFeedTitle);
			Assert.assertEquals("New Feed", lbFeedTitle.getText());
			System.out.println("Sign In successfully. Feed screen is displayed");
		}
		
		public void clickOnForgetPasswordButton() {

		}

		public void hasIncorrectPasswordMessageShown() {

		}

		
	}
}
