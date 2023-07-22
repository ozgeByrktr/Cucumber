package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruPage {

    public GuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);



    }
@FindBy(xpath = "//tbody/tr/td[1]")
    public List<WebElement>sirketElementList;


@FindBy(xpath = "//iframe[@class=‘faktor-iframe-wrapper’]")
    public WebElement Cookies_iFrame;

@FindBy(xpath = "//tbody/tr")  //satır sayısını verir
    public List<WebElement>  satirlarListesi;

}
