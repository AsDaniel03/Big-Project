package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tesdata.boardData;

public class boardPage extends BasePage {
    private final boardData BoardData;

    public boardPage(WebDriver driver) {
        super(driver);
        BoardData = new boardData();
    }

    @FindBy(xpath = "//h1[.='Board']")
    private WebElement board;
    @FindBy(xpath = "//a[.='Add List']")
    private WebElement addList;
    @FindBy(xpath = "//input[@name='name']")
    private WebElement inputList;
    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement buttonCreate;
    @FindBy(xpath = "//*[name()='path' and contains(@d,'M19 6.41 1')]")
    private WebElement iconCLose;
    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[2]//a[.='Add Card']")
    private WebElement buttonAddList;
    @FindBy(css = ".MuiSwitch-input")
    private WebElement buttonPrivateCard;
    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement fieldCardName;
    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement buttonAddCard;
    @FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[30]")
    private WebElement buttonCloseAddCard;
    @FindBy(css="[data-testid='CloseIcon']")
    private WebElement buttonClose;

    @FindBy(xpath = "//div[@class='BoardPage_container__3oHah']")
    private WebElement textSuccesslist;
    @FindBy(xpath = "//h1[.='Board - QA-14-BP-D']")
    private WebElement textBoardPage;

    @FindBy(id = "notistack-snackbar")
    private WebElement textCreate;

