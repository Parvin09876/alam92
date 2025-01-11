package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("Selenium Web Driver");
        driver.findElement(By.cssSelector("input[value='Google Search']")).click();

        WebElement firstResultTitle = driver.findElement(By.xpath("//h3"));
        String title = firstResultTitle.getText();
        System.out.println("First search result title : "+ title);

        WebElement firstResultsUrl = driver.findElement(By.xpath("//a[@jsname='UWckNb']"));
        String Link = firstResultsUrl.getAttribute("href");
        System.out.println("Search Complete " + Link);


    }
}
