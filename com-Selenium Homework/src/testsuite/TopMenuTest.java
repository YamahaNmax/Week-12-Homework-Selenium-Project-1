package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        WebElement textComputer = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li/a"));
        textComputer.click();

        String actualText = driver.findElement(By.className("page-title")).getText();
        String expectedText = "Computers";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        WebElement textElectronics = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[2]/a"));
        textElectronics.click();

        String actualText = driver.findElement(By.className("page-title")).getText();
        String expectedText = "Electronics";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

        WebElement textApparel = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[3]/a"));
        textApparel.click();

        String actualText = driver.findElement(By.className("page-title")).getText();
        String expectedText = "Apparel";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        WebElement textDigitalDownloads = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[4]/a"));
        textDigitalDownloads.click();

        String actualText = driver.findElement(By.className("page-title")).getText();
        String expectedText = "Digital downloads";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        WebElement textBooks = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[5]/a"));
        textBooks.click();

        String actualText = driver.findElement(By.className("page-title")).getText();
        String expectedText = "Books";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        WebElement textJewelry = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[6]/a"));
        textJewelry.click();

        String actualText = driver.findElement(By.className("page-title")).getText();
        String expectedText = "Jewelry";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {

        WebElement textGiftCards = driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[7]/a"));
        textGiftCards.click();

        String actualText = driver.findElement(By.className("page-title")).getText();
        String expectedText = "Gift Cards";
        Assert.assertEquals(actualText, expectedText);
    }


    @After
    public void endTest() {
        closeBrowser();
    }

}


