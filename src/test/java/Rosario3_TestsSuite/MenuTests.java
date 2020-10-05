package Rosario3_TestsSuite;

import BaseTestClass.BaseTests;
import org.testng.annotations.Test;
import Pages.Rosario3_Pages.Rosario3_Deportes_Page;
import static org.testng.Assert.*;


public class MenuTests extends BaseTests {

    @Test
    public void ValidarUrlEnMenuDeportes() {

        Rosario3_Deportes_Page DeportesPage = InitialPage.clickOnMenuDeportes();
        String URL = DeportesPage.GetCurrentUrl();
        assertTrue(URL.equalsIgnoreCase("ERROR"));
    }

}
