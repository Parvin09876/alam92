package MultipleLogin;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTest {
    WebDriver driver;
    @Before
    public void setUp(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("User is on the login page")
    public void User_is_on_the_login_page(){
        driver.get("https://www.saucedemo.com/");
    }
    @When("User enters {string} and {string}")
    public void User_enters_username_and_password(String username, String password) throws InterruptedException{

       driver.findElement(By.id("user-name")).sendKeys(username);
       driver.findElement(By.id("password")).sendKeys(password);
       driver.findElement(By.id("login-button")).click();
       Thread.sleep(3000);
    }
    @Then("User should see {string}")
    public void User_should_see_result(String result){
        WebElement productElement= driver.findElement(By.xpath("//span[@data-test='title']"));
        System.out.println(productElement.getText());
    }
   @After
    public void tearDown(){
        driver.close();
   }

}
