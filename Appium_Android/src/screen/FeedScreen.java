package screen;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.ApplicationHelper;
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
	}

	// The annotated method will be run after all the test methods belonging to the
	// classes inside the tag have run.
	@AfterTest
	public void setUpAfterTest() throws Exception {
		// quit app
		screen.quitApp();
	}

	// The annotated method will be run before each test method.
	@BeforeMethod
	public void setUpBeforeMethod() throws Exception {
		// sign in if necessary
		screen.signIn();
	}

	// The annotated method will be run after each test method.
	@AfterMethod
	public void setUpAfterMethod() throws Exception {
		// log out if necessary
		screen.logOut();
	}

	// VERIFY UI FEED SCREEN
	@Test(priority = 1)
	public void verifyFeedScreenIsDisplayed() throws Exception {
		screen.verifyUIFeedScreen();
	}

	@Test(priority = 2)
	public void verifyBlackTipsPanelIsDisplayedWhenTapOnPostLabel() throws Exception {
		screen.tapOnPostLabelToOpenInputStatusPanel();

		screen.verifyBlackTipsPanelIsDisplayed();

		screen.tapOnXIconToCloseBlackTipsPanel();
	}

	@Test(priority = 3)
	public void verifyInputStatusPanelIsDisplayedAtTheFirstTime() throws Exception {
		screen.tapOnPostLabelToOpenInputStatusPanel();
		screen.tapOnXIconToCloseBlackTipsPanel();

		screen.verifyInputStatusPanelIsDisplayed();
	}
	
	@Test(priority = 4)
	public void verifyBlackTipsPanelNotDisplayedWhenCheckedDontShowAgain() throws Exception {
		screen.tapOnPostLabelToOpenInputStatusPanel();
		screen.checkedDontShowAgain();

		screen.verifyBlackTipsPanelNotDisplayedAnymore();
	}
	
	@Test(priority = 5)
	public void verifyInputStatusPanelIsDisplayedWhenTapOnPostLabel() throws Exception {
		screen.tapOnPostLabelToOpenInputStatusPanel();

		screen.verifyInputStatusPanelIsDisplayed();
	}

	// VERIFY FUNCTIONAL SIGN IN SCREEN
	// User should be able to sign in with valid credentials
	@Test(priority = 6)
	public void signInWithValidCredentials() {

	}

	class Screen {
		public void launchApp() throws Exception {
			ApplicationHelper.launchApp();
		}

		public void quitApp() throws Exception {
			ApplicationHelper.quitApp();
		}

		public void signIn() throws Exception {
			SignInHelper.signIn();
			getElementsFeedScreen();
		}

		public void logOut() throws Exception {
			FeedHelper.logOut(iconLeftMenu);
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

		public void tapOnPostLabelToOpenInputStatusPanel() throws Exception {
			ApplicationHelper.tapButton(lbPost);
			getElementsBlackTipsBox();
		}

		public void tapOnXIconToCloseBlackTipsPanel() throws Exception {
			ApplicationHelper.tapButton(iconClose);
			getElementsInputStatusPanel();
		}
		
		public void checkedDontShowAgain() throws Exception {
			ApplicationHelper.tapButton(checkboxTips);
			getElementsBlackTipsBox();
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
		}

		public void verifyBlackTipsPanelNotDisplayedAnymore() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(lbHintTips);
			System.out.println("Verify Black tips panel is not displayed anymore after checked Dont show again!!!");
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
	// Post content panel
	MobileElement txtStatusContent;
	MobileElement lbNumberCharacter;
	MobileElement btnPost;
	MobileElement btnUploadPhoto;
	MobileElement btnUploadVideo;
	// Select groups post
	MobileElement iconGlobal;
	MobileElement lbSelectGroup;
	// Black tips panel
	MobileElement lbHintTips;
	MobileElement iconClose;
	MobileElement checkboxTips;
	// Activity Card
	MobileElement imgAvatar;
	MobileElement lbUsername;
	MobileElement lbAddress;
	MobileElement iconOption;
	MobileElement lbDateTime;
	MobileElement lbContentStatus;
	MobileElement lbTitleGroup;
	MobileElement lbContentGroup;
	MobileElement btnLike;
	MobileElement lbNumberLike;
	MobileElement btnComment;
	MobileElement lbNumberComment;
}
