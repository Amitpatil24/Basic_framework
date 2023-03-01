package pajeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setUsername(String uname) {
        username.sendKeys(uname);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickSubmit(){
        submit.click();
    }

    public String loginSuccess()
    {
        return loginSuccess.getText();
    }

    public String loginFail()
    {
        return loginFail.getText();
    }


}
