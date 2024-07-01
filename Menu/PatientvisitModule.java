package Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import static org.openqa.selenium.By.xpath;
public class PatientvisitModule {
    WebDriver driver;

    public PatientvisitModule(WebDriver driver) {

        this.driver = driver;
    }

    public void Patientvisit() throws InterruptedException {
        Thread.sleep(10000);
        WebElement PatientvisitModule = driver.findElement(xpath("//div[normalize-space()='Patient Visit']"));
        PatientvisitModule.click();

        //clicking on Requestsappointments
        Thread.sleep(5000);
        WebElement Requestsappointments = driver.findElement(xpath("//*[@id=\"Requests\"]"));
        Requestsappointments.click();
        //Editeappointement
        Thread.sleep(2000);
        WebElement Editeappointement = driver.findElement(xpath("//*[@class=\"footerIcons ng-star-inserted\"]"));
        Editeappointement.click();
        //Scrollbar
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        //clicking on the visittime
        Thread.sleep(2000);
        WebElement visittime = driver.findElement(xpath("//*[@formcontrolname=\"VisitTime\"]"));
        visittime.click();

        //choosingtime10
        Thread.sleep(5000);
        WebElement choosingtime10 = driver.findElement(xpath("//*[text()=\" 10 \"]"));
        choosingtime10.click();

        //am/pm
        Thread.sleep(3000);
        WebElement pm = driver.findElement(xpath("//*[text()=\"PM\"]"));
        pm.click();



//   //choosingtime
//        Thread.sleep(5000);
//        WebElement choosingtime = driver.findElement(xpath("(//*[@class=\"clock-face__number clock-face__number--outer ng-star-inserted\"])[31]"));
//        choosingtime.click();


        //setpup the visittime
        Thread.sleep(2000);
        WebElement setvisittime = driver.findElement(xpath("//*[text()=\"Ok\"]"));
        setvisittime.click();

        //clicking on close button
        Thread.sleep(3000);
        WebElement close1 = driver.findElement(xpath("//*[text()=\"Close\"]"));
        close1.click();

        // clicking on VisitType dropdown
        Thread.sleep(2000);
        WebElement VisitType = driver.findElement(xpath("//*[@formcontrolname=\"VisitType\"]"));
        VisitType.click();

        //choosevisittype
        Thread.sleep(3000);
        WebElement choosevisittype = driver.findElement(xpath("//*[text()=\"Recurring\"]"));
        choosevisittype.click();

        //clicking on RecordedDuringdropdown
        Thread.sleep(2000);
        WebElement RecordedDuringdropdown = driver.findElement(xpath("//*[@formcontrolname=\"RecordedDuring\"]"));
        RecordedDuringdropdown.click();

        //chooseRecordedDuring
        Thread.sleep(3000);
        WebElement chooseRecordedDuring = driver.findElement(xpath("//*[text()=\" Day care \"]"));
        chooseRecordedDuring.click();

        //choosing urgencydropdown
        Thread.sleep(2000);
        WebElement urgencydropdown = driver.findElement(xpath("(//*[@class=\"col-lg-3\"])[6]"));
        urgencydropdown.click();

        //choosingurgency
        Thread.sleep(3000);
        WebElement choosingurgency = driver.findElement(xpath("//*[text()=\" Urgent \"]"));
        choosingurgency.click();

        //PatientArrivalCondition dropdown
        Thread.sleep(2000);
        WebElement PatientArrivalCondition = driver.findElement(xpath("//*[@formcontrolname=\"PatientArrivalCondition\"]"));
        PatientArrivalCondition.click();

        //choosingPatientArrivalCondition
        Thread.sleep(3000);
        WebElement choosingPatientArrivalCondition = driver.findElement(xpath("//*[text()=\" Delayed \"]"));
        choosingPatientArrivalCondition.click();

        //clicking on ToConsult dropdown
        Thread.sleep(2000);
        WebElement ToConsult = driver.findElement(xpath("//*[@formcontrolname=\"ToConsult\"]"));
        ToConsult.click();

        //choosing on doctor
        WebElement doctor = driver.findElement(xpath("//*[text()=\" Naresh  Sharma \"]"));
        doctor.click();
        //consultingdoctor
        Thread.sleep(2000);
        WebElement consultingdoctor = driver.findElement(xpath("//*[@formcontrolname=\"Provider\"]"));
        consultingdoctor.click();

        //choosingconsultingdoctor
        WebElement choosingconsultingdoctor = driver.findElement(xpath("//*[text()=\" Naresh  Sharma \"]"));
        choosingconsultingdoctor.click();

        //consultigtype
        Thread.sleep(2000);
        WebElement consultigtype = driver.findElement(xpath("//*[@formcontrolname=\"ConsultationType\"]"));
        consultigtype.click();

        //choosingconsultigtype
        Thread.sleep(2000);
        WebElement choosingconsultigtype = driver.findElement(xpath("//*[text()=\"  Spec., Proc/ Test \"]"));
        choosingconsultigtype.click();

        //ChiefComplaint textbox
        Thread.sleep(2000);
        WebElement ChiefComplaint = driver.findElement(xpath("//*[@formcontrolname=\"ChiefComplaint\"]"));
        ChiefComplaint.sendKeys("Diabetic");

        //clicking on  VisitPayment
        Thread.sleep(2000);
            WebElement VisitPayment = driver.findElement(xpath("//*[text()=\" Visit Payment \"]"));
            VisitPayment.click();

        //clicking on close button
        WebElement close = driver.findElement(xpath("//*[text()='Close']"));
        close.click();

        //clicking on back button
        WebElement back = driver.findElement(xpath("//*[text()=' Back ']"));
        back.click();


//        //Payment
//        //entering payment Department
//        Thread.sleep(2000);
//        WebElement Department = driver.findElement(xpath("//*[@formcontrolname=\"Department\"]"));
//        Department.sendKeys("Ane");
//
//        //Choosingdepartment
//        Thread.sleep(3000);
//        WebElement Choosingdepartment = driver.findElement(xpath("//*[text()=\" Anesthesiology \"]"));
//        Choosingdepartment.click();
//
//        //Entering BillingParticulars
//        Thread.sleep(2000);
//        WebElement BillingParticulars = driver.findElement(xpath("(//*[@ng-reflect-placeholder=\"Type and Select\"])[2]"));
//        BillingParticulars.sendKeys("tes");
//
//        //ChossingBillingParticulars
//        Thread.sleep(5000);
//        WebElement ChossingBillingParticulars = driver.findElement(xpath("//*[text()=\" 123 test - sub test \"]"));
//        ChossingBillingParticulars.click();
//
//
//      //PaidAmount
//        Thread.sleep(2000);
//        WebElement PaidAmount = driver.findElement(xpath("//*[@formcontrolname=\"PaidAmount\"]"));
//        PaidAmount.sendKeys("300");
//
//        //PaymentMode
//        Thread.sleep(2000);
//        WebElement PaymentMode = driver.findElement(xpath("//*[@formcontrolname=\"PaymentMode\"]"));
//        PaymentMode.click();
//
//        //choosingPaymentMode
//        Thread.sleep(5000);
//        WebElement choosingPaymentMode = driver.findElement(xpath("//*[text()=\" Cash In Hand \"]"));
//        choosingPaymentMode.click();
//
//        //clicking on save button
//        Thread.sleep(5000);
//        WebElement save = driver.findElement(xpath("//*[text()=\" Save \"]"));
//        save.click();
//
//
//
//





    }

}
