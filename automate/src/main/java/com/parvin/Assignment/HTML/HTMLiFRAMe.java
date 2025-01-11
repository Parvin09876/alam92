package com.parvin.Assignment.HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public class HTMLiFRAMe {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/sayed/IdeaProjects/automate/src/main/java/com/parvin/Assignment/HTML/iFrameHTML.html");

        List<WebElement> browser = driver.findElements(By.xpath("//iframe"));
        System.out.println(browser.size());

       // driver.switchTo().frame(2);
       //driver.switchTo().frame("selenium");
       WebElement secondbrowser = driver.findElement(By.xpath("//iframe[@id='w3c']"));
       driver.switchTo().frame(secondbrowser);
       WebElement skipSign = driver.findElement(By.cssSelector("button#btn2"));
       skipSign.click();

       driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@href=\"https://www.google.com\"]")).click();








    }
}
