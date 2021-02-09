package Steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class WebDriverSetings {

    public WebDriver driver;

    @BeforeClass
    public void startTests(){

        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


    }



}
