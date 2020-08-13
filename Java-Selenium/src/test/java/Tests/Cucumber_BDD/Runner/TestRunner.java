//Contiene el punto de partida, donde van a comenzar a ejecutarse los tets.
package Tests.Cucumber_BDD.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "src\\test\\java\\Tests\\Cucumber_BDD\\Features\\Buscar_Productos.feature",
        glue = "Tests.Cucumber_BDD.Steps")

public class TestRunner extends AbstractTestNGCucumberTests {


}


