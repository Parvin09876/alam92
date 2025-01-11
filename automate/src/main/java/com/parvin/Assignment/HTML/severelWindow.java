package com.parvin.Assignment.HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class severelWindow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
        String newTab = driver.getWindowHandle();
        System.out.println(newTab);
        driver.findElement(By.cssSelector("a[href='//www.google.com']")).click();
        driver.findElement(By.xpath("(//a[@href='http://www.facebook.com'])[1]")).click();
        driver.findElement(By.cssSelector("a[href='http://www.yahoo.com']")).click();








    }
}
