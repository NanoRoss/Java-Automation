package Otros.Learning;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Arreglos {
    public  WebDriver driver;



    @BeforeMethod  //Cosas Comunes a todos los Test.
    public void setUp(){
        System.out.println("HACE SETUP");


    }


    @Test(description = "Ejemplo FOR")
    public void TEST_FOR() {

        System.out.println("HACE TEST");

        int ArregloEntero[] = {1,2,3,4,5,6,7,8,9,10};

        for (int i=0;i<ArregloEntero.length;i++)

            System.out.println("El Arreglo en la posiciopn "+i+" Tiene el valor: "+ArregloEntero[i]);

    }




    @AfterMethod
    public void tearDown(ITestResult result)
    {
        System.out.println("HACE tearDown");
    }



}

