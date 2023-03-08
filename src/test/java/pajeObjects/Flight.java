package pajeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Flight {

    @FindBy(xpath = "//a[text()='Flights']")
    WebElement clickFlightButton;

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
    WebElement clickOnWayButtons;

    @FindBy(name = "passCount")
    WebElement selectPassengers;

    @FindBy(name = "fromPort")
    WebElement departFrom;

    @FindBy(name = "fromMonth")
    WebElement departMonth;

    @FindBy(name = "fromDay")
    WebElement departDate;

    @FindBy(name = "toPort")
    WebElement arrivingTo;

    @FindBy(name = "toMonth")
    WebElement arrivingMonth;

    @FindBy(name = "toDay")
    WebElement arrivingDay;

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")
    WebElement serviceType;

    @FindBy(name = "airline")
    WebElement airline;

    @FindBy(name = "findFlights")
    WebElement clickContinue;

    WebDriver driver;

    public Flight(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void setClickFlightButton()
    {
        clickFlightButton.click();
    }

    public void clickOnWayButtons()
    {
        WebElement flightType = clickOnWayButtons;
        flightType.click();
    }

    public void selectPassengers()
    {
        Select select = new Select(selectPassengers);
        select.selectByIndex(1);
    }

    public void setDepartFrom()
    {
        Select select = new Select(departFrom);
        select.selectByIndex(3);
    }

    public void setDepartMonth()
    {
        Select select = new Select(departMonth);
        select.selectByIndex(3);
    }

    public void setDepartDate()
    {
        Select select = new Select(departDate);
        select.selectByIndex(25);
    }

    public void setArrivingTo(){
        Select select = new Select(arrivingTo);
        select.selectByIndex(4);
    }

    public void setArrivingMonth(){
        Select select = new Select(arrivingMonth);
        select.selectByIndex(4);
    }

    public void setArrivingDay(){
        Select select = new Select(arrivingDay);
        select.selectByIndex(27);
    }

    public void setServiceType(){
        WebElement serviceSelect = serviceType;
        serviceSelect.click();
    }

    public void setAirline(){
        Select select = new Select(airline);
        select.selectByIndex(2);
    }

    public void ClickContinue(){
        clickContinue.click();
    }

}
