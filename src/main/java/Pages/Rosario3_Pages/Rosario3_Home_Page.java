package Pages.Rosario3_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Rosario3_Home_Page {

    private WebDriver driver;
    private By Btn_MenuDeportes_xpath = By.xpath("//a[@class='alt-font uppercase'][contains(text(),'Deportes')]");

    public Rosario3_Home_Page(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickOnMenuDeportes(){
        driver.findElement(Btn_MenuDeportes_xpath).click();
    }
}