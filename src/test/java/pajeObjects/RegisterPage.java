package pajeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setUsername(String uname) {
        username.sendKeys(uname);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
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
