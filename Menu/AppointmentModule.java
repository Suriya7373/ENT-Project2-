package Menu;
import static org.openqa.selenium.By.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static Login.Loginpage.driver;
import static org.openqa.selenium.By.xpath;

public class AppointmentModule {
    WebDriver driver;

    public AppointmentModule(WebDriver driver) {

        this.driver = driver;
    }
    public void Appointment() throws InterruptedException {

        //Appointment module
         Thread.sleep(5000);
         WebElement PatientAppointment = driver.findElement(xpath("//div[normalize-space()='Appointments']"));
         PatientAppointment.click();

         //Appointmentcalender
        Thread.sleep(5000);
          WebElement calendar= driver.findElement(xpath("(//*[@class=\"dx-button-text\"])[1]"));
          calendar.click();

          //Clicking on appointmentlist
        Thread.sleep(5000);
         WebElement appointmentlist= driver.findElement(xpath("//*[@id=\"List\"]"));
         appointmentlist.click();

        //Clicking on Addappointmentlist
        Thread.sleep(5000);
        WebElement Addappointmentlist= driver.findElement(xpath("//*[@id=\"Add\"]"));
        Addappointmentlist.click();

        //neew appointment choose Salutation
        Thread.sleep(5000);
        WebElement salutation= driver.findElement(xpath("//*[@formcontrolname=\"Salutation\"]"));
        salutation.click();

        //choosingsalutation
        Thread.sleep(5000);
        WebElement choosingsalutation= driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[1]"));
        choosingsalutation.click();

        //Endering patientfirstname
        Thread.sleep(1000);
        WebElement patientfirstname= driver.findElement(xpath("//*[@id=\"mat-input-7\"]"));
        patientfirstname.sendKeys("Bell");

        //Endering patientLasttname
        Thread.sleep(1000);
        WebElement patientLasttname= driver.findElement(xpath("//*[@id=\"mat-input-8\"]"));
        patientLasttname.sendKeys("John");

        //Choosing Genter
        Thread.sleep(1000);
        WebElement Genter= driver.findElement(xpath("//*[@ng-reflect-name=\"Gender\"]"));
        Genter.click();

        //Choosingmale
        WebElement Choosingmale= driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[1]"));
        Choosingmale.click();

        //PatientDOB
        WebElement PatientDOB= driver.findElement(xpath("//*[@placeholder=\"Date of Birth\"]"));
        PatientDOB.sendKeys("08/06/1959");

        //contactnumber
        Thread.sleep(1000);
        WebElement contactnumber= driver.findElement(xpath("//*[@id=\"mat-input-11\"]"));
        contactnumber.sendKeys("7373871966");

        //Chossing Facility
        WebElement Facility= driver.findElement(xpath("//*[@ng-reflect-name=\"FacilityName\"]"));
        Facility.click();

        //Chossing Facility name
        WebElement Facilityname= driver.findElement(xpath("(//span[@class=\"mat-option-text\"])[1]"));
        Facilityname.click();

        //Searching ProviderName
        WebElement SearchingName= driver.findElement(xpath("//*[@ng-reflect-name=\"ProviderName\"]"));
        SearchingName.click();

        //Choosingprovider
        WebElement Choosingprovider= driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[1]"));
        Choosingprovider.click();

        //choosing appointmentcalender

        WebElement appointmentcalender= driver.findElement(xpath("(//*[@aria-label=\"Open calendar\"])[2]"));
        appointmentcalender.click();

        //scedulling todayappointement
        Thread.sleep(3000);
        WebElement todayappointement= driver.findElement(xpath("//*[@class=\"mat-calendar-body-cell-content mat-calendar-body-today\"]"));
        todayappointement.click();

//        appointementtime
        WebElement appointementtime= driver.findElement(xpath("//*[@ng-reflect-name=\"AppointmentTime\"]"));
        appointementtime.click();
//
//      //choosingappointementtime
        Thread.sleep(5000);
       WebElement choosingappointementtime= (WebElement) driver.findElement(xpath("//*[@class=\"mat-option ng-star-inserted mat-active\"]"));
       choosingappointementtime.click();

       //Appointmenttype
        WebElement Appointmenttype= driver.findElement(xpath("//*[@ng-reflect-name=\"AppointmentType\"]"));
        Appointmenttype.click();

        //choosingappointmenttype
        WebElement choosingappointmenttype= driver.findElement(xpath("(//*[@class=\"mat-option ng-star-inserted mat-active\"])[1]"));
        choosingappointmenttype.click();

        //save the appointment
        WebElement save = driver.findElement(xpath("//*[text()='Save']"));
        save.click();

        //clicking on close button
        WebElement close = driver.findElement(xpath("//*[text()='Close']"));
        close.click();






















    }
}
