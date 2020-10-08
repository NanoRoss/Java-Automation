package BaseTestClass;

import Helpers.Helpers;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Pages.Rosario3_Pages.Rosario3_Home_Page;
import org.testng.annotations.BeforeMethod;


import java.util.concurrent.TimeUnit;

public class BaseTests {

    private WebDriver driver;
    public Helpers helpers;
    protected Rosario3_Home_Page InitialPage;


    @BeforeClass //@BeforeClass: el método anotado se ejecutará antes de que se el 1er Test de la clase.
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        chromeOptions.addArguments("--no-sandbox");
        driver = new ChromeDriver(chromeOptions); //Creo nuestro Objeto Chromedriver
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        helpers = new Helpers(driver);
        //driver = new EventFiringWebDriver(new ChromeDriver());
        //((EventFiringWebDriver) driver).register(new EventReporter());
    }

    @BeforeMethod //@BeforeTest: el método anotado se ejecutará antes de que se ejecute cualquier Test de la clase.
    public void BeforeMethod() {
        driver.get("https://www.rosario3.com/");
        InitialPage = new Rosario3_Home_Page(driver);
    }



    @AfterClass
    public void tearDown(){
        driver.quit();
    }


    public void hablar(){System.out.println("Soy clase Base");}

}