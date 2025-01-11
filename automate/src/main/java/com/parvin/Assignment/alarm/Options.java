package com.parvin.Assignment.alarm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.Arrays;

public class Options {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("star-maximized");

        chromeOptions.addExtensions(new File("C:\\Users\\sayed\\Downloads\\Skins-for-YouTube-player-Chrome-Web-Store.crx"));
        chromeOptions.addArguments("--lang=bn");

        chromeOptions.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
        chromeOptions.setExperimentalOption("useAutomationExtension", false);

       WebDriver driver= new ChromeDriver(chromeOptions);
        driver.get("https://google.com");



    }

}
