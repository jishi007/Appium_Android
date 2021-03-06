package common;

public class ElementDeclaration {
	// Device Info
//	public static String deviceName = "Nexus 5";
//	public static String platformName = "Android";
//	public static String platformVersion = "6.0.1";
	
	public static String deviceName = "SM-G930P";
	public static String platformName = "Android";
	public static String platformVersion = "7.0";
	
	// App Info
	public static String appPackage = "com.anomo.bellevue.staging";
	public static String appActivity = "com.anomo.uclasocial.SplashScreen";

	// Element Info
	// Welcome screen
	public static String SIGNIN_BUTTON_WELCOME = "com.anomo.bellevue.staging:id/button_signin";
	public static String REGISTER_BUTTON_WELCOME = "com.anomo.bellevue.staging:id/button_register";
	public static String LOGO_WELCOME_FindByClass = "android.widget.ImageView";

	// Left menu
	public static String FEED_LEFT_MENU = "com.anomo.bellevue.staging:id/textview_menu_name_activity_feed";
	public static String USERNAME_LEFT_MENU = "com.anomo.bellevue.staging:id/textview_left_username";
	public static String SETTING_LEFT_MENU = "com.anomo.bellevue.staging:id/textview_menu_name_settings";

	// Setting screen
	public static String SIGNOUT_BUTTON_SETTING = "com.anomo.bellevue.staging:id/fragment_settings_btn_logout";
	public static String CONFIRM_SIGNOUT_BUTTON_SETTING = "com.anomo.bellevue.staging:id/btn_dialog_ok";
	public static String CANCEL_SIGNOUT_BUTTON_SETTING = "com.anomo.bellevue.staging:id/btn_dialog_cancel";

	// Sign In screen
	public static String TITLE_SIGNIN = "com.anomo.bellevue.staging:id/title";
	public static String USERNAME_FIELD_SIGNIN = "com.anomo.bellevue.staging:id/edittext_user_name";
	public static String PASSWORD_FIELD_SIGNIN = "com.anomo.bellevue.staging:id/edittext_password";
	public static String FORGOT_PASSWORD_BUTTON_SIGNIN = "com.anomo.bellevue.staging:id/button_forgot_password";
	public static String SIGNIN_BUTTON_SIGNIN = "com.anomo.bellevue.staging:id/button_sign_in";
	public static String BACK_BUTTON_SIGNIN = "com.anomo.bellevue.staging:id/button_back";
	public static String CONFIRM_INVALID_SIGNIN = "android:id/button1";
	// Alert pop up
	public static String ALERT_TITLE_SIGNIN = "android:id/alertTitle";
	public static String ALERT_MESSAGE_SIGNIN = "android:id/message";
	public static String ALERT_CONFIRM_SIGNIN = "android:id/button1";

	// Forgot Password screen
	public static String TITLE_FORGOT_PASSWORD = "com.anomo.bellevue.staging:id/title";
	public static String DESCRIPTION_FORGOT_PASSWORD = "com.anomo.bellevue.staging:id/textview_password_description";
	public static String EMAIL_FIELD_FORGOT_PASSWORD = "com.anomo.bellevue.staging:id/edittext_email";
	public static String SUBMIT_BUTTON_FORGOT_PASSWORD = "com.anomo.bellevue.staging:id/button_submit";
	public static String BACK_BUTTON_FORGOT_PASSWORD = "com.anomo.bellevue.staging:id/button_back";

	// Register screen
	public static String TITLE_REGISTER = "com.anomo.bellevue.staging:id/title";
	public static String BACK_BUTTON_REGISTER = "com.anomo.bellevue.staging:id/button_back";

	// Feed Screen
	public static String TITLE_FEED = "com.anomo.bellevue.staging:id/textview_title";
	public static String LEFT_MENU_BUTTON = "com.anomo.bellevue.staging:id/button_notification_left_menu";
	public static String NOTIFICATION_NUMBER_FEED = "com.anomo.bellevue.staging:id/textivew_notification_number";
	public static String CHAT_BUTTON_FEED = "com.anomo.bellevue.staging:id/button_open_conversation";
	public static String CONVERSATION_NUMBER_FEED = "com.anomo.bellevue.staging:id/textivew_conversation_number";
	public static String POPULAR_TAB = "com.anomo.bellevue.staging:id/button_popular";
	public static String RECENT_TAB = "com.anomo.bellevue.staging:id/button_recent";
	public static String FOLLOWING_TAB = "com.anomo.bellevue.staging:id/button_following";
	public static String SOCIAL_TAB = "com.anomo.bellevue.staging:id/button_social_media";
	public static String CAMERA_ICON_FEED = "com.anomo.bellevue.staging:id/image_attach_photo";
	public static String HINT_TEXT_ADD_TO_CONVERSATION_FEED = "com.anomo.bellevue.staging:id/textview_add_to_conversation";
	public static String LABEL_POST_BUTTON = "com.anomo.bellevue.staging:id/textview_post_top_bar";
	// Post content panel
	public static String INPUT_CONTENT_STATUS_FIELD = "com.anomo.bellevue.staging:id/txt_content_info";
	public static String NUMBER_OF_CHARACTER = "com.anomo.bellevue.staging:id/tv_number";
	public static String POST_BUTTON = "com.anomo.bellevue.staging:id/button_post";
	public static String UPLOAD_PHOTO_ICON = "com.anomo.bellevue.staging:id/image_attach_photo_post";
	public static String UPLOAD_VIDEO_ICON = "com.anomo.bellevue.staging:id/image_attach_video_post";
	// Select groups post
	public static String GLOBAL_IMAGE_POST = "com.anomo.bellevue.staging:id/iv_feed";
	public static String SELECT_GROUP_TEXT_VIEW_POST = "com.anomo.bellevue.staging:id/tv_select_group";
	public static String SELECT_OTHER_GROUPS_TEXT_VIEW_POST = "com.anomo.bellevue.staging:id/tv_other_groups";
	public static String TITLE_WHERE_TO_POST = "com.anomo.bellevue.staging:id/lbl_title";
	public static String CANCEL_BUTTON = "com.anomo.bellevue.staging:id/btn_cancel";
	public static String DONE_BUTTON = "com.anomo.bellevue.staging:id/btn_done";
	public static String GROUP_TYPE_CONTAINER = "com.anomo.bellevue.staging:id/group_container";
	public static String GROUP_TYPE_LABEL = "com.anomo.bellevue.staging:id/group_type";
	public static String GROUP_TYPE_CHECK_ICON = "com.anomo.bellevue.staging:id/ic_group_check";
	public static String FEED_TYPE_CONTAINER = "com.anomo.bellevue.staging:id/feed_container";
	public static String FEED_TYPE_LABEL = "com.anomo.bellevue.staging:id/feed_type";
	public static String FEED_TYPE_CHECK_ICON = "com.anomo.bellevue.staging:id/ic_feed_check";
	// Specific group screen
	public static String SPECIFIC_GROUP_NAME = "com.anomo.bellevue.staging:id/anomo_chk_title";
	public static String SPECIFIC_GROUP_CHECK_ICON = "com.anomo.bellevue.staging:id/anomo_chk_title";
	// Black tips panel
	public static String HINT_TEXT_TIPS_PANEL = "com.anomo.bellevue.staging:id/hint";
	public static String CLOSE_ICON_TIPS_PANEL = "com.anomo.bellevue.staging:id/close";
	public static String CHECKBOX_TIPS_PANEL = "com.anomo.bellevue.staging:id/dont_show";

