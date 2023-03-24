package XML;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaseWebElements {
    public CaseWebElements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath =" *[@id='Email']")
    public WebElement email;
    @FindBy(css = "input[id='Password']")
    public WebElement password;
    @FindBy(css = "class=button-1 login-button")

    public WebElement loginButton;
    @FindBy(xpath = "//h1[normalize-space()='Dashboard']")
    public WebElement Validation;



}
