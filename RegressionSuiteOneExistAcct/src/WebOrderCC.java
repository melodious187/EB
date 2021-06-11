import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class WebOrderCC {

    static void WebOrderCrCd(WebDriver driver) throws InterruptedException {

        Log.info("----- Starting WebOrderCC -----");

        // Give the website up to 10 second to wait for each WebElement to be found
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Add a filter to the order
        Log.info("Add a filter to the order");
        OrderFilter.OrderFltr(driver);

/*
        // Search for filters
        driver.findElement(By.name("search")).sendKeys("filter");
        driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
        Log.info("Searching for a Filter");

        // Click buy now
//        driver.findElement(By.cssSelector(".listProduct:nth-child(2) .buy_now")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),\'Buy Now\')]")).click();
        Log.info("Click Buy Now");

        // Add filter to cart
        Thread.sleep(5000);
        driver.findElement(By.id("addtoCart3785")).click();
        Log.info("Add filter to cart");

        // Click Secure Checkout
        Thread.sleep(3000);
        driver.findElement(By.linkText("Secure Checkout")).click();
        Log.info("Click Secure Checkout");

 */
        // pause to allow CC fields to appear
        Thread.sleep(40000);

        // Submit order
        driver.findElement(By.id("submit-button")).click();

        // close popup
        Thread.sleep(20000);
        driver.findElement(By.cssSelector(".featherlight-close-icon")).click();
        Log.info("Close PopUp");

        Log.info("----- Ending WebOderCC -----");

    }

}
