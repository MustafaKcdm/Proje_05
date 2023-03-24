import Utlity.BaseDriver;
import Utlity.BaseDriverParameter;
import XML.CaseWebElements;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.swing.*;


public class Proje_5_POM extends BaseDriverParameter {
    @Test()
    void loginTest(){
        CaseWebElements cwe = new CaseWebElements();
        Actions act = new Actions(BaseDriver.driver);
        act.moveToElement(cwe.loginButton).click().build().perform();
//        cwe.email.clear();
//        cwe.email.sendKeys("admin@yourstore.com");
//        cwe.password.clear();
//        cwe.password.sendKeys("admin");
//        cwe.loginButton.click();
        Assert.assertTrue(cwe.Validation.getText().contains("Dashboard"));

    }
}
