package Login;
import Menu.*;
import Menu.PatientvisitModule;
import POM.LoginpagePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
///sgsuriya

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

//        //calling to Appointment page
       //AppointmentModule Appointment= new AppointmentModule(driver);
      // Appointment.Appointment();
//        //calling to PatientModule
        //PatientsModule  Patients= new PatientsModule(driver);
        //Patients.Patients();
        //put on existing patient appointment
        //existingpatientappointment ExistingAppointment=new existingpatientappointment(driver);
        //ExistingAppointment.ExistingAppointment();
        //calling to Patientvisit
       // PatientvisitModule Patientvisit= new PatientvisitModule(driver);
        //Patientvisit.Patientvisit();
        //visit page appointment page
        //payment paymentvisit=new payment(driver);
        //paymentvisit.paymentvisit();
        //New patient appointment
        //existingpatientappointment ExistingAppointment=new existingpatientappointment(driver);
        //ExistingAppointment.ExistingAppointment();
        //calling Triagemodule
        Triagemodule Triage=new Triagemodule(driver);
        Triage.Triage();
    }
}
