import Utlity.BaseDriverParameter;
import XML.CaseWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Proje_5_POM extends BaseDriverParameter {
    @Test()
    void loginTest(){
        driver.get("https://admin-demo.nopcommerce.com/login");
        CaseWebElements cwe = new CaseWebElements();
        cwe.email.sendKeys("admin@yourstore.com");
        cwe.password.sendKeys("admin");
        cwe.loginbutton.click();
        Assert.assertTrue(cwe.Validation.getText().contains("Dashboard"));


    }
}
