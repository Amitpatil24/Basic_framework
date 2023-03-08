package pajeObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.GenericHelpers;

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
    GenericHelpers genericHelpers;

    public Flight(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        genericHelpers = new GenericHelpers();
    }


    public void setClickFlightButton()
    {
        System.out.println("Clicking Flight Button");
//        clickFlightButton.click();
        genericHelpers.clickElement(clickFlightButton);
    }

    public void clickOnWayButtons()
    {
        System.out.println("Clicking onWay Button");
//        WebElement flightType = clickOnWayButtons;
//        flightType.click();
        genericHelpers.clickElement(clickOnWayButtons);
    }

    public void selectPassengers()
    {
        System.out.println("Selecting total Passengers");
        Select select = new Select(selectPassengers);
        select.selectByIndex(1);
        genericHelpers.selectElement(selectPassengers);
    }

    public void setDepartFrom()
    {
        System.out.println("Selecting Departure from");
        Select select = new Select(departFrom);
        select.selectByIndex(3);
        genericHelpers.selectElement(departFrom);
    }

    public void setDepartMonth()
    {
        System.out.println("Selecting Departure Month");
        Select select = new Select(departMonth);
        select.selectByIndex(3);
        genericHelpers.selectElement(departMonth);
    }

    public void setDepartDate()
    {
        System.out.println("Selecting Departure date");
        Select select = new Select(departDate);
        select.selectByIndex(25);
        genericHelpers.selectElement(departDate);
    }

    public void setArrivingTo(){
        System.out.println("Selecting Arriving in");
        Select select = new Select(arrivingTo);
        select.selectByIndex(4);
        genericHelpers.selectElement(arrivingTo);
    }

    public void setArrivingMonth(){
        System.out.println("Selecting Arriving Month");
        Select select = new Select(arrivingMonth);
        select.selectByIndex(4);
        genericHelpers.selectElement(arrivingMonth);
    }

    public void setArrivingDay(){
        System.out.println("Selecting Arriving Day");
        Select select = new Select(arrivingDay);
        select.selectByIndex(27);
        genericHelpers.selectElement(arrivingDay);
    }

    public void setServiceType(){
        System.out.println("Click on service type");
//        WebElement serviceSelect = serviceType;
//        serviceSelect.click();
        genericHelpers.clickElement(serviceType);
    }

    public void setAirline(){
        System.out.println("Selecting Airline");
        Select select = new Select(airline);
        select.selectByIndex(2);
        genericHelpers.selectElement(airline);
    }

    public void clickContinue(){
        System.out.println("Clicking on continue button");
//        clickContinue.click();
        genericHelpers.clickElement(clickContinue);
    }

}
