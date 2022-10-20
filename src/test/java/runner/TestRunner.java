package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.SendEmail;
import org.testng.annotations.AfterSuite;

@CucumberOptions(
        tags = "@board1",
        features = {"classpath:features"},
        glue = {"classpath:stepdef"},
        plugin = {"pretty", "html:target/html-reports.html"},
        dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @AfterSuite
    public void sendEmail() {
        String[] args = new String[]{
                "asdaniel0310@gmail.com",
                "asdaniel0310@gmail.com",
//                "fakhri@cilsyfiolution.com",
                "Report Big Project - As Daniel",
                "Big Project Cucumber Report",
                "C:\\Users\\ACER\\Music\\bp baru\\Big-Project\\target\\html-reports.html"
        };
        SendEmail.main(args);
    }
}
