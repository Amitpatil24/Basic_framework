package Helpers;

import PajeObject.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginHelpers {
        LoginPage loginPage;

        public LoginHelpers(WebDriver driver){
            loginPage = new LoginPage(driver);
        }

        public void doLogin(String username, String password){
            loginPage.setUsername(username);
            loginPage.setPassword(password);
            loginPage.clickSubmit();
        }


}
