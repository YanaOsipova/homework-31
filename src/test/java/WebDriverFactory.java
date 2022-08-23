import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public class WebDriverFactory {
    private static final String pathToDriverChrome = System.getProperty("user.dir") + "\\lib\\chromedriver.exe";
    private static final String pathToDriverIE = System.getProperty("user.dir") + "\\lib\\chromedriver.exe";
    private static final String pathToDriverFireFox = System.getProperty("user.dir") + "\\lib\\chromedriver.exe";

    public static WebDriver create(Driver webDriverName) {
        switch (webDriverName) {
            case CHROME -> {
                System.setProperty("webdriver.chrome.driver", pathToDriverChrome);
                return new ChromeDriver();
            }
            case FIREFOX -> {
                System.setProperty("webdriver.gecko.driver", pathToDriverFireFox);
                return new FirefoxDriver();
            }
            case IE -> {
                System.setProperty("webdriver.ie.driver", pathToDriverIE);
                return new InternetExplorerDriver();
            }
            default -> throw new RuntimeException("Драйвер для " + webDriverName + " не найден!");
        }
    }

    public static<T extends AbstractDriverOptions<T>> WebDriver create(Driver webDriverName, T options) {
        switch (webDriverName) {
            case CHROME -> {
                System.setProperty("webdriver.chrome.driver", pathToDriverChrome);
                if (options instanceof ChromeOptions) {
                    return new ChromeDriver((ChromeOptions) options);
                }
                throw new RuntimeException("Ошибка при создании ChromeDriver: " + options.getClass().getSimpleName());
            }
            case FIREFOX -> {
                System.setProperty("webdriver.gecko.driver", pathToDriverFireFox);
                if (options instanceof FirefoxOptions) {
                    return new FirefoxDriver((FirefoxOptions) options);
                }
                throw new RuntimeException("Ошибка при создании FirefoxDriver: " + options.getClass().getSimpleName());
            }
            case IE -> {
                System.setProperty("webdriver.ie.driver", pathToDriverIE);
                if (options instanceof InternetExplorerOptions) {
                    return new InternetExplorerDriver((InternetExplorerOptions) options);
                }
                throw new RuntimeException("Ошибка при создании InternetExplorerDriver: " + options.getClass().getSimpleName());
            }
            default -> throw new RuntimeException("Драйвер для " + webDriverName + " не найден!");
        }
    }
}
