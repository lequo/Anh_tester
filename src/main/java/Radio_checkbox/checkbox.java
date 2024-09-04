package Radio_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lequo\\Downloads\\moi_truong_test\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");

        driver.findElement(By.xpath("//label[@class='ui-btn ui-corner-all ui-btn-inherit ui-btn-icon-left ui-checkbox-off']")).click();

        boolean isSelected = driver.findElement(By.xpath("//label[@for='checkbox-mini-0']")).isSelected();
        System.out.println(isSelected);



    }
}
