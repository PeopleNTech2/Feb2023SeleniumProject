package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.List;

public class SuggestionDropdown {
    public static void main(String[] args) throws InterruptedException {
        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to amazon
        driver.get("https:rahulshettyacademy.com/AutomationPractice/");

        //select canada on the suggestion dropdown
        driver.findElement(By.id("autocomplete")).sendKeys("can");
        Thread.sleep(1000);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

        Thread.sleep(3000);

        driver.close();
    }
}
