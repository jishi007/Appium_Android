package common;

import io.appium.java_client.MobileElement;

public class FeedHelper {
	public static MobileElement getFeedTitle() {
		return ApplicationHelper.getElement(ElementDeclaration.TITLE_TEXT_VIEW_FEED);
	}
	
	public static MobileElement getLeftMenuIcon() {
		return ApplicationHelper.getElement(ElementDeclaration.LEFT_MENU_BUTTON);
	}
	
	public static MobileElement getSettingMenu() {
		return ApplicationHelper.getElement(ElementDeclaration.SETTING_LEFT_MENU);
	}
	
	public static MobileElement getLogOutButton() {
		return ApplicationHelper.getElement(ElementDeclaration.SIGNOUT_BUTTON_SETTING);
	}
	
	public static MobileElement getOKLogOutButton() {
		return ApplicationHelper.getElement(ElementDeclaration.CONFIRM_SIGNOUT_BUTTON_SETTING);
	}
	
	public static MobileElement getCancelLogOutButton() {
		return ApplicationHelper.getElement(ElementDeclaration.CANCEL_SIGNOUT_BUTTON_SETTING);
	}
	
	public static void signOut() {
		System.out.println("Prepare sign out...");		
		MobileElement iconLeftMenu = getLeftMenuIcon();
		ApplicationHelper.tapButton(iconLeftMenu);
		MobileElement menuSetting = getSettingMenu();
		ApplicationHelper.tapButton(menuSetting);
		MobileElement btnLogOut = getLogOutButton();
		ApplicationHelper.tapButton(btnLogOut);
		MobileElement btnOK = getOKLogOutButton();
		ApplicationHelper.tapButton(btnOK);
		System.out.println("Log out successfully. Welcome screen is displayed");
	}
}
