package pajeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenericHelpers;

public class RegisterPage {

    @FindBy(id = "email")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "confirmPassword")
    WebElement confirmPassword;

    @FindBy(name = "submit")
    WebElement submit;

    @FindBy(xpath = "//a[text()='REGISTER']")
    WebElement clickRegistration;

    @FindBy(xpath = "//b[starts-with(text(),' Note: Your user name is')]")
    public WebElement registrationSucess;

    WebDriver driver;
    GenericHelpers genericHelpers;

    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        genericHelpers = new GenericHelpers();
    }

    public void setUsername(String uname) {
        System.out.println("Setting Username as : "+uname);
        username.sendKeys(uname);
        genericHelpers.setText(username,uname);
    }


    public void setPassword(String pwd){
        System.out.println("Setting Password as : "+pwd);
        password.sendKeys(pwd);
        genericHelpers.setText(password,pwd);
    }

    public void setConfirmPassword(String confirmpwd){
        confirmPassword.sendKeys(confirmpwd);
    }

    public void clickSubmit(){
        submit.click();
    }

    public void clickRegistration()
    {
        clickRegistration.click();
    }

    public String readSuccessMessage()
    {
        return registrationSucess.getText();
    }

}
