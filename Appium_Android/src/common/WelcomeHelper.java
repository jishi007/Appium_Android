package common;

import io.appium.java_client.MobileElement;

public class WelcomeHelper {
	public static MobileElement getLogoImage() {
		return ApplicationHelper.getElementByClass(ElementDeclaration.IMAGE_VIEW_WELCOME_FindByClass);
	}

	public static MobileElement getSignInButton() {
		return ApplicationHelper.getElement(ElementDeclaration.SIGNIN_BUTTON_WELCOME);
	}

	public static MobileElement getRegisterButton() {
		return ApplicationHelper.getElement(ElementDeclaration.REGISTER_BUTTON_WELCOME);
	}

	public static void openSignInScreen(MobileElement btnSignIn) {
		System.out.println("Prepare open Sign In screen...");
		ApplicationHelper.tapButton(btnSignIn);
		System.out.println("Open Sign In screen successfully");
	}

	public static void openRegisterScreen(MobileElement btnRegister) {
		System.out.println("Prepare open Register screen...");
		ApplicationHelper.tapButton(btnRegister);
		System.out.println("Open Register screen successfully");
	}

}
