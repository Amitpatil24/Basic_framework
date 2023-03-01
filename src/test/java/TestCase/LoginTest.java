package TestCase;

import Helpers.LoginHelpers;
import PajeObject.LoginPage;
import Utils.Base_class;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class LoginTest extends Base_class {

    @BeforeClass
    public void initialize() {
        loginPage = new LoginPage(driver);
        loginHelpers = new LoginHelpers(driver);
    }

    @DataProvider(name = "UserData")
    public Object[][] ld() {
        return new Object[][]{
                {"prash", "prash"},
                {"Adminssasa", "Adminsadsa"},
                {"Admin", "Admin"},
        };
    }

    @Test(dataProvider = "UserData")
    public void verifyLogin (String username, String password)
    {
        loginHelpers.doLogin(username,password);
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(loginPage.loginSuccess.getText(),"Login Successfully");

        softAssert.assertAll();
        System.out.println("Login Successfully");


    }

}
