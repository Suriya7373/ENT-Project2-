package Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.openqa.selenium.By.xpath;

public class Triagemodule {
   WebDriver driver;

    public Triagemodule(WebDriver driver) {

        this.driver=driver;
    }

    public void Triage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
       // Thread.sleep(5000);
        WebElement Triagemodule = driver.findElement(xpath("//div[normalize-space()='Triage']"));
        Triagemodule.click();

        //searchpatient
        Thread.sleep(3000);
        WebElement searchpatient = driver.findElement(xpath("//*[@formcontrolname=\"Patient\"]"));
        searchpatient.sendKeys("Rabin");

        //clivking on kevinpatient
        Thread.sleep(3000);
        WebElement kevinpatient=driver.findElement(xpath("//*[text()=\" Rabin  john - MR0000118 \"]"));
//        kevinpatient.click();

        //searchpatient
        Thread.sleep(3000);
        WebElement searchpatient1=driver.findElement(xpath("//*[text()=\"Search\"]"));
        searchpatient1.click();


//Editetriage
        Thread.sleep(10000);
        WebElement Editetriage=driver.findElement(xpath("//*[@ng-reflect-message=\"Visit Intake\"]"));
        Editetriage.click();

//        //choosing RecordedBy
        Thread.sleep(3000);
        WebElement RecordedBy=driver.findElement(xpath("(//*[@formcontrolname=\"RecordedBy\"])[1]"));
        RecordedBy.click();

       //choosing recodrded by doctor name
        Thread.sleep(3000);
        WebElement choosingRecordedBy=driver.findElement(xpath("//*[@ng-reflect-value=\"Naresh  Sharma\"]"));
        choosingRecordedBy.click();

        //entering height
        Thread.sleep(3000);
        WebElement height=driver.findElement(xpath("(//*[@formcontrolname=\"Height\"])[1]"));
        height.sendKeys("160");

        //entering Weight
        Thread.sleep(3000);
        WebElement Weight=driver.findElement(xpath("//*[@formcontrolname=\"Weight\"]"));
        Weight.sendKeys("85");

        //Entering Temperature
        Thread.sleep(3000);
        WebElement Temperature=driver.findElement(xpath("//*[@formcontrolname=\"Temperature\"]"));
        Temperature.sendKeys("85");

        //choose patient diabetic yes/no
        Thread.sleep(3000);
        WebElement diabetic=driver.findElement(xpath("(//*[@class=\"mat-radio-container\"])[1]"));
        diabetic.click();

        //choosing bloodpressure yes/no
        Thread.sleep(3000);
        WebElement bloodpressure=driver.findElement(xpath("(//*[@class=\"mat-radio-container\"])[4]"));
        bloodpressure.click();
//        //clicking on save button
        Thread.sleep(3000);
        WebElement save1=driver.findElement(xpath("(//*[text()=\" Save \"])[1]"));
        save1.click();

        //clicking the close button
        Thread.sleep(3000);
        WebElement close=driver.findElement(xpath("//*[text()=\"Close\"]"));
        close.click();


//        //clicking on next button
        Thread.sleep(3000);
       WebElement next=driver.findElement(xpath("(//*[text()=\" Next \"])[1]"));
       next.click();

        //Allergy module
        //choosing RecordedBy
        Thread.sleep(3000);
       WebElement RecordedBy1=driver.findElement(xpath("(//*[@formcontrolname=\"RecordedBy\"])[2]"));
        RecordedBy1.click();
       //choosing recodrded by doctor name
        Thread.sleep(3000);
        WebElement choosingRecordedBy2=driver.findElement(xpath("//*[@ng-reflect-value=\"Naresh  Sharma\"]"));
        choosingRecordedBy2.click();

        //Enter allergyname
        WebElement allergyname=driver.findElement(xpath("//*[@placeholder=\"Enter Allergy Name\"]"));
        allergyname.sendKeys("pollan");

