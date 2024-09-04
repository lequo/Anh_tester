package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lequo\\Downloads\\moi_truong_test\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open Facebook
            driver.get("https://www.facebook.com");

            // You can add additional actions here, such as interacting with the page

        } finally {
            // Close the browser
            Thread.sleep(2000);
        }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    }    // to see how IntelliJ IDEA suggests fixing it.
}