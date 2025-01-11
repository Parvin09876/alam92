package javaSrcipt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingCalender {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.globalsqa.com/demo-site/datepicker/");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
        driver.findElement(By.cssSelector("input#datepicker")).click();
        List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
        int total_nodes = alldates.size();
        System.out.println("Total nodes : " + total_nodes);
        for (int i = 0; i < total_nodes; i++){
            String date = alldates.get(i).getText();
            alldates.get(i).click();
            break;
            
        }


    }
}