        //clicking on save button
        Thread.sleep(3000);
        WebElement save2=driver.findElement(xpath("//*[text()=\" save \"]"));
        save2.click();

        //clicking the close button
        Thread.sleep(3000);
        WebElement close1=driver.findElement(xpath("//*[text()=\"Close\"]"));
        close1.click();

        //clicking on next button
        Thread.sleep(3000);
        WebElement next1=driver.findElement(xpath("(//*[text()=\" Next \"])[2]"));
        next1.click();

        //adding Problem list
        //choosing RecordedBy
        Thread.sleep(3000);
        WebElement RecordedBy3=driver.findElement(xpath("(//*[@formcontrolname=\"RecordedBy\"])[3]"));
        RecordedBy3.click();
        //choosing recodrded by doctor name
        Thread.sleep(3000);
        WebElement choosingRecordedBy3=driver.findElement(xpath("//*[@ng-reflect-value=\"Naresh  Sharma\"]"));
        choosingRecordedBy3.click();

        //choosing problemtype
        Thread.sleep(3000);
        WebElement problemtype=driver.findElement(xpath("//*[@formcontrolname=\"ProblemTypeID\"]"));
        problemtype.click();

        //choosing particular problem type
        Thread.sleep(3000);
        WebElement  Hearingloss =driver.findElement(xpath("//*[text()=\" Hearing loss \"]"));
        Hearingloss .click();

        //clicking on save button
        Thread.sleep(3000);
        WebElement save3=driver.findElement(xpath("(//*[text()=\" Save \"])[2]"));
        save3.click();

        //clicking the close button
        Thread.sleep(3000);
        WebElement close2=driver.findElement(xpath("//*[text()=\"Close\"]"));
        close2.click();

        //clicking on next button
        Thread.sleep(3000);
        WebElement next2=driver.findElement(xpath("(//*[text()=\" Next \"])[3]"));
        next2.click();

        //adding drugname

        //adding drug
        Thread.sleep(3000);
        WebElement RecordedBy4=driver.findElement(xpath("//*[@formcontrolname=\"RecordedByMedication\"]"));
        RecordedBy4.click();

        //choosing recodrded by doctor name
        Thread.sleep(3000);
        WebElement choosingRecordedBy4=driver.findElement(xpath("//*[text()=\" Naresh  Sharma \"]"));
        choosingRecordedBy4.click();
//
//        //searching on drugname
        Thread.sleep(3000);
        WebElement drugname=driver.findElement(xpath("//*[@formcontrolname=\"ItemDrugName\"]"));
        drugname.sendKeys("dolo");
//
//
        //clicking on drugname
        Thread.sleep(10000);
        WebElement clickingdrugname=driver.findElement(xpath("//*[text()=\" 52959-0351-24 / DOLOBID TABLETS\"]"));
        clickingdrugname.click();
//
        //choosing Route
        Thread.sleep(3000);
        WebElement Route=driver.findElement(xpath("//*[@formcontrolname=\"Route\"]"));
        Route.click();
//
        //choosing Routeoral
        Thread.sleep(3000);
        WebElement Routeoral=driver.findElement(xpath("  //*[text()=\" Oral\"]"));
        Routeoral.click();
//
//        //Choosing Diagnosis
        Thread.sleep(3000);
        WebElement Diagnosis=driver.findElement(xpath(" //*[@formcontrolname=\"Diagnosis\"]"));
        Diagnosis.sendKeys("fever");
//
        //choosing feverdiagnosis
        Thread.sleep(10000);
        WebElement feverdiagnosis=driver.findElement(xpath("//*[text()=\"A924 - Rift Valley fever\"]"));
        feverdiagnosis.click();
//
//
//        //Entering total qutanity
//        Thread.sleep(3000);
        WebElement Qty=driver.findElement(xpath("//*[@formcontrolname=\"Qty\"]"));
        Qty.sendKeys("10");

