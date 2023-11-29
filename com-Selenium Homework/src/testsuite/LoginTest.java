package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        WebElement textLogin = driver.findElement(By.className("ico-login"));
        textLogin.click();

        String actualText = driver.findElement(By.xpath("//div[@class='master-wrapper-content']/div/div/div/div/h1")).getText();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test

    public void userShouldLoginSuccessfullyWithValidCredentials() {

        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();

        WebElement emailLoginField = driver.findElement(By.id("Email"));
        emailLoginField.sendKeys("m4mitzcodebuster@gmail.com");

        WebElement passwordLoginField = driver.findElement(By.id("Password"));
        passwordLoginField.sendKeys("Codebuster");

        WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginButton.click();

        String actualText = driver.findElement(By.className("ico-logout")).getText();
        String expectedText = "Log out";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test

    public void verifyTheErrorMessage() {

        WebElement loginLink = driver.findElement(By.className("ico-login"));
        loginLink.click();

        WebElement emailLoginField = driver.findElement(By.id("Email"));
        emailLoginField.sendKeys("m4mitzcodebuster1@gmail.com");

        WebElement passwordLoginField = driver.findElement(By.id("Password"));
        passwordLoginField.sendKeys("Codebuster1");

        WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginButton.click();

        String actualText = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[3]/div/div/div/div[2]/div/div[2]/form/div")).getText();
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualText, expectedText);


    }

    @After
    public void endTest() {
        closeBrowser();
    }

}
