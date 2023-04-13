package test;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {

        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to amazon
        driver.get("https://www.amazon.com");
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        Assert.assertEquals(expectedUrl,currentUrl);
        System.out.println("land on amazon home page success");

        //type "java book" on the search bar
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book");
        System.out.println("type java book on the search bar success");

        //click on search button
        driver.findElement(By.id("nav-search-submit-button")).click();
        System.out.println("click on search button success");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon.com : java book";
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("validate the title success");

        driver.close();
        System.out.println("browser close success");
    }
}
