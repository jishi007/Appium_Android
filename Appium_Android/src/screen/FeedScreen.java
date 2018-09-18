package screen;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.ActivityCardHelper;
import common.ApplicationHelper;
import common.ElementDeclaration;
import common.FeedHelper;
import common.SignInHelper;
import io.appium.java_client.MobileElement;

public class FeedScreen {
	// The annotated method will be run before any test method belonging to the
	// classes inside the <test> tag is run.
	@BeforeTest
	public void setUpBeforeTest() throws Exception {
		// launch app
		screen.launchApp();
		screen.signIn();
	}

	// The annotated method will be run after all the test methods belonging to the
	// classes inside the tag have run.
	@AfterTest
	public void setUpAfterTest() throws Exception {
		// quit app
		screen.logOut();
		screen.quitApp();
	}

	// The annotated method will be run before each test method.
	@BeforeMethod
	public void setUpBeforeMethod() throws Exception {
		// sign in if necessary

	}

	// The annotated method will be run after each test method.
	@AfterMethod
	public void setUpAfterMethod() throws Exception {
		// log out if necessary

	}

	// VERIFY UI FEED SCREEN
	@Test(priority = 1)
	public void verifyFeedScreenIsDisplayed() throws Exception {
		screen.verifyUIFeedScreen();
	}

	@Test(priority = 2)
	public void verifyBlackTipsPanelIsDisplayedWhenTapOnPostLabelAtTheFirstTime() throws Exception {
		screen.tapOnPostLabel();
		screen.getElementsBlackTipsBox();

		screen.verifyBlackTipsPanelIsDisplayed();
	}

	@Test(priority = 3)
	public void verifyBlackTipsPanelIsDisplayedWhenAtTheSecondTime() throws Exception {
		screen.tapOnPostLabel();

		screen.verifyBlackTipsPanelIsDisplayed();
	}

	@Test(priority = 4)
	public void verifyBlackTipsPanelNotDisplayedWhenCheckedDontShowAgain() throws Exception {
		screen.tapOnPostLabel();
		screen.checkedDontShowAgain();
		screen.tapOnXIconToCloseBlackTipsPanel();
		screen.openFeedScreen();
		screen.tapOnPostLabel();

		screen.verifyBlackTipsPanelNotDisplayedAnymore();
	}

	@Test(priority = 5)
	public void verifyInputStatusPanelIsDisplayeAfterCheckDontShowAgain() throws Exception {
		screen.tapOnPostLabel();
		screen.getElementsInputStatusPanel();

		screen.verifyInputStatusPanelIsDisplayed();
	}

	// VERIFY FUNCTIONAL SIGN IN SCREEN
	// User should be able to sign in with valid credentials
	@Test(priority = 6)
	public void verifyPostButtonIsDisableWWithEmptyContent() throws Exception {
		screen.tapOnPostLabel();
		screen.inputContentStatus(ElementDeclaration.strInvalidStatusPost);

		screen.verifyPostButtonIsDisable();
	}

	@Test(priority = 7)
	public void postStatus() throws Exception {
		screen.tapOnPostLabel();
		screen.inputContentStatus(ElementDeclaration.strStatusPost);
		screen.tapOnPostButton();

		screen.verifyPostText();
	}

	@Test(priority = 8)
	public void likePost() throws Exception {
		screen.tapOnLikeButton();

		screen.verifyLikePost();
	}

	@Test(priority = 9)
	public void unLikePost() throws Exception {
		screen.tapOnLikeButton();

		screen.verifyUnLikePost();
	}

	@Test(priority = 10)
	public void commentPost() throws Exception {
		screen.tapOnCommentButton();
		screen.inputContentComment(ElementDeclaration.strComment);
		screen.tapOnPostCommentButton();

		screen.verifyComment();
	}

//	@Test(priority = 8)
//	public void postPicture() throws Exception {
//		screen.tapOnPostLabel();
//		screen.inputContentStatus(ElementDeclaration.strStatusPost);
//		screen.takePhoto();
//		screen.tapOnPostButton();
//
//		screen.verifyPostPicture();
//	}
//	
//	@Test(priority = 9)
//	public void postVideo() throws Exception {
//		screen.tapOnPostLabel();
//		screen.inputContentStatus(ElementDeclaration.strStatusPost);
//		screen.recordVideo();
//		screen.tapOnPostButton();
//
//		screen.verifyPostVideo();
//	}

	class Screen {
		public void launchApp() throws Exception {
			ApplicationHelper.launchApp();
		}

		public void quitApp() throws Exception {
			ApplicationHelper.quitApp();
		}

		public void signIn() throws Exception {
			SignInHelper.signIn();
			getElementsLeftMenu();
			getElementsFeedScreen();
		}

