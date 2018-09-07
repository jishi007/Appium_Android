package common;

import io.appium.java_client.MobileElement;

public class SignInHelper {
	public static MobileElement getSignInTitle() {
		return ApplicationHelper.getElement(ElementDeclaration.TITLE_TEXT_VIEW_SIGNIN);
	}

	public static MobileElement getUsernameField() {
		return ApplicationHelper.getElement(ElementDeclaration.USERNAME_TEXT_FIELD_SIGNIN);
	}

	public static MobileElement getPasswordField() {
		return ApplicationHelper.getElement(ElementDeclaration.PASSWORD_TEXT_FIELD_SIGNIN);
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
	
	public static void inputUsername(MobileElement txtUsername, String strUsername) {
		ApplicationHelper.enterValidCredential(txtUsername, strUsername);
	}

	public static void inputPassword(MobileElement txtPassword, String strPassword) {
		ApplicationHelper.enterValidCredential(txtPassword, strPassword);
	}

	public static void tapOnSignInButton(MobileElement btnSignIn) {
		ApplicationHelper.tapButton(btnSignIn);
	}

	public static void tapOnBackButton(MobileElement btnBack) {
		System.out.println("Prepare back to welcome screen...");
		ApplicationHelper.tapButton(btnBack);
		System.out.println("Back to Welcome screen successfully");
	}
}
