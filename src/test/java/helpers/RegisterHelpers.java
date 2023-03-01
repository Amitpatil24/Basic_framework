package helpers;

import pajeObjects.RegisterPage;
import org.openqa.selenium.WebDriver;

public class RegisterHelpers {

    RegisterPage registerPage;

    public RegisterHelpers(WebDriver driver){
        registerPage = new RegisterPage(driver);
    }

    public void doRegister(String username, String password,String confirmPwd){
        registerPage.setUsername(username);
        registerPage.setPassword(password);
        registerPage.setConfirmPassword(confirmPwd);
        registerPage.clickSubmit();

    }
}
