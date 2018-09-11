package common;

import io.appium.java_client.MobileElement;

public class WelcomeHelper {
	public static MobileElement getLogoImage() throws Exception {
		return ApplicationHelper.getElementByClass(ElementDeclaration.LOGO_WELCOME_FindByClass);
	}

	public static MobileElement getSignInButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.SIGNIN_BUTTON_WELCOME);
	}

	public static MobileElement getRegisterButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.REGISTER_BUTTON_WELCOME);
	}

	public static void openSignInScreen(MobileElement btnSignIn) throws Exception {
		System.out.println("Prepare open Sign In screen...");
		ApplicationHelper.tapButton(btnSignIn);
		System.out.println("Open Sign In screen successfully");
	}

	public static void openRegisterScreen(MobileElement btnRegister) throws Exception {
		System.out.println("Prepare open Register screen...");
		ApplicationHelper.tapButton(btnRegister);
		System.out.println("Open Register screen successfully");
	}

}
