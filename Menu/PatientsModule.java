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

      //patientviewdetails
        Thread.sleep(20000);
        WebElement patientviewdetails= driver.findElement(xpath("(//*[@ng-reflect-message=\"View Patient Details\"])[1]"));
      patientviewdetails.click();

      //Closepatientviewdetails
        Thread.sleep(3000);
        WebElement Closepatientviewdetails= driver.findElement(xpath("//*[@class=\"close\"]"));
        Closepatientviewdetails.click();

        //patientEditdetails
        Thread.sleep(10000);
        WebElement patientEditdetails= driver.findElement(xpath("(//*[@ng-reflect-message=\"Edit Patient Details\"])[1]"));
        patientEditdetails.click();

        //ClosepatientEditdetails
        Thread.sleep(3000);
        WebElement ClosepatientEditdetails= driver.findElement(xpath("//*[@class=\"close\"]"));
        ClosepatientEditdetails.click();

        //Patientchart
        Thread.sleep(10000);
        WebElement Patientchart= driver.findElement(xpath("(//*[@ng-reflect-message=\"Patient Chart\"])[1]"));
        Patientchart.click();

        //ClosePatientchart
        Thread.sleep(5000);
        WebElement ClosePatientchart= driver.findElement(xpath("(//*[@class=\"mat-button-ripple mat-ripple\"])[1]"));
        ClosePatientchart.click();

        //Patient Summary
        Thread.sleep(10000);
        WebElement PrintPatientSummary= driver.findElement(xpath("(//*[@ng-reflect-message=\"Print Patient Summary\"])[1]"));
        PrintPatientSummary.click();

        //ClosePatientSummary
        Thread.sleep(3000);
        WebElement ClosePatientSummary= driver.findElement(xpath("//*[@class=\"close\"]"));
        ClosePatientSummary.click();


    }
}
