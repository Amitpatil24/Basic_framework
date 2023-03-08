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

    @FindBy(css = "input[name='submit']")
    public WebElement buttonSubmit;

    @FindBy(xpath = "//a[text()='REGISTER']")
    WebElement clickRegistration;

    @FindBy(xpath = "//b[starts-with(text(),' Note: Your user name is')]")
    public WebElement readMessage;

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
//        username.sendKeys(uname);
        genericHelpers.setText(username,uname);
    }


    public void setPassword(String pwd){
        System.out.println("Setting Password as : "+pwd);
//        password.sendKeys(pwd);
        genericHelpers.setText(password,pwd);
    }

    public void setConfirmPassword(String confirmpwd){
        System.out.println("Setting Comfirm Password as : "+confirmpwd);
//        confirmPassword.sendKeys(confirmpwd);
        genericHelpers.setText(confirmPassword,confirmpwd);

    }

    public void clickSubmit(){
        System.out.println("Clicking submit Button");
//        buttonSubmit.click();
        genericHelpers.clickElement(buttonSubmit);
    }

    public void clickRegistration()
    {
        System.out.println("Clicking Registration link");
//        clickRegistration.click();
        genericHelpers.clickElement(clickRegistration);
    }

    public String readNote()
    {
        System.out.println("Reading Note message");
        return genericHelpers.getString(readMessage);
    }

}

