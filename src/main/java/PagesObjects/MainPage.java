package PagesObjects;

import UserConfig.User1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {

    public WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(id = "userid")
    WebElement inputEmailUser;

    @FindBy(id = "pass")
    WebElement inputPasswordUser;

    @FindBy(xpath = "//a[text()='Мой eBay']")
    WebElement header;

    @FindBy(xpath = "//h1[@id='greeting-msg']")
    WebElement greetingOnTheAuthorizationPage;


    public void open() {
        driver.get("https://www.ebay.com/");
    }

    public void pressLinkLoginButton(String text){
        driver.findElement(By.xpath("//a[text()=' "+ text +" ']")).click();

    }

    public void selectEmail (){
        inputEmailUser.sendKeys(User1.userEmail);
        inputEmailUser.sendKeys(Keys.ENTER);
    }

    public void selectPassword (){
        inputPasswordUser.sendKeys(User1.userPassword);
        inputPasswordUser.sendKeys(Keys.ENTER);
    }

    public String getTextHeader (){
        String value = header.getText();
        return value;

    }

    public String getTextTheGreetingOnTheAuthorizationPage(){
        String value = greetingOnTheAuthorizationPage.getText();
        return value;
    }

}
