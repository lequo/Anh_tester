package Thuchanh;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Du_an_test extends setup {
    setup s = new setup();

    public void login() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder='Username'])[1]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]")).click();
    }

    public void Forgot_password() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header'])[1]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//input[@placeholder='Username'])[1]")).sendKeys("Admin");
        driver.findElement(By.xpath("(//button[normalize-space()='Cancel'])[1]")).click();
    }

    public void Admin() throws InterruptedException {
        Thread.sleep(20000);
        driver.findElement(By.xpath("//a[normalize-space()='']"));

    }


    public static void main(String[] args) throws InterruptedException {
       Du_an_test d1 = new Du_an_test();
       d1.setups();
       d1.Forgot_password();
       d1.login();
       d1.Admin();
    }
}

