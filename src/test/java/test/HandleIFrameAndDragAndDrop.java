package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleIFrameAndDragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        //open the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        System.out.println("browser launch success");
        //FirefoxDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        System.out.println("browser maximized success");

        //navigate to amazon
        driver.get("https://jqueryui.com/droppable/");

        //click on element inside the iFrame
        driver.switchTo().frame(0);
        System.out.println("switch to iframe success");

        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();

        Thread.sleep(3000);

        driver.close();
    }
}