    //notes
    @FindBy(css = "[href='/companies/61eba2c85080f47b25ddc8f8/teams/632e858e3c6e10177263cc8d/cards/634968d7699bc04871aae4f6']")
    private WebElement cardBoard;
    @FindBy(css = "[href='/companies/61eba2c85080f47b25ddc8f8/teams/632e858e3c6e10177263cc8d/cards/633c7ff2aa8e878b94a1db9c']")
    private WebElement cardBoard1;
    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement inputNotes;
    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']/div[@class='Button_container__1WNuB']")
    private WebElement buttonSaveNotes;
    @FindBy(css = "[data-testid='CloseIcon']")
    private WebElement buttonCloseNote;
    @FindBy(xpath = "//div[@class='ManageDesc_editIcon__1I0bY']")
    private WebElement buttonEditNotes;
    @FindBy(xpath = "//p[.='Add a detailed notes here...']")
    private WebElement notes;
    @FindBy(xpath = "//div[@class='fr-view']")
    private WebElement successCreateNotes;
    @FindBy(xpath = "//p[contains(.,'project')]")
    private WebElement successEditNotes;
    @FindBy(css="[data-cmd='undo'] > .fr-svg")
    private WebElement buttonUndo;
    @FindBy(css = "[title='Redo (Ctrl+Shift+Z)'] > .fr-svg")
    private WebElement buttonRedo;

//    attachment
    @FindBy(xpath = "//p[.='Click or drop files here for fast attach']")
    private WebElement attachmentPage;
    @FindBy(xpath = "//p[.='Edit']")
    private WebElement editAttachment;
    @FindBy(xpath = "//p[.='Delete']")
    private WebElement deleteAttachment;
    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement inputName;
    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']/div[@class='Button_container__1WNuB']")
    private WebElement buttonUpdateAtt;
    @FindBy(xpath = "//button[@class='btn btn-danger btn-block btn-sm']/div[@class='Button_container__1WNuB']")
    private WebElement buttonDeleteAtt;
    @FindBy(css = ".ManageAttachments_titleSection__3I823 > h1")
    private WebElement textEditAtt;
    @FindBy(css = ".ManageAttachments_askDropContainer__aTIyn > p")
    private WebElement successDeleteAtt;

//    KOMEN
    @FindBy(xpath = "//input[@class='Main_input__qq9k9 Main_secondary__2bXP3']")
    private WebElement comentField;
    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement inputComent;
    @FindBy(xpath = "//h1[.='Post']")
    private WebElement buttonPost;
    @FindBy(xpath = "//h1[.='Cancel']")
    private WebElement buttonCancel;
    @FindBy(xpath = "//p[.='No comments here yet...']")
    private WebElement textnoComent;
    @FindBy(css = ".CommentItem_commentTextContainer__8Gd1V > .fr-view")
    private WebElement textComent;
    @FindBy(xpath = "//p[.='Delete']")
    private WebElement deleteComment;
    @FindBy(xpath = "//p[.='Edit']")
    private WebElement editComment;
    @FindBy(xpath = "//h1[.='Delete']")
    private WebElement buttonDeleteComment;
    @FindBy(css = "[data-testid='MoreHorizOutlinedIcon']")
    private WebElement menuComment;
    @FindBy(xpath = "//p[.='bebas']")
    private WebElement successEditAct;
    @FindBy(xpath ="//p[.='Reply']")
    private WebElement buttonReply;
    @FindBy(xpath = "//div[@class='infinite-scroll-component ']//div[@class='fr-view']")
    private WebElement textSuccReply;
    @FindBy(css = "[src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABcAAAAWCAYAAAArdgcFAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAP0SURBVHgBrVRdaFt1FD/nn6TpWrvdQAUtiHe+aPElcRZ8UJpb0H0orFWYzg9oR3F96w1utS/S+LYxZemDUkGaBGSryGgmuC+mycAX0ZKAD3ZPuXupD2oTbdc0ae//eP737uajH3OKB8LN/+P8zjm/3/kfgAew+fywBv/BxD9dUMBEmL20cMLc/c5odKcE/Fs3xrIlvb6QG1O3yoFYwghFPOeSeUiXgOMIoCNQLJS4ZhHZU4gwwsfl+4KDtDlDeVQIGLIBh9dk7Q7vxociKceRALMKmP9aXLgT8NVnkgY8qI1lf9XV9+S3vxffvflbvvls2TxSKplHklt93pi8qm/da+G8ZA5qy+bh/IzxqKXWiPIWl6s3zl+JutlTC9CxietTJEXx+MTNwV3BQ4lMWfEIrVbnmsDOMrTGd9Le4evv31A0xRExV+lYyTU7buNcG3+uQCfDOvaeYaFwH9RF8usANrCYI92Jq6nB+LzWcbdTt1UVSNNzZw9u66btgtbuJrmeMP0yaYwtKW6gwBxPcdZxdewDKr95+kbYXqN5G0n78uzBkNqPj16MSsSk8JERnzlubaOFiiZTQMwbZyPs7EzPx7HPBh42mOMoHxeYDmMsGHvcRmB6UEOSsaY0LQQseMDg5NVklW9ODwcfoyQG68cWSJ+hKHL4nbh+nj8me1kstjF35rAF97EW8GXzPSVY1N+DENgP0LYfQXS5AY7NvqAJ9OfZIb3esWY+0v98WAL0I0GUYXQgt4P4HZQRqSAkTtfBmWO9srBRtP8A2GSuqUputSrQE2C1Px0w3pod0C6ce6nA/c99TsNuehycSFFWvrfWJUFYAGYagvrs6J6+RiGbSwjVRYLabVLB9Mr3tewn8J1xQSVCcFkQ3Dmw91PobiumwOkof3go8nluR1oUJUxFNKADBJ9qBJErrMWPbhA2Fq3NCCVcDS4tjJSgMU90IZDHxOyHnq/wKPH3QHSjSLCWJfjzC+lk7VzoAugcQNj3tlAU8UOqZUvmpO5GJgWk3/tZUlJ8fuFEsgVcUdJ11AXoHBBOQV4QlbkXRN1h6lSAfMmMa6/1pRIMaAibIkIQtyxMgy2nPXCH89Urclx1h6Kj7UmAAA/T6s8uHX99JaHDENw5zv1y+wGR5owze96Jl9UsCvWlch7YB6Nzlm8zaAGkXPDKRe6SH2rhDd5a/4ngoUMCfN0A7c+qQAgrX8vy6jU7vfdlXybw4kd1IDXECKqq7yN1AdWQa1/XPB2QFk+ZchXOK8Gqi0pAgs5+LLf1coZEGextADabyppnhR5KXCnALoZ0+5Sa12H1GjeXKL16GXKhxM6A/9aYc1Zc8qvqPZeD/9n+Bhuit/AbMMijAAAAAElFTkSuQmCC']")
    private WebElement iconCheers;
    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement inputCheers;
    @FindBy(css = ".CheersButton_checkIcon__1ub7w")
    private WebElement iconCorrect;
    @FindBy(css = ".CheersButton_cancelIcon__NVrG8")
    private WebElement iconWrong;
    @FindBy(xpath = "//p[.='suka-suka']")
    private WebElement successCreateCheer;
    @FindBy(css = "[d='M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zM19 4h-3.5l-1-1h-5l-1 1H5v2h14V4z']")
    private WebElement deleteCheers;
    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    private WebElement failedGiveCheer;

