import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Configuration {
    public static String phoneNumber;
    public static String sum;
    public static WebDriver driver;

    public static WebDriver openPage() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://mts.by");
        WebElement cookie = driver.findElement(By.xpath("//*[contains(@id, 'cookie-agree')]"));
        cookie.click();
        return driver;
    }

    public void testData(String phoneNumber, String sum) {
        Configuration.sum = sum;
        Configuration.phoneNumber = phoneNumber;
        WebElement phoneInputField = driver.findElement(By.xpath("//*[contains(@id, 'connection-phone')]"));
        WebElement sumInputField = driver.findElement(By.xpath("//*[contains(@id, 'connection-sum')]"));
        WebElement continueButton = driver.findElement(By.xpath("//*[contains(@id, 'pay-connection')]/button"));
        phoneInputField.click();
        phoneInputField.sendKeys(phoneNumber);
        sumInputField.click();
        sumInputField.sendKeys(sum);
        continueButton.click();
    }

    public static void closeDriver() {
        driver.close();
    }
}