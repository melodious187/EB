import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhoneOrderCC {

    static void PhoneOrdCC(WebDriver driver)  {

        // Click Orders tab
        driver.findElement(By.cssSelector("li:nth-child(1) > a > span")).click();
        // Click Phone Order
        driver.findElement(By.linkText("Phone Order")).click();
        // Search for Customer - will need to dynamically get the customer name from CreateAccount
        driver.findElement(By.name("fName")).sendKeys("rs2");
        // Search for name
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        // Select name
        driver.findElement(By.linkText("Select")).click();
        // Select Continue
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        // Search for a filter
        // //driver.findElement(By.name("search")).click();
        // // 15 | type | name=search | filter
        driver.findElement(By.name("search")).sendKeys("filter");
        // Select filter
        driver.findElement(By.cssSelector(".input > input:nth-child(2)")).click();
        // Add filter to Cart
        driver.findElement(By.linkText("Add to Cart")).click();
        // Continue
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        // Continue
        driver.findElement(By.id("continue-order")).click();
        // Continue
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        // No on the Sweepstakes Entry
        driver.findElement(By.xpath("(//input[@name='sweepstakesentry'])[2]")).click();
        // Continue
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        // Click on CC field
        driver.findElement(By.id("credit-card-number")).click();
        // Enter CC number
        driver.findElement(By.id("credit-card-number")).sendKeys("3700 000000 00002");
        // 27 | selectFrame | relative=parent |
        driver.switchTo().defaultContent();
        // 28 | selectFrame | index=1 |
        driver.switchTo().frame(1);
        // 29 | click | id=expiration |
        driver.findElement(By.id("expiration")).click();
        // 30 | type | id=expiration | 12 / 23
        driver.findElement(By.id("expiration")).sendKeys("12 / 23");
        // 31 | selectFrame | relative=parent |
        driver.switchTo().defaultContent();
        // 32 | selectFrame | index=2 |
        driver.switchTo().frame(2);
        // 33 | click | id=cvv |
        driver.findElement(By.id("cvv")).click();
        // 34 | type | id=cvv | 1324
        driver.findElement(By.id("cvv")).sendKeys("1324");
        // 35 | selectFrame | relative=parent |
        driver.switchTo().defaultContent();
        // 36 | selectFrame | index=3 |
        driver.switchTo().frame(3);
        // 37 | click | id=postal-code |
        driver.findElement(By.id("postal-code")).click();
        // 38 | type | id=postal-code | 47586
        driver.findElement(By.id("postal-code")).sendKeys("47586");
        // 39 | selectFrame | relative=parent |
        driver.switchTo().defaultContent();
        // 40 | click | id=submitBtn |
        driver.findElement(By.id("submitBtn")).click();







    }

}