    //BoardPage
    @FindBy(css="[data-testid='MoreHorizIcon']")
    private WebElement menuAwal;
    @FindBy(xpath = "//p[.='Archive All Cards in This List']")
    private WebElement buttonArchieveAllCard;
    @FindBy(xpath = "//p[.='Archive This List']")
    private WebElement buttonArchievelist;
    @FindBy(xpath = "//p[.='Archive This List']")
    private WebElement buttonSetComplete;
    @FindBy(xpath = "//p[.='Sort This List from A to Z']")
    private WebElement buttonSortAtoZ;
    @FindBy(xpath = "//p[.='Sort This List from Z to A']")
    private WebElement buttonSortZtoA;
    @FindBy(xpath = "//p[.='Sort This List by Nearest Due Date']")
    private WebElement buttonNearestDueDate;
    @FindBy(xpath = "//p[.='Sort This List by Furthest Due Date']")
    private WebElement buttonFurthestDueDate;
    @FindBy(xpath = "//p[.='Sort This List by Nearest Created Date']")
    private WebElement buttonNearestCreated;
    @FindBy(xpath = "//p[.='Sort This List by Furthest Created Date']")
    private WebElement buttonFurthestCreated;
    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    private WebElement successSet;
    @FindBy(xpath = "//div[@class='SnackbarContainer-bottom SnackbarContainer-left SnackbarContainer-root css-uwcd5u']//div[@class='SnackbarContent-root SnackbarItem-contentRoot SnackbarItem-variantSuccess SnackbarItem-lessPadding css-hped4j']/div[.='All cards on list asd moved to archived']")
    private WebElement textArchieveCard;

    @FindBy(xpath = "//div[@class='CardDetailContainer_CardDetailContainer__sideColumn__3hzRV col-lg-2 col-md-3']//div[@class='CardDetailContainer_buttonAction__2Sfwo']//div[contains(.,'Due Date')]")
    private WebElement buttonDueDate;
    @FindBy(xpath = "//div[.='Save']")
    private WebElement buttonSave;
    @FindBy(xpath = "//div[.='Remove']")
    private WebElement buttonRemove;
    @FindBy(xpath = "//div[@class='ManageDueDateContainer_datePicker__1LCTx']//input[@class='MuiInput-input MuiInputBase-input MuiInputBase-inputAdornedEnd css-mnn31']")
    private WebElement inputDate;
    @FindBy(xpath = "//button[contains(.,'Move')]")
    private WebElement buttonMove;
    @FindBy(xpath = "//a[@href='/companies/61eba2c85080f47b25ddc8f8/teams/632e858e3c6e10177263cc8d/cards/63340b067f0cbb32cdd0f165']")
    private WebElement card3;
    @FindBy(css = "[data-testid='CalendarIcon']")
    private WebElement iconCalender;
    @FindBy(css = "[aria-label='Oct 25, 2022']")
    private WebElement tanggal;
    @FindBy(css = ".CardDetailContainer_CardDetailContainer__mainColumn__2bG2a > .CardDetailContainer_CardDetailContainer__smallSectionContainer__3qfM5 > .DateBox_DateBox__3UL8M > p")
    private WebElement editTanggal;
    @FindBy(css="[aria-label='Oct 3, 2022']")
    private WebElement pastTanggal;
    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']/div[@class='Button_container__1WNuB']")
    private WebElement move;
    @FindBy(css = "[data-testid='DoubleArrowIcon']")
    private WebElement buttonMoves;
    @FindBy(css = "[data-testid='LockIcon']")
    private WebElement makePrivate;

