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
	public void setUpBeforeTest() {
		// launch app
		screen.launchApp();
		screen.signIn();
	}

	// The annotated method will be run after all the test methods belonging to the
	// classes inside the tag have run.
	@AfterTest
	public void setUpAfterTest() {
		// quit app
		screen.quitApp();
	}

	// The annotated method will be run before each test method.
	@BeforeMethod
	public void setUpBeforeMethod() {
		// sign in if necessary

	}

	// The annotated method will be run after each test method.
	@AfterMethod
	public void setUpAfterMethod() {
		// log out if necessary
	}

	// VERIFY UI FEED SCREEN
	@Test(priority = 1)
	public void verifyFeedScreenIsDisplayed() {
		screen.verifyUIFeedScreen();
	}
	
	@Test(priority = 2)
	public void verifyInputStatusPanelIsDisplayedWhenTapOnPostLabel() {
		screen.verifyUIFeedScreen();
	}

	// VERIFY FUNCTIONAL SIGN IN SCREEN
	// User should be able to sign in with valid credentials
	@Test(priority = 3)
	public void signInWithValidCredentials() {

	}

	class Screen {
		public void launchApp() {
			try {
				ApplicationHelper.launchApp();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		public void quitApp() {
			try {
				ApplicationHelper.quitApp();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		public void signIn() {
			SignInHelper.signIn();
		}

		public void getElementsFeedScreen() {
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

		public void checkFeedTitleIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(lbFeedTitle);
		}

		public void checkLeftMenuIconIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(iconLeftMenu);
		}

		public void checkChatIconIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(iconChat);
		}

		public void checkPopularTabIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(btnPopularTab);
		}

		public void checkRecentTabIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(btnRecentTab);
		}

		public void checkFollowingTabIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(btnFollowingTab);
		}

		public void checkCameraIconIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(iconCamera);
		}

		public void checkHintAddToConversationIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(lbAddToConversation);
		}

		public void checkPostLabelIsDisplayed() {
			ApplicationHelper.checkElementIsDisplayed(lbPost);
		}

		public void verifyUIFeedScreen() {
			checkFeedTitleIsDisplayed();
			checkLeftMenuIconIsDisplayed();
			checkChatIconIsDisplayed();
			checkPopularTabIsDisplayed();
			checkRecentTabIsDisplayed();
			checkFollowingTabIsDisplayed();
			checkCameraIconIsDisplayed();
			checkHintAddToConversationIsDisplayed();
			checkPostLabelIsDisplayed();
			System.out.println("Verify UI Feed screen");
		}
		
		public void tapOnPostLabel() {
			ApplicationHelper.tapButton(lbPost);
		}
		
		public void getElementsBlackTipsBox() {
			
		}
		
		public void verifyInputStatusPanelIsDisplayed() {
			lbHintTips = FeedHelper.getHintTipsPanel();
			iconClose = FeedHelper.getCloseIcon();
			checkboxTips = FeedHelper.getCheckboxTips();
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
