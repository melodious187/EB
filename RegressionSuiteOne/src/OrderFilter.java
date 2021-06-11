import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class OrderFilter {

    static void OrderFltr(WebDriver driver) {
        // Give the website up to 10 second to wait for each WebElement to be found
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("===============================");
        System.out.println("You have made it to OrderFilter");
        System.out.println("===============================");

        // Search for filters
        driver.findElement(By.name("search")).sendKeys("filter");
        driver.findElement(By.name("search")).sendKeys(Keys.ENTER);

        // Add a filter to the order
        driver.findElement(By.cssSelector(".listProduct:nth-child(2) .buy_now")).click();
        // Add filter to cart
        driver.findElement(By.id("addtoCart4028")).click();
        // Click Secure Checkout
        driver.findElement(By.linkText("Secure Checkout")).click();

    }

}
