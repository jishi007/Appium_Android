package screen;

import java.util.List;

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
		screen.openInputStatusPanel();

		screen.verifyBlackTipsPanelIsDisplayed();

		// Preparing the next Test
		screen.closeBlackTipsBox();
		screen.openFeedScreen();
		screen.openRecentTab();
	}

//	@Test(priority = 3)
//	public void verifyBlackTipsPanelIsDisplayedWhenAtTheSecondTime() throws Exception {
//		screen.openInputStatusPanel();
//		screen.closeBlackTipsBox();
//		screen.openFeedScreen();
//		screen.openInputStatusPanel();
//
//		screen.verifyBlackTipsPanelIsDisplayed();
//
//		// Preparing the next Test
//		screen.closeBlackTipsBox();
//		screen.openFeedScreen();
//	}
//
//	@Test(priority = 4)
//	public void verifyBlackTipsPanelNotDisplayedAfterCheckedDontShowAgain() throws Exception {
//		screen.openInputStatusPanel();
//		screen.checkDontShowAgain();
//		screen.closeBlackTipsBox();
//		screen.openFeedScreen();
//		screen.openInputStatusPanel();
//
//		screen.verifyBlackTipsPanelNotDisplayedAnymore();
//
//		// Preparing the next Test
//		screen.openFeedScreen();
//	}
//
//	@Test(priority = 5)
//	public void verifyInputStatusPanelIsDisplayeAfterCheckDontShowAgain() throws Exception {
//		screen.openInputStatusPanel();
//
//		screen.verifyInputStatusPanelIsDisplayed();
//
//		// Preparing the next Test
//		screen.openFeedScreen();
//	}
//
//	// VERIFY FUNCTIONAL SIGN IN SCREEN
//	// User should be able to sign in with valid credentials
//	@Test(priority = 6)
//	public void verifyPostButtonIsDisableWWithEmptyContent() throws Exception {
//		screen.openInputStatusPanel();
//		screen.verifyPostButtonIsDisable();
//		screen.inputContentStatus(ElementDeclaration.strInvalidStatusPost);
//		screen.verifyPostButtonIsDisable();
//	}
//
//	@Test(priority = 7)
//	public void postStatus() throws Exception {
//		screen.openInputStatusPanel();
//		screen.inputContentStatus(ElementDeclaration.strStatusPost);
//		screen.tapOnPostButton();
//
//		screen.verifyPostText();
//	}
//
//	@Test(priority = 8)
//	public void likePost() throws Exception {
//		screen.tapOnLikeButton();
//
//		screen.verifyLikePost();
//	}
//
//	@Test(priority = 9)
//	public void unLikePost() throws Exception {
//		screen.tapOnLikeButton();
//
//		screen.verifyUnLikePost();
//	}
//
//	@Test(priority = 10)
//	public void commentPost() throws Exception {
//		screen.tapOnCommentButton();
//		screen.inputContentComment(ElementDeclaration.strComment);
//		screen.tapOnPostCommentButton();
//
//		screen.verifyComment();
//
//		// Preparing the next Test
//		screen.backToProviousScreen();
//	}
//
//	@Test(priority = 11)
//	public void postPicture() throws Exception {
//		screen.openInputStatusPanel();
//		screen.inputContentStatus(ElementDeclaration.strStatusPost);
//		screen.takePhoto();
//		screen.tapOnPostButton();
//		screen.waitToDo(10);
//
//		screen.verifyPostPicture();
//	}
//
//	@Test(priority = 12)
//	public void postVideo() throws Exception {
//		screen.openInputStatusPanel();
//		screen.inputContentStatus(ElementDeclaration.strStatusPost);
//		screen.recordVideo();
//		screen.tapOnPostButton();
//		screen.waitToDo(20);
//
//		screen.verifyPostVideo();
//	}

	@Test(priority = 13)
	public void postStatusToSpecificGroups() throws Exception {
		screen.openInputStatusPanel();
		screen.inputContentStatus(ElementDeclaration.strStatusPost);
		screen.tapOnSelectGroupsBox();
		screen.checkedPostToSpecificGroupType();
		screen.selectListSpecificGroup();
		screen.tapOnPostButton();
		screen.waitToDo(5);

		screen.verifyPostText();
	}

	@Test(priority = 14)
	public void postPictureToSpecificGroups() throws Exception {
		screen.openInputStatusPanel();
		screen.inputContentStatus(ElementDeclaration.strStatusPost);
		screen.takePhoto();
		screen.tapOnSelectGroupsBox();
		screen.checkedPostToSpecificGroupType();
		screen.selectListSpecificGroup();
		screen.tapOnPostButton();
		screen.waitToDo(25);

		screen.verifyPostPicture();
	}
	
	@Test(priority = 15)
	public void postStatusToSpecificGroups1() throws Exception {
		screen.openInputStatusPanel();
		screen.inputContentStatus(ElementDeclaration.strStatusPost);
		screen.tapOnSelectGroupsBox();
		screen.checkedPostToSpecificGroupType();
		screen.selectListSpecificGroup();
		screen.tapOnPostButton();
		screen.waitToDo(5);

		screen.verifyPostText();
	}

	@Test(priority = 16)
	public void postPictureToSpecificGroups1() throws Exception {
		screen.openInputStatusPanel();
		screen.inputContentStatus(ElementDeclaration.strStatusPost);
		screen.takePhoto();
		screen.tapOnSelectGroupsBox();
		screen.checkedPostToSpecificGroupType();
		screen.selectListSpecificGroup();
		screen.tapOnPostButton();
		screen.waitToDo(25);

		screen.verifyPostPicture();
	}
	
