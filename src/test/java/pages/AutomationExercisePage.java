package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signinButonu;
    @FindBy(xpath = "//*[@*='signup-name']")
    public WebElement signupNameKutusu;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement e_mailKutusu;
    @FindBy(xpath = "//button[text()='Signup']")
    public WebElement signUpButonu;

    @FindBy(xpath ="//input[@value='Mrs']")
    public WebElement mrsButonu;

    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement createButonu;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedYaziElementi;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmailKutusu;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPasswordKutusu;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButonu;
}
