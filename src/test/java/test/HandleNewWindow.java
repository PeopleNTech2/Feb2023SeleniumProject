package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HandleNewWindow {
    public static void main(String[] args) throws InterruptedException {
        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to amazon
        driver.get("https:rahulshettyacademy.com/AutomationPractice/");

        //click on the button to open a new window then garb the test from the web element
        driver.findElement(By.id("openwindow")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String parentWind = iterator.next();
        String childWind = iterator.next();

        driver.switchTo().window(childWind);
        System.out.println("switch to child win success");
        String text = driver.findElement(By.cssSelector(".header-opening-time.text-lg-right.text-center p")).getText();
        System.out.println(text);

        Thread.sleep(3000);

        driver.close();

        driver.switchTo().window(parentWind);

        driver.close();
    }
}
