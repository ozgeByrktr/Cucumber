package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercisePage;
import utilities.Driver;

public class AutomationExerciseStepDefinitions {
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        Faker faker=new Faker();
        String emailAdres;
        Actions actions;
        String firstName;
    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        automationExercisePage.signinButonu.click();

    }
    @Given("user Create an account bolumune name ve email adresi girer")
    public void user_create_an_account_bolumune_name_ve_email_adresi_girer() {
        firstName=faker.name().firstName();
        automationExercisePage.signupNameKutusu.sendKeys(firstName);
        emailAdres=faker.internet().emailAddress();
                automationExercisePage.e_mailKutusu.sendKeys(emailAdres);
    }
    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
       automationExercisePage.signUpButonu.click();

    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        actions = new Actions(Driver.getDriver());
      automationExercisePage.mrsButonu.click();
      actions.sendKeys(Keys.TAB)
              .sendKeys(Keys.TAB)
              .sendKeys(faker.internet().password())
              .sendKeys(Keys.TAB)
              .sendKeys("21")
              .sendKeys(Keys.TAB)
              .sendKeys("May")
              .sendKeys(Keys.TAB)
              .sendKeys("2000")
              .sendKeys(Keys.PAGE_DOWN)
              .sendKeys(Keys.TAB)
              .sendKeys(Keys.TAB)
              .sendKeys(Keys.TAB)
              .sendKeys(firstName)
              .sendKeys(Keys.TAB)
              .sendKeys(faker.name().lastName())
              .sendKeys(Keys.TAB)
              .sendKeys(faker.company().name())
              .sendKeys(Keys.TAB)
              .sendKeys(faker.address().fullAddress())
              .sendKeys(Keys.TAB)
              .sendKeys(Keys.TAB)
              .sendKeys("United States")
              .sendKeys(Keys.TAB)
              .sendKeys("Texas")
              .sendKeys(Keys.TAB)
              .sendKeys("Dallas")
              .sendKeys(Keys.TAB)
              .sendKeys("07100")
              .sendKeys(Keys.TAB)
              .sendKeys(faker.phoneNumber().cellPhone())
              .sendKeys(Keys.PAGE_DOWN)
              .perform();

    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {
       automationExercisePage.createButonu.click();

    }
    @Then("hesap olustugunu test edin")
    public void hesap_olustugunu_test_edin() {
       Assert.assertTrue(automationExercisePage.accountCreatedYaziElementi.isDisplayed());

    }

}
