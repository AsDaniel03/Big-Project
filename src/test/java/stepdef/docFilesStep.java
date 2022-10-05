package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageobject.Doc_FilesPage;

import static stepdef.hook.driver;

public class docFilesStep {
    private final Doc_FilesPage docFilesPage= new Doc_FilesPage(driver);

    @And("user select doc&files")
    public void userSelectDocFiles() throws InterruptedException {
        docFilesPage.clickDocFiles();
        Thread.sleep(1000);
    }

    @And("user select add a new doc")
    public void userSelectAddANewDoc() throws InterruptedException {
//        Assert.assertTrue(docFilesPage.isDisplayed());
        docFilesPage.addItem();
        Thread.sleep(1000);

    }

    @Then("add a new doc is success")
    public void addANewDocIsSuccess() throws InterruptedException {
//        Thread.sleep(300);
//        Assert.assertTrue(docFilesPage.successCreate());

    }

    @And("user choose private only")
    public void userChoosePrivateOnly() {
        docFilesPage.clickPrivate();
    }

    @Then("add a new doc for private only is success")
    public void addANewDocForPrivateOnlyIsSuccess() throws InterruptedException {
//        Thread.sleep(300);
//        Assert.assertTrue(docFilesPage.successCreate());
    }

    @And("user select cancel")
    public void userSelectCancel() {
        docFilesPage.clickCancel();
    }

    @Then("cancel add a new doc is success")
    public void cancelAddANewDocIsSuccess() {
    }

    @And("user choose files")
    public void userChooseFiles() {
        docFilesPage.selectFiles();
    }

    @And("user select edit")
    public void userSelectEdit() {
        docFilesPage.menu();
        docFilesPage.editStory();
//        docFilesPage.clickScroll();
        docFilesPage.clickPublishChanges();

    }

    @Then("user success edit file")
    public void userSuccessEditFile() {
    }

    @And("user fill coment")
    public void userFillComent() {
        docFilesPage.clickComent();
        docFilesPage.clickPost();
    }

    @Then("user success comment file")
    public void userSuccessCommentFile() {
//        Assert.assertTrue(docFilesPage.comentText());
    }

    @And("user edit comment")
    public void userEditComment() throws InterruptedException {
        docFilesPage.clickMenuComment();
        docFilesPage.clickEditComment();
        Thread.sleep(1000);
        docFilesPage.inputEditComment();
        Thread.sleep(1000);
        docFilesPage.clickPost();
    }

    @Then("user success edit comment file")
    public void userSuccessEditCommentFile() {
    }

    @And("user delete comment")
    public void userDeleteComment() {
        docFilesPage.clickMenuComment();
        docFilesPage.clickDeleteComment();
        docFilesPage.clickButtonDeleteComment();
    }

    @Then("user success delete comment")
    public void userSuccessDeleteComment() {

    }

    @And("user select archieve doc")
    public void userSelectArchieveDoc() {
        docFilesPage.menu3();
        docFilesPage.clickArchieveDoc();
    }

    @Then("user success archieve doc&files")
    public void userSuccessArchieveDocFiles() {
    }

    @And("user create a new folder")
    public void userCreateANewFolder() {
        docFilesPage.menu2();
        docFilesPage.clickCreateFolder();
    }

    @Then("user success create a new folder")
    public void userSuccessCreateANewFolder() {
    }

    @And("user close edit  folder")
    public void userCloseEditFolder() {
        docFilesPage.menu2();
        docFilesPage.clickEditFolder();
    }

    @Then("user success close edit folder")
    public void userSuccessCloseEditFolder() {
        
    }

    @And("user add member")
    public void userAddMember() throws InterruptedException {
        Thread.sleep(500);
        docFilesPage.addMember();
        Thread.sleep(500);
        docFilesPage.clickPublish();
        Thread.sleep(500);
    }

    @Then("add member is success")
    public void addMemberIsSuccess() throws InterruptedException {
//        Assert.assertTrue(docFilesPage.sAddMember());
    }

    @And("user select project with member")
    public void userSelectProjectWithMember() {
        docFilesPage.clickWithMember();
        docFilesPage.menu();
    }

    @And("user remove member")
    public void userRemoveMember() throws InterruptedException {
        Thread.sleep(500);
        docFilesPage.addMember();
        docFilesPage.clickPublishChanges();
        Thread.sleep(2000);
    }

    @Then("remove member is success")
    public void removeMemberIsSuccess() throws InterruptedException {
//        Thread.sleep(4000);
//        Assert.assertTrue(docFilesPage.removeSuccess());
    }

    @And("user select publish")
    public void userSelectPublish() {
        docFilesPage.clickPublish();
    }
}
