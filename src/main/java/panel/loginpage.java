package panel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import common.BaseSetUp;

public class loginpage extends BaseSetUp {
    private By username_ip = By.xpath("//input[@placeholder='Username']");
    private By password_ip = By.xpath("//input[@placeholder='Password']");
    private By login_btn = By.xpath("//button[normalize-space()='Login']");


    public loginpage(WebDriver driver) {
        this.driver = driver;
    }

    public void enter_username(String username) {
        WebElement user_box = driver.findElement(username_ip);
        user_box.sendKeys(username);
    }

    public void enter_password(String password) {
        WebElement password_box = driver.findElement(password_ip);
        password_box.sendKeys(password);
    }

    public void enter_login() {
        WebElement login_button = driver.findElement(login_btn);
        login_button.click();
    }

    public void login(String username, String password) {
        enter_username(username);
        enter_password(password);
        enter_login();
        String Url_expected = driver.getCurrentUrl();
        String url_actual= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        if(driver.getCurrentUrl().equals(url_actual)){
            System.out.println("đunng ro ");
        }
        else {
            System.out.println("sai");
        }
    }


}
