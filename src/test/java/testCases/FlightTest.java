package testCases;

import helpers.FlightHelpers;
import helpers.RegisterHelpers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pajeObjects.Flight;
import pajeObjects.RegisterPage;
import utils.Base_class;

public class FlightTest extends Base_class {

    @BeforeClass
    public void initialize() {
        flight = new Flight(driver);
        flightHelpers = new FlightHelpers(driver);
    }


    @Test()
    public void Registration(){
        flightHelpers.doFlightRegistration();
    }

}
