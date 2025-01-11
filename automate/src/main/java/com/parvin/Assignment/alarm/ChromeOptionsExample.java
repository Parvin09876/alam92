package com.parvin.Assignment.alarm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.sql.Array;
import java.util.Arrays;

public class ChromeOptionsExample {
    public static void main(String[] args) {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("start-maximized");
//
//        chromeOptions.addExtensions(new File("C:\\Users\\sayed\\Downloads\\Grammarly-AI-Writing-and-Grammar-Checker-App-Chrome-Web-Store.crx"));
//        chromeOptions.addArguments("--lang=bn");
//
//        chromeOptions.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
//        chromeOptions.setExperimentalOption("useAutomationExtension", false);
//
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        driver.get("https://google.com");
//
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        chromeOptions.addExtensions(new File("C:\\Users\\sayed\\Downloads\\Skins-for-YouTube-player-Chrome-Web-Store.crx"));
        chromeOptions.addArguments("--lang=bn");
        
        chromeOptions.setExperimentalOption("excludeSwitches",  Arrays.asList("enable-automation","disable-popup-blocking"));
        chromeOptions.setExperimentalOption("useAutomationExtension", false);


        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://google.com");



    }
}
