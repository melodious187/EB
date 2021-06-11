import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class WebOrderCC {

    static void WebOrderCrCd(WebDriver driver) throws InterruptedException {

        System.out.println("==============================");
        System.out.println("You have made it to WebOrderCC");
        System.out.println("==============================");

        // Give the website up to 10 second to wait for each WebElement to be found
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Search for filters
        driver.findElement(By.name("search")).sendKeys("filter");
        driver.findElement(By.name("search")).sendKeys(Keys.ENTER);

        // Add a filter to the order
        driver.findElement(By.cssSelector(".listProduct:nth-child(2) .buy_now")).click();
        // Add filter to cart
        driver.findElement(By.id("addtoCart4028")).click();
        // Click Secure Checkout
        driver.findElement(By.linkText("Secure Checkout")).click();


        // pause for 20 seconds to allow CC fields to appear
        System.out.println("Starting 30 second sleep");
        Thread.sleep(30000);
        System.out.println("Ending 30 second sleep");

        // wait until email field shows up
        // WebElement dynamicElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.id("credit-card-number")));

        /*
        //
        // Need to figure out how to fill in CC form
        //

        System.out.println("Trying CC Number by xpath");
        driver.findElement(By.xpath("//input[@id='credit-card-number']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@id='credit-card-number']")).sendKeys("3700 000000 00002");
        //driver.findElement(By.className("number")).sendKeys("3700 000000 00002");

        // Add expiration date
        System.out.println("Trying to find element via class name");
        driver.findElement(By.className("expirationDate"));


        // driver.findElement(By.name("expiration")).click();
        driver.findElement(By.name("expiration")).sendKeys("12 / 23");

        */
        // Add CVV
        driver.findElement(By.name("cvv")).click();
        driver.findElement(By.name("cvv")).sendKeys("1324");

        // 22 | selectFrame | relative=parent |
        driver.switchTo().defaultContent();
        // 23 | selectFrame | index=6 |
        driver.switchTo().frame(6);
        // Add Zip Code
        driver.findElement(By.name("postal-code")).click();
        // 25 | type | id=postal-code | 47586
        driver.findElement(By.name("postal-code")).sendKeys("47586");

        // Submit Order
        driver.switchTo().defaultContent();
        // 27 | click | id=submit-button |
        driver.findElement(By.id("submit-button")).click();

        // close popup
        driver.findElement(By.cssSelector(".featherlight-close-icon")).click();



    }

}
