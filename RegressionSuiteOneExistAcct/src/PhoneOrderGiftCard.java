import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhoneOrderGiftCard {

    static void PhoneOrdGiftCard(WebDriver driver) throws InterruptedException {

        Log.info("----- Starting PhoneOderGiftCard -----");

        // Call PhoneOrderbase to add a filter to the order
        PhoneOrderBase.PhoneOrdBase(driver);

        // Select Gift Card payment option
        Log.info("Select Gift Card option and enter info");
        driver.findElement(By.xpath("(//input[@name='paymentType'])[6]")).click();

        // Enter Gift Certificate number
        driver.findElement(By.name("giftCode")).sendKeys("GC1176673DB1C7650CD2CB852");

        // Continue payment
        driver.findElement(By.name("giftCodeSubmit")).click();

        // Continue payment again
        Log.info("Click Gist Code Submit button");
        driver.findElement(By.name("giftCodeSubmit")).click();

        Log.info("----- Ending PhoneOrderGiftCard -----");

    }

}
