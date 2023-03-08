package utils;

import helpers.FlightHelpers;
import helpers.LoginHelpers;
import helpers.RegisterHelpers;
import pajeObjects.Flight;
import pajeObjects.LoginPage;
import pajeObjects.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Base_class {

    public WebDriver driver;
    public LoginPage loginPage;
    public RegisterPage registerPage;
    public LoginHelpers loginHelpers;
    public RegisterHelpers registerHelpers;
    public Flight flight;
    public FlightHelpers flightHelpers;

    @BeforeClass()
    public void invokeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","E:\\Automation\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeClass(dependsOnMethods = "invokeBrowser")
    public void navigateUrl()
    {
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @AfterClass()
    public void closeBrowser()
    {
        driver.quit();
    }
}
