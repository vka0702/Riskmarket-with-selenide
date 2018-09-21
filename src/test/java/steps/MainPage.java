package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
//    public MainPage(WebDriver driver) {
//        super(driver);
//    }

    @FindBy(xpath = "//form/.//input[@placeholder=\"Укажите страну\"]")
    private WebElement inputCountry;

    @FindBy(xpath = "//form/.//input[@placeholder=\"Туристы\"]")
    private WebElement inputTourist;

    @FindBy(xpath = "//form/.//input[@placeholder=\"дд.мм.гггг\"]")
    private WebElement dateOfBirthFirstTourist;

    @FindBy(xpath = "//form/.//input[@placeholder=\"дд.мм.гггг — дд.мм.гггг\"]")
    private WebElement dateOfTravel;

    @FindBy(xpath = "//div[2]/span[contains(text(), '9')]")
    private WebElement dateStart;

    @FindBy(xpath = "//div[4]/span[contains(text(), '18')]")
    private WebElement dateFinish;

    @FindBy(xpath = "//form/div[4]/button")
    private WebElement buttonCalculate;

    public void insertCountry(String country) {
        inputCountry.click();
        inputCountry.sendKeys(country);
        inputCountry.sendKeys(Keys.ENTER);
    }

    public void insertOneTourist(String dateOfBirth) {
        inputTourist.click();
        dateOfBirthFirstTourist.click();
        //dateOfBirthFirstTourist.sendKeys(dateOfBirth);
        String [] subStr = dateOfBirth.split("-");
        dateOfBirthFirstTourist.sendKeys(subStr[0]);
        dateOfBirthFirstTourist.sendKeys(subStr[1]);
        dateOfBirthFirstTourist.sendKeys(subStr[2]);
        Selenide.sleep(4000);
        dateOfBirthFirstTourist.sendKeys(Keys.ENTER);
    }

    public void checkFieldTourist(String fieldTourist) {
        $(inputTourist).shouldHave(Condition.exactText(fieldTourist));
    }



    public void insertDateOfTravel() {
        dateOfTravel.click();

    }
}
