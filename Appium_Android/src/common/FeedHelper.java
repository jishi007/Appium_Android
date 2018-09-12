package common;

import io.appium.java_client.MobileElement;

public class FeedHelper {
	public static MobileElement getFeedTitle() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.TITLE_FEED);
	}

	public static MobileElement getLeftMenuIcon() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.LEFT_MENU_BUTTON);
	}

	public static MobileElement getNumberNotification() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.NOTIFICATION_NUMBER_FEED);
	}

	public static MobileElement getChatIcon() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.CHAT_BUTTON_FEED);
	}

	public static MobileElement getNumberConversation() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.CONVERSATION_NUMBER_FEED);
	}

	public static MobileElement getPopularTab() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.POPULAR_TAB);
	}

	public static MobileElement getRecentTab() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.RECENT_TAB);
	}

	public static MobileElement getFollowingTab() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.FOLLOWING_TAB);
	}

	public static MobileElement getSocialTab() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.SOCIAL_TAB);
	}

	public static MobileElement getCameraIcon() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.CAMERA_ICON_FEED);
	}

	public static MobileElement getHintAddToConversation() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.HINT_TEXT_ADD_TO_CONVERSATION_FEED);
	}

	public static MobileElement getPostLabel() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.LABEL_POST_BUTTON);
	}

	public static MobileElement getInputStatusField() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.INPUT_CONTENT_STATUS_FIELD);
	}

	public static MobileElement getNumberOfCharacter() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.NUMBER_OF_CHARACTER);
	}

	public static MobileElement getPostButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.POST_BUTTON);
	}

	public static MobileElement getUploadPhotoButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.UPLOAD_PHOTO_ICON);
	}

	public static MobileElement getUploadVideoButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.UPLOAD_VIDEO_ICON);
	}

	public static MobileElement getHintTipsPanel() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.HINT_TEXT_TIPS_PANEL);
	}

	public static MobileElement getCloseIcon() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.CLOSE_ICON_TIPS_PANEL);
	}

	public static MobileElement getCheckboxTips() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.CHECKBOX_TIPS_PANEL);
	}

	public static MobileElement getGlobalImage() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.GLOBAL_IMAGE_POST);
	}

	public static MobileElement getSelectGroupLabel() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.SELECT_GROUP_TEXT_VIEW_POST);
	}

	public static MobileElement getSettingMenu() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.SETTING_LEFT_MENU);
	}	
	
	public static MobileElement getFeedMenu() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.FEED_LEFT_MENU);
	}

	public static MobileElement getLogOutButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.SIGNOUT_BUTTON_SETTING);
	}

	public static MobileElement getOKLogOutButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.CONFIRM_SIGNOUT_BUTTON_SETTING);
	}

	public static MobileElement getCancelLogOutButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.CANCEL_SIGNOUT_BUTTON_SETTING);
	}
	
	public static void openInputStatusPanel() throws Exception {
		ApplicationHelper.tapButton(getPostLabel());
		System.out.println("Open Input Status panel");
	}

	public static void openLeftMenu() throws Exception {
		ApplicationHelper.tapButton(getLeftMenuIcon());
		System.out.println("Open Left menu");
	}
	
	public static void openFeedScreen() throws Exception {
		openLeftMenu();
		ApplicationHelper.tapButton(getFeedMenu());
		System.out.println("Open Feed screen");
	}

	public static void openSettingScreen() throws Exception {
		ApplicationHelper.tapButton(getSettingMenu());
		System.out.println("Open Setting menu");
	}

	public static void tapOnLogOutButton() throws Exception {
		System.out.println("Prepare sign out...");
		ApplicationHelper.tapButton(getLogOutButton());
		System.out.println("Log out successfully. Welcome screen is displayed");
	}
	
	public static void logOut() throws Exception {
		openLeftMenu();		
		openSettingScreen();
		tapOnLogOutButton();
		confirmSignOut();
	}

	public static void confirmSignOut() throws Exception {
		System.out.println("Prepare sign out...");
		ApplicationHelper.tapButton(getOKLogOutButton());
		System.out.println("Log out successfully. Welcome screen is displayed");
	}
	
	public static void inputContentStatus(MobileElement txtInputStatusField, String strStatusPost) throws Exception {
		ApplicationHelper.enterValidCredential(txtInputStatusField, strStatusPost);
	}
	
	public static void tapOnPostButton(MobileElement btnPost) throws Exception {
		ApplicationHelper.tapButton(btnPost);
	}
}
