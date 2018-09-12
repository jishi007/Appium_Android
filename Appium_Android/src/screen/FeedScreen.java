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
	public void createValidNewPostText() throws Exception {
		screen.tapOnPostLabel();
		screen.inputContentStatus(ElementDeclaration.strStatusPost);
		screen.tapOnPostPostButton();
		
		screen.verifyPostText();
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
			FeedHelper.logOut();
		}
		
		public void openFeedScreen() throws Exception {
			FeedHelper.openFeedScreen();
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
		
		public void getElementsActivityCard() throws Exception {
			lbContentStatus = ActivityCardHelper.getContentStatus();
		}
		
		public void inputContentStatus(String strStatusPost) throws Exception {
			FeedHelper.inputContentStatus(txtStatusContent, strStatusPost);
			System.out.println("Input content status: " + strStatusPost);
		}
		
		public void tapOnPostPostButton() throws Exception {
			FeedHelper.tapOnPostButton(btnPost);
			getElementsActivityCard();
		}
		
		public void verifyPostButtonIsDisable() throws Exception {
			ApplicationHelper.checkElementIsDisable(btnPost);
			System.out.println("Post button is disable");
		}
		
		public void verifyPostText() throws Exception {
			Assert.assertEquals(ElementDeclaration.strStatusPost, lbContentStatus.getText());
			System.out.println("Post Successfully");
		}

		public void tapOnPostLabel() throws Exception {
			FeedHelper.openInputStatusPanel();			
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
