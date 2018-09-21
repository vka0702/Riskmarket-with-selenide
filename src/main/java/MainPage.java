import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends PageObject {
    public MainPage(WebDriver driver) {
        super(driver);
    }

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
}
