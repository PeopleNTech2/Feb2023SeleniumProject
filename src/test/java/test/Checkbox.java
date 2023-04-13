package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to amazon
        driver.get("https:rahulshettyacademy.com/AutomationPractice/");

        //check the second checkbox and make sure the 1st is unchecked, the second is checked and the third is unchecked
        driver.findElement(By.id("checkBoxOption2")).click();
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption2")).isSelected());
        System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption3")).isSelected());
        System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());

        Thread.sleep(3000);

        driver.close();
    }
}
