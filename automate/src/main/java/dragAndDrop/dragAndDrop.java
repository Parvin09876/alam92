package dragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class dragAndDrop {
    public static void main(String[] args) {

//        WebDriver driver= new ChromeDriver();
//       // driver.manage().window().maximize();
//        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
//
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='js-iframe active']")));
//
//        Actions act =new Actions(driver);
//        WebElement src = driver.findElement(By.xpath("//span[text()='Nancy Atherton']"));
//        WebElement dest = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
////        act.dragAndDrop(src,dest).perform();
//         act.clickAndHold(src)
//                 .pause(Duration.ofSeconds(3))
//                 .moveToElement(dest)
//                 .pause(Duration.ofSeconds(3))
//                 .release()
//                 .build()
//                 .perform();

        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='js-iframe active']")));
        Actions pact = new Actions(driver);
        WebElement hrc = driver.findElement(By.xpath("//span[text()='Nancy Atherton']"));
        WebElement dst = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
       // pact.dragAndDrop(hrc,dst).perform();
        pact.clickAndHold(hrc)
                .pause(Duration.ofSeconds(2))
                .moveToElement(dst)
                .pause(Duration.ofSeconds(2))
                .release()
                .build()
                .perform();











    }
}
