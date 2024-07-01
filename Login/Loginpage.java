package Login;

import Menu.AppointmentModule;
import POM.LoginpagePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class
Loginpage {
    public static WebDriver driver = new ChromeDriver();

    @Test
    public void Setup() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
        driver.get("https://entdemo.eblucare.com");
        driver.manage().window().maximize();

        //Enter username

        //LoginpagePOM loginpagePOM=new LoginpagePOM();
        LoginpagePOM.username(driver).sendKeys("bluehospital@eblucare.com");
        //Entering  password
        LoginpagePOM.Password(driver).sendKeys("Welcome@123");
        //Enter signup
        LoginpagePOM.Signin(driver).click();

        //calling to Appointment page
         AppointmentModule Appointment= new AppointmentModule(driver);
          Appointment.Appointment();
    }
}
