package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import panel.loginpage;
import common.BaseSetUp;

public class loginTest extends BaseSetUp {

    private loginpage loginpage;

    @BeforeClass
    public void setUp() {

        loginpage = new loginpage(driver);
    }

    @Test
    public void testLogin() {
        System.out.println("Check driver: " + driver);
        loginpage = new loginpage(driver);
        loginpage.login("Admin", "admin123");
    }
}