		public void logOut() throws Exception {
			FeedHelper.logOut();
		}

		public void openFeedScreen() throws Exception {
			FeedHelper.openFeedScreen();
			tapOnRecentTab();
		}

		public void openLeftMenu() throws Exception {
			FeedHelper.openLeftMenu();
		}

		public void tapOnRecentTab() throws Exception {
			FeedHelper.tapOnRecentTab(btnRecentTab);
		}

		public void getElementsFeedScreen() throws Exception {
			lbFeedTitle = FeedHelper.getFeedTitle();
			iconLeftMenu = FeedHelper.getLeftMenuIcon();
			// iconNumberNotification = FeedHelper.getNumberNotification();
			iconChat = FeedHelper.getChatIcon();
			// iconNumberConversation = FeedHelper.getNumberConversation();
			btnPopularTab = FeedHelper.getPopularTab();
			btnRecentTab = FeedHelper.getRecentTab();
			btnFollowingTab = FeedHelper.getFollowingTab();
			// btnSocialTab = FeedHelper.getSocialTab();
			iconCamera = FeedHelper.getCameraIcon();
			lbAddToConversation = FeedHelper.getHintAddToConversation();
			lbPost = FeedHelper.getPostLabel();
			System.out.println("Get elements Feed screen");
		}

		public void getElementsLeftMenu() throws Exception {
			openLeftMenu();
			lbUsernameLeftMenu = FeedHelper.getUsernameLeftMenu();
			strUsername = lbUsernameLeftMenu.getText();
			btnFeedMenu = FeedHelper.getFeedMenu();
			System.out.println("Get elements Left menu");
			FeedHelper.tapOnFeedMenu(btnFeedMenu);
		}

