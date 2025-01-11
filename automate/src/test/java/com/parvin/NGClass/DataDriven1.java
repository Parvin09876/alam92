package com.parvin.NGClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven1 {
    @DataProvider(name = "testdata")
    public Object [][] alldata(){
        Object[][] data = new Object[3][2];
        data[0][0]="standard_user";
        data[0][1]="secret_sauce";

        data[1][0]= "problem_user";
        data[1][1]= "secret_sauce";

        data[2][0]= "deff1230";
        data[2][1]= "secret_sauce";
        return data;
    }
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }
    @Test(dataProvider = "testdata")
    public void login(String username, String password) throws InterruptedException{
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(2000);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();

    }

}
