package Steps;

import PagesObjects.MainPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class AutorizatonUser extends WebDriverSetings {

    public MainPage mainPage;



    @When("Пользователь кликает на ссылку {string}")
    public void selectPassword (String arg0) {
        mainPage = new MainPage(driver);
        mainPage.pressLinkLoginButton(arg0);
    }

    @Then("Страница авторизации загрузилась")
    public void checkingTheAutorizationsPageLoad() {
        Assert.assertEquals("Здравствуйте!", mainPage.getTextTheGreetingOnTheAuthorizationPage());
    }

    @Then("Пользователь вводит Email и нажимает Enter")
    public void inputEmailUser() {
        mainPage.selectEmail();
    }

    @Then("Пользователь вводит Password и нажимает Enter")
    public void inputPasswordlUser() {
        mainPage.selectPassword();
    }
}
