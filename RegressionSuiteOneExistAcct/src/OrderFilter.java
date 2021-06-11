import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class OrderFilter {

    static void OrderFltr(WebDriver driver) throws InterruptedException {
        // Give the website up to 10 second to wait for each WebElement to be found
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Log.info("--- Starting OrderFilter ---");

        // Search for filters
        Log.info("Search for a filter");
        driver.findElement(By.name("search")).sendKeys("filter");
        driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        // Add a filter to the order
        Log.info("Click Buy Now");
        driver.findElement(By.cssSelector(".listProduct:nth-child(2) .buy_now")).click();
        // Add filter to cart
        driver.findElement(By.id("addtoCart4028")).click();
        // Click Secure Checkout
        Log.info("Click Secure Checkout");
        driver.findElement(By.linkText("Secure Checkout")).click();

        Log.info("--- Ending OrderFilter ---");

    }

}
