import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LogIn {
    static void logInEx(WebDriver driver) throws InterruptedException {

        // Customer Account to login as (Change account to login as different customer)
        String custAcct = "EB2@fromthemind.net";
        String custPwd = "E4syBr34th3";

        // Give the website up to 10 second to wait for each WebElement to be found
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Log.info("Login to Website");

        // Click Log In
        driver.findElement(By.linkText("Log In")).click();

        // Sleep for 2 seconds to allow things to work
        Thread.sleep(2000);

        // Change the following email address to execute the suite against a different customer account
        driver.findElement(By.name("cEmail1")).sendKeys(custAcct);

        Thread.sleep(2000);

        // Enter Password
        driver.findElement(By.id("userpwd")).sendKeys(custPwd);

        // Sleep for a bit to allow things to work
        Thread.sleep(2000);

        // Click the login button
        driver.findElement(By.id("button1")).click();
    }
}

