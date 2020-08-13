package Pages.Pages_Learning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Page_EjemploBasicoSelenium {


    public WebDriver driver; // Instancio un Objeto Driver para usar.

    public Page_EjemploBasicoSelenium (WebDriver driver) // Metodo Constructor: Es un metodo especial que se encarga de dar un estado inicial a nuestro objeto.
    {
        this.driver = driver; //Mi Webdriver
       // PolicialesBtn = By.xpath("//a[@class='alt-font uppercase'][contains(text(),'Policiales')]"); //Creo Objetos WebElements referenciales

    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void EntrarRosario3yClickPoliciales ()
    {
        driver.get("https://www.rosario3.com");
        //driver.findElement(PolicialesBtn).click();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public By PolicialesBtn = By.xpath("//a[@class='alt-font uppercase'][contains(text(),'Policiales')]"); //Creo Objetos WebElements referenciales


}
