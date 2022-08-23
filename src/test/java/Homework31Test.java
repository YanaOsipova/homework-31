import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import page.LKPage;
import page.LoginPage;
import util.Util;

public class Homework31Test {
    static final Logger userLogger = LogManager.getLogger(Homework31Test.class);
    private WebDriver driver;
    private LoginPage loginPage;
    private LKPage lkPage;

    @Test
    public void test_1() {
        userLogger.info("Начало теста 1");
        loginPage.login();
        Util.waitSecond(2);
        lkPage.learningPageWithBiography();
        lkPage.setPersonalData();
        userLogger.info("Конец теста 1");
    }

    @Test
    public void test_2() {
        userLogger.info("Начало теста 2");
        loginPage.login();
        Util.waitSecond(2);
        lkPage.learningPageWithBiography();
        lkPage.checkPersonalData();
        userLogger.info("Конец теста 2");
    }

    @BeforeEach
    public void configDriver() {
        userLogger.info("Создание драйвера");
        var chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--kiosk");
        driver = WebDriverFactory.create(Driver.CHROME, chromeOptions);
        loginPage = new LoginPage(driver);
        lkPage = new LKPage(driver);
    }

    @AfterEach
    public void close() {
        userLogger.info("Закрытие драйвера");
        driver.quit();
    }
}
