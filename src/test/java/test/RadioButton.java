package test;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to amazon
        driver.get("https:rahulshettyacademy.com/AutomationPractice/");

        //handle radio button dynamically
        List<WebElement> radioButtons = driver.findElements(By.name("radioButton"));

        for (WebElement radioButton: radioButtons){
            if (radioButton.getAttribute("value").equals("radio3")){
                radioButton.click();
            }
        }

        Thread.sleep(3000);

        driver.close();
    }
}
