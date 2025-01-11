package com.parvin.Assignment.alarm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class alarmB0x {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        WebElement alarButton = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
         alarButton.click();

        Alert alarmBox = driver.switchTo().alert();
        System.out.println(alarmBox.getText());
        alarmBox.dismiss();

//
//        WebElement alarButton = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
//        alarButton.click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
//
//        Thread.sleep(2000);
//        Alert alarmCase = driver.switchTo().alert();
//        System.out.println(alarmCase.getText());
//        alarmCase.accept();

    }
}
