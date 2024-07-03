import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MtsPayTest {
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
    public void payBlockFieldsTest() {
        WebElement connectionPhoneNumber = driver.findElement(By.xpath("//*[contains(@id, 'connection-phone')]"));
        WebElement connectionSum = driver.findElement(By.xpath("//*[contains(@id, 'connection-sum')]"));
        WebElement connectionEmail = driver.findElement(By.xpath("//*[contains(@id, 'connection-email')]"));
        WebElement internetPhoneNumber = driver.findElement(By.xpath("//*[contains(@id, 'internet-phone')]"));
        WebElement internetSum = driver.findElement(By.xpath("//*[contains(@id, 'internet-sum')]"));
        WebElement internetEmail = driver.findElement(By.xpath("//*[contains(@id, 'internet-email')]"));
        WebElement instalmentScore = driver.findElement(By.xpath("//*[contains(@id, 'score-instalment')]"));
        WebElement instalmentSum = driver.findElement(By.xpath("//*[contains(@id, 'instalment-sum')]"));
        WebElement instalmentEmail = driver.findElement(By.xpath("//*[contains(@id, 'instalment-email')]"));
        WebElement arrearsScore = driver.findElement(By.xpath("//*[contains(@id, 'score-arrears')]"));
        WebElement arrearsSum = driver.findElement(By.xpath("//*[contains(@id, 'arrears-sum')]"));
        WebElement arrearsEmail = driver.findElement(By.xpath("//*[contains(@id, 'arrears-email')]"));
        assertAll("Тестирование полей ввода для разных видов платежей",
                () -> assertEquals("Номер телефона", connectionPhoneNumber.getAttribute("placeholder")),
                () -> assertEquals("Сумма", connectionSum.getAttribute("placeholder")),
                () -> assertEquals("E-mail для отправки чека", connectionEmail.getAttribute("placeholder")),
                () -> assertEquals("Номер абонента", internetPhoneNumber.getAttribute("placeholder")),
                () -> assertEquals("Сумма", internetSum.getAttribute("placeholder")),
                () -> assertEquals("E-mail для отправки чека", internetEmail.getAttribute("placeholder")),
                () -> assertEquals("Номер счета на 44", instalmentScore.getAttribute("placeholder")),
                () -> assertEquals("Сумма", instalmentSum.getAttribute("placeholder")),
                () -> assertEquals("E-mail для отправки чека", instalmentEmail.getAttribute("placeholder")),
                () -> assertEquals("Номер счета на 2073", arrearsScore.getAttribute("placeholder")),
                () -> assertEquals("Сумма", arrearsSum.getAttribute("placeholder")),
                () -> assertEquals("E-mail для отправки чека", arrearsEmail.getAttribute("placeholder"))
        );
    }

    @AfterAll
    public static void closeChrome() {
        driver.close();
    }
}


