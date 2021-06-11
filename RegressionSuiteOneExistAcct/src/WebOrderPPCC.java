import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WebOrderPPCC {

    static void WebOrdPPCC (WebDriver driver) throws InterruptedException {
        System.out.println("==========================================");
        System.out.println("     You have made it to WebOrderPPCC");
        System.out.println("==========================================");

        // Give the website up to 10 second to wait for each WebElement to be found
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Search for CPAP in Payment Plan
        driver.findElement(By.name("search")).sendKeys("Payment Plan CPAP");
        driver.findElement(By.name("search")).sendKeys(Keys.ENTER);

        // Select first offering
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".buy_now:nth-child(6)")).click();

       // Agree to 12 month plan
        {
            WebElement dropdown = driver.findElement(By.id("persInput-1818[required]"));
            dropdown.findElement(By.xpath("//option[. = 'I agree to 12 payments of $68.67']")).click();
        }

        // Select have a current Rx
        {
            WebElement dropdown = driver.findElement(By.id("persInput-1820[required]"));
            dropdown.findElement(By.xpath("//option[. = 'No, I have a current Rx']")).click();
        }

        driver.findElement(By.id("persInput-2022")).click();
        // 14 | select | id=persInput-2022 | label=No, thank you.
        {
            WebElement dropdown = driver.findElement(By.id("persInput-2022"));
            dropdown.findElement(By.xpath("//option[. = 'No, thank you.']")).click();
        }




    }


}
