package com.parvin.Assignment.alarm;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class practiceAssignment {
    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//       driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("Selenium WebDriver");
//       driver.findElement(By.cssSelector("input[class='gNO89b']")).click();
//
//        WebElement firstresultTitle = driver.findElement(By.xpath("(//h3)[1]"));
//        String title = firstresultTitle.getText();
//        System.out.println("First search result enforcement: "+ title);
//
//        WebElement firstResultUrl = driver.findElement(By.xpath("(//h3)[1]/ancestor::a[1]"));
//        String Url = firstResultUrl.getAttribute("href");
//        System.out.println(Url);
//
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://facebook.com");
//
//        driver.findElement(By.cssSelector("input[type='Text']")).sendKeys("ahmedrazu160@gmail.com");
//
//         TakesScreenshot pictureOfFacebook = (TakesScreenshot) driver;
//         File screenshotOfFacebook = pictureOfFacebook.getScreenshotAs(OutputType.FILE);
//         try{ FileUtils.copyFile(screenshotOfFacebook, new File("./sc/sc.png"));
//
//         }catch (IOException exception){
//             System.out.println("Exception: "+ exception.getMessage());


//            WebDriver driver = new ChromeDriver();
//            driver.get("https://www.Youtube.com/");
//            driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Kids Intelligent Videos");
//            driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();

//        WebDriver driver = new ChromeDriver();
//        driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
//        driver.manage().window().maximize();
//
//        String mainab = driver.getWindowHandle();
//        System.out.println(mainab);
//
//        driver.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
//
//        Set<String> allTabs = driver.getWindowHandles();
//        System.out.println(allTabs);
//
//        List<String> alltabList = new ArrayList<>(allTabs);
//        driver.switchTo().window(alltabList.get(1));
//        driver.get("https://google.com");
//       driver.switchTo().window(mainab);
//
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
//        driver.manage().window().maximize();
//        String mainstream = driver.getWindowHandle();
//        System.out.println(mainstream);
//        driver.findElement(By.cssSelector("a[href='//www.google.com']")).click();
//        Set<String> allTablets= driver.getWindowHandles();
//        System.out.println(allTablets);
//        List<String> alltabletslist = new ArrayList<>(allTablets);
//        driver.switchTo().window(alltabletslist.get(1));
//        driver.get("a[href='http://www.yahoo.com']");
//        driver.switchTo().window(mainstream);


//

//                WebDriver driver = new ChromeDriver();
//                driver.manage().window().maximize();
//
//                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
//
//                driver.get("https://learn-automation.com/selenium-webdriver-tutorial-for-beginners/");
//                System.out.println(driver.getTitle());
//                driver.quit();


//                WebDriver driver = new ChromeDriver();
//                driver.manage().window().maximize();
//
//                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
//                driver.get("https://facebook.com");
//                System.out.println(driver.getTitle());
//                driver.quit();


        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/sayed/IdeaProjects/Automation/src/main/java/com/parvin/MyseleniumPractice/Iframe-Automation.html");
        List<WebElement> allFrame = driver.findElements(By.xpath("iframe[src='https://www.hyrtutorials.com/']"));
        System.out.println(allFrame.size());
       // WebElement thirdframe = driver.findElement(By.xpath())


    }

}
