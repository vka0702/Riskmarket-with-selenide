package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MyStepdefs {
    MainPage mainPage = page(MainPage.class);

    @Given("^open (.*)$")
    public void openHttpsRiskmarketExtSidenisCom(String url) {
        open(url);
    }

    @When("^user inputs \"([^\"]*)\" in country widget$")
    public void userInputsInCountryWidget(String arg0) {
        mainPage.insertCountry(arg0);
    }


    @When("^user adds one tourists and date of birth \"([^\"]*)\" into field Tourists$")
    public void userAddsOneTouristsAndDateOfBirthIntoFieldTourists(String arg0) throws InterruptedException {
        mainPage.insertOneTourist(arg0);
    }

    @Then("^field Tourists contains \"([^\"]*)\"$")
    public void fieldTouristsContains(String arg0) {
        mainPage.checkFieldTourist(arg0);
    }
}
