package dangnhap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class dang_nhap {
    protected WebDriver driver;
    protected WebDriverWait wait;


    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lequo\\Downloads\\moi_truong_test\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // Khởi tạo WebDriver
        wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Khởi tạo WebDriverWait
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }


    public void login(){
        // nhap vao o input
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        username.sendKeys("Admin");

        //nhap vao password
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.click();
        password.sendKeys("admin123");

        // click login button
        boolean bt_login = driver.findElement(By.xpath("//button[@type='submit']")).isSelected();
        System.out.println(bt_login);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public boolean login_success(){
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"); // Thay đổi URL thành URL của trang chính
    }


    public void return_s(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


    public static void main(String[] args) {
        dang_nhap test = new dang_nhap();
        test.setup();
        test.login();
        test.login_success();
        test.return_s();
    }
}
