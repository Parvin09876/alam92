package com.parvin.Assignment;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("Selenium WebDriver");
        driver.findElement(By.cssSelector("input[value='Google Search']")).click();

       WebElement firstResultTitle = driver.findElement(By.xpath("//h3"));
        String title = firstResultTitle.getText();
        System.out.println("First search result title : "+ title);

        WebElement firstResultzUrl = driver.findElement(By.xpath("//a[@jsname='UWckNb']"));
        String Url = firstResultzUrl.getAttribute("href");
        System.out.println("First search result URL : "+ Url);

//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//        driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("Selenium Webdriver");
//        driver.findElement(By.cssSelector("input[value='Google Search']")).click();
//        WebElement firstResultTitle = driver.findElement(By.xpath("//h3"));
//        String title = firstResultTitle.getText();
//        System.out.println(" Fist search result title : '+ title");
//        WebElement firstResultUrl = driver.findElement(By.xpath("//a[@jsname=UWckNb']"));
//        String Url = firstResultUrl.getAttribute("href");
//        System.out.println("First search result URL : "+ Url);


    }
}
