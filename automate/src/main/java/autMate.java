import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class autMate{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
       // driver.findElement(By.cssSelector())
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        try {

            FileUtils.copyFile(screenshotFile, new File(  "./screenshotFile/sc.png"));
        } catch (IOException e){
            System.out.println( "Exception: " + e.getMessage() );
        }


    }
}