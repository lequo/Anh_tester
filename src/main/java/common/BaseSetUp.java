package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseSetUp {
    static String dvierpath = "C:\\Users\\lequo\\Downloads\\moi_truong_test\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
    private WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

    public  void setDriver(String browsertyle, String url){
        switch (browsertyle){
            case "chrome":
                driver = initChromeDriver(url);
                break;
        }
    }

    @Parameters({ "browserType", "appURL" })
    @BeforeClass
    public void initializeTestBaseSetup(String browserType, String appURL) {
        try {
            // Khởi tạo driver và browser
            setDriver(browserType, appURL);
        } catch (Exception e) {
            System.out.println("Error..." + e.getStackTrace());
        }
    }

    @AfterClass
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

    private static WebDriver initChromeDriver(String appURL) {
        System.out.println("Launching Chrome browser...");
        System.setProperty("webdriver.chrome.driver", dvierpath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

}
