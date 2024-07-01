package Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class PatientsModule {
    WebDriver driver;

    public PatientsModule(WebDriver driver) {

        this.driver = driver;
    }

    public void Patients() throws InterruptedException {
        Thread.sleep(5000);
        WebElement PatientAppointment = driver.findElement(xpath("//div[normalize-space()='Patient']"));
        PatientAppointment.click();

        //Newpatinet
        Thread.sleep(5000);
        WebElement Newpatinet = driver.findElement(xpath("//*[text()=\" Add New Patient\"]"));
        Newpatinet.click();

        //choosingfacility
        Thread.sleep(5000);
        WebElement choosingfacility = driver.findElement(xpath("//*[@formcontrolname=\"Facility\"]"));
        choosingfacility.click();

        //choosingbludelhi
        Thread.sleep(5000);
        WebElement choosingbludelhi = driver.findElement(xpath("(//*[@class=\"mat-option-text\"])[1]"));
        choosingbludelhi.click();


        //choosing patienttype
        Thread.sleep(5000);
        WebElement patienttype = driver.findElement(xpath("//*[@formcontrolname=\"PatientType\"]"));
        patienttype.click();

        //choosingpatienttype
        Thread.sleep(5000);
        WebElement choosingpatienttype = driver.findElement(xpath("//*[text()=\" Inpatient  \"]"));
        choosingpatienttype.click();

        //patinet firstname
        Thread.sleep(5000);
        WebElement firstname = driver.findElement(xpath("//*[@formcontrolname=\"PatientFirstName\"]"));
        firstname.sendKeys("Arun");

        //patinet  //PatientLastName
        Thread.sleep(5000);
        WebElement PatientLastName = driver.findElement(xpath("//*[@formcontrolname=\"PatientLastName\"]"));
        PatientLastName.sendKeys("Vijay");

        //Gender
        Thread.sleep(5000);
        WebElement Gender = driver.findElement(xpath("//*[@formcontrolname=\"Gender\"]"));
        Gender.click();

        //choosinggender
        Thread.sleep(5000);
        WebElement choosinggender = driver.findElement(xpath("//*[text()=\" Male \"]"));
        choosinggender.click();

        //Entering emergencycontact
        Thread.sleep(5000);
        WebElement emergencycontact = driver.findElement(xpath("//*[@formcontrolname=\"Emergencycontactnumber\"]"));
        emergencycontact.sendKeys("7656787667");

        //save
        Thread.sleep(5000);
        WebElement save = driver.findElement(xpath("//*[text()=\"Save\"]"));
        save.click();
        //patientviewdetails
        Thread.sleep(20000);
        WebElement patientviewdetails= driver.findElement(xpath("(//*[@ng-reflect-message=\"View Patient Details\"])[1]"));
      patientviewdetails.click();

      //Closepatientviewdetails
        Thread.sleep(5000);
        WebElement Closepatientviewdetails= driver.findElement(xpath("//*[@class=\"close\"]"));
        Closepatientviewdetails.click();

        //patientEditdetails
        Thread.sleep(5000);
        WebElement patientEditdetails= driver.findElement(xpath("(//*[@ng-reflect-message=\"Edit Patient Details\"])[1]"));
        patientEditdetails.click();

        //ClosepatientEditdetails
        Thread.sleep(5000);
        WebElement ClosepatientEditdetails= driver.findElement(xpath("//*[@class=\"close\"]"));
        ClosepatientEditdetails.click();

        //Patientchart
        Thread.sleep(10000);
        WebElement Patientchart= driver.findElement(xpath("(//*[@ng-reflect-message=\"Patient Chart\"])[1]"));
        Patientchart.click();

        //Patientchart demographics
        Thread.sleep(3000);
        WebElement demographics = driver.findElement(xpath("//*[text()=\"Demographics\"]"));
        demographics.click();

        //Patientchart HealthHistory
        Thread.sleep(3000);
        WebElement HealthHistory = driver.findElement(xpath("//*[text()=\"Health History\"]"));
        HealthHistory.click();

        //Patientchart Visit
        Thread.sleep(3000);
        WebElement Visit = driver.findElement(xpath("//*[text()=\"Visit\"]"));
        Visit.click();
        //Patientchart Hospitalization
        Thread.sleep(3000);
        WebElement Hospitalization = driver.findElement(xpath("//*[text()=\"Hospitalization\"]"));
        Hospitalization.click();

        //BackPatientchart
        Thread.sleep(5000);
        WebElement Back = driver.findElement(xpath("//*[@class=\"px-3 mr-2 my-2\"]"));
        Back.click();

        //Patient Summary
        Thread.sleep(5000);
        WebElement PrintPatientSummary= driver.findElement(xpath("(//*[@ng-reflect-message=\"Print Patient Summary\"])[1]"));
        PrintPatientSummary.click();

        //ClosePatientSummary
        Thread.sleep(3000);
        WebElement ClosePatientSummary= driver.findElement(xpath("//*[@class=\"close\"]"));
        ClosePatientSummary.click();


    }
}
