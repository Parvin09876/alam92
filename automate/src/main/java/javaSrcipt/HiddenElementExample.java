package javaSrcipt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HiddenElementExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
       List<WebElement> radio = driver.findElements(By.cssSelector("input[id='male']"));
        int count = radio.size();
        driver.findElement(By.cssSelector("input[id='python']")).click();

        System.out.println("Total radio buttons " + count);
        for (int i = 0; i < count; i++) {
            int x = radio.get(i).getLocation().getX();
            int y = radio.get(i).getLocation().getY();
            System.out.println("(X,Y) : " + x + " " + y);
            if (x != 0) {
                radio.get(i).click();
                break;

            }
        }
    }

}