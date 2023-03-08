package helpers;

import org.openqa.selenium.WebDriver;
import pajeObjects.Flight;

public class FlightHelpers {
    Flight flight;

    public FlightHelpers(WebDriver driver){
        flight = new Flight(driver);
    }

    public void doFlightRegistration(){
        flight.setClickFlightButton();
        flight.clickOnWayButtons();
        flight.selectPassengers();
        flight.setDepartFrom();
        flight.setDepartMonth();
        flight.setDepartDate();
        flight.setArrivingTo();
        flight.setArrivingMonth();
        flight.setArrivingDay();
        flight.setArrivingDay();
        flight.setServiceType();
        flight.setAirline();
        flight.ClickContinue();
    }
}
