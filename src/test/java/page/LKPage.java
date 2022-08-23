package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.Util;

import static org.assertj.core.api.Assertions.assertThat;

public class LKPage {
    private final WebDriver driver;

    private static final By HEADER_MENU = By.xpath("/html/body/div[1]/div/header[2]/div/div[3]/div/div/div[1]");
    private static final By HEADER_LK = By.xpath("/html/body/div[1]/div/header[2]/div/div[3]/div/div/div[1]/div[2]/a[2]");
    private static final By BIOGRAPHY = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/a[3]");
    private static final By ID_FNAME = By.id("id_fname");
    private static final By ID_FNAME_LATIN = By.id("id_fname_latin");
    private static final By ID_LNAME = By.id("id_lname");
    private static final By ID_LNAME_LATIN = By.id("id_lname_latin");
    private static final By ID_BLOG_NAME = By.id("id_blog_name");
    private static final By DATE_OF_BIRTH = By.xpath("//input[@name='date_of_birth']");
    private static final By SELECTED_COUNTRY = By.xpath("//div[@data-slave-selector='.js-lk-cv-dependent-slave-city']");
    private static final By COUNTRY = By.xpath("//button[@title='Украина']");
    private static final By SELECTED_CITY = By.xpath("//div[@data-selected-option-class='lk-cv-block__select-option_selected']");
    private static final By CITY = By.xpath("//button[@title='Мариуполь']");
    private static final By SELECTED_LEVEL_LANGUAGE = By.xpath("//div[@data-selected-option-class='lk-cv-block__select-option_selected']");
    private static final By LEVEL_LANGUAGE = By.xpath("//button[@title='Начальный уровень (Beginner)']");
    private static final By SELECTED_RELOCATE = By.xpath("//span[@class='radio__label']");
    private static final By WORK_FORMAT = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[1]/div/div[1]/div[5]/div[2]/div[1]/div[2]/label/span");
    private static final By PREFERRED_COMMUNICATION_METHOD = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[2]/div[2]/label/span");
    private static final By SELECTED_COMMUNICATION_1 = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/div/div/div");
    private static final By ADD_COMMUNICATION_1 = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/button[5]");
    private static final By SET_VALUE_FOR_COMMUNICATION_1 = By.xpath("//*[@id='id_contact-0-value']");
    private static final By ADD_COMMUNICATION = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[2]/div[2]/button");
    private static final By SELECTED_COMMUNICATION_2 = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div/div/label/div");
    private static final By ADD_COMMUNICATION_2 = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div/div/div/div/button[3]");
    private static final By SET_VALUE_FOR_COMMUNICATION_2 = By.xpath("//*[@id='id_contact-1-value']");
    private static final By SELECTED_GENDER = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[4]/div[1]/div[1]/div");
    private static final By SELECTED_WOMAN = By.xpath("//*[@id='id_gender']/option[3]");
    private static final By SET_COMPANY = By.xpath("//*[@id='id_company']");
    private static final By SET_JOB_TITLE = By.xpath("//*[@id='id_work']");
    private static final By SAVE_PERSONAL_DATA = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[2]/div/div/button[1]");
    private static final By CHECK_CHECKBOX = By.xpath("//*[@id='id_is_email_preferable']");
    private static final By CHECK_DATE = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[1]/div/div[4]/div/div/input");
    private static final By CHECK_COUNTRY = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[1]/div/div[1]/div[1]/div[2]/div/label/div");
    private static final By CHECK_CITY = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[1]/div/div[1]/div[2]/div[2]/div/label/div");
    private static final By CHECK_LEVEL_LANGUAGE = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[1]/div/div[1]/div[3]/div[2]/div/label/div");
    private static final By CHECK_RELOCATE = By.xpath("//*[@id='id_ready_to_relocate_1']");
    private static final By CHECK_WORK_FORMAT = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[1]/div/div[1]/div[5]/div[2]/div[1]/div[2]/label/input");
    private static final By CHECK_EMAIL = By.xpath("//*[@id='id_email']");
    private static final By CHECK_COMMUNICATION_1 = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[2]/div[2]/div/div[1]/div[1]/div/div/div/label/div");
    private static final By CHECK_COMMUNICATION_2 = By.xpath("/html/body/div[1]/div/div[4]/div[3]/div[2]/div[2]/div/form/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/div/div/label/div");
    private static final String NAME = "Тест";
    private static final String NAME_LATIN = "Test";
    private static final String LNAME = "Тестов";
    private static final String LNAME_LATIN = "Testov";
    private static final String BLOG_NAME = "TestBlogov";
    private static final String BIRTHDAY = "02.02.2002";
    private static final String FIRST_COMMUNICATION = "test@mail.com";
    private static final String SECOND_COMMUNICATION = "vk.com/test";
    private static final String COMPANY = "SIS";
    private static final String JOB_TITLE = "qa engineer";

    public LKPage(WebDriver driver) {
        this.driver = driver;
    }

    public void learningPageWithBiography() {
        var action = new Actions(driver);
        Util.waitSecond(2);
        WebElement webElement = driver.findElement(HEADER_MENU);
        action.moveToElement(webElement).perform();
        driver.findElement(HEADER_LK).click();
        Util.waitSecond(1);
        driver.findElement(BIOGRAPHY).click();
    }

