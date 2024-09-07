package Thuchanh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class setup {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    public  String url = "https://hrm.anhtester.com/";
    public  By username_ip = By.xpath("//input[@placeholder='Username']");
    public  By password_ip = By.xpath("//input[@placeholder='Password']");
    public  By login_btn = By.xpath("(//button[normalize-space()='Login'])[1]");


    public setup( ){

    }

    public void setups(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lequo\\Downloads\\moi_truong_test\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // Khởi tạo driver
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }


    public void login(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(username_ip).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(password_ip).sendKeys(password);
        Thread.sleep(200);
        driver.findElement(login_btn).click();

    }

    public void Forgot_password() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header'])[1]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//input[@placeholder='Username'])[1]")).sendKeys("Admin");
        driver.findElement(By.xpath("(//button[normalize-space()='Cancel'])[1]")).click();
    }

    public void sercher(){

    }

}