//	@Test(priority = 15)
//	public void postVideoToSpecificGroups() throws Exception {
//		screen.openInputStatusPanel();
//		screen.inputContentStatus(ElementDeclaration.strStatusPost);
//		screen.recordVideo();
//		screen.tapOnSelectGroupsBox();
//		screen.checkedPostToSpecificGroupType();
//		screen.selectListSpecificGroup();
//		screen.tapOnPostButton();
//		screen.waitToDo(30);
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
			getUsernameLogging();
		}

		public void logOut() throws Exception {
			FeedHelper.logOut();
		}

		public void openFeedScreen() throws Exception {
			FeedHelper.openFeedScreen();
		}

		public void openRecentTab() throws Exception {
			FeedHelper.openRecentTab();
		}

		public void closeBlackTipsBox() throws Exception {
			FeedHelper.closeBlackTipsBox();
		}

		public void openLeftMenu() throws Exception {
			FeedHelper.openLeftMenu();
		}

		public void getUsernameLogging() throws Exception {
			openLeftMenu();
			strUsername = FeedHelper.getUsernameLeftMenu().getText();
			System.out.println(strUsername);
			ApplicationHelper.tapButton(FeedHelper.getLeftMenuIcon());
		}

		public void verifyUIFeedScreen() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getFeedTitle());
			System.out.println("Feed title is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getLeftMenuIcon());
			System.out.println("Left menu icon is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getChatIcon());
			System.out.println("Chat icon is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getPopularTab());
			System.out.println("Popular tab is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getRecentTab());
			System.out.println("Recent tab is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getFollowingTab());
			System.out.println("Following tab is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getCameraIcon());
			System.out.println("Camera icon is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getHintAddToConversation());
			System.out.println("Text 'Add To Conversation' is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getPostLabel());
			System.out.println("Post label is displayed!!!");
			System.out.println("Verify Feed screen is displayed!!!");
		}

		public void inputContentStatus(String strStatusPost) throws Exception {
			FeedHelper.inputContent(FeedHelper.getInputStatusField(), strStatusPost);
			System.out.println("Input content status: " + strStatusPost);
			strListSpecificGroups = strUsername + "'s Profile";
		}

		public void tapOnSelectGroupsBox() throws Exception {
			FeedHelper.tapOnSelectGroupsBox(FeedHelper.getSelectGroupLabel());
			System.out.println("Select where to post...");
		}

		public void checkedPostToSpecificGroupType() throws Exception {
			FeedHelper.tapOnPostGroupType(FeedHelper.getGroupTypeContainer());
			System.out.println("Select specific groups...");
		}

		public void selectListSpecificGroup() throws Exception {
			List<MobileElement> listSpecificGroupName = FeedHelper.getListSpecificGroupsName();
			List<MobileElement> listSpecificGroupCheckIcon = FeedHelper.getListSpecificGroupsCheckIcon();
			int size = listSpecificGroupCheckIcon.size();
			if (size == 1) {
				FeedHelper.tapOnSpecificGroup(listSpecificGroupCheckIcon.get(0));
				System.out.println("Select post into " + listSpecificGroupName.get(0).getText() + " group");
				FeedHelper.tapOnDoneButton(FeedHelper.getDoneButton());
				strListSpecificGroups = FeedHelper.getSelectGroupLabel().getText();
			} else if (size > 1) {
				int i = 0;
				for (MobileElement element : listSpecificGroupCheckIcon) {
					FeedHelper.tapOnSpecificGroup(element);
					System.out.println("Select post into " + listSpecificGroupName.get(i).getText() + " group");
					i++;
				}
				FeedHelper.tapOnDoneButton(FeedHelper.getDoneButton());
				strListSpecificGroups = FeedHelper.getSelectGroupLabel().getText() + " "
						+ FeedHelper.getSelectOtherGroupsLabel().getText();
			} else {
				FeedHelper.tapOnCancelButton(FeedHelper.getCancelbutton());
				System.out.println("This user does not join any groups!");
			}
		}

		public void inputContentComment(String strComment) throws Exception {
			FeedHelper.inputContent(ActivityCardHelper.getCommentInputField(), strComment);
			System.out.println("Input content status: " + strComment);
		}

		public void takePhoto() throws Exception {
			FeedHelper.takePhoto(FeedHelper.getUploadPhotoButton());
		}

		public void recordVideo() throws Exception {
			FeedHelper.recordVideo(FeedHelper.getUploadVideoButton());
		}

		public void tapOnPostButton() throws Exception {
			FeedHelper.tapOnPostButton(FeedHelper.getPostButton());
		}

		public void waitToDo(int sec) throws Exception {
			ApplicationHelper.WaitToDo(sec);
		}

		public void verifyPostButtonIsDisable() throws Exception {
			ApplicationHelper.checkElementIsDisable(FeedHelper.getPostButton());
			System.out.println("Post button is disable");
		}

		public void tapOnCommentButton() throws Exception {
			FeedHelper.tapOnCommentButton(ActivityCardHelper.getCommentButton());
		}

		public void tapOnPostCommentButton() throws Exception {
			FeedHelper.tapOnCommentButton(ActivityCardHelper.getPostCommentButton());
		}

		public void verifyComment() throws Exception {
			while (ActivityCardHelper.getUsernameComment() == null
					&& ActivityCardHelper.getDateTimeComment().getText() != strDateTime) {
				ApplicationHelper.scrollUp();
				break;
			}
			Assert.assertEquals(ActivityCardHelper.getUsernameComment().getText(), strUsername);
			ApplicationHelper.WaitToDo(1);
			Assert.assertEquals(ActivityCardHelper.getDateTimeComment().getText(), strDateTime);
			ApplicationHelper.WaitToDo(1);
			Assert.assertEquals(ActivityCardHelper.getContentComment().getText(), ElementDeclaration.strComment);
			ApplicationHelper.WaitToDo(1);
			System.out.println("Comment status successfully");
			while (ActivityCardHelper.getLikeCommentButton() == null) {
				ApplicationHelper.scrollDown();
				break;
			}
			ActivityCardHelper.tapOnLikeComment();
			ApplicationHelper.WaitToDo(1);
			Assert.assertEquals(ActivityCardHelper.getLikeCommentButton().getText(), "Unlike");
			System.out.println("Like comment successfully");
			ActivityCardHelper.tapOnLikeComment();
			ApplicationHelper.WaitToDo(1);
			Assert.assertEquals(ActivityCardHelper.getLikeCommentButton().getText(), "Like");
			System.out.println("Unlike comment successfully");
		}

		public void backToProviousScreen() throws Exception {
			ActivityCardHelper.tapOnBackButton(ActivityCardHelper.getBackButton());
		}

		public void tapOnLikeButton() throws Exception {
			FeedHelper.tapOnLikeButton(ActivityCardHelper.getLikeButton());
		}

		public void verifyLikePost() throws Exception {
			Assert.assertTrue(ActivityCardHelper.getLikeButton().isSelected());
			System.out.println("Like post successfully");
		}

		public void verifyUnLikePost() throws Exception {
			Assert.assertFalse(ActivityCardHelper.getLikeButton().isSelected());
			System.out.println("Un-like post successfully");
		}

		public void verifyPostText() throws Exception {
			isDisplay = ApplicationHelper.waitUtilElementIsDisplayed(ActivityCardHelper.getContentStatus(), 3);
			ApplicationHelper.WaitToDo(1);
			if (!isDisplay) {
				System.out.println("Server not responding!");
			} else {
				Assert.assertEquals(ActivityCardHelper.getContentStatus().getText(), ElementDeclaration.strStatusPost);
				ApplicationHelper.WaitToDo(1);
				Assert.assertEquals(ActivityCardHelper.getUsernameDisplay().getText(), strUsername);
				ApplicationHelper.WaitToDo(1);
				Assert.assertEquals(ActivityCardHelper.getDateTimeLable().getText(), strDateTime);
				ApplicationHelper.WaitToDo(1);
				while (ActivityCardHelper.getTitleGroup() == null) {
					ApplicationHelper.scrollDown();
					break;
				}
				Assert.assertEquals(ActivityCardHelper.getContentGroup().getText(), strListSpecificGroups);
				System.out.println("Post status successfully into " + ActivityCardHelper.getContentGroup().getText());
			}
		}

		public void verifyPostPicture() throws Exception {
			isDisplay = ApplicationHelper.waitUtilElementIsDisplayed(ActivityCardHelper.getPictureVideoPost(), 5);
			if (!isDisplay) {
				System.out.println("Server not responding!");
			} else {
				Assert.assertEquals(ActivityCardHelper.getContentStatus().getText(), ElementDeclaration.strStatusPost);
				ApplicationHelper.WaitToDo(1);
				Assert.assertEquals(ActivityCardHelper.getUsernameDisplay().getText(), strUsername);
				ApplicationHelper.WaitToDo(1);
				Assert.assertEquals(ActivityCardHelper.getDateTimeLable().getText(), strDateTime);
				ApplicationHelper.WaitToDo(1);
				Assert.assertNotNull(ActivityCardHelper.getPictureVideoPost());
				ApplicationHelper.WaitToDo(1);
				while (ActivityCardHelper.getTitleGroup() == null) {
					ApplicationHelper.scrollDown();
					break;
				}
				Assert.assertEquals(ActivityCardHelper.getContentGroup().getText(), strListSpecificGroups);
				System.out.println("Post picture successfully into " + ActivityCardHelper.getContentGroup().getText());
			}
		}

		public void verifyPostVideo() throws Exception {
			isDisplay = ApplicationHelper.waitUtilElementIsDisplayed(ActivityCardHelper.getPictureVideoPost(), 10);
			if (!isDisplay) {
				System.out.println("Server not responding!");
			} else {
				Assert.assertEquals(ActivityCardHelper.getContentStatus().getText(), ElementDeclaration.strStatusPost);
				ApplicationHelper.WaitToDo(1);
				Assert.assertEquals(ActivityCardHelper.getUsernameDisplay().getText(), strUsername);
				ApplicationHelper.WaitToDo(1);
				Assert.assertEquals(ActivityCardHelper.getDateTimeLable().getText(), strDateTime);
				ApplicationHelper.WaitToDo(1);
				Assert.assertNotNull(ActivityCardHelper.getPictureVideoPost());
				ApplicationHelper.WaitToDo(1);
				Assert.assertNotNull(ActivityCardHelper.getPlayVideoIcon());
				ApplicationHelper.WaitToDo(1);
				while (ActivityCardHelper.getTitleGroup() == null) {
					ApplicationHelper.scrollDown();
					break;
				}
				Assert.assertEquals(ActivityCardHelper.getContentGroup().getText(), strListSpecificGroups);
				System.out.println("Post video successfully into " + ActivityCardHelper.getContentGroup().getText());
			}
		}

		public void openInputStatusPanel() throws Exception {
			FeedHelper.openInputStatusPanel();
		}

		public void checkDontShowAgain() throws Exception {
			FeedHelper.checkDontShowAgain();
		}

		public void verifyBlackTipsPanelIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getHintTipsPanel());
			System.out.println("Hint text is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getCloseIcon());
			System.out.println("X icon is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getCheckboxTips());
			System.out.println("Checkbox 'Dont show again' is displayed!!!");
			System.out.println("Verify Black tips panel is displayed!!!");
		}

		public void verifyBlackTipsPanelNotDisplayedAnymore() throws Exception {
			Assert.assertNull(FeedHelper.getHintTipsPanel());
			System.out.println("Verify Black tips panel is not displayed anymore after checked Dont show again!!!");
		}

		public void verifyInputStatusPanelIsDisplayed() throws Exception {
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getInputStatusField());
			System.out.println("Input content field is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getNumberOfCharacter());
			System.out.println("The number of limit character is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getPostButton());
			System.out.println("Post button is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getUploadPhotoButton());
			System.out.println("Upload photo button is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getUploadVideoButton());
			System.out.println("Upload video button is displayed!!!");
			ApplicationHelper.checkElementIsDisplayed(FeedHelper.getSelectGroupLabel());
			System.out.println("Select group box is displayed!!!");
			System.out.println("Verify Input status field is displayed!!!");
		}
	}

	private Screen screen = new Screen();

	String strUsername;
	String strDateTime = "Right now";
	boolean isDisplay = true;
	String strListSpecificGroups;
}
