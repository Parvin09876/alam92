package com.parvin.definition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginDefinition {
    WebDriver driver;

    @Before
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Given("User is on the login page")
    public void user_is_on_the_login_page(){
        driver.get("https://www.saucedemo.com/");
    }
    @When("User enters username {string} and password as {string}")
    public void user_enters_username_and_password_as (String userName, String password){
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully(){
        WebElement productsElement = driver.findElement(By.xpath("//span[@data-test='title']"));

        //String actualProducts = productsElement.getText();
        //Assert.assertEquals(actualProducts, "product", "User was not log in");

        System.out.println(productsElement.getText());
        }
        @After
                public void teardown(){
            driver.quit();
        }
    }

