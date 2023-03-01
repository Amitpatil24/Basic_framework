package TestCase;

import Helpers.LoginHelpers;
import Helpers.RegisterHelpers;
import PajeObject.LoginPage;
import PajeObject.RegisterPage;
import Utils.Base_class;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterTest extends Base_class {

    @BeforeClass
    public void initialize() {
         registerPage = new RegisterPage(driver);
         registerHelpers = new RegisterHelpers(driver);
    }

    @BeforeMethod()
    public void goToRegistration()
    {
        registerPage.clickRegistration();
    }

    @DataProvider(name = "UserData")
    public Object[][] ld() {
        return new Object[][]{
                {"Adhira05", "Adhira","Adhira"},
                {"Amit24", "Amit","Amit"},
        };
    }

    @Test(dataProvider = "UserData")
    public void Registration(String username, String password,String confirmPwd) {
        registerHelpers.doRegister(username, password,confirmPwd);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(registerPage.registrationSucess.getText(),"Note: Your user name is");

    }

}





