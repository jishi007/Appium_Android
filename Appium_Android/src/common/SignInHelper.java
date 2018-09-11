package common;

import io.appium.java_client.MobileElement;

public class SignInHelper {
	public static MobileElement getSignInTitle() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.TITLE_SIGNIN);
	}

	public static MobileElement getUsernameField() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.USERNAME_FIELD_SIGNIN);
	}

	public static MobileElement getPasswordField() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.PASSWORD_FIELD_SIGNIN);
	}

	public static MobileElement getForfotPasswordButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.FORGOT_PASSWORD_BUTTON_SIGNIN);
	}

	public static MobileElement getSignInButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.SIGNIN_BUTTON_SIGNIN);
	}

	public static MobileElement getBackButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.BACK_BUTTON_SIGNIN);
	}

	public static MobileElement getAlertTitle() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.ALERT_TITLE_SIGNIN);
	}

	public static MobileElement getAlertMessage() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.ALERT_MESSAGE_SIGNIN);
	}

	public static MobileElement getAlertConfirmButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.ALERT_CONFIRM_SIGNIN);
	}

	public static void inputUsername(MobileElement txtUsername, String strUsername) throws Exception {
		ApplicationHelper.enterValidCredential(txtUsername, strUsername);
	}

	public static void inputPassword(MobileElement txtPassword, String strPassword) throws Exception {
		ApplicationHelper.enterValidCredential(txtPassword, strPassword);
	}

	public static void tapOnSignInButton(MobileElement btnSignIn) throws Exception {
		ApplicationHelper.tapButton(btnSignIn);
	}

	public static void signIn() throws Exception {
		WelcomeHelper.openSignInScreen(WelcomeHelper.getSignInButton());
		MobileElement txtUsername = getUsernameField();
		MobileElement txtPassword = getPasswordField();
		MobileElement btnSignIn = getSignInButton();
		inputUsername(txtUsername, ElementDeclaration.strUsername);
		inputPassword(txtPassword, ElementDeclaration.strPassword);
		ApplicationHelper.tapButton(btnSignIn);
		System.out.println("Feed screen is displayed");
	}

	public static void tapOnBackButton(MobileElement btnBack) throws Exception {
		System.out.println("Prepare back to Welcome screen...");
		ApplicationHelper.tapButton(btnBack);
		System.out.println("Back to Welcome screen successfully");
	}

	public static void tapOnForgotPassword(MobileElement btnForgotPassword) throws Exception {
		ApplicationHelper.tapButton(btnForgotPassword);
		System.out.println("Open Forgot Password screen successfully");
	}

	public static void confirmAlertPopup(MobileElement btnConfirm) throws Exception {
		ApplicationHelper.tapButton(btnConfirm);
		System.out.println("Alert! Log in unsuccessfully");
	}
}
