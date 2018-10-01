package common;

import io.appium.java_client.MobileElement;

public class ActivityCardHelper {
	public static MobileElement getAvatarUser() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.AVATAR_USER_AC);
	}

	public static MobileElement getUsernameDisplay() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.DISPLAY_USERNAME_AC);
	}

	public static MobileElement getAddressUser() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.ADDRESS_USERNAME_AC);
	}

	public static MobileElement getOptionIcon() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.OPTION_ICON_AC);
	}

	public static MobileElement getDateTimeLable() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.DATETIME_AC);
	}

	public static MobileElement getContentStatus() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.CONTENT_STATUS_AC);
	}
	
	public static MobileElement getPictureVideoPost() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.PICTURE_POST_AC);
	}
	
	public static MobileElement getPlayVideoIcon() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.PLAY_ICON_AC);
	}

	public static MobileElement getTitleGroup() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.TITLE_GROUP_AC);
	}

	public static MobileElement getContentGroup() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.CONTENT_GROUP_AC);
	}

	public static MobileElement getLikeButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.LIKE_BUTTON_AC);
	}

	public static MobileElement getNumberOfLike() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.NUMBER_OF_LIKE_AC);
	}

	public static MobileElement getCommentButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.COMMENT_BUTTON_AC);
	}

	public static MobileElement getNumberOfComment() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.NUMBER_OF_COMMENT_AC);
	}
	
	// Comment card
	public static MobileElement getUsernameComment() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.DISPLAY_USERNAME_COMMENT);
	}
	
	public static MobileElement getAvatarCommentDisplay() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.AVATAR_COMMENT);
	}
	
	public static MobileElement getDateTimeComment() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.DATETIME_COMMENT);
	}
	
	public static MobileElement getCommentInputField() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.INPUT_CONTENT_COMMENT_FIELD);
	}
	
	public static MobileElement getPostCommentButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.POST_COMMENT_BUTTON);
	}
	
	public static MobileElement getContentComment() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.CONTENT_COMMENT);
	}
	
	public static MobileElement getLikeCommentButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.LIKE_COMMENT_BUTTON);
	}
	
	public static MobileElement getBackButton() throws Exception {
		return ApplicationHelper.getElement(ElementDeclaration.BACK_BUTTON_DETAIL_AC);
	}
	
	public static void tapOnBackButton(MobileElement btnBack) throws Exception {
		ApplicationHelper.tapButton(btnBack);
		System.out.println("Back to previous screen");
	}
	
	public static void tapOnLikeComment() throws Exception {
		ApplicationHelper.tapButton(getLikeCommentButton());
		System.out.println("Tap on Like comment " + getLikeCommentButton().getText());
	}
}
