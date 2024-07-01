import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ContinueButtonTest {
    private static WebDriver driver;

    @BeforeAll
    public static void authorisation() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://mts.by");
        WebElement cookie = driver.findElement(By.xpath("//*[contains(@id, 'cookie-agree')]"));
        cookie.click();
    }

    @Test
    public void continueButtonTest() {
        WebElement phoneInputField = driver.findElement(By.xpath("//*[contains(@id, 'connection-phone')]"));
        WebElement sumInputField = driver.findElement(By.xpath("//*[contains(@id, 'connection-sum')]"));
        WebElement continueButton = driver.findElement(By.xpath("//*[contains(@id, 'pay-connection')]/button"));
        phoneInputField.click();
        phoneInputField.sendKeys("297777777");
        sumInputField.click();
        sumInputField.sendKeys("300");
        continueButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement iframeElement = driver.findElement(By.xpath("//*[contains(@class, 'bepaid-iframe')]"));
        new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeElement));
    }

    @AfterAll
    public static void closeChrome() {
        driver.close();
    }
}
