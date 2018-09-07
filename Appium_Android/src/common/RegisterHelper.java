package common;

import io.appium.java_client.MobileElement;

public class RegisterHelper {
	public static MobileElement getRegisterTitle() {
		return ApplicationHelper.getElement(ElementDeclaration.TITLE_TEXT_VIEW_REGISTER);
	}

	public static MobileElement getBackButton() {
		return ApplicationHelper.getElement(ElementDeclaration.BACK_BUTTON_REGISTER);
	}

	public static void tapOnBackButton(MobileElement btnBack) {
		System.out.println("Prepare back to welcome screen...");
		ApplicationHelper.tapButton(btnBack);
		System.out.println("Back to Welcome screen successfully");
	}
}
