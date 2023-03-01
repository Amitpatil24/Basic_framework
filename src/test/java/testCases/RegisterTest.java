package testCases;

import helpers.RegisterHelpers;
import pajeObjects.RegisterPage;
import utils.Base_class;
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
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        registerPage.clickRegistration();
    }

    @DataProvider(name = "UserData")
    public Object[][] registrationsData() {
        return new Object[][]{
                {"Adhira05", "Adhira","Adhira"},
                {"Amit24", "Amit","Amit"},
        };
    }

    @Test(dataProvider = "UserData")
    public void Registration(String username, String password,String confirmPwd) {
        registerHelpers.doRegister(username, password,confirmPwd);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(registerPage.registrationSucess.isDisplayed(),"Registration Success message is not Displayed ");

        softAssert.assertAll();

    }

}





