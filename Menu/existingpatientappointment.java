package Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class existingpatientappointment {
    WebDriver driver;

    public existingpatientappointment(WebDriver driver) {

        this.driver = driver;
    }

    public void ExistingAppointment() throws InterruptedException {

        //Appointment module
        Thread.sleep(10000);
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
        //clicking on existing patient
        Thread.sleep(5000);
        WebElement Existingpatient=driver.findElement(xpath("//*[text()=\" Existing patient \"]"));
        Existingpatient.click();

        //searching on existing patient
        Thread.sleep(5000);
        WebElement SearchExistingpatient=driver.findElement(xpath("//*[@placeholder=\"Search\"]"));
        SearchExistingpatient.sendKeys("kevin");

        //clcking on searching patient
        Thread.sleep(5000);
        WebElement clickinhSearchExistingpatient=driver.findElement(xpath("//*[text()=\" Kevin  John - MR0000133 \"]"));
        clickinhSearchExistingpatient.click();

        //choosing toconsult
        Thread.sleep(5000);
        WebElement toconsult=driver.findElement(xpath("//*[@formcontrolname=\"ToConsult\"]"));
        toconsult.click();
        //choose phycician
        //clcking on searching patient
        Thread.sleep(5000);
        WebElement phycician=driver.findElement(xpath("(//*[text()=\"Physician\"])[2]"));
        phycician.click();

        //searching on physicican
        Thread.sleep(5000);
        WebElement Searchphysician=driver.findElement(xpath("//*[@formcontrolname=\"ProviderName\"]"));
        Searchphysician.click();

        //physicanname
        Thread.sleep(5000);
        WebElement physicanname=driver.findElement(xpath("//*[text()=\" Naresh  Sharma\"]"));
        physicanname.click();

        //choosing appointmentcalender

        WebElement appointmentcalender= driver.findElement(xpath("//*[@aria-label=\"Open calendar\"]"));
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