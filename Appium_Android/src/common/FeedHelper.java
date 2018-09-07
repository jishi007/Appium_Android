package common;

import io.appium.java_client.MobileElement;

public class FeedHelper {
	public static MobileElement getFeedTitle() {
		return ApplicationHelper.getElement(ElementDeclaration.TITLE_FEED);
	}

	public static MobileElement getLeftMenuIcon() {
		return ApplicationHelper.getElement(ElementDeclaration.LEFT_MENU_BUTTON);
	}
	
	public static MobileElement getNumberNotification() {
		return ApplicationHelper.getElement(ElementDeclaration.NOTIFICATION_NUMBER_FEED);
	}
	
	public static MobileElement getChatIcon() {
		return ApplicationHelper.getElement(ElementDeclaration.CHAT_BUTTON_FEED);
	}
	
	public static MobileElement getNumberConversation() {
		return ApplicationHelper.getElement(ElementDeclaration.CONVERSATION_NUMBER_FEED);
	}
	
	public static MobileElement getPopularTab() {
		return ApplicationHelper.getElement(ElementDeclaration.POPULAR_TAB);
	}
	
	public static MobileElement getRecentTab() {
		return ApplicationHelper.getElement(ElementDeclaration.RECENT_TAB);
	}
	
	public static MobileElement getFollowingTab() {
		return ApplicationHelper.getElement(ElementDeclaration.FOLLOWING_TAB);
	}
	
	public static MobileElement getSocialTab() {
		return ApplicationHelper.getElement(ElementDeclaration.SOCIAL_TAB);
	}
	
	public static MobileElement getCameraIcon() {
		return ApplicationHelper.getElement(ElementDeclaration.CAMERA_ICON_FEED);
	}
	
	public static MobileElement getHintAddToConversation() {
		return ApplicationHelper.getElement(ElementDeclaration.HINT_TEXT_ADD_TO_CONVERSATION_FEED);
	}
	
	public static MobileElement getPostLabel() {
		return ApplicationHelper.getElement(ElementDeclaration.LABEL_POST_BUTTON);
	}
	
	public static MobileElement getInputStatusField() {
		return ApplicationHelper.getElement(ElementDeclaration.INPUT_CONTENT_STATUS_FIELD);
	}
	
	public static MobileElement getNumberOfCharacter() {
		return ApplicationHelper.getElement(ElementDeclaration.NUMBER_OF_CHARACTER);
	}
	
	public static MobileElement getPostButton() {
		return ApplicationHelper.getElement(ElementDeclaration.POST_BUTTON);
	}
	
	public static MobileElement getUploadPhotoButton() {
		return ApplicationHelper.getElement(ElementDeclaration.UPLOAD_PHOTO_ICON);
	}
	
	public static MobileElement getUploadVideoButton() {
		return ApplicationHelper.getElement(ElementDeclaration.UPLOAD_VIDEO_ICON);
	}
	
	public static MobileElement getHintTipsPanel() {
		return ApplicationHelper.getElement(ElementDeclaration.HINT_TEXT_TIPS_PANEL);
	}
	
	public static MobileElement getCloseIcon() {
		return ApplicationHelper.getElement(ElementDeclaration.CLOSE_ICON_TIPS_PANEL);
	}
	
	public static MobileElement getCheckboxTips() {
		return ApplicationHelper.getElement(ElementDeclaration.CHECKBOX_TIPS_PANEL);
	}
	
	public static MobileElement getGlobalImage() {
		return ApplicationHelper.getElement(ElementDeclaration.GLOBAL_IMAGE_POST);
	}
	
	public static MobileElement getSelectGroupLabel() {
		return ApplicationHelper.getElement(ElementDeclaration.SELECT_GROUP_TEXT_VIEW_POST);
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

	public static void openLeftMenu(MobileElement iconLeftMenu) {
		ApplicationHelper.tapButton(iconLeftMenu);
		System.out.println("Open Left menu");
	}

	public static void openSettingMenu(MobileElement menuSetting) {
		ApplicationHelper.tapButton(menuSetting);
		System.out.println("Open Setting menu");
	}

	public static void signOut(MobileElement btnLogOut) {
		System.out.println("Prepare sign out...");
		ApplicationHelper.tapButton(btnLogOut);
		System.out.println("Log out successfully. Welcome screen is displayed");
	}

	public static void confirmSignOut(MobileElement btnOK) {
		System.out.println("Prepare sign out...");
		ApplicationHelper.tapButton(btnOK);
		System.out.println("Log out successfully. Welcome screen is displayed");
	}
}