		public void verifyUIFeedScreen() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(lbFeedTitle);
			System.out.println("Feed title is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(iconLeftMenu);
			System.out.println("Left menu icon is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(iconChat);
			System.out.println("Chat icon is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(btnPopularTab);
			System.out.println("Popular tab is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(btnRecentTab);
			System.out.println("Recent tab is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(btnFollowingTab);
			System.out.println("Following tab is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(iconCamera);
			System.out.println("Camera icon is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(lbAddToConversation);
			System.out.println("Text 'Add To Conversation' is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(lbPost);
			System.out.println("Post label is displayed!!!");
			System.out.println("Verify Feed screen is displayed!!!");
		}

		public void getElementsActivityCardTypeText() throws Exception {
			lbUsername = ActivityCardHelper.getUsernameDisplay();
			lbDateTime = ActivityCardHelper.getDateTimeLable();
			lbContentStatus = ActivityCardHelper.getContentStatus();
			while (!ActivityCardHelper.getLikeButton().isDisplayed()) {
				ApplicationHelper.scrollDown();
				break;
			}
			btnComment = ActivityCardHelper.getCommentButton();
			btnLike = ActivityCardHelper.getLikeButton();
		}

		public void getElementsCommentCard() throws Exception {
			boolean isDisplayedContent = ActivityCardHelper.getContentComment().isDisplayed();
			String strRighNow = ActivityCardHelper.getDateTimeComment().getText();
			while (!isDisplayedContent && strDateTime == strRighNow) {
				ApplicationHelper.scrollUp();
				break;
			}
			lbUsernameComment = ActivityCardHelper.getUsernameComment();
			lbDateTimeComment = ActivityCardHelper.getDateTimeComment();
			lbContentComment = ActivityCardHelper.getContentComment();
			btnLikeComment = ActivityCardHelper.getLikeCommentButton();
			System.out.println("Get elements Comment card");
		}

		public void getElementsActivityCardTypeImage() throws Exception {
			lbUsername = ActivityCardHelper.getUsernameDisplay();
			lbContentStatus = ActivityCardHelper.getContentStatus();
			imgPictureVideoPost = ActivityCardHelper.getPictureVideoPost();
		}

		public void getElementsActivityCardTypeVideo() throws Exception {
			lbUsername = ActivityCardHelper.getUsernameDisplay();
			lbContentStatus = ActivityCardHelper.getContentStatus();
			imgPictureVideoPost = ActivityCardHelper.getPictureVideoPost();
			iconPlayVideo = ActivityCardHelper.getPlayVideoIcon();
		}

		public void inputContentStatus(String strStatusPost) throws Exception {
			FeedHelper.inputContent(txtStatusContent, strStatusPost);
			System.out.println("Input content status: " + strStatusPost);
		}

		public void inputContentComment(String strComment) throws Exception {
			FeedHelper.inputContent(txtComment, strComment);
			System.out.println("Input content status: " + strComment);
		}

		public void takePhoto() throws Exception {
			FeedHelper.takePhoto(btnUploadPhoto);
		}

		public void recordVideo() throws Exception {
			FeedHelper.recordVideo(btnUploadVideo);
		}

		public void tapOnPostButton() throws Exception {
			FeedHelper.tapOnPostButton(btnPost);
		}

		public void verifyPostButtonIsDisable() throws Exception {
			ApplicationHelper.checkElementIsDisable(btnPost);
			System.out.println("Post button is disable");
		}

		public void tapOnCommentButton() throws Exception {
			FeedHelper.tapOnCommentButton(btnComment);
			txtComment = ActivityCardHelper.getCommentInputField();
			btnPostComment = ActivityCardHelper.getPostCommentButton();
		}

		public void tapOnPostCommentButton() throws Exception {
			FeedHelper.tapOnCommentButton(btnPostComment);
		}

		public void verifyComment() throws Exception {
			getElementsCommentCard();
			btnBackFromActivityDetail = ActivityCardHelper.getBackButton();
			Assert.assertEquals(lbUsernameComment.getText(), strUsername);
			Assert.assertEquals(lbDateTimeComment.getText(), strDateTime);		
			Assert.assertEquals(lbContentComment.getText(), ElementDeclaration.strComment);
			System.out.println("Comment status successfully");
			ActivityCardHelper.tapOnLikeComment(btnLikeComment);
			Assert.assertEquals(btnLikeComment.getText(), "Unlike");
			System.out.println("Like comment successfully");
			ActivityCardHelper.tapOnLikeComment(btnLikeComment);
			Assert.assertEquals(btnLikeComment.getText(), "Like");
			System.out.println("Unlike comment successfully");
			ActivityCardHelper.tapOnBackButton(btnBackFromActivityDetail);
		}

		public void tapOnLikeButton() throws Exception {
			FeedHelper.tapOnLikeButton(btnLike);
		}

		public void verifyLikePost() throws Exception {
			Assert.assertTrue(btnLike.isSelected());
			System.out.println("Like post successfully");
		}

		public void verifyUnLikePost() throws Exception {
			Assert.assertFalse(btnLike.isSelected());
			System.out.println("Un-like post successfully");
		}

		public void verifyPostText() throws Exception {
			getElementsActivityCardTypeText();
			isDisplay = ApplicationHelper.waitUtilElementIsDisplayed(lbContentStatus, 10);
			if (!isDisplay) {
				Assert.assertEquals(ElementDeclaration.strStatusPost, lbContentStatus.getText());
				Assert.assertEquals(strUsername, lbUsername.getText());
				Assert.assertEquals(strDateTime, lbDateTime.getText());
			}
			System.out.println("Post status successfully");
		}

		public void verifyPostPicture() throws Exception {
			getElementsActivityCardTypeImage();
			isDisplay = ApplicationHelper.waitUtilElementIsDisplayed(lbUsername, 10);
			if (!isDisplay) {
				Assert.assertEquals(strUsername, lbUsername.getText());
			}
			isDisplay = ApplicationHelper.waitUtilElementIsDisplayed(lbContentStatus, 10);
			if (!isDisplay) {
				Assert.assertEquals(ElementDeclaration.strStatusPost, lbContentStatus.getText());
			}
			isDisplay = ApplicationHelper.waitUtilElementIsDisplayed(imgPictureVideoPost, 20);
			if (!isDisplay) {
				Assert.assertNotNull(imgPictureVideoPost);
			}
			System.out.println("Post picture successfully");
		}

		public void verifyPostVideo() throws Exception {
			getElementsActivityCardTypeVideo();
			isDisplay = ApplicationHelper.waitUtilElementIsDisplayed(lbUsername, 10);
			if (!isDisplay) {
				Assert.assertEquals(strUsername, lbUsername.getText());
			}
			isDisplay = ApplicationHelper.waitUtilElementIsDisplayed(lbContentStatus, 10);
			if (!isDisplay) {
				Assert.assertEquals(ElementDeclaration.strStatusPost, lbContentStatus.getText());
			}
			isDisplay = ApplicationHelper.waitUtilElementIsDisplayed(imgPictureVideoPost, 20);
			if (!isDisplay) {
				Assert.assertNotNull(imgPictureVideoPost);
			}
			isDisplay = ApplicationHelper.waitUtilElementIsDisplayed(iconPlayVideo, 10);
			if (!isDisplay) {
				Assert.assertNotNull(iconPlayVideo);
			}
			System.out.println("Post picture successfully");
		}

		public void tapOnPostLabel() throws Exception {
			FeedHelper.openInputStatusPanel(lbPost);
		}

		public void tapOnXIconToCloseBlackTipsPanel() throws Exception {
			ApplicationHelper.tapButton(iconClose);
			getElementsInputStatusPanel();
		}

		public void checkedDontShowAgain() throws Exception {
			ApplicationHelper.tapButton(checkboxTips);
		}

		public void getElementsBlackTipsBox() throws Exception {
			lbHintTips = FeedHelper.getHintTipsPanel();
			iconClose = FeedHelper.getCloseIcon();
			checkboxTips = FeedHelper.getCheckboxTips();
		}

		public void verifyBlackTipsPanelIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(lbHintTips);
			System.out.println("Hint text is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(iconClose);
			System.out.println("X icon is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(checkboxTips);
			System.out.println("Checkbox 'Dont show again' is displayed!!!");
			System.out.println("Verify Black tips panel is displayed!!!");
			tapOnXIconToCloseBlackTipsPanel();
			openFeedScreen();
		}

		public void verifyBlackTipsPanelNotDisplayedAnymore() throws Exception {
			ApplicationHelper.checkElementIsNotDisplayed(lbHintTips);
			System.out.println("Verify Black tips panel is not displayed anymore after checked Dont show again!!!");
			openFeedScreen();
		}

		public void getElementsInputStatusPanel() throws Exception {
			txtStatusContent = FeedHelper.getInputStatusField();
			lbNumberCharacter = FeedHelper.getNumberOfCharacter();
			btnPost = FeedHelper.getPostButton();
			btnUploadPhoto = FeedHelper.getUploadPhotoButton();
			btnUploadVideo = FeedHelper.getUploadVideoButton();
			lbSelectGroup = FeedHelper.getSelectGroupLabel();
			iconGlobal = FeedHelper.getGlobalImage();
		}

		public void verifyInputStatusPanelIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(txtStatusContent);
			System.out.println("Input content field is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(lbNumberCharacter);
			System.out.println("The number of limit character is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(btnPost);
			System.out.println("Post button is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(btnUploadPhoto);
			System.out.println("Upload photo button is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(btnUploadVideo);
			System.out.println("Upload video button is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(lbSelectGroup);
			System.out.println("Select group box is displayed!!!");
			System.out.println("Verify Input status field is displayed!!!");
			openFeedScreen();
		}
	}

	private Screen screen = new Screen();

	// Feed screen
	MobileElement lbFeedTitle;
	MobileElement iconLeftMenu;
	MobileElement iconNumberNotification;
	MobileElement iconChat;
	MobileElement iconNumberConversation;
	MobileElement btnPopularTab;
	MobileElement btnRecentTab;
	MobileElement btnFollowingTab;
	MobileElement btnSocialTab;
	MobileElement iconCamera;
	MobileElement lbAddToConversation;
	MobileElement lbPost;
	// Left menu
	MobileElement lbUsernameLeftMenu;
	MobileElement btnFeedMenu;
	// Post content panel
	MobileElement txtStatusContent;
	MobileElement lbNumberCharacter;
	MobileElement btnPost;
	MobileElement btnUploadPhoto;
	MobileElement btnUploadVideo;
	// Upload Photo/ Video
	MobileElement btnTakePhotoVideo;
	MobileElement btnChoosePhotoVideo;
	MobileElement btnCancelUpload;
	MobileElement btnTakePhotoVideoDevice;
	MobileElement btnDoneTakePhotoVideoDevice;
	MobileElement btnSavePhotoVideo;
	MobileElement btnTrimVideoDone;
	// Select groups post
	MobileElement iconGlobal;
	MobileElement lbSelectGroup;
	// Black tips panel
	MobileElement lbHintTips;
	MobileElement iconClose;
	MobileElement checkboxTips;
	// Activity Card
	MobileElement btnBackFromActivityDetail;
	MobileElement imgAvatar;
	MobileElement lbUsername;
	MobileElement lbAddress;
	MobileElement iconOption;
	MobileElement lbDateTime;
	MobileElement lbContentStatus;
	MobileElement imgPictureVideoPost;
	MobileElement iconPlayVideo;
	MobileElement lbTitleGroup;
	MobileElement lbContentGroup;
	MobileElement btnLike;
	MobileElement lbNumberLike;
	MobileElement btnComment;
	MobileElement lbNumberComment;
	// Comment card
	MobileElement lbUsernameComment;
	MobileElement lbDateTimeComment;
	MobileElement txtComment;
	MobileElement btnPostComment;
	MobileElement btnLikeComment;
	MobileElement lbContentComment;

	String strUsername;
	String strDateTime = "Right now";
	String strComment;
	boolean isDisplay = true;
}
