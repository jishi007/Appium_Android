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

public class SignInScreen {
	// The annotated method will be run before any test method belonging to the
	// classes inside the <test> tag is run.
	@BeforeTest
	public void setUpBeforeTest() throws Exception {
		// launch app
		screen.launchApp();
		screen.openSignInScreen();
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

	// VERIFY UI SIGN IN SCREEN
	@Test(priority = 1)
	public void verifySignInScreenIsDisplayed() throws Exception {
		screen.verifyUISignInScreen();	
	}

	// VERIFY FUNCTIONAL SIGN IN SCREEN

	// User should not be allow to sign in with valid username & invalid password
	@Test(priority = 2)
	public void signInWithValidUsernameAndInvalidPassword() throws Exception {
		screen.inputUsername(ElementDeclaration.strUsername);
		screen.inputPassword(ElementDeclaration.strInvalidPassword);

		screen.tapOnSignInButton();

		screen.confirmAlertLoginUnsuccessfully();
	}

	// User should not be allow to sign in with invalid username & valid password
	@Test(priority = 3)
	public void signInWithInvalidUsernameAndValidPassword() throws Exception {
		screen.clearUsernameField();
		screen.inputUsername(ElementDeclaration.strInvalidUsername);
		screen.clearPasswordField();
		screen.inputPassword(ElementDeclaration.strPassword);

		screen.tapOnSignInButton();

		screen.confirmAlertLoginUnsuccessfully();
	}

	// User should not be allowed to Login with blank Username field
	@Test(priority = 4)
	public void signInWithBlankUsernameField() throws Exception {
		screen.clearUsernameField();
		screen.clearPasswordField();
		screen.inputPassword(ElementDeclaration.strPassword);

		screen.tapOnSignInButton();

		screen.confirmAlertLoginUnsuccessfully();
	}

	// User should not be allowed to Login with blank Password field
	@Test(priority = 5)
	public void signInWithBlankPasswordField() throws Exception {
		screen.inputUsername(ElementDeclaration.strUsername);
		screen.clearPasswordField();

		screen.tapOnSignInButton();

		screen.confirmAlertLoginUnsuccessfully();
	}
	
	// User should not be allowed to Login with blank Username & blank Password field
		@Test(priority = 6)
		public void signInWithBlankUsernameAndPassword() throws Exception {
			screen.clearUsernameField();

			screen.tapOnSignInButton();

			screen.confirmAlertLoginUnsuccessfully();
		}

	// User should be redirected to appropriate page when clicking on Forgot
	// Password
	@Test(priority = 7)
	public void redirectToForgotPasswordScreen() throws Exception {
		screen.tapOnForgetPasswordButton();

		screen.verifyForgotPasswordScreenIsDisplayed();
	}
	
	// User should be able to sign in with valid credentials
		@Test(priority = 8)
		public void signInWithValidCredentials() throws Exception {
			screen.inputUsername(ElementDeclaration.strUsername);
			screen.inputPassword(ElementDeclaration.strPassword);

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

		public void openSignInScreen() throws Exception {
			WelcomeHelper.openSignInScreen(WelcomeHelper.getSignInButton());
		}

		public void verifyUISignInScreen() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(SignInHelper.getSignInTitle());
			System.out.println("Sign In title is displayed");
			ApplicationHelper.checkElementIsDisplayed(SignInHelper.getUsernameField());
			System.out.println("Username field is displayed");
			ApplicationHelper.checkElementIsDisplayed(SignInHelper.getPasswordField());
			System.out.println("Password field is displayed");
			ApplicationHelper.checkElementIsDisplayed(SignInHelper.getForfotPasswordButton());
			System.out.println("Forgot Password button is displayed");
			ApplicationHelper.checkElementIsDisplayed(SignInHelper.getSignInButton());
			System.out.println("Sign In button is displayed");
			ApplicationHelper.checkElementIsDisplayed(SignInHelper.getBackButton());
			System.out.println("Back button is displayed");
			System.out.println("Verify Sign In screen is displayed!!!");
		}

		public void inputUsername(String username) throws Exception {
			SignInHelper.inputUsername(SignInHelper.getUsernameField(), username);
			System.out.println("Input username: " + username);
		}
		
		public void clearUsernameField() throws Exception {
			ApplicationHelper.clearTextField(SignInHelper.getUsernameField());
		}

		public void inputPassword(String password) throws Exception {
			SignInHelper.inputPassword(SignInHelper.getPasswordField(), password);
			System.out.println("Input password: " + password);
		}
		
		public void clearPasswordField() throws Exception {
			ApplicationHelper.clearTextField(SignInHelper.getPasswordField());
		}

		public void tapOnSignInButton() throws Exception {
			SignInHelper.tapOnSignInButton(SignInHelper.getSignInButton());
		}

		public void logOut() throws Exception {
			FeedHelper.logOut();
		}

		public void backToWelcomeScreen() throws Exception {
			SignInHelper.tapOnBackButton(SignInHelper.getBackButton());
		}

		public void backToSignInScreen() throws Exception {
			ForgotPasswordHelper.tapOnBackButton(ForgotPasswordHelper.getBackButton());
		}

		public void verifyFeedScreenIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getFeedTitle());
			Assert.assertEquals("New Feed", FeedHelper.getFeedTitle().getText());
			System.out.println("User should be able to sign in with valid credentials. Feed screen is displayed");
			logOut();
		}

		public void tapOnForgetPasswordButton() throws Exception {
			SignInHelper.tapOnForgotPassword(SignInHelper.getForfotPasswordButton());
		}

		public void verifyForgotPasswordScreenIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(ForgotPasswordHelper.getForgotPasswordTitle());
			Assert.assertEquals("Forgot password?", ForgotPasswordHelper.getForgotPasswordTitle().getText());
			System.out.println(
					"User should be redirected to appropriate page when clicking on Forgot Password. Forgot password screen is displayed");
			backToSignInScreen();
		}

		public void confirmAlertLoginUnsuccessfully() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(SignInHelper.getAlertTitle());
			SignInHelper.confirmAlertPopup(SignInHelper.getAlertConfirmButton());
			System.out.println("User should not be allow to sign in with invalid username or invalid password");
		}
	}

	private Screen screen = new Screen();
}
