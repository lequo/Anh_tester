package Thuchanh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

public class setup {
    protected WebDriver driver;


    public static List<String> element(){
        String url = "https://hrm.anhtester.com/";
        By username_ip = By.xpath("(//input[@placeholder='Username'])[1]");
        By password_ip = By.xpath("//input[@id='iusername']");
        By login_btn = By.xpath("//input[@id='iusername']");
        List<String>  listString = new LinkedList<>();
        listString.add(username_ip.toString().replace("By.xpath: ", ""));
        listString.add(password_ip.toString());
        listString.add(login_btn.toString());
        return listString;
    }


    public void setups() {
        this.driver = driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lequo\\Downloads\\moi_truong_test\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(); // Khởi tạo driver
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

}
