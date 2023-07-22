package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.GuruPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GuruStepDefinitions {

    List<String>sirketListesi=new ArrayList<>();
        GuruPage guruPage=new GuruPage();
    @Given("guru99 sayfasinda Cookies kabul eder")
    public void guru99_sayfasinda_cookies_kabul_eder() {

    }
    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {
       sirketListesi = ReusableMethods.stringListeCevir(guruPage.sirketElementList);
        System.out.println(sirketListesi +" ");
    }


    @And("listede {string} oldugunu test eder")
    public void listedeOldugunuTestEder(String istenenSirket) {
        Assert.assertTrue(sirketListesi.contains(istenenSirket));

    }

    @Then("Tum sayfa fotografi alir")
    public void tumSayfaFotografiAlir() throws IOException {
        ReusableMethods.getScreenshot("Guru99");
    }

    @And("{string} Prev.Close degerini yazdirir")
    public void prevCloseDegeriniYazdirir(String istenenSirket) {
        //  //tbody/tr[9]/td[3]
        int satirSayisi=guruPage.satirlarListesi.size();
        for (int i = 1; i < satirSayisi; i++) {
            String dinamikXpath="//tbody/tr["+ i+"[/td[1]";

            String satirdakiSirketIsmi=
                         Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            if(satirdakiSirketIsmi.equalsIgnoreCase(istenenSirket)){
                dinamikXpath="//tbody/tr["+ i+"[/td[3]";
                String istenenSirketPrevValue=
                         Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
                System.out.println(istenenSirketPrevValue);
            }
        }
    }
}
