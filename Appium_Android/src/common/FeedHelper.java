package common;

import java.util.List;

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
	
	public static MobileElement getSelectOtherGroupsLabel() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.SELECT_OTHER_GROUPS_TEXT_VIEW_POST);
	}
	
	public static MobileElement getGroupTypeLabel() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.GROUP_TYPE_LABEL);
	}
	
	public static MobileElement getGroupTypeCheckIcon() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.GROUP_TYPE_CHECK_ICON);
	}
	
	public static MobileElement getGroupTypeContainer() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.GROUP_TYPE_CONTAINER);
	}
	
	public static MobileElement getFeedTypeLabel() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.FEED_TYPE_LABEL);
	}
	
	public static MobileElement getFeedTypeCheckIcon() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.FEED_TYPE_CHECK_ICON);
	}
	
	public static MobileElement getFeedTypeContainer() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.FEED_TYPE_CONTAINER);
	}
	
	public static MobileElement getCancelbutton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.CANCEL_BUTTON);
	}
	
	public static MobileElement getDoneButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.DONE_BUTTON);
	}
	
	public static List<MobileElement> getListSpecificGroupsCheckIcon() throws Exception {
		return ApplicationHelper.getListElements(ElementDeclaration.SPECIFIC_GROUP_CHECK_ICON);
	}
	
	public static List<MobileElement> getListSpecificGroupsName() throws Exception {
		return ApplicationHelper.getListElements(ElementDeclaration.SPECIFIC_GROUP_NAME);
	}

	public static MobileElement getSettingMenu() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.SETTING_LEFT_MENU);
	}
	
	public static MobileElement getUsernameLeftMenu() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.USERNAME_LEFT_MENU);
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
	
	public static MobileElement getTakePhotoVideoButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.TAKE_PHOTO_VIDEO_BUTTON);
	}
	
	public static MobileElement getChoosePhotoVideoButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.CHOOSE_PHOTO_VIDEO_BUTTON);
	}
	
	public static MobileElement getCancelUploadButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.CANCEL_UPLOAD_PHOTO_VIDEO);
	}
	
	public static MobileElement getTakePhotoVideoDeviceButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.TAKE_PHOTO_VIDEO_BUTTON_DEVICE);
	}
	
	public static MobileElement getDoneTakePhotoVideoButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.TAKE_PHOTO_VIDEO_DONE_BUTTON_DEVICE);
	}
	
	public static MobileElement getSavePhotoVideoButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.SAVE_PHOTO_VIDEO_BUTTON);
	}
	
	public static MobileElement getTrimVideoDoneButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.TRIM_VIDEO_DONE_BUTTON);
	}
	
	public static void openInputStatusPanel() throws Exception {
		ApplicationHelper.tapButton(getPostLabel());
		System.out.println("Open Input Status panel");
	}
	
	public static void checkDontShowAgain() throws Exception {
		ApplicationHelper.tapButton(getCheckboxTips());
		ApplicationHelper.WaitToDo(1);
		System.out.println("Check Dont show again");
	}
	
	public static void closeBlackTipsBox() throws Exception {
		ApplicationHelper.tapButton(getCloseIcon());
		System.out.println("Close Black Tips Box");
	}

	public static void openLeftMenu() throws Exception {
		ApplicationHelper.tapButton(getLeftMenuIcon());
		System.out.println("Open Left menu");
	}
	
	public static void openFeedScreen() throws Exception {
		openLeftMenu();
		ApplicationHelper.tapButton(getFeedMenu());
		ApplicationHelper.WaitToDo(2);
		System.out.println("Open Feed screen");
	}
	
	public static void tapOnFeedMenu(MobileElement btnFeedMenu) throws Exception {
		ApplicationHelper.tapButton(btnFeedMenu);
		System.out.println("Open Feed screen");
	}
	
	public static void openRecentTab() throws Exception {
		ApplicationHelper.tapButton(getRecentTab());
		System.out.println("Open Recent tab");
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
	
	public static void inputContent(MobileElement txtInputStatusField, String strStatusPost) throws Exception {
		ApplicationHelper.inputTextField(txtInputStatusField, strStatusPost);
	}
	
	public static void tapOnPostButton(MobileElement btnPost) throws Exception {
		ApplicationHelper.tapButton(btnPost);
	}
	
	public static void tapOnLikeButton(MobileElement btnLike) throws Exception {
		ApplicationHelper.tapButton(btnLike);
		ApplicationHelper.WaitToDo(2);
	}
	
	public static void tapOnCommentButton(MobileElement btnComment) throws Exception {
		ApplicationHelper.tapButton(btnComment);
		ApplicationHelper.WaitToDo(1);
	}
	
	public static void tapOnSelectGroupsBox(MobileElement selectGroupBox) throws Exception {
		ApplicationHelper.tapButton(selectGroupBox);
		ApplicationHelper.WaitToDo(1);
	}
	
	public static void tapOnPostGroupType(MobileElement checkIcon) throws Exception {
		ApplicationHelper.tapButton(checkIcon);
		ApplicationHelper.WaitToDo(1);
	}
	
	public static void tapOnPostFeedType(MobileElement checkIcon) throws Exception {
		ApplicationHelper.tapButton(checkIcon);
		ApplicationHelper.WaitToDo(1);
	}
	
	public static void tapOnSpecificGroup(MobileElement checkIcon) throws Exception {
		ApplicationHelper.tapButton(checkIcon);
		ApplicationHelper.WaitToDo(1);
	}
	
	public static void tapOnCancelButton(MobileElement btnCancel) throws Exception {
		ApplicationHelper.tapButton(btnCancel);
		ApplicationHelper.WaitToDo(1);
	}
	
	public static void tapOnDoneButton(MobileElement btnDone) throws Exception {
		ApplicationHelper.tapButton(btnDone);
		ApplicationHelper.WaitToDo(1);
	}
	
	public static void takePhoto(MobileElement btnUploadPhoto) throws Exception {
		ApplicationHelper.tapButton(btnUploadPhoto);
		ApplicationHelper.tapButton(getTakePhotoVideoButton());
		ApplicationHelper.WaitToDo(5);
		ApplicationHelper.tapButton(getTakePhotoVideoDeviceButton());
		ApplicationHelper.WaitToDo(5);
		ApplicationHelper.tapButton(getDoneTakePhotoVideoButton());
		ApplicationHelper.tapButton(getSavePhotoVideoButton());
		System.out.println("Take new photo");
	}
	
	public static void recordVideo(MobileElement btnUploadVideo) throws Exception {
		ApplicationHelper.tapButton(btnUploadVideo);
		ApplicationHelper.tapButton(getTakePhotoVideoButton());
		ApplicationHelper.WaitToDo(1);
		ApplicationHelper.tapButton(getTakePhotoVideoDeviceButton());
		ApplicationHelper.WaitToDo(30);
		ApplicationHelper.tapButton(getTakePhotoVideoDeviceButton());
		ApplicationHelper.tapButton(getDoneTakePhotoVideoButton());
		ApplicationHelper.tapButton(getTrimVideoDoneButton());
		ApplicationHelper.WaitToDo(5);
		System.out.println("Record new video");
	}
}
