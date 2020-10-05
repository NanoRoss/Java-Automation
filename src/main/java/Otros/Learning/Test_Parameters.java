package Tests.Learning;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Helpers.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Test_Parameters {

    public WebDriver driver;
    Helpers help;

    @BeforeMethod
    public void setUp(){
        System.out.println("HACE SETUP");
        help = new Helpers(driver);
    }

    @Test(description = "Ejemplo de Test Parameters")
    public void Test_Parameters() {
       String value = readConfigParameters("Browser");
       System.out.println("Parametro Encontado: "+value);
        help.SleepSeconds(10);
    }

    public String readConfigParameters(String param){
        Properties prop = new Properties();
        String Value="NULL";
        try{
            InputStream input = new FileInputStream("src\\test\\java\\Config\\config.properties");
            prop.load(input);
            Value = prop.getProperty(param);
            System.out.println("Parametro Encontrado:");
            System.out.println(prop.getProperty(param));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return Value;
    }

    @AfterMethod
    public void tearDown(ITestResult result)
    {
        System.out.println("HACE tearDown");
    }


}
