package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tesdata.groupChatData;

public class HomePage extends BasePage {
    private final groupChatData groupchatData;
    public HomePage(WebDriver driver) {
        super(driver);
    groupchatData=new groupChatData();
    }

    @FindBy(xpath = "//p[.='Login with Google Account']")
    private WebElement buttonLogin;

    @FindBy(id ="identifierId")
    private WebElement email;
    @FindBy(name ="password")
    private WebElement password;
    @FindBy(xpath ="//span[.='Berikutnya']")
    private WebElement buttonNext;
    @FindBy(xpath ="//h1[normalize-space()='Sekolah QA']")
    private WebElement selectProject;
    @FindBy(xpath = "//img[@alt='logo']")
    private WebElement logo;
    @FindBy(xpath = "//h1[normalize-space()='Sekolah QA']")
    private WebElement textHomePage;

    public void clickSignIn() {
        clickElement(buttonLogin);
    }
    public void loginExistingAccount(){
        setTextElement(email,groupchatData.getEmail());
        clickElement(buttonNext);
        setTextElement(password,groupchatData.getPassword());
        clickElement(buttonNext);
        clickElement(selectProject);
    }
    public void clickLogo(){
        clickElement(logo);
    }
    public boolean navigatedHomepage(){
        return isElementDisplayed(textHomePage);

    }
}
