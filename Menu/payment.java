package Menu;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class payment {
    WebDriver driver;

    public payment(WebDriver driver) {

        this.driver = driver;
    }

    public void paymentvisit() throws InterruptedException {
        Thread.sleep(20000);
        WebElement PatientvisitModule = driver.findElement(xpath("//div[normalize-space()='Patient Visit']"));
        PatientvisitModule.click();
        Thread.sleep(5000);
        WebElement Payment = driver.findElement(xpath("(//*[@ng-reflect-message=\"Visit Payment\"])[1]"));
        Payment.click();
        //Payment
        //entering payment Department
        Thread.sleep(2000);
        WebElement Department = driver.findElement(xpath("//*[@formcontrolname=\"Department\"]"));
        Department.sendKeys("Ane");

        //Choosingdepartment
        Thread.sleep(3000);
        WebElement Choosingdepartment = driver.findElement(xpath("//*[text()=\" Anesthesiology \"]"));
        Choosingdepartment.click();

        //Entering BillingParticulars
//        Thread.sleep(2000);
//        WebElement EnteringBillingParticulars = driver.findElement(xpath("//input[@formcontrolname='BillingParticulars']"));
////        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", EnteringBillingParticulars);
////        EnteringBillingParticulars.sendKeys("tes");
//      JavascriptExecutor jse = (JavascriptExecutor) driver;
//       ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','test')", EnteringBillingParticulars);
//        Thread.sleep(3000);
//     ((JavascriptExecutor) driver).executeScript("arguments[0].click()", EnteringBillingParticulars);
////
//
//        //ChossingBillingParticulars
////        Thread.sleep(2000);
//        WebElement ChosingBillingParticulars = driver.findElement(xpath("//span[text()=' 123  - sub test ']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", ChosingBillingParticulars);

        Thread.sleep(2000);
        WebElement BillingParticulars = driver.findElement(xpath("//*[@formcontrolname=\"BillingParticulars\"]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Thread.sleep(2000);
       ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','test')", BillingParticulars);
        //BillingParticulars.sendKeys("tes");

        //Choosingdepartment
        Thread.sleep(3000);

        WebElement ChosingBillingParticulars = driver.findElement(xpath("//*[text()=\" 123  - sub test \"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ChosingBillingParticulars);
        //ChosingBillingParticulars.click();


    }
}
