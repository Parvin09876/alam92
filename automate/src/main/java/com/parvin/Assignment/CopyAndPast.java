package com.parvin.Assignment;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPast {
    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.facebook.com");
//        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Zayan Yameer");
//        Actions Act = new Actions(driver);
//        Act.click(driver.findElement(By.cssSelector("input[type='text']")))
//                .keyDown(Keys.CONTROL)
//                .sendKeys("a")
//                .sendKeys("c")
//                .keyUp(Keys.CONTROL)
//                .sendKeys(Keys.TAB)
//                .keyDown(Keys.CONTROL)
//                .sendKeys("v")
//                .keyUp(Keys.CONTROL)
//                .perform();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("Zayan Yameer");
        Actions Act = new Actions(driver);
        Act.click(driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")))
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.TAB)
                .keyDown(Keys.CONTROL)
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .perform();





    }
}
