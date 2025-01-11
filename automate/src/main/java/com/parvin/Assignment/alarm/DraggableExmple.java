package com.parvin.Assignment.alarm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableExmple {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://jqueryui.com/draggable/");
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
//        Actions noAction = new Actions(driver);
//        WebElement src =  driver.findElement(By.xpath("//div[@id='draggable']"));
//        Thread.sleep(3000);
//       noAction.dragAndDropBy(src,250,50).perform();

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
        Actions noAct = new Actions(driver);
        WebElement hrc = driver.findElement(By.xpath("//div[@id='draggable']"));
        Thread.sleep(3000);
        noAct.dragAndDropBy(hrc,250,100).perform();








    }
}
