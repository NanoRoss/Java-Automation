package Tests.Cucumber_BDD.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Buscar_Producto_Steps {

    WebDriver driver;

    @Given("El usuario ingresa a index page")
    public void el_usuario_ingresa_a_index_page(){
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        driver = new ChromeDriver(); //Creo nuestro Objeto Chromedriver
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("El usuario ingresa producto a Buscar en el elemento de busqueda")
    public void el_usuario_ingresa_producto_a_Buscar_en_el_elemento_de_busqueda() {
        driver.findElement(By.id("search_query_top")).sendKeys("dresses");
    }

    @Then("El usuario hace el click en el btn de Buscar")
    public void el_usuario_hace_el_click_en_el_btn_de_Buscar(){
        driver.findElement(By.name("submit_search")).click();
    }

    @Then("Los resultados de la busqueda aparecen")
    public void los_resultados_de_la_busqueda_aparecen() {
        String Cantidad = driver.findElement(By.xpath("//div[@class='top-pagination-content clearfix']//div[@class='product-count'][contains(text(),'Showing 1 - 7 of 7 items')]")).getText();
        Assert.assertEquals(Cantidad,"Showing 1 - 7 of 7 items");
    }


}
