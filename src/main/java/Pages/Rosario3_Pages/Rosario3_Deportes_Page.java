package Pages.Rosario3_Pages;

import org.openqa.selenium.WebDriver;

public class Rosario3_Deportes_Page {

    private WebDriver driver;

    public Rosario3_Deportes_Page(WebDriver driver){
        this.driver = driver;
        System.out.println("___");
    }

    public String GetCurrentUrl(){
        String CurrentUrl = driver.getCurrentUrl();
        return  CurrentUrl;
    }


}