import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhoneOrderMailingCheck {

    static void PhoneOrdMailChk(WebDriver driver) throws InterruptedException {

        Log.info("----- Starting PhoneOrderMailingCheck -----");

        // Call PhoneOrderBase to add filter to order
        PhoneOrderBase.PhoneOrdBase(driver);

        // Select payment option Mail Order Check
        Log.info("Select Mail Check order option and submit order");
        driver.findElement(By.xpath("(//input[@name='paymentType'])[2]")).click();
        // Submit Payment
        driver.findElement(By.name("submitBtn")).click();

        Log.info("----- Ending PhoneOrderMailingCheck -----");

    }


}
