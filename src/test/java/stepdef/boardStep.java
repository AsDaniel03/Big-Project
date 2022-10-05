package stepdef;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageobject.HomePage;
import pageobject.boardPage;

import static stepdef.hook.driver;

public class boardStep {
    private final boardPage BoardPage= new boardPage(driver);
    private final HomePage homePage=new HomePage(driver);

    @And("user click board")
    public void userClickBoard() throws InterruptedException {
        BoardPage.clickBoard();
        Thread.sleep(1000);
        Assert.assertTrue(BoardPage.isDisplayed());
    }

    @And("user create list")
    public void userCreateList() throws InterruptedException {
        BoardPage.createList();
        BoardPage.fillList();
        Thread.sleep(1000);
        BoardPage.submitlist();
        Thread.sleep(1000);
    }

    @Then("list should be created")
    public void listShouldBeCreated() {
    Assert.assertTrue(BoardPage.successList());
    }

    @Then("list is cancel create")
    public void listIsCancelCreate() {

    }

    @And("user click icon cancel")
    public void userClickIconCancel() {
        BoardPage.createList();
        BoardPage.cancelCreate();
    }

    @And("user select private card")
    public void userSelectPrivateCard() throws InterruptedException {
        BoardPage.createPrivateCard();
        BoardPage.clickButtonPrivate();
    }

    @Then("private card has been added")
    public void privateCardHasBeenAdded() {
//        Assert.assertTrue(BoardPage.success());
    }

    @And("user create card")
    public void userCreateCard() throws InterruptedException {
        BoardPage.createCard();
        Thread.sleep(500);
    }

    @Then("card has been added")
    public void cardHasBeenAdded() {
        
    }

    @And("user cancel create card")
    public void userCancelCreateCard() throws InterruptedException {
        BoardPage.cancelCreateCard();
    }

    @Then("add card has been canceled")
    public void addCardHasBeenCanceled() {
    }

    @And("user select card")
    public void userSelectCard() {
        BoardPage.clickCard();
    }

    @And("user create notes")
    public void userCreateNotes() throws InterruptedException {
        BoardPage.createNotes();
        Thread.sleep(500);
    }

    @Then("notes has been created")
    public void notesHasBeenCreated() {
//        Assert.assertTrue(BoardPage.Displayed());
    }

    @And("user edit notes")
    public void userEditNotes() {
        BoardPage.editNotes();
    }

    @Then("notes has been edited")
    public void notesHasBeenEdited() {
        Assert.assertTrue(BoardPage.edits());
    }

    @And("user cancel edit notes")
    public void userCancelEditNotes() {
        BoardPage.cancelEditNotes();

    }

    @Then("notes has been cancel edited")
    public void notesHasBeenCancelEdited() {
//        Assert.assertTrue(BoardPage.edits());
    }

    @And("user undo edit notes")
    public void userUndoEditNotes() {
        BoardPage.undoNotes();
    }

    @Then("notes has been undo edited")
    public void notesHasBeenUndoEdited() {
//        Assert.assertTrue(BoardPage.edits());
    }

    @And("user redo edit notes")
    public void userRedoEditNotes() {
        BoardPage.redoNotes();
    }

    @Then("notes has been redo edited")
    public void notesHasBeenRedoEdited() {
//        Assert.assertTrue(BoardPage.edits());
    }

    @And("user edit name attachments")
    public void userEditNameAttachments() {
        BoardPage.editAtt();
    }

