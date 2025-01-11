package com.parvin.Assignment.alarm;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;

public class implicite {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement emailInput = driver.findElement(By.cssSelector("input[type='text']"));
        emailInput.click();
        emailInput.sendKeys("Zayanyameer@gmail.com");

//        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234567890");
//
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
//        driver.findElement(By.xpath("//button [text()='Automation Tools']")).click();
//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .ignoring(NoSuchElementException.class)
//                .pollingEvery(Duration.ofSeconds(1))
//                .withTimeout(Duration.ofSeconds(20));
//
//       // WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//            @Override
//           // public WebElement apply(WebDriver input) {
//                return null;
//             //  WebElement ele = driver.findElement(By.xpath("//p[text()='WebDriver']"));
//              //  return ele;
//            }
        }











    }

