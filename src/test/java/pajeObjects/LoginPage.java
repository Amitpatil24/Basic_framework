package pajeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenericHelpers;

public class LoginPage {

    @FindBy(name = "userName")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "submit")
    WebElement submit;

    @FindBy(xpath = "//h3[text()='Login Successfully']")
    public WebElement loginSuccess;

    @FindBy(xpath = "//input[@type='password']/following-sibling::span")
    public WebElement loginFail;

    WebDriver driver;
    GenericHelpers genericHelpers;

    public LoginPage(WebDriver driver){
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

    public void clickSubmit(){
        System.out.println("Clicking submit Button");
//        submit.click();
        genericHelpers.clickElement(submit);
    }

    public String loginSuccess()
    {
        return  loginSuccess.getText();
    }

    public String loginFail()
    {
        return loginFail.getText();
    }


}
