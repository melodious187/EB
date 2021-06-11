import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebOrderGiftCard {

    static void WebOrderGC(WebDriver driver) throws InterruptedException {
        Log.info("----- Starting WebOrderGiftCard -----");

        // Give the website up to 10 second to wait for each WebElement to be found
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Add a filter to the order
        Log.info("Add a filter to the order");
        OrderFilter.OrderFltr(driver);

        // Add number to Gift Card field
        Thread.sleep(3000);
        Log.info("Enter Gift Card info");
        driver.findElement(By.id("gift-certificate")).sendKeys("GC1176673DB1C7650CD2CB852");

        // Click Continue on order
        Thread.sleep(15000);
        // Submit Payment
        Log.info("Submit Gift Card payment");
        driver.findElement(By.name("giftCodeSubmit")).click();


        // Get rid of popup window
        Thread.sleep(5000);
        Log.info("Close PopoUp");
        driver.findElement(By.cssSelector(".featherlight-close-icon")).click();

        Log.info("----- Ending WebOrderGiftCard -----");

    }

}
