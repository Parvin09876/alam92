package com.parvin.Assignment.alarm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class alarmBox2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.cssSelector("a[href='#Textbox']")).click();
        driver.findElement(By.cssSelector("button.btn.btn-info")).click();

        Alert warning = driver.switchTo().alert();
        System.out.println(warning.getText());

      //  warning.dismiss();

        warning.accept();
        WebElement warnbutton =driver.findElement(By.cssSelector("p#demo1"));
        System.out.println(warnbutton.getText());

        String sms = warnbutton.getText();

        if(sms.equalsIgnoreCase("Hello Automation Testing user How are you today")){
            System.out.println("You are welcome ");
        }else {
            System.out.println("You did mistake ");
        }


    }
}
