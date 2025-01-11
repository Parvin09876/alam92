package SeleniumAssignment;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class YoutubeSeacrch {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayed\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        search.sendKeys("Automation Interview Question And Answer");

        WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        searchButton.click();
        Thread.sleep(2000);


        TakesScreenshot takePicture = (TakesScreenshot) driver;
        File picture = takePicture.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(picture, new File("./screenshotFile/.sc.png"));
        } catch (IOException exception){
            System.out.println("Exception : " +exception.getMessage());
        }


       
    }
}
