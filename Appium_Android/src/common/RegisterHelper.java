package common;

import io.appium.java_client.MobileElement;

public class RegisterHelper {
	public static MobileElement getRegisterTitle() throws Exception {
		try {
			return ApplicationHelper.getElement(ElementDeclaration.TITLE_REGISTER);
		} catch (Exception e) {
			throw new Exception("Error! Element not found!!!", e);
		}
	}

	public static MobileElement getBackButton() throws Exception {
		try {
			return ApplicationHelper.getElement(ElementDeclaration.BACK_BUTTON_REGISTER);
		} catch (Exception e) {
			throw new Exception("Error! Element not found!!!", e);
		}
	}

	public static void tapOnBackButton(MobileElement btnBack) throws Exception {
		System.out.println("Prepare back to welcome screen...");
		ApplicationHelper.tapButton(btnBack);
		System.out.println("Back to Welcome screen successfully");
	}
}