        //entering totaldays
        Thread.sleep(3000);
        WebElement totaldays=driver.findElement(xpath("//*[@formcontrolname=\"Days\"]"));
        totaldays.sendKeys("10");

////        //clicking on save button
//        Thread.sleep(3000);
//        WebElement save4=driver.findElement(xpath("(//*[text()=\" Save \"])[3]"));
//        save4.click();
//
//        //clicking the close button
//        Thread.sleep(3000);
//        WebElement close3=driver.findElement(xpath("//*[text()=\"Close\"]"));
//        close3.click();

        //clicking on next button
        Thread.sleep(3000);
        WebElement next3=driver.findElement(xpath("(//*[text()=\" Next \"])[4]"));
        next3.click();

        //socialhistory

        //adding socialhistory
//        Thread.sleep(3000);
        WebElement RecordedBy5=driver.findElement(xpath("(//*[@formcontrolname=\"RecordedBy\"])[4]"));
        RecordedBy5.click();

        //choosing recodrded by doctor name
        Thread.sleep(3000);
        WebElement choosingRecordedBy5=driver.findElement(xpath("//*[text()=\" Naresh  Sharma \"]"));
        choosingRecordedBy5.click();

        //choosing smokinglevel
        Thread.sleep(3000);
        WebElement smokinglevel=driver.findElement(xpath("//*[@formcontrolname=\"Smoking\"]"));
        smokinglevel.click();
//
//
//
//       // Chain Smoker
//
//        //choosing smokingleverlstatus
         Thread.sleep(3000);
         WebElement smokingleverlstatus=driver.findElement(xpath("//*[text()=\" Chain Smoker \"]"));
          smokingleverlstatus.click();

        //Entering CigarettesPerDay
        Thread.sleep(3000);
        WebElement CigarettesPerDay=driver.findElement(xpath("//*[@formcontrolname=\"CigarettesPerDay\"]"));
        CigarettesPerDay.sendKeys("10");


        //choosing Drinkinglevel
        Thread.sleep(3000);
        WebElement Drinkinglevel=driver.findElement(xpath("  //*[@formcontrolname=\"Drinking\"]"));
        Drinkinglevel.click();
//
//
//       // Alcholicstatus
        Thread.sleep(3000);
        WebElement Alcholicstatus=driver.findElement(xpath(" //*[text()=\" Alcholic \"]"));
        Alcholicstatus.click();

        //AlcholicConsumptionPerDay
        Thread.sleep(3000);
        WebElement AlcholicConsumptionPerDay=driver.findElement(xpath("//*[@formcontrolname=\"ConsumptionPerDay\"]"));
        AlcholicConsumptionPerDay.sendKeys("100ml");

        //clicking on save button
        Thread.sleep(3000);
        WebElement save4=driver.findElement(xpath("(//*[text()=\" Save \"])[4]"));
        save4.click();

        //clicking the close button
        Thread.sleep(3000);
        WebElement close3=driver.findElement(xpath("//*[text()=\"Close\"]"));
        close3.click();

        //clicking on next button
        Thread.sleep(3000);
        WebElement next4=driver.findElement(xpath("(//*[text()=\" Next \"])[5]"));
        next4.click();

        //ROS
        //adding socialhistory
        Thread.sleep(3000);
        WebElement RecordedBy6=driver.findElement(xpath("(//*[@formcontrolname=\"RecordedBy\"])[5]"));
        RecordedBy6.click();

        //choosing recodrded by doctor name
        Thread.sleep(3000);
        WebElement choosingRecordedBy6=driver.findElement(xpath("//*[text()=\" Naresh  Sharma \"]"));
        choosingRecordedBy6.click();

        //choosing Neck
        Thread.sleep(2000);
        WebElement Neck=driver.findElement(xpath("//*[@formcontrolname=\"NeckLumps\"]"));
        Neck.click();
//
//        //choosing Respiratory
        Thread.sleep(2000);
        WebElement Respiratory=driver.findElement(xpath("//*[@formcontrolname=\"Cough\"]"));
        Respiratory.click();

