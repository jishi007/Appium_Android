package common;

import io.appium.java_client.MobileElement;

public class ForgotPasswordHelper {
	public static MobileElement getForgotPasswordTitle() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.TITLE_FORGOT_PASSWORD);
	}

	public static MobileElement getDescription() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.DESCRIPTION_FORGOT_PASSWORD);
	}

	public static MobileElement getEmailField() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.EMAIL_FIELD_FORGOT_PASSWORD);
	}

	public static MobileElement getSubmitButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.SUBMIT_BUTTON_FORGOT_PASSWORD);
	}

	public static MobileElement getBackButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.BACK_BUTTON_FORGOT_PASSWORD);
	}

	public static void tapOnBackButton(MobileElement btnBack) throws Exception {
		System.out.println("Prepare back to Sign In screen...");
		ApplicationHelper.tapButton(btnBack);
		System.out.println("Back to Sign In screen successfully");
	}
}
