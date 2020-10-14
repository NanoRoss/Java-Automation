package Rosario3_TestsSuite;

import BaseTestClass.BaseTests;
import Pages.Rosario3_Pages.Rosario3_Home_Page;
import org.testng.annotations.Test;
import Pages.Rosario3_Pages.Rosario3_Deportes_Page;
import static org.testng.Assert.*;


public class MenuTests extends BaseTests {



    @Test
    public void ValidarUrlEnMenuDeportes() {

        //Laburo en PAGE HOME_PAGE
        Rosario3_Home_Page Home_Page = new Rosario3_Home_Page(driver);
        Home_Page.clickOnMenuDeportes();

        //Laburo en PAGE DEPORTES_PAGE
        Rosario3_Deportes_Page DeportesPage = new Rosario3_Deportes_Page(driver);
        String URL = DeportesPage.GetCurrentUrl();
        assertTrue(URL.equalsIgnoreCase("https://www.rosario3.com/seccion/deportes/"));
    }

}
