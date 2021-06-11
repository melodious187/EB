import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhoneOrderBase {
    static void PhoneOrdBase(WebDriver driver) throws InterruptedException {

        Log.info("Starting Phone Order Base");

        // Click Orders tab
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("li:nth-child(1) > a > span")).click();

        // Click Phone Order
        driver.findElement(By.linkText("Phone Order")).click();

        // Search for Customer - will need to dynamically get the customer name from CreateAccount
        driver.findElement(By.name("fName")).sendKeys("EB2");

        // Search for name
        Log.info("Search for name of Customer");
        driver.findElement(By.xpath("//input[@value='Search']")).click();

        // Select name
        Thread.sleep(2000);
        Log.info("Select Customer found");
        driver.findElement(By.linkText("Select")).click();

        // Select Continue
        Thread.sleep(10000);
        Log.info("Hit Continue");
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

        // Search for a filter
        Thread.sleep(1000);
        Log.info("Search for a Filter");
        driver.findElement(By.name("search")).sendKeys("filter");

        // Select filter
        Thread.sleep(12000);
        Log.info("Select Filter");
        driver.findElement(By.cssSelector(".input > input:nth-child(2)")).click();

        // Add filter to Cart
        Thread.sleep(12000);
        Log.info("Add Filter to cart");
        driver.findElement(By.linkText("Add to Cart")).click();

        // Continue
        Log.info("Hit Continue");
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

        // Continue
        driver.findElement(By.id("continue-order")).click();

        // Continue
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

        // No on the Sweepstakes Entry
        driver.findElement(By.xpath("(//input[@name='sweepstakesentry'])[2]")).click();

        // Continue
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

        Log.info("Ending Phone Order Base");

    }

}
