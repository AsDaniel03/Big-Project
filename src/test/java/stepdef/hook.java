package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.HomePage;

public class hook {
    protected static WebDriver driver;

    @Given("I navigated to homepage")
    public void openLandingPage() {

        driver.get("https://staging.cicle.app/");
    }

    @And("I login with existing account")
    public void loginWithExistingAccount() {
        HomePage homePage = new HomePage(driver);
        homePage
                .clickSignIn();
        homePage.loginExistingAccount();

    }
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
