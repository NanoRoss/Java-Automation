package Helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Helpers {

    private WebDriver driver; // Instancio un Objeto Driver para usar.

    public Helpers (WebDriver driver) // Metodo Constructor: Es un metodo especial que se encarga de dar un estado inicial a nuestro objeto.
    {
        this.driver = driver; //Mi Webdriver
    }



/////////////////////////////////////////////////////////////////


    public void Print(String texto)
    {
        System.out.println(texto);
    }

    public void SleepSeconds(int seconds) //El método Thread.sleep (long millis) hace que el subproceso actualmente en ejecución se suspenda n milisegundos.
    {
        try { Thread.sleep(seconds*1000);}
        catch (InterruptedException e)
        {e.printStackTrace(); } // dice qué sucedió y en qué parte del código sucedió esto.
    }

    public void implicitlyWaitMethod(WebDriver driver,int seconds) //Espera que SE cargue una pagina 100%(DOOM)
    {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }


    public void ExplicitWait_presenceOfElement_Method(int seconds, By ElementoaEsperar) //Espera que se cumpla una condicion N durante un Tiempo
    {
        WebDriverWait wait = new WebDriverWait(driver,seconds);
        WebElement WebElement;
        WebElement = wait.until(ExpectedConditions.presenceOfElementLocated(ElementoaEsperar));

        if (WebElement.isDisplayed() == true)
        {System.out.println("Se Valido OK ExplicitWait_presenceOfElement_Method para"+WebElement); }
        else {
            System.out.println("ERROR DE VALIDACION ExplicitWait_presenceOfElement_Method Para:" + WebElement);
        }
    }


    public void TakeScreenshot(String nombre)

    {
        Date fecha = new Date();
        File MyScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {FileUtils.copyFile(MyScreenshot, new File(nombre+fecha.getTime()+".png"));}
        catch (IOException e) {e.printStackTrace();}
    }


    public boolean ValidarExistenciaByid(String element)
    {
        boolean present;
        try {
            driver.findElement(By.id(element));
            present = true;
        } catch (NoSuchElementException e) { present = false; }

        return present;
    }


    public boolean ValidarExistenciaByXpath(String element)
    {
        boolean present;
        try {
            driver.findElement(By.xpath(element)); present = true;
        } catch (NoSuchElementException e) { present = false; }

        return present;
    }


    public boolean ValidarExistenciaByName(String element)
    {
        boolean present;
        try {
            driver.findElement(By.name(element)); present = true;
        } catch (NoSuchElementException e) { present = false; }

        return present;
    }

    public void AgregarTab(String URL){
        JavascriptExecutor javaScriptExecutor = (JavascriptExecutor)driver;
        String NewTab =  "window.open('"+ URL +"')";
        javaScriptExecutor.executeScript(NewTab);
    }



}
