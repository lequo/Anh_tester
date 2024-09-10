package testcase;

import common.BaseSetUp;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import panel.loginPanel;
import common.BaseSetUp;
import static java.sql.DriverManager.getDriver;

public class loginTest extends loginPanel {
    private WebDriver driver;
    public loginPanel loginPanel;
    public  BaseSetUp baseSetUp;

    public loginTest(WebDriver driver) {
        super(driver);
    }


    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }

    @Test()
    public void signIn() throws Exception {
        System.out.println(driver);
        loginPanel = new loginPanel(driver);

        Assert.assertTrue(loginPanel.verifySignInPageTitle(), "Sign In page title doesn't match");
        Assert.assertTrue(loginPanel.verifySignInPageText(), "Header page text not matching");

        loginPanel.signin("thaian@mailinator.com", "Demo@123", "123456");

    }


    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
