package Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.openqa.selenium.By.xpath;

public class consultingmodule {
    WebDriver driver;

    public consultingmodule(WebDriver driver) {

        this.driver = driver;
    }

    public void consulting() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
        // Thread.sleep(5000);
        //clicking on consulting
        WebElement consulting = driver.findElement(xpath("//div[normalize-space()='Consulting']"));
        consulting.click();
        //searchpatient
        Thread.sleep(3000);
        WebElement searchpatient = driver.findElement(xpath("//*[@formcontrolname=\"Patient\"]"));
        searchpatient.sendKeys("Rabin");

        //clivking on kevinpatient
        Thread.sleep(3000);
        WebElement Rabinpatient=driver.findElement(xpath("//*[text()=\" Rabin      john - MR0000118 \"]"));
        Rabinpatient.click();

        //searchpatient
        Thread.sleep(3000);
        WebElement searchpatient1=driver.findElement(xpath("//*[text()=\"Search\"]"));
        searchpatient1.click();

        //Editeconsulting
        Thread.sleep(5000);
        WebElement Editeconsulting=driver.findElement(xpath("//*[@class=\"footerIcons\"]"));
        Editeconsulting.click();

        //view intakesummary
        Thread.sleep(10000);
        WebElement intakesummary=driver.findElement(xpath("//*[@mattooltip=\"Intake Summary\"]"));
        intakesummary.click();

        //moving allergypart
        Thread.sleep(5000);
        WebElement allergypart=driver.findElement(xpath("(//*[text()=\"2\"])[2]"));
        allergypart.click();

        //moving problemlist
        Thread.sleep(5000);
        WebElement problemlist=driver.findElement(xpath("//*[text()=\"3\"]"));
        problemlist.click();


    }
}