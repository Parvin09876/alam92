package javaSrcipt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/upload-file-demo");

        WebElement chooseFile = driver.findElement(By.id("file"));
        chooseFile.sendKeys("C:/Users/sayed/OneDrive/Desktop/Pictures/IMG_1765.jpg");

        String message = driver.findElement(By.id("error")).getText();

        System.out.println(message);
    }


}