package com.parvin.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        JavascriptExecutor Nishapu = (JavascriptExecutor)driver;
        System.out.println(Nishapu.executeScript("return document.title"));
        WebElement Email = driver.findElement(By.cssSelector("input[type='text']"));
        Nishapu.executeScript("arguments[0].setAttribute('style','background: Yellow')",Email);
        WebElement Mail = driver.findElement(By.cssSelector("div#passContainer"));
        WebElement raizz =driver.findElement(By.cssSelector("input#pass"));

        Nishapu.executeScript("arguments[0].setAttribute('style','background: Grey')", Mail);
        Nishapu.executeScript("arguments[0].setAttribute('style','background: red')", raizz);

    }
}
