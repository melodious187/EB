import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebOrderGiftCard {

    static void WebOrderGC(WebDriver driver) throws InterruptedException {
        System.out.println("====================================");
        System.out.println("You have made it to WebOrderGiftCard");
        System.out.println("====================================");

        // Give the website up to 10 second to wait for each WebElement to be found
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Add a filter to the order
        OrderFilter.OrderFltr(driver);

        // Add number to Gift Card field
        driver.findElement(By.id("gift-certificate")).sendKeys("GC1176673DB1C7650CD2CB852");

        // Click Continue on order
        // System.out.println("Waiting 15 Seconds to find Continue button after order");
        Thread.sleep(15000);
        // driver.findElement(By.xpath("//button[@name='giftCodeSubmit']")).click();
        driver.findElement(By.name("giftCodeSubmit")).click();


        // Get rid of popup window
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".featherlight-close-icon")).click();

        // Current GC = GC1176673DB1C7650CD2CB852, equipped with $500 for testing!

        System.out.println("=======================");
        System.out.println("End of WebOrderGiftCard");
        System.out.println("=======================");



    }

}
