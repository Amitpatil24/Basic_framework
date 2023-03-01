package TestCase;

import Helpers.LoginHelpers;
import PajeObject.LoginPage;
import Utils.Base_class;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class LoginTest extends Base_class {

    LoginPage loginPage;
    LoginHelpers loginHelpers;

    @BeforeClass
    public void initialize() {
        loginPage = new LoginPage(driver);
        loginHelpers = new LoginHelpers(driver);
    }

    @DataProvider(name = "UserData")
    public Object[][] ld() {
        return new Object[][]{
                {"prash", "prash"},
                {"Admin", "Admin"},
        };
    }

    @Test(dataProvider = "UserData")
    public void verifyLogin (String username, String password)
    {
        loginHelpers.doLogin(username,password);

//        String expected = "SIGN-OFF";
//        String actual = driver.findElement(By.xpath("(//a[@href='index.php'])[3]")).getText();
//        Assert.assertEquals(actual,expected,"SIGN OFF not matches");
    }

}
