package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Util;

public class LoginPage {
    private static final Logger userLogger = LogManager.getLogger(LoginPage.class);

    private final By AUTH_BUTTON = By.cssSelector("button.header2__auth");
    private final By LOGIN_EMAIL = By.xpath("//form[@action = '/login/']//input[@name = 'email']");
    private final By LOGIN_PASSWORD = By.xpath("//form[@action = '/login/']//input[@name = 'password']");
    private final By SUBMIT = By.xpath("//form[@action = '/login/']//button[@type = 'submit']");

    private static final String LOGIN = System.getProperty("login");
    private static final String PASSWORD = System.getProperty("password");
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        userLogger.info("Авторизация на сайте");
        driver.get("https://otus.ru");
        driver.findElement(AUTH_BUTTON).click();
        Util.waitSecond(1);

        var element = driver.findElement(LOGIN_EMAIL);
        element.clear();
        element.sendKeys(LOGIN);

        element = driver.findElement(LOGIN_PASSWORD);
        element.clear();
        element.sendKeys(PASSWORD);

        driver.findElement(SUBMIT).submit();
    }

}
