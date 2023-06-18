package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class UsernameTesting {
    public static void main(String[] args) {
        String baseUrl = " http://the-internet.herokuapp.com/login";

        // Setup chrome browser
        WebDriver driver = new ChromeDriver();
        // Open URL
        driver.get(" http://the-internet.herokuapp.com/login");
        // Maximise the page
        driver.manage().window().maximize();
        // we give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Print the title of the page
        System.out.println(" Title os the page: " + driver.getTitle());
        // Print the current url
        System.out.println(" Current URL: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println(" Page Source: " + driver.getPageSource());
        //Enter the email to email field
        WebElement usernameField = driver.findElement(By.id("username"));
        // Action
        usernameField.sendKeys("tomsmith");
        // Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("password"));
        // Action
        passwordField.sendKeys("SuperSecretPassword!");
        // Close the browser
        driver.close();
    }

}
