import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhoneOrderCC {

    static void PhoneOrdCC(WebDriver driver) throws InterruptedException {

        Log.info("----- Starting PhoneOrderCC -----");

        // Call phone order base, order filter and get ready for payment option
        PhoneOrderBase.PhoneOrdBase(driver);

        // Pay for order by clicking the Submit button
        Log.info("Click Submit");
        driver.findElement(By.id("submitBtn")).click();

        Log.info("----- Ending PhoneOrderCC -----");

    }

}
