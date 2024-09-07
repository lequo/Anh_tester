package Thuchanh;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Du_an_test extends setup {


    public static void main(String[] args) throws InterruptedException {
       Du_an_test d1 = new Du_an_test();
       d1.setups();
       d1.Forgot_password();
       d1.login("Admin","admin123");
    }


}

