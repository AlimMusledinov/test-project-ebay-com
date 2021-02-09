package Steps;
import PagesObjects.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Start extends WebDriverSetings {

    MainPage mainPage;

    @When("Пользователь открывает сайт {string}")
    public void openUrl() {
        mainPage = new MainPage(driver);
        mainPage.open();
    }

    @Then("Cайт {string} загрузился")
    public void checkingTheSiteLoad(String arg0) {
        Assert.assertEquals("Мой eBay", mainPage.getTextHeader());
    }



}
