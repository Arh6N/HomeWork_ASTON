import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MtsClassTest {
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
    @Order(1)
    public void testBlockTitle() {
        WebElement blockTitle = driver.findElement(By.xpath("//*[contains(@class, 'pay__wrapper')]/h2"));
        assertEquals("Онлайн пополнение\nбез комиссии", blockTitle.getText());
    }

    @Test
    @Order(2)
    public void testPayPartnersLogo() {
        List<WebElement> payPartners = driver.findElements(By.xpath("//*[contains(@class, 'pay__partners')]/ul/li/img"));
        List<String> payPartnersExpected = new ArrayList<>(Arrays.asList("Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"));
        List<String> payPartnersNew = new ArrayList<>();
        for (WebElement payPartner : payPartners) {
            payPartnersNew.add(payPartner.getAttribute("alt"));
        }
        assertEquals(payPartnersExpected, payPartnersNew);
    }

    @Test
    @Order(3)
    public void testMoreAboutService() {
        WebElement urlMoreAboutService = driver.findElement(By.xpath("//*[contains(@class, 'pay__wrapper')]/a"));
        String urlText = urlMoreAboutService.getAttribute("href");
        urlMoreAboutService.click();
        assertEquals(urlText, driver.getCurrentUrl());
    }

    @AfterAll
    public static void closeChrome() {
        driver.close();
    }
}
