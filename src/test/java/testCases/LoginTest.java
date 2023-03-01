package testCases;

import helpers.LoginHelpers;
import org.testng.Assert;
import pajeObjects.LoginPage;
import utils.Base_class;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class LoginTest extends Base_class {

    @BeforeClass
    public void initialize() {
        loginPage = new LoginPage(driver);
        loginHelpers = new LoginHelpers(driver);
    }

    @BeforeMethod
    public void gotoLoginPage(){
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @DataProvider(name = "UserData")
    public Object[][] loginDetails() {
        return new Object[][]{
                {"prash", "prash"},
                {"Admin", "Admin"},
        };
    }

    @Test(dataProvider = "UserData")
    public void verifyLoginwithValidDeatils (String username, String password)
    {
        loginHelpers.doLogin(username,password);
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(loginPage.loginSuccess.getText(),"Login Successfully");

        softAssert.assertAll();
        System.out.println("Login Successfully");

    }

    @DataProvider(name = "InvalidUserData")
    public Object[][] InvalidloginDetails() {
        return new Object[][]{
                {"prashwe", "prashwee"},

        };
    }

    @Test(dataProvider = "InvalidUserData")
    public void verifyLoginWithInValidDetails(String username, String password)
    {
        loginHelpers.doLogin(username,password);

       String expected = "Enter your userName and password correct";
       String actual = loginPage.loginFail.getText();

       Assert.assertEquals(actual,expected,"User name and password incorrect");
        System.out.println("User is not logging with Invalid username and password");


    }

}
