package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tesdata.doc_filesData;

public class Doc_FilesPage extends BasePage{
    private final doc_filesData docFilesData;
    public Doc_FilesPage(WebDriver driver) {
        super(driver);
        docFilesData=new doc_filesData();
    }
    @FindBy(xpath = "//div[@class='BucketSnapshot_Folder__3vk5x']")
    private WebElement doc_files;
    @FindBy(xpath = "//p[.='Add Item Here']")
    private WebElement buttonAddItem;
    @FindBy(xpath = "//p[.='Edit This Folder']")
    private WebElement buttonEditFolder;
    @FindBy(xpath = "//p[.='Add a New Doc']")
    private WebElement buttonAddNewDoc;
    @FindBy(xpath ="//p[.='Create a New Folder']")
    private WebElement buttonCreateNewFolder;
    @FindBy(xpath = "//div[@class='CreateDocPage_inputTitleSection__3PwFx']/textarea[1]")
    private WebElement inputTitle;
    @FindBy(xpath ="//div[@class='fr-element fr-view']/p[1]")
    private WebElement inputStory;
    @FindBy(css = "[data-testid='AddIcon']")
    private WebElement buttonAddMember;
    @FindBy(xpath = "//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-9l3uo3']")
    private WebElement buttonPrivate;
    @FindBy(xpath = "//div[.='Publish']")
    private WebElement buttonPublish;
    @FindBy(xpath = "//div[.='Cancel']")
    private WebElement buttonCancel;

    @FindBy(xpath = "//div[@class='Doc_Doc__dwRS7']")
    private WebElement filesDoc;
    @FindBy(css = "#notistack-snackbar")
    private WebElement textSuccessCreate;

    @FindBy(css ="[data-testid='MoreHorizIcon']")
    private WebElement menuDocFile;
    @FindBy(xpath = "//p[.='Edit']")
    private WebElement buttonEdit;
    @FindBy(css ="[data-testid='CloseIcon']" )
    private WebElement closeMenu;
    @FindBy(xpath = "//div[.='Publish Changes']")
    private WebElement buttonPublishChanges;
    @FindBy(xpath = "//p[2]")
    private WebElement editStory;

    //    komen
    @FindBy(xpath = "//input[@class='Main_input__qq9k9 Main_secondary__2bXP3']")
    private WebElement comentField;
    @FindBy(xpath = "//h1[.='Post']")
    private WebElement buttonPost;
    @FindBy(xpath = "//div[@class='CommentItem_commentTextContainer__8Gd1V']/div[@class='fr-view']")
    private WebElement textComment;
    @FindBy(css = ".infinite-scroll-component div:nth-of-type(4) .CommentItem_commentMenuSection__1dW17 .MuiSvgIcon-root")
    private WebElement menuComent;
    @FindBy(xpath = "//p[.='Edit']")
    private WebElement editComment;
    @FindBy(xpath = "//p[.='Delete']")
    private WebElement deleteComment;
    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[2]")
    private WebElement inputNewComment;
    @FindBy(xpath = "//button[.='Delete']")
    private WebElement buttonDeteleComment;

    @FindBy(xpath = "//p[.='Archive This Doc']")
    private WebElement archieveDoc;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement inputFolderName;
    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement buttonSave;
    @FindBy(css="[data-testid='CloseIcon']")
    private WebElement closeIcon;

//    @FindBy(xpath = "//div[@class='BucketPage_docsSection__1rLtw']")
//    private WebElement docFilesPage;
    @FindBy(xpath = "//h1[.='Docs & Files']")
    private WebElement textDocFiles;
    @FindBy(css="[placeholder='Search members...']")
    private WebElement searchMember;
    @FindBy(xpath = "//p[.='Done']")
    private WebElement buttonDone;
    @FindBy(css=".ManageSubscribersContainer_ManageSubscribersContainer__teamMember__dAJ8o > .MuiSvgIcon-root")
    private WebElement check;

    @FindBy(css = "[href='/companies/61eba2c85080f47b25ddc8f8/teams/632e858e3c6e10177263cc8d/docs/633c7b7a1e8679f08e072b35'] > .Doc_Doc__dwRS7")
    private WebElement withMember;

//    @FindBy(css ="html")
//    private WebElement scrollDown;
    @FindBy(xpath = "//a[@href='/companies/61eba2c85080f47b25ddc8f8/teams/632e858e3c6e10177263cc8d/docs/63372e8d1fa533a20d585c30']/div[@class='Doc_Doc__dwRS7']")
    private WebElement successAdd;
    @FindBy(xpath = "//strong[.=\"This document doesn't have any subscribers.\"]")
    private WebElement textRemove;

    public boolean isDisplayed(){
        return isElementDisplayed(textDocFiles);
    }
    public void addItem(){
        clickElement(buttonAddItem);
        clickElement(buttonAddNewDoc);
        setTextElement(inputTitle,docFilesData.getTitle());
        setTextElement(inputStory,docFilesData.getStory());
    }
    public void clickPublish(){
        clickElement(buttonPublish);
    }
    public void clickCancel(){
        clickElement(buttonCancel);
    }
    public void clickDocFiles(){
        clickElement(doc_files);
    }
    public void clickPrivate(){
        clickElement(buttonPrivate);
    }
    public boolean successCreate(){
        return isElementDisplayed(textSuccessCreate);
    }
    public void selectFiles(){
        clickElement(filesDoc);
    }
    public void menu(){
        clickElement(menuDocFile);
        clickElement(buttonEdit);
    }
    public void menu2(){
        clickElement(buttonAddItem);
    }
    public void menu3() {
        clickElement(menuDocFile);
    }
    public void editStory(){
        setTextElement(editStory,docFilesData.getNewStory());
    }
    public void clickPublishChanges(){
        clickElement(buttonPublishChanges);
//    }
//    public void clickScroll(){
//        clickElement(scrollDown);
    }
    public void clickComent(){
        clickElement(comentField);
        setTextElement(inputStory,docFilesData.getComment());
    }
    public void clickPost(){
        clickElement(buttonPost);
    }
    public boolean comentText(){
        return isElementDisplayed(textComment);
    }
    public void clickMenuComment(){
        clickElement(menuComent);
    }
    public void clickEditComment(){
        clickElement(editComment);
    }
    public void clickDeleteComment(){
        clickElement(deleteComment);
    }
    public void inputEditComment(){
        setTextElement(inputNewComment,docFilesData.getNewComment());
    }
    public void clickButtonDeleteComment(){
        clickElement(buttonDeteleComment);
    }
    public void clickArchieveDoc(){
        clickElement(archieveDoc);
    }
    public void clickCreateFolder(){
        clickElement(buttonCreateNewFolder);
        setTextElement(inputFolderName,docFilesData.getFolderName());
        clickElement(buttonSave);
    }
    public void clickEditFolder(){
        clickElement(buttonEditFolder);
        clickElement(closeIcon);
    }
    public void addMember(){
        clickElement(buttonAddMember);
        setTextElement(searchMember,docFilesData.getMember());
        clickElement(check);
        clickElement(buttonDone);
    }
    public boolean removeSuccess(){
        return isElementDisplayed(textRemove);
    }
    public void clickWithMember(){
        clickElement(withMember);
    }
}
