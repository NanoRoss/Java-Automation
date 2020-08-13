package Tests.Learning;

import Pages.Pages_Learning.Page_EjemploBasicoSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Helpers.*;


public class EjemploBasicoSelenium {

    public  WebDriver driver;
    public  Helpers help;



    @BeforeMethod  //Cosas Comunes a todos los Test.
    public void setUp(){
        DesiredCapabilities caps = new DesiredCapabilities(); //Llamo al driver
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("headless");
        driver = new ChromeDriver(); //Creo nuestro Objeto Chromedriver
        help = new Helpers(driver); //Creo nuestro Objeto Helpers

        driver.manage().window().maximize();
        help.implicitlyWaitMethod(driver,15); //La espera implícita se establece para la vida de la instancia del objeto WebDriver


    }


    @Test(description = "Hace Algo 1")
    public void pruebauno() {
        Page_EjemploBasicoSelenium page_EjemploBasicoSelenium = new Page_EjemploBasicoSelenium(driver);
        page_EjemploBasicoSelenium.EntrarRosario3yClickPoliciales();
        driver.findElement(page_EjemploBasicoSelenium.PolicialesBtn).click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://www.rosario3.com/seccion/policiales/");
    }






    @AfterMethod
    public void tearDown(ITestResult result)
    {
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_GREEN = "\u001B[32m";
        if (result.isSuccess() == false)
        {
            Helpers help = new Helpers(driver);
            help.TakeScreenshot("AT FAIL--"+result.getName());
            System.out.println(ANSI_YELLOW+"El Test: "+result.getName()+", Objetivo: "+result.getMethod().getDescription()+"->NO PASO | Se genero Captura)"+ANSI_YELLOW);
            driver.close();
        }
        else
        {
            System.out.println(ANSI_GREEN+"El Test: "+result.getName()+", Objetivo: "+result.getMethod().getDescription()+"->PASO OK"+ANSI_GREEN);
            driver.close();
        }
    }

}
