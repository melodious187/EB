import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhoneOrderManualSplitPayment {

    static void PhoneOrdManSpPay (WebDriver driver) throws InterruptedException {

        Log.info("----- Starting PhoneOrderManualSplitPayment -----");

        // Call PhoneOrderBase  to add filter to order
        PhoneOrderBase.PhoneOrdBase(driver);

        // Select payment option Manual or Split Payment
        Log.info("Select Manual or Split Payment option and submit order");
        driver.findElement(By.xpath("(//input[@name='paymentType'])[4]")).click();

        // Submit Payment
        driver.findElement(By.name("submitBtn")).click();

        Log.info("----- Ending PhoneOrderManualSplitPayment -----");

    }

}