    public boolean isDisplayed() {
        return isElementDisplayed(textBoardPage);
    }
    public void clickPrivate(){
        clickElement(makePrivate);
    }
    public boolean displayArchieve() {
        return isElementDisplayed(textArchieveCard);
    }
    public void clickRemove(){
        clickElement(buttonDueDate);
        clickElement(buttonRemove);
    }
    public void clickMove(){
        clickElement(buttonMoves);
        clickElement(move);
    }
    public void clickEditTanggal(){
        clickElement(editTanggal);
        clickElement(iconCalender);
        clickElement(pastTanggal);
        clickElement(buttonSave);
    }
    public boolean displayedFailedCheer() {
        return isElementDisplayed(failedGiveCheer);
    }
    public void clickCard3(){
        clickElement(card3);
    }
    public void clickDueDate(){
        clickElement(buttonDueDate);
        clickElement(iconCalender);
        clickElement(tanggal);
        clickElement(buttonSave);
    }
    public boolean displayedSet() {
        return isElementDisplayed(successSet);
    }
    public void clickArchieveList(){
        clickElement(menuAwal);
        clickElement(buttonArchievelist);
    }
    public boolean displayedCheers() {
        return isElementDisplayed(successCreateCheer);
    }
    public void clickDeleteCheer(){
        clickElement(successCreateCheer);
        clickElement(deleteCheers);
    }
    public void clickArchieveAllCard(){
        clickElement(menuAwal);
        clickElement(buttonArchieveAllCard);
    }
    public void clickSortZA(){
        clickElement(menuAwal);
        clickElement(buttonSortZtoA);
    }
    public void clickNearestDueDate(){
        clickElement(menuAwal);
        clickElement(buttonNearestDueDate);
    }
    public void clickFurthestDueDate(){
        clickElement(menuAwal);
        clickElement(buttonFurthestDueDate);
    }
    public void clickNearestCreated(){
        clickElement(menuAwal);
        clickElement(buttonNearestCreated);
    }
    public void clickFurthestCreated(){
        clickElement(menuAwal);
        clickElement(buttonFurthestCreated);
    }
    public void clickCompleteList(){
        clickElement(menuAwal);
        clickElement(buttonSetComplete);
    }
    public void clickSortAZ(){
        clickElement(menuAwal);
        clickElement(buttonSortAtoZ);
    }
    public void cancelGiveCheer(){
        clickElement(iconCheers);
        clickElement(iconWrong);
    }
    public void createBlankCheers(){
        clickElement(iconCheers);
        clickElement(iconCorrect);
    }
    public void createCheers(){
        clickElement(iconCheers);
        setTextElement(inputCheers,BoardData.getAttachment());
        clickElement(iconCorrect);
    }
    public void cancelDeleteComment(){
        clickElement(menuComment);
        clickElement(deleteComment);
        clickElement(buttonCancel);
    }
    public void deleteCommentAct(){
        clickElement(menuComment);
        clickElement(deleteComment);
        clickElement(buttonDeleteComment);
    }
    public boolean succReplyComent() {
        return isElementDisplayed(textSuccReply);
    }
    public boolean editSucc() {
        return isElementDisplayed(successEditAct);
    }
    public void clickReplyComent(){
        clickElement(buttonReply);
        clickElement(comentField);
        setTextElement(inputComent,BoardData.getAddCard());
        clickElement(buttonPost);
    }
    public void editCommentAct(){
        clickElement(menuComment);
        clickElement(editComment);
        setTextElement(inputComent,BoardData.getAddList());
        clickElement(buttonPost);
    }
    public void cancelComent(){
        clickElement(comentField);
        clickElement(buttonCancel);
    }
    public boolean successComent() {
        return isElementDisplayed(textComent);
    }
    public boolean comentPage() {
        return isElementDisplayed(textnoComent);
    }
    public void createComent(){
        clickElement(comentField);
        setTextElement(inputComent,BoardData.getNotes());
        clickElement(buttonPost);
    }
    public boolean sDeleteAtt() {
        return isElementDisplayed(successDeleteAtt);
    }
    public boolean successEditAttchments() {
        return isElementDisplayed(textEditAtt);
    }
    public void editAtt(){
        clickElement(editAttachment);
        setTextElement(inputName,BoardData.getEditN());
        clickElement(buttonUpdateAtt);
    }
    public void cancelDeleteAtt() {
        clickElement(deleteAttachment);
        clickElement(buttonCloseNote);
    }
    public void deleteAtt() {
        clickElement(deleteAttachment);
        clickElement(buttonDeleteAtt);
    }
    public boolean edits() {
        return isElementDisplayed(successEditNotes);
    }
    public boolean Displayed() {
        return isElementDisplayed(successCreateNotes);
    }
    public void clickCard(){
        clickElement(cardBoard);
    }
    public void clickCard2(){
        clickElement(cardBoard1);
    }
    public void createNotes(){
        clickElement(notes);
        setTextElement(inputNotes,BoardData.getNotes());
        clickElement(buttonSaveNotes);
    }
    public void undoNotes(){
        clickElement(buttonEditNotes);
        setTextElement(inputNotes,BoardData.getNotes());
        clickElement(buttonUndo);
        clickElement(buttonSaveNotes);
    }
    public void redoNotes(){
        clickElement(buttonEditNotes);
        setTextElement(inputNotes,BoardData.getNotes());
        clickElement(buttonUndo);
        clickElement(buttonRedo);
        clickElement(buttonSaveNotes);
    }
    public void editNotes(){
        clickElement(buttonEditNotes);
        setTextElement(inputNotes,BoardData.getEditN());
        clickElement(buttonSaveNotes);
    }
    public void cancelEditNotes(){
        clickElement(buttonEditNotes);
        clickElement(buttonCloseNote);
    }

    public boolean success() {
        return isElementDisplayed(textCreate);
    }

    public void clickBoard() {
        clickElement(board);
    }

    public void createList() {
        clickElement(addList);
    }

    public void fillList() {
        setTextElement(inputList, BoardData.getAddList());
    }

    public void submitlist() {
        clickElement(buttonCreate);
    }

    public void cancelCreate() {
        clickElement(iconCLose);
    }

    public boolean successList() {
        return isElementDisplayed(textSuccesslist);
    }

    public void createPrivateCard() throws InterruptedException {
        clickElement(buttonAddList);
        setTextElement(fieldCardName, BoardData.getAddList());
        Thread.sleep(500);

    }

    public void createCard() throws InterruptedException {
        clickElement(buttonAddList);
        setTextElement(fieldCardName, BoardData.getAddList());
        Thread.sleep(500);
        clickElement(buttonAddCard);
    }
    public void clickButtonPrivate(){
        clickElement(buttonPrivateCard);
        clickElement(buttonAddCard);
    }

    public void cancelCreateCard() throws InterruptedException {
        clickElement(buttonAddList);
        setTextElement(fieldCardName, BoardData.getAddList());
        clickElement(buttonClose);
    }

}