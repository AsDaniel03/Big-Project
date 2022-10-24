package stepdef;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageobject.HomePage;
import pageobject.groupChatPage;

import static stepdef.hook.driver;

public class groupChatStep {
    private final groupChatPage groupchatPage = new groupChatPage(driver);
    private final HomePage homePage = new HomePage(driver);

    @When("user select project name")
    public void selectProjectName() throws InterruptedException {
        Assert.assertTrue(groupchatPage.isDisplayed());
        groupchatPage.clickBigPro();
        Thread.sleep(900);
    }

    @And("user select group chat")
    public void userSelectGroupChat() throws InterruptedException {
        groupchatPage.clickGroupChat();
        Thread.sleep(1000);
    }

    @And("user fill message")
    public void userFillMessage() {
        Assert.assertTrue(groupchatPage.Displayed());
        groupchatPage.fillMessage();
        groupchatPage.sendMessage();
    }
    @And("user fill message2")
    public void userFillMessage2() {
        Assert.assertTrue(groupchatPage.Displayed());
        groupchatPage.fillMessage();
    }

    @Then("user should be send message")
    public void userShouldBeSendMessage() {
//            Assert.assertTrue(groupchatPage.getMessage());
//            Assert.assertEquals(groupchatPage.getPageHeading(),text);
    }

    @And("user click message icon option")
    public void userClickMessageIconOption() {
        groupchatPage.clickMenu();
    }

    @And("user delete message")
    public void userDeleteMessage() throws InterruptedException {
        groupchatPage.deleteMessage1();
        Thread.sleep(1000);
        Assert.assertTrue(groupchatPage.getDeleteMessage());
        groupchatPage.deleteMessge2();
    }

    @Then("the message has been deleted")
    public void theMessageHasBeenDeleted() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertTrue(groupchatPage.endDeleteText());

    }

    @And("user click icon cancel menu message")
    public void userClickIconCancelMenuMessage() throws InterruptedException {
        Thread.sleep(500);
        groupchatPage.clickCLose1();
        Thread.sleep(1000);
    }

    @Then("the message undelete")
    public void theMessageUndelete() {
    }

    @And("user click cancel delete message")
    public void userClickCancelDeleteMessage() throws InterruptedException {
        groupchatPage.deleteMessage1();
        Thread.sleep(1000);
        Assert.assertTrue(groupchatPage.getDeleteMessage());
        groupchatPage.clickClose2();
        Thread.sleep(1000);
    }

    @And("user send blank message")
    public void userSendBlankMessage() {
        groupchatPage.sendMessage();
    }

    @Then("user failed send message")
    public void userFailedSendMessage() {
    }

    @And("user click logo")
    public void userClickLogo() {
        homePage.clickLogo();
    }

    @Then("user navigated to homepage")
    public void userNavigatedToHomepage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(homePage.navigatedHomepage());
    }

    @And("user send image")
    public void userSendImage() {
        WebElement addFile = driver.findElement(By.xpath("//input[@type='file']\n"));
        addFile.sendKeys("C:\\Users\\ACER\\Music\\BP1\\src\\main\\java\\pageobject\\gambar\\tanah.jpg");

    }

    @When("User send address without space on chat")
    public void userSendAddressWithoutSpaceOnChat() {
        groupchatPage.sendAddress();
    }

    @And("User can navigates to that link")
    public void userCanNavigatesToThatLink() {
        
    }

    @Then("User can see chat section")
    public void userCanSeeChatSection() {
    }

    @And("user send the message with enter")
    public void userSendTheMessageWithEnter() {
        groupchatPage.enterMessage();
    }

    @Then("user can't send the message")
    public void userCantTSendTheMessage() {
    }
}