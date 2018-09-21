import org.junit.Test;

public class FunctionalPageObjectTest extends FunctionalTest {

    @Test
    public void countrySelectorTest() {
        driver.get("https://riskmarket-ext.sidenis.com/");

        MainPage mainPage = new MainPage(driver);
        mainPage.insertCountry("Испания");
    }
}