        //choosing Neurologic
        Thread.sleep(2000);
        WebElement Neurologic=driver.findElement(xpath("//*[@formcontrolname=\"Dizziness\"]"));
        Neurologic.click();
        //choosing Hematologic
        Thread.sleep(2000);
        WebElement Hematologic=driver.findElement(xpath("//*[@formcontrolname=\"Easeofbruising\"]"));
        Hematologic.click();
        //choosing Psychiatric
        Thread.sleep(2000);
        WebElement Psychiatric=driver.findElement(xpath("//*[@formcontrolname=\"Nervousness\"]"));
        Psychiatric.click();


        //clicking on save button
        Thread.sleep(3000);
        WebElement save5=driver.findElement(xpath("(//*[text()=\" Save \"])[5]"));
        save5.click();

        //clicking the close button
        Thread.sleep(3000);
//        WebElement close5=driver.findElement(xpath("//*[text()=\"Close\"]"));
//        close5.click();

        //clicking on next button
        Thread.sleep(3000);
        WebElement next5=driver.findElement(xpath("(//*[text()=\" Next \"])[6]"));
        next5.click();

        //adding Nutrition
        Thread.sleep(3000);
        WebElement RecordedBy7=driver.findElement(xpath("(//*[@formcontrolname=\"RecordedBy\"])[6]"));
        RecordedBy7.click();

        //choosing recodrded by doctor name
        Thread.sleep(3000);
        WebElement choosingRecordedBy7=driver.findElement(xpath("//*[text()=\" Naresh  Sharma \"]"));
        choosingRecordedBy7.click();

        //clicking on save button
        Thread.sleep(3000);
        WebElement save6=driver.findElement(xpath("(//*[text()=\" Save \"])[6]"));
        save6.click();

        //clicking the close button
        Thread.sleep(3000);
        WebElement close6=driver.findElement(xpath("//*[text()=\"Close\"]"));
        close6.click();

        //clicking on next button
        Thread.sleep(3000);
        WebElement next6=driver.findElement(xpath("(//*[text()=\" Next \"])[7]"));
        next6.click();
        //Adding FunctionalCognitive
        Thread.sleep(3000);
        WebElement FunctionalCognitive=driver.findElement(xpath("(//*[@formcontrolname=\"RecordedBy\"])[7]"));
        FunctionalCognitive.click();

        //choosing recodrded by doctor name
        Thread.sleep(3000);
        WebElement FunctionalCognitive1=driver.findElement(xpath("//*[text()=\" Naresh  Sharma \"]"));
        FunctionalCognitive1.click();

        //clicking on save button
        Thread.sleep(3000);
        WebElement save7=driver.findElement(xpath("(//*[text()=\" Save \"])[7]"));
        save7.click();

        //clicking the close button
        Thread.sleep(3000);
        WebElement close7=driver.findElement(xpath("//*[text()=\"Close\"]"));
        close7.click();

        //clicking on next button
        Thread.sleep(3000);
        WebElement next7=driver.findElement(xpath("(//*[text()=\" Next \"])[8]"));
        next7.click();//clicking on save button

        //NursingSignOff
        Thread.sleep(3000);
        WebElement NursingSignOff=driver.findElement(xpath("(//*[@formcontrolname=\"RecordedBy\"])[8]"));
        NursingSignOff.click();

        //choosing recodrded by doctor name
        Thread.sleep(3000);
        WebElement NursingSignOff1=driver.findElement(xpath("//*[text()=\" Naresh  Sharma \"]"));
        NursingSignOff1.click();
        //clicking on save button
        Thread.sleep(3000);
        WebElement save8=driver.findElement(xpath("(//*[text()=\" Save \"])[8]"));
        save8.click();

        //clicking the close button
        Thread.sleep(3000);
        WebElement close8=driver.findElement(xpath("//*[text()=\"Close\"]"));
        close8.click();














    }
}
