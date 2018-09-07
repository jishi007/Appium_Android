package common;

import io.appium.java_client.MobileElement;

public class ActivityCardHelper {
	public static MobileElement getAvatarUser() {
		return ApplicationHelper.getElement(ElementDeclaration.AVATAR_USER_AC);
	}
	
	public static MobileElement getUsernameDisplay() {
		return ApplicationHelper.getElement(ElementDeclaration.DISPLAY_USERNAME_AC);
	}
	
	public static MobileElement getAddressUser() {
		return ApplicationHelper.getElement(ElementDeclaration.ADDRESS_USERNAME_AC);
	}
	
	public static MobileElement getOptionIcon() {
		return ApplicationHelper.getElement(ElementDeclaration.OPTION_ICON_AC);
	}
	
	public static MobileElement getDateTimeLable() {
		return ApplicationHelper.getElement(ElementDeclaration.DATETIME_AC);
	}
	
	public static MobileElement getContentStatus() {
		return ApplicationHelper.getElement(ElementDeclaration.CONTENT_STATUS_AC);
	}
	
	public static MobileElement getTitleGroup() {
		return ApplicationHelper.getElement(ElementDeclaration.TITLE_GROUP_AC);
	}
	
	public static MobileElement getContentGroup() {
		return ApplicationHelper.getElement(ElementDeclaration.CONTENT_GROUP_AC);
	}
	
	public static MobileElement getLikeButton() {
		return ApplicationHelper.getElement(ElementDeclaration.LIKE_BUTTON_AC);
	}
	
	public static MobileElement getNumberOfLike() {
		return ApplicationHelper.getElement(ElementDeclaration.NUMBER_OF_LIKE_AC);
	}
	
	public static MobileElement getCommentButton() {
		return ApplicationHelper.getElement(ElementDeclaration.COMMENT_BUTTON_AC);
	}
	
	public static MobileElement getNumberOfComment() {
		return ApplicationHelper.getElement(ElementDeclaration.NUMBER_OF_COMMENT_AC);
	}
}
