package Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class Triagemodule {
   WebDriver driver;

    public Triagemodule(WebDriver driver) {

        this.driver=driver;
    }

    public void Triage() throws InterruptedException {
        Thread.sleep(10000);
        WebElement Triagemodule = driver.findElement(xpath("//div[normalize-space()='Triage']"));
        Triagemodule.click();
//Editetriage
        Thread.sleep(3000);
        WebElement Editetriage=driver.findElement(xpath("//*[@ng-reflect-message=\"Visit Intake\"]"));
        Editetriage.click();

        //choosing RecordedBy
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

        //clicking on save button
        Thread.sleep(3000);
        WebElement save=driver.findElement(xpath("(//*[text()=\" Save \"])[1]"));
        save.click();

        //clicking on next button
        Thread.sleep(3000);
        WebElement next=driver.findElement(xpath("(//*[text()=\" Next \"])[1]"));
        next.click();






    }
}