	// Upload Photo/ Video
	public static String TAKE_PHOTO_VIDEO_BUTTON = "com.anomo.bellevue.staging:id/btn_take_photo";
	public static String TAKE_PHOTO_VIDEO_BUTTON_DEVICE = "com.android.camera2:id/photo_video_button";
	public static String TAKE_PHOTO_VIDEO_DONE_BUTTON_DEVICE = "com.android.camera2:id/done_button";
	public static String TRIM_VIDEO_DONE_BUTTON = "com.anomo.bellevue.staging:id/button_done";
	public static String SAVE_PHOTO_VIDEO_BUTTON = "com.anomo.bellevue.staging:id/button_save";
	public static String CHOOSE_PHOTO_VIDEO_BUTTON = "com.anomo.bellevue.staging:id/btn_choose_photo";
	public static String CANCEL_UPLOAD_PHOTO_VIDEO = "com.anomo.bellevue.staging:id/button_cancel_photo";

	// Activity card
	public static String BACK_BUTTON_DETAIL_AC = "com.anomo.bellevue.staging:id/button_back";
	public static String AVATAR_USER_AC = "com.anomo.bellevue.staging:id/ic_avatar";
	public static String DISPLAY_USERNAME_AC = "com.anomo.bellevue.staging:id/textview_username";
	public static String ADDRESS_USERNAME_AC = "com.anomo.bellevue.staging:id/textview_user_address";
	public static String OPTION_ICON_AC = "com.anomo.bellevue.staging:id/button_option";
	public static String DATETIME_AC = "com.anomo.bellevue.staging:id/txt_date_2";
	public static String CONTENT_STATUS_AC = "com.anomo.bellevue.staging:id/textview_post_status_content";
	public static String PICTURE_POST_AC = "com.anomo.bellevue.staging:id/img_post";
	public static String PLAY_ICON_AC = "com.anomo.bellevue.staging:id/imageview_play_youtube";
	public static String TITLE_GROUP_AC = "com.anomo.bellevue.staging:id/textview_stream_title";
	public static String CONTENT_GROUP_AC = "com.anomo.bellevue.staging:id/textview_stream_content";
	public static String LIKE_BUTTON_AC = "com.anomo.bellevue.staging:id/button_like";
	public static String NUMBER_OF_LIKE_AC = "com.anomo.bellevue.staging:id/textview_number_of_like";
	public static String COMMENT_BUTTON_AC = "com.anomo.bellevue.staging:id/button_comment";
	public static String NUMBER_OF_COMMENT_AC = "com.anomo.bellevue.staging:id/textview_number_of_comment";

	// Comment card
	public static String DISPLAY_USERNAME_COMMENT = "com.anomo.bellevue.staging:id/textview_username";
	public static String AVATAR_COMMENT = "com.anomo.bellevue.staging:id/ic_avatar";
	public static String DATETIME_COMMENT = "com.anomo.bellevue.staging:id/txt_date_2";
	public static String INPUT_CONTENT_COMMENT_FIELD = "com.anomo.bellevue.staging:id/edit_message_post";
	public static String POST_COMMENT_BUTTON = "com.anomo.bellevue.staging:id/btn_post_comment";
	public static String CONTENT_COMMENT = "com.anomo.bellevue.staging:id/txt_content_post";
	public static String LIKE_COMMENT_BUTTON = "com.anomo.bellevue.staging:id/textview_like_comment";

	// Element Valid Value
	public static String strUsername = "huskyguy@appzocial.com";
	public static String strPassword = "tennis";
	public static String strStatusPost = "Status Testing";
	public static String strComment = "Comment Testing";

	// Element Invalid Value
	public static String strInvalidUsername = "abc@xyz.com";
	public static String strInvalidPassword = "qwerty";
	public static String strInvalidStatusPost = "        ";
}
