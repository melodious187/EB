import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class PhoneOrderECheck {

    static void PhoneOrdECheck(WebDriver driver) throws InterruptedException {

        Log.info("----- Starting PhoneOrderECheck");

        // Call phone order base, order filter and get ready for payment option
        PhoneOrderBase.PhoneOrdBase(driver);

        // Select E-Check payment option
        Log.info("Enter E-Check option and info");
        driver.findElement(By.xpath("(//input[@name='paymentType'])[5]")).click();

        // Enter routing number
        driver.findElement(By.name("routingNumber")).sendKeys("121042882");

        // Enter account number
        driver.findElement(By.name("accountNumber")).sendKeys("142536");

        // Enter Bank Name
        driver.findElement(By.name("bankName")).sendKeys("Wells Fargo");

        // Enter Account name
        driver.findElement(By.name("nameOnAccount")).sendKeys("RS1Ex");

        // Submit Payment
        Log.info("Click Submit");
        driver.findElement(By.id("submitBtn")).click();

        Log.info("----- Ending PhoneOrderECheck");

    }

}
