    package panel;

    import dangnhap.dang_nhap;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.support.ui.WebDriverWait;
    import org.openqa.selenium.By;
    import org.openqa.selenium.chrome.ChromeDriver;
    import java.time.Duration;

    public class Admin extends dang_nhap {
        public static WebDriver driver;
        protected static WebDriverWait wait;

        public class job {


        }


        public static void main(String[] args) {
            Admin admin = new Admin();
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\lequo\\Downloads\\moi_truong_test\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver(); // Khởi tạo WebDriver
            wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Khởi tạo WebDriverWait
            driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().window().maximize();
            admin.setup();
            admin.login();
            admin.login_success();
            driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
            driver.findElement(By.xpath("//span[normalize-space()='Job']")).click();
            driver.findElement(By.xpath("//li[@class='--active oxd-topbar-body-nav-tab --parent --visited']//li[1]")).click();
            admin.return_s();
        }
    }
