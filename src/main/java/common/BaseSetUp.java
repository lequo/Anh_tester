package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseSetUp {
    static String driverPath = "C:\\Users\\lequo\\Downloads\\moi_truong_test\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
    protected WebDriver driver;

    public BaseSetUp() {
    }

    @Parameters({ "browserType", "appURL" })
    @BeforeClass
    public void initializeTestBaseSetup(String browserType, String appURL) {
        try {
            setDriver(browserType, appURL);
        } catch (Exception e) {
            System.out.println("Error initializing WebDriver: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() throws Exception {
        if (driver != null) {
            Thread.sleep(2000);
            driver.quit();
        }
    }

    private void setDriver(String browserType, String appURL) {
        if ("chrome".equalsIgnoreCase(browserType)) {
            driver = initChromeDriver(appURL);
        }
    }

    private WebDriver initChromeDriver(String appURL) {
        System.out.println("Launching Chrome browser...");
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}
