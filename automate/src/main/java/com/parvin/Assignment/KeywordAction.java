package com.parvin.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class KeywordAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Actions active = new Actions(driver);
        active.click(driver.findElement(By.cssSelector("textarea[class='gLFyf']")))
                .sendKeys("Apartment Homes")
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.ARROW_DOWN)
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.ENTER)
                .build().perform();
        

    }
}
