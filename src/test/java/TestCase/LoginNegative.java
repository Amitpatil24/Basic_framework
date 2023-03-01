//package TestCase;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class LoginNegative {
//    WebDriver driver;
//
//    @BeforeClass()
//    public void invokeBrowser()
//    {
//        System.setProperty("webdriver.chrome.driver","E:\\Automation\\Drivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//    }
//
//    @BeforeMethod()
//    public void navigateUrl()
//    {
//        driver.get("https://demo.guru99.com/test/newtours/index.php");
//    }
//
//    @Test()
//    public void loginInValidCustomer()
//    {
//        driver.findElement(By.name("userName")).sendKeys("prashss");
//        driver.findElement(By.name("password")).sendKeys("prashss");
//        driver.findElement(By.name("submit")).click();
//        String expected = "Enter your userName and password correct";
//        String actual = driver.findElement(By.xpath("//input[@type='password']/following-sibling::span")).getText();
//        Assert.assertEquals(actual,expected,"User name and password incorrect");
//        System.out.println("User is Not login with Invalid Credentials");
//        String expected1 = "Enter your userName and password correct";
//        String actual2 = driver.findElement(By.xpath("//input[@type='password']/following-sibling::span")).getText();
//        Assert.assertEquals(actual,expected,"User name and password incorrect");

//        String expected2 = "REGISTER";
//        String actual2 = driver.findElement(By.xpath("//a[@href='register.php']")).getText();
//        Assert.assertEquals(actual2,expected2,"SIGN OFF not matches");
//        System.out.println("User is login with valid Credentials");
//    }
//
//    @Test()
//    public void loginInvalidAdmin()
//    {
//        driver.findElement(By.name("userName")).sendKeys("admin123122a");
//        driver.findElement(By.name("password")).sendKeys("admin123aaa");
//        driver.findElement(By.name("submit")).click();
//        String expected = "Enter your userName and password correct";
//        String actual = driver.findElement(By.xpath("//input[@type='password']/following-sibling::span")).getText();
//        Assert.assertEquals(actual,expected,"User name and password incorrect");
//        System.out.println("Admin User is Not login with Invalid Credentials");
//
//    }
//
//    @AfterClass()
//    public void closeBrowser()
//    {
//        driver.quit();
//    }
//}