    public void setPersonalData() {
        var element = driver.findElement(ID_FNAME);
        element.clear();
        element.sendKeys(NAME);

        element = driver.findElement(ID_FNAME_LATIN);
        element.clear();
        element.sendKeys(NAME_LATIN);

        element = driver.findElement(ID_LNAME);
        element.clear();
        element.sendKeys(LNAME);

        element = driver.findElement(ID_LNAME_LATIN);
        element.clear();
        element.sendKeys(LNAME_LATIN);

        element = driver.findElement(ID_BLOG_NAME);
        element.clear();
        element.sendKeys(BLOG_NAME);

        element = driver.findElement(DATE_OF_BIRTH);
        element.clear();
        element.sendKeys(BIRTHDAY);

        driver.findElement(SELECTED_COUNTRY).click();
        driver.findElement(COUNTRY).click();

        Util.waitSecond(3);

        driver.findElements(SELECTED_CITY).get(1).click();
        driver.findElement(CITY).click();

        driver.findElements(SELECTED_LEVEL_LANGUAGE).get(2).click();
        driver.findElement(LEVEL_LANGUAGE).click();

        driver.findElements(SELECTED_RELOCATE)
                .get(1)
                .click();
        driver.findElement(WORK_FORMAT)
                .click();

        if (!driver.findElement(CHECK_CHECKBOX)
                .getAttribute("checked").equalsIgnoreCase("true")) {
            driver.findElement(PREFERRED_COMMUNICATION_METHOD)
                    .click();
        }

        driver.findElement(SELECTED_COMMUNICATION_1)
                .click();
        driver.findElement(ADD_COMMUNICATION_1)
                .click();
        element = driver.findElement(SET_VALUE_FOR_COMMUNICATION_1);
        element.clear();
        element.sendKeys(FIRST_COMMUNICATION);

        driver.findElement(ADD_COMMUNICATION)
                .click();
        driver.findElement(SELECTED_COMMUNICATION_2)
                .click();
        driver.findElement(ADD_COMMUNICATION_2)
                .click();
        element = driver.findElement(SET_VALUE_FOR_COMMUNICATION_2);
        element.clear();
        element.sendKeys(SECOND_COMMUNICATION);

        driver.findElement(SELECTED_GENDER)
                .click();
        driver.findElement(SELECTED_WOMAN)
                .click();

        element = driver.findElement(SET_COMPANY);
        element.clear();
        element.sendKeys(COMPANY);

        element = driver.findElement(SET_JOB_TITLE);
        element.clear();
        element.sendKeys(JOB_TITLE);

        driver.findElement(SAVE_PERSONAL_DATA)
                .click();
    }

    public void checkPersonalData() {
        var text = driver.findElement(ID_FNAME).getAttribute("value");
        assertThat(text).as("Name").isEqualTo(NAME);
        text = driver.findElement(ID_FNAME_LATIN).getAttribute("value");
        assertThat(text).as("Name(Latin)").isEqualTo(NAME_LATIN);
        text = driver.findElement(ID_LNAME).getAttribute("value");
        assertThat(text).as("Last Name").isEqualTo(LNAME);
        text = driver.findElement(ID_LNAME_LATIN).getAttribute("value");
        assertThat(text).as("Last Name(Latin)").isEqualTo(LNAME_LATIN);
        text = driver.findElement(ID_BLOG_NAME).getAttribute("value");
        assertThat(text).as("Blog name").isEqualTo(BLOG_NAME);
        text = driver.findElement(CHECK_DATE)
                .getAttribute("value");
        assertThat(text).as("Date").isEqualTo(BIRTHDAY);
        text = driver.findElement(CHECK_COUNTRY)
                .getText();
        assertThat(text).as("Country").isEqualTo("Украина");
        text = driver.findElement(CHECK_CITY)
                .getText();
        assertThat(text).as("City").isEqualTo("Мариуполь");
        text = driver.findElement(CHECK_LEVEL_LANGUAGE)
                .getText();
        assertThat(text).as("Level language").isEqualTo("Начальный уровень (Beginner)");
        text = driver.findElement(CHECK_RELOCATE)
                .getAttribute("value");
        assertThat(text).as("CHECK_RELOCATE").isEqualTo("True");
        text = driver.findElement(CHECK_WORK_FORMAT)
                .getAttribute("checked");
        assertThat(text).as("Checkbox").isEqualTo("true");
        text = driver.findElement(CHECK_EMAIL)
                .getAttribute("value");
        assertThat(text).as("email").isEqualTo("ya.osipova.sis+1@gmail.com");
        text = driver.findElement(CHECK_CHECKBOX)
                .getAttribute("checked");
        assertThat(text).as("Checkbox").isEqualTo("true");
        text = driver.findElement(SET_VALUE_FOR_COMMUNICATION_1)
                .getAttribute("value");
        assertThat(text).as("Skype").isEqualTo(FIRST_COMMUNICATION);
        text = driver.findElement(CHECK_COMMUNICATION_1)
                .getText();
        assertThat(text).as("Skype").isEqualTo("Skype");
        text = driver.findElement(SET_VALUE_FOR_COMMUNICATION_2)
                .getAttribute("value");
        assertThat(text).as("VK").isEqualTo(SECOND_COMMUNICATION);
        text = driver.findElement(CHECK_COMMUNICATION_2)
                .getText();
        assertThat(text).as("VK").isEqualTo("VK");
        text = driver.findElement(SELECTED_WOMAN)
                .getAttribute("selected");
        assertThat(text).as("checkbox").isEqualTo("true");
        text = driver.findElement(SET_COMPANY)
                .getAttribute("value");
        assertThat(text).as("Company").isEqualTo(COMPANY);
        text = driver.findElement(SET_JOB_TITLE)
                .getAttribute("value");
        assertThat(text).as("Work").isEqualTo(JOB_TITLE);
    }
}
