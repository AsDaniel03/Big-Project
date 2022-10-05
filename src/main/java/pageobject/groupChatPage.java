package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tesdata.groupChatData;

public class groupChatPage extends BasePage {
    private final groupChatData groupchatData;
    public groupChatPage(WebDriver driver) {
        super(driver);
        groupchatData=new groupChatData();
    }
    @FindBy(xpath = "//div[@class='Card_Card__2LWWW']")
    private WebElement bigpro;
    @FindBy(xpath = "//h1[.='Group Chat']")
    private WebElement groupChat;
    @FindBy(xpath ="//div[@class='fr-element fr-view']")
    private WebElement setMessage;
    @FindBy(xpath = "//div[@class='CreateMessage_send__2f1ZQ']//*[name()='svg']")
    private WebElement buttonMessage;
    @FindBy(xpath = "//p[.='Group Chat']")
    private WebElement pageHeading;

//    text
    @FindBy(xpath = "//h1[.='Home']")
    private WebElement textHomePage;
    @FindBy(xpath = "//p[.='Group Chat Members (5)']")
    private WebElement textMember;
    @FindBy(xpath = "//p[.='no comment']")
    private WebElement textMessage;
    @FindBy(xpath = "//div[@class='modal-title h4']")
    private WebElement textDelete;
    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    private WebElement endDelete;

    @FindBy(xpath = "//body/div[@id='root']/div[@class='GroupChatPage_container__2cpwQ']/div[@class='MainGroupChatSection_container__3-P_S']/div[@class='MainGroupChatSection_dropzone__1nSfG']/div[@class='MainGroupChatSection_box__1a2DO']/div[@class='MainGroupChatSection_messages__1wQ0n']/div[@class='OverlayButton_container__3kxDV']/div[@class='OverlayButton_box__2jFLd']/div[@id='list-groupChat-messages-section']/div[@class='infinite-scroll-component__outerdiv']/div[@class='infinite-scroll-component ']/div[1]/div[1]/div[1]/div[1]/div[1]//*[name()='svg']")
    private WebElement menuMessage;
    @FindBy(xpath = "//p[.='Delete Message']")
    private WebElement deleteMessage;
    @FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[1]//div[@class='Message_balloonMessage__3dmkS']")
    private WebElement message;
    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement buttonDetele;
    @FindBy(css = "[data-testid='CloseIcon']")
    private WebElement close1;
    @FindBy(xpath = "//span[.='×']")
    private WebElement close2;




public boolean isDisplayed(){
return isElementDisplayed(textHomePage);
}
public boolean Displayed(){
 return isElementDisplayed(textMember);
    }
public String getPageHeading(){
    return getTextElement(textMessage);
}
public void clickBigPro(){
    clickElement(bigpro);
}
public void clickGroupChat(){
    clickElement(groupChat);
}
public void fillMessage(){
    setTextElement(setMessage,groupchatData.getMessage());

}
public void sendMessage(){
    clickElement(buttonMessage);
}
public boolean getMessage(){
    return isElementDisplayed(textMessage);

}
public void clickMenu(){
    clickElement(message);
    clickElement(menuMessage);
}
public void deleteMessage1(){
    clickElement(deleteMessage);
}
public void deleteMessge2(){
    clickElement(buttonDetele);
}
public boolean getDeleteMessage(){
    return isElementDisplayed(textDelete);
}
public boolean endDeleteText(){
    return isElementDisplayed(endDelete);
}
public void clickCLose1(){
    clickElement(close1);
}
public void clickClose2(){
    clickElement(close2);
}

}
