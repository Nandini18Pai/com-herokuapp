package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {

    static String browser = "Edge";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println(" Wrong Browse name");
        }

        driver.get(baseUrl); // Open URL
        driver.manage().window().maximize(); // MaximiseBrowser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25)); //   Implicit wait to Drive
        System.out.println(" Title of the Page: " + driver.getTitle()); // Print the title of the page
        System.out.println(" Current URL : " + driver.getCurrentUrl()); //  Print the current url
        System.out.println("Page Source: " + driver.getPageSource());  // Print the page source
        WebElement emailField = driver.findElement(By.id("username")); // Enter the email to email field
        emailField.sendKeys("tomsmith");  // action
        WebElement passwordField = driver.findElement(By.id("password")); // Enter the password to password field
        passwordField.sendKeys("SuperSecretPassword!");// action
        driver.close(); //Close the browser

    }


}
