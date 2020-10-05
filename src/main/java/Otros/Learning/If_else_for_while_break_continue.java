package Tests.Learning;


import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class If_else_for_while_break_continue {
    public  WebDriver driver;

    @BeforeMethod  //Cosas Comunes a todos los Test.
    public void setUp(){
        System.out.println("HACE SETUP");


    }


    @Test(description = "Ejemplo de IF/ELSE BASICO")
    public void TEST_IF_ELSE() {

        System.out.println("HACE TEST");
        int a = 1;
        int b = 1;
        boolean condicion;

        if ((a+b==2)&& (a-b==0))
        {
            condicion = true;
        }
        else {
            condicion = false;
        }

        if (condicion==true){
            System.out.println("El boolean es true");
        }
        else {
            System.out.println("El boolean es false");
        }

    }



    @Test(description = "Ejemplo FOR")
    public void TEST_FOR() {

        System.out.println("HACE TEST");

        for (int a=0; a<=10;a++){ //Inicializo Variable,Condifcion,Accion.
            System.out.println(a);
        }

    }

    @Test(description = "Ejemplo WHILE")
    public void TEST_while() {

        System.out.println("HACE TEST");
        int  A = 0;

        do {
            System.out.println("El valor es: "+A);
            A = A + 1;
        }
        while (A!=10);

    }

    @Test(description = "Ejemplo Break,Continue")
    public void TEST_Break() {

        System.out.println("HACE TEST");

        for (int A=0;A<=10;A++){

            if (A==4)
            {
                continue; //Retoma el ciclo nuevamente sin ejecutar el codigo que sigue a el.
            }
            if (A==8)
            {
                break; //Corta el for y sale.
            }

            System.out.println("El valor es: "+A);
        }



    }





    @AfterMethod
    public void tearDown(ITestResult result)
    {
        System.out.println("HACE tearDown");
    }



}
