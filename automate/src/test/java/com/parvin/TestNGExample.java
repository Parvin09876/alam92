package com.parvin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TestNGExample {
    WebDriver driver;

    @BeforeTest
    public void Brower(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        options.addArguments("start-maximized");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("Its Working...");
    }
    @Test(priority = 2)
    public void testLogin(){
        driver.get("https://qbek.github.io/selenium-exercises/en/");
        driver.findElement(By.xpath("//a[@href='radio_buttons.html']")).click();

        List<WebElement>radiobuttons= driver.findElements(By.cssSelector("input[type='radio']"));
        System.out.println(radiobuttons.size());
        radiobuttons.get(1).click();
        for (WebElement Local_radio:radiobuttons){
            String value = Local_radio.getAttribute("value");
            System.out.println("Value of the Radio Buttons are ==> "+ value);
            if (value.equalsIgnoreCase("polskieradio")){
                Local_radio.click();
            }
        }
    }
    @AfterMethod
    public void print(){
        System.out.println("After method");
        // driver.quit();
    }
    
    @Test(priority = 1)
    public void testlogin2(){
        driver.get("https://qbek.github.io/selenium-exercises/en/");
        driver.findElement(By.xpath("//a[@href='check_boxes.html']")).click();
        List<WebElement> checkboxs = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
        System.out.println(checkboxs.size());
        checkboxs.get(2).click();
        checkboxs.get(1).click();
        checkboxs.get(0).click();
        for(int i = 0 ; 1 < checkboxs.size(); i++){
            System.out.println(checkboxs.get(i).getAttribute("name"));

        }
    }
    @AfterMethod
    public void afterTest(){
        System.out.println("after Test");
        //driver.quit();
    }
}