    @Then("attachment's name has been edit")
    public void attachmentSNameHasBeenEdit() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(BoardPage.successEditAttchments());
    }

    @And("user cancel delete attachments")
    public void userCancelDeleteAttachments() {
        BoardPage.cancelDeleteAtt();
    }

    @Then("attachment has been cancel delete")
    public void attachmentHasBeenCancelDelete() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(BoardPage.successEditAttchments());
    }

    @And("user delete attachments")
    public void userDeleteAttachments() throws InterruptedException {
        Thread.sleep(500);
        BoardPage.deleteAtt();
        Thread.sleep(500);

    }

    @Then("attachment has been deleted")
    public void attachmentHasBeenDeleted() {
//        Assert.assertTrue(BoardPage.sDeleteAtt());
    }

    @And("user comment activities")
    public void userCommentActivities() {
//        Assert.assertTrue(BoardPage.comentPage());
        BoardPage.createComent();
    }

    @Then("successfully comment activities")
    public void successfullyCommentActivities() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(BoardPage.successComent());
    }

    @And("user cancel comment activities")
    public void userCancelCommentActivities() {
        BoardPage.cancelComent();
    }

    @Then("successfully cancel comment activities")
    public void successfullyCancelCommentActivities() {
//        Assert.assertTrue(BoardPage.successComent());
    }

    @And("user edit comment activities")
    public void userEditCommentActivities() {
        BoardPage.editCommentAct();
    }

    @Then("successfully edit comment activities")
    public void successfullyEditCommentActivities() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(BoardPage.editSucc());
    }

    @And("user reply comment activities")
    public void userReplyCommentActivities() {
        BoardPage.clickReplyComent();
    }

    @Then("successfully reply comment activities")
    public void successfullyReplyCommentActivities() throws InterruptedException {
//        Thread.sleep(1000);
//        Assert.assertTrue(BoardPage.succReplyComent());
    }

    @And("user cancel delete comment activities")
    public void userCancelDeleteCommentActivities() {
        BoardPage.cancelDeleteComment();
    }

    @Then("successfully cancel delete comment activities")
    public void successfullyCancelDeleteCommentActivities() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(BoardPage.editSucc());
    }

    @And("user delete comment activities")
    public void userDeleteCommentActivities() {
        BoardPage.deleteCommentAct();
    }

    @Then("successfully delete comment activities")
    public void successfullyDeleteCommentActivities() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(BoardPage.comentPage());
    }

    @And("user give cheers on comment activities")
    public void userGiveCheersOnCommentActivities() {
        BoardPage.createCheers();
    }

    @Then("successfully give cheers on comment activities")
    public void successfullyGiveCheersOnCommentActivities() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(BoardPage.displayedCheers());
    }

    @And("user give cheers on comment activities using blank text")
    public void userGiveCheersOnCommentActivitiesUsingBlankText() {
        BoardPage.createBlankCheers();
    }

    @Then("unsuccessfully give cheers on comment activities")
    public void unsuccessfullyGiveCheersOnCommentActivities() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(BoardPage.displayedFailedCheer());
    }

    @And("user cancel give cheers on comment activities")
    public void userCancelGiveCheersOnCommentActivities() {
        BoardPage.cancelGiveCheer();
    }
    @Then("successfully cancel give cheers on comment activities")
    public void successfullyCancelGiveCheersOnCommentActivities() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(BoardPage.displayedCheers());
    }

    @And("user delete cheers on comment activities")
    public void userDeleteCheersOnCommentActivities() {
        BoardPage.clickDeleteCheer();
    }

    @Then("successfully delete cheers on comment activities")
    public void successfullyDeleteCheersOnCommentActivities() throws InterruptedException {
//        Thread.sleep(3000);
//        Assert.assertTrue(BoardPage.displayedFailedCheer());
    }

    @And("user select card{int}")
    public void userSelectCard(int arg0) {
        BoardPage.clickCard2();
    }

    @And("user select set as a complete list")
    public void userSelectSetAsACompleteList() {
        BoardPage.clickCompleteList();
    }

    @Then("successfully set as a complete list")
    public void successfullySetAsACompleteList() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(BoardPage.displayedSet());
    }

    @And("user select sort list from A to Z")
    public void userSelectSortListFromAToZ() {
        BoardPage.clickSortAZ();
    }

    @Then("successfully sort list from A to Z")
    public void successfullySortListFromAToZ() throws InterruptedException {
    }

    @And("user select sort list from Z to A")
    public void userSelectSortListFromZToA() {
        BoardPage.clickSortZA();
    }

    @Then("successfully sort list from Z to A")
    public void successfullySortListFromZToA() {

    }

    @And("user select sort list by nearest due date")
    public void userSelectSortListByNearestDueDate() {
        BoardPage.clickNearestDueDate();
    }

    @Then("successfully sortlist by nearest due date")
    public void successfullySortlistByNearestDueDate() {
        
    }

    @And("user select sort list by furthest due date")
    public void userSelectSortListByFurthestDueDate() {
        BoardPage.clickFurthestDueDate();
    }

    @Then("successfully sortlist by furthest due date")
    public void successfullySortlistByFurthestDueDate() {
        
    }

    @And("user select sort list by nearest created date")
    public void userSelectSortListByNearestCreatedDate() {
        BoardPage.clickNearestCreated();
    }

    @Then("successfully sortlist by nearest created date")
    public void successfullySortlistByNearestCreatedDate() {
        
    }

    @And("user select sort list by furthest created date")
    public void userSelectSortListByFurthestCreatedDate() {
        BoardPage.clickFurthestCreated();
    }

    @Then("successfully sortlist by furthest created date")
    public void successfullySortlistByFurthestCreatedDate() {

    }

    @And("user create due date time")
    public void userCreateDueDateTime() {
        BoardPage.clickDueDate();
    }

    @Then("successfully create due date time")
    public void successfullyCreateDueDateTime() {
    }

    @And("user select archieve all card in this list")
    public void userSelectArchieveAllCardInThisList() {
        BoardPage.clickArchieveAllCard();
    }

    @Then("successfully archieve all card in this list")
    public void successfullyArchieveAllCardInThisList() throws InterruptedException {
//        Thread.sleep(1000);
//        Assert.assertTrue(BoardPage.displayedSet());
    }

    @And("user select archieve this list")
    public void userSelectArchieveThisList() {
        BoardPage.clickArchieveList();
    }

    @Then("successfully archieve this list")
    public void successfullyArchieveThisList() {
    }

    @And("user select cards")
    public void userSelectCards() {
        BoardPage.clickCard3();
    }

    @And("user edit due date time")
    public void userEditDueDateTime() {
        BoardPage.clickEditTanggal();
    }

    @Then("successfully edit due date time")
    public void successfullyEditDueDateTime() {
    }

    @And("user remove due date time")
    public void userRemoveDueDateTime() {
        BoardPage.clickRemove();
    }

    @Then("successfully remove due date time")
    public void successfullyRemoveDueDateTime() {
    }

    @And("user move card")
    public void userMoveCard() {
       BoardPage.clickMove();
    }

    @Then("successfully move card")
    public void successfullyMoveCard() {
    }

    @And("user click private card")
    public void userClickPrivateCard() {
        BoardPage.clickPrivate();
    }
}
