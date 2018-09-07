package common;

import io.appium.java_client.MobileElement;

public class SignInHelper {
	public static MobileElement getSignInTitle() {
		return ApplicationHelper.getElement(ElementDeclaration.TITLE_SIGNIN);
	}

	public static MobileElement getUsernameField() {
		return ApplicationHelper.getElement(ElementDeclaration.USERNAME_FIELD_SIGNIN);
	}

	public static MobileElement getPasswordField() {
		return ApplicationHelper.getElement(ElementDeclaration.PASSWORD_FIELD_SIGNIN);
	}

	public static MobileElement getForfotPasswordButton() {
		return ApplicationHelper.getElement(ElementDeclaration.FORGOT_PASSWORD_BUTTON_SIGNIN);
	}

	public static MobileElement getSignInButton() {
		return ApplicationHelper.getElement(ElementDeclaration.SIGNIN_BUTTON_SIGNIN);
	}

	public static MobileElement getBackButton() {
		return ApplicationHelper.getElement(ElementDeclaration.BACK_BUTTON_SIGNIN);
	}

	public static MobileElement getAlertTitle() {
		return ApplicationHelper.getElement(ElementDeclaration.ALERT_TITLE_SIGNIN);
	}

	public static MobileElement getAlertMessage() {
		return ApplicationHelper.getElement(ElementDeclaration.ALERT_MESSAGE_SIGNIN);
	}

	public static MobileElement getAlertConfirmButton() {
		return ApplicationHelper.getElement(ElementDeclaration.ALERT_CONFIRM_SIGNIN);
	}

	public static void inputUsername(MobileElement txtUsername, String strUsername) {
		ApplicationHelper.enterValidCredential(txtUsername, strUsername);
	}

	public static void inputPassword(MobileElement txtPassword, String strPassword) {
		ApplicationHelper.enterValidCredential(txtPassword, strPassword);
	}

	public static void tapOnSignInButton(MobileElement btnSignIn) {
		ApplicationHelper.tapButton(btnSignIn);
	}

	public static void signIn() {
		WelcomeHelper.openSignInScreen(WelcomeHelper.getSignInButton());
		MobileElement txtUsername = getUsernameField();
		MobileElement txtPassword = getPasswordField();
		MobileElement btnSignIn = getSignInButton();
		inputUsername(txtUsername, ElementDeclaration.strUsername);
		inputPassword(txtPassword, ElementDeclaration.strPassword);
		ApplicationHelper.tapButton(btnSignIn);
		System.out.println("Feed screen is displayed");
	}

	public static void tapOnBackButton(MobileElement btnBack) {
		System.out.println("Prepare back to Welcome screen...");
		ApplicationHelper.tapButton(btnBack);
		System.out.println("Back to Welcome screen successfully");
	}

	public static void tapOnForgotPassword(MobileElement btnForgotPassword) {
		ApplicationHelper.tapButton(btnForgotPassword);
		System.out.println("Open Forgot Password screen successfully");
	}

	public static void confirmAlertPopup(MobileElement btnConfirm) {
		ApplicationHelper.tapButton(btnConfirm);
		System.out.println("Alert! Log in unsuccessfully");
	}
}
