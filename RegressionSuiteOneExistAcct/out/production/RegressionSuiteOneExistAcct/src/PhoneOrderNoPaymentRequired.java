import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhoneOrderNoPaymentRequired {

    static void NoPayReq(WebDriver driver) throws InterruptedException {

        Log.info("----- Starting PhoneOrderNoPaymentRequired -----");

        // Call PhoneOrderBase to add filter to order
        PhoneOrderBase.PhoneOrdBase(driver);

        // Select payment option No Payment Required
        Log.info("Select No Payment Required option and submit order");
        driver.findElement(By.xpath("(//input[@name='paymentType'])[3]")).click();

        // Submit Payment
        driver.findElement(By.name("submitBtn")).click();

        Log.info("----- Ending PhoneOrderNoPaymentRequired -----");

    }

}
