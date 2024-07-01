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
//Edite triage
        Thread.sleep(5000);
        WebElement Searchphysician=driver.findElement(xpath("//*[@formcontrolname=\"Visit Intake\"]"));
        Searchphysician.click();
    }
}
