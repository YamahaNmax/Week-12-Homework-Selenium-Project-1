package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        WebElement textRegister = driver.findElement(By.className("ico-register"));
        textRegister.click();

        String actualText = driver.findElement(By.className("ico-register")).getText();
        String expectedText = "Register";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        WebElement textRegister = driver.findElement(By.className("ico-register"));
        textRegister.click();

        WebElement genderButton = driver.findElement(By.id("gender-male"));
        genderButton.click();

        WebElement firstNameField = driver.findElement(By.id("FirstName"));
        firstNameField.sendKeys("Miten");

        WebElement lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.sendKeys("Patel");

        WebElement dateField = driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/select"));
        dateField.sendKeys("15");

        WebElement monthField = driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/select[2]"));
        monthField.sendKeys("August");

        WebElement yearField = driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/select[3]"));
        yearField.sendKeys("1998");

        WebElement fieldLastName = driver.findElement(By.id("Company"));
        fieldLastName.sendKeys("Software Testing");

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("m4mitzcodebuster@gmail.com");

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Codebuster");

        WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordField.sendKeys("Codebuster");

        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();

    }

    @After
    public void endTest() {
        closeBrowser();
    }

}
