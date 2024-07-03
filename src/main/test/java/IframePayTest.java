import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IframePayTest {
    private static WebDriver driver;
    private static final String phoneNumber = "297777777";
    private static final String sum = "300";

    @BeforeAll
    public static void authorisation() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://mts.by");
        WebElement cookie = driver.findElement(By.xpath("//*[contains(@id, 'cookie-agree')]"));
        cookie.click();
        WebElement phoneInputField = driver.findElement(By.xpath("//*[contains(@id, 'connection-phone')]"));
        WebElement sumInputField = driver.findElement(By.xpath("//*[contains(@id, 'connection-sum')]"));
        WebElement continueButton = driver.findElement(By.xpath("//*[contains(@id, 'pay-connection')]/button"));
        phoneInputField.click();
        phoneInputField.sendKeys(phoneNumber);
        sumInputField.click();
        sumInputField.sendKeys(sum);
        continueButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement iframeElement = driver.findElement(By.xpath("//*[contains(@class, 'bepaid-iframe')]"));
        driver.switchTo().frame(iframeElement);
    }

    @Test
    public void iframePayFieldsTest() {

        WebElement sumPay = driver.findElement(By.xpath("//*[contains(@class, 'pay-description__cost')]/span[1]"));
        WebElement phonePay = driver.findElement(By.xpath("//*[contains(@class, 'pay-description__text')]/span[1]"));
        WebElement cardNumber = driver.findElement(By.xpath("//*[contains(@class, 'content ng-tns-c46-1')]/label[1]"));
        WebElement validity = driver.findElement(By.xpath("//*[contains(@class, 'content ng-tns-c46-4')]/label[1]"));
        WebElement cvc = driver.findElement(By.xpath("//*[contains(@class, 'content ng-tns-c46-5')]/label[1]"));
        WebElement nameCardHolder = driver.findElement(By.xpath("//*[contains(@class, 'content ng-tns-c46-3')]/label[1]"));
        WebElement sumButton = driver.findElement(By.xpath("//*[contains(@class, 'colored disabled')]"));
        assertAll("Тестирование полей ввода для оплаты услуг связи",
                () -> assertEquals(sum + ".00 BYN", sumPay.getAttribute("innerHTML")),
                () -> assertEquals("Оплата: Услуги связи\nНомер:375" + phoneNumber, phonePay.getAttribute("innerHTML")),
                () -> assertEquals("Номер карты", cardNumber.getAttribute("innerHTML")),
                () -> assertEquals("Срок действия", validity.getAttribute("innerHTML")),
                () -> assertEquals("CVC", cvc.getAttribute("innerHTML")),
                () -> assertEquals("Имя держателя (как на карте)", nameCardHolder.getAttribute("innerHTML")),
                () -> assertEquals(" Оплатить  " + sum + ".00 BYN <!---->", sumButton.getAttribute("innerHTML"))
        );
    }

    @Test
    public void iframePayLogoTest() {
        List<WebElement> payPartners = driver.findElements(By.xpath("//*[contains(@class, 'cards-brands ng-tns-c46-1')]//div/img"));
        List<String> payPartnersExpected = new ArrayList<>(Arrays.asList("https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/mastercard-system.svg", "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/visa-system.svg", "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/belkart-system.svg", "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/mir-system-ru.svg", "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/maestro-system.svg"));
        List<String> payPartnersNew = new ArrayList<>();
        for (WebElement payPartner : payPartners) {
            payPartnersNew.add(payPartner.getAttribute("src"));
        }
        assertEquals(payPartnersExpected, payPartnersNew);
    }

    @AfterAll
    public static void closeChrome() {
        driver.close();
    }
}

