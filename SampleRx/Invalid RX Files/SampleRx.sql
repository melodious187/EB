import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.AccessControlContext;
import java.util.Scanner;

public class CreateAccount {


    static void newAccount(WebDriver driver){
        System.out.println("=================================");
        System.out.println("You have made it to CreateAccount");
        System.out.println("=================================");

        String acctName;
        // String bLastName = "Last";
        String phone = "1234567890";
        String bAddress = "123 4th St";
        String bAddress2 = "Suite 12";
        String bCity = "City";
        String bState = "State";
        String bZip = "12345";

        boolean notEnd = false;
        Scanner accObj = new Scanner(System.in); //create a scanner object

        System.out.println("Please Enter Account First Name, which will also be the email address ");
        acctName = accObj.nextLine(); //read user input
        String bLastName = (acctName + "LastName");
        System.out.println("Account name =              " + acctName);
        System.out.println("Account Last name =         " + bLastName);
        System.out.println("Account Phone Number =      " + phone);
        System.out.println("Account Billing Address 1 = " + bAddress);
        System.out.println("Account Billing Address 2 = " + bAddress2);
        System.out.println("Account Billing City =      " + bCity);
        System.out.println("Account Billing State =     " + bState);
        System.out.println("Account Billing Zip Code =  " + bZip);
        System.out.println("\nCreating the Account now, please wait a minute or two...\n\n");

        //  click Log In
        driver.findElement(By.linkText("Log In")).click();

        // wait until Create an Account field shows up
        WebElement dynamicElement1 = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Create an Account")));
        // click Create an Account
        driver.findElement(By.linkText("Create an Account")).click();

        // wait until email field shows up
        WebElement dynamicElement2 = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
        // enter email address
        driver.findElement(By.name("email")).sendKeys(acctName + "@easybreathe.com");
        // enter password
        driver.findElement(By.name("password")).sendKeys("E4syBr34th3");
        // re-enter password
        driver.findElement(By.name("password2")).sendKeys("E4syBr34th3");
        // Click Create an Account
        driver.findElement(By.xpath("//input[@value='Create an Account']")).click();

        //
        // ------- enter account information -------
        //

        WebElement dynamicElement5 = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("billFName")));
        // enter billing first name
        driver.findElement(By.name("billFName")).sendKeys(acctName);
        // enter billing last name
        driver.findElement(By.name("billLName")).sendKeys(bLastName);
        // enter billing phone number
        driver.findElement(By.name("phone")).sendKeys(phone);
        // enter billing address
        driver.findElement(By.name("billAddress1")).click();
        driver.findElement(By.name("billAddress1")).sendKeys(bAddress);
        // enter billing address 2
        driver.findElement(By.name("billAddress2")).sendKeys(bAddress2);
        // enter billing city
        driver.findElement(By.name("billCity")).sendKeys(bCity);
        // enter billing state
        driver.findElement(By.name("usState")).sendKeys(bState);
        // enter billing zip code
        driver.findElement(By.name("billZip")).sendKeys(bZip);
        // save billing info
        driver.findElement(By.xpath("//input[@value='Save Billing Info']")).click();


        // enter shipping first name if different from billing

        // enter shipping last name if different from billing

        // enter shipping address
        driver.findElement(By.name("shipAddress1")).click();
        driver.findElement(By.name("shipAddress1")).sendKeys(bAddress);
        // enter shipping address 2
        driver.findElement(By.name("shipAddress2")).sendKeys(bAddress);
        // enter shipping city
        driver.findElement(By.name("shipCity")).sendKeys(bCity);
        // enter shipping state
        driver.findElement(By.name("usState1")).sendKeys(bState);
        // enter shipping zip code
        driver.findElement(By.name("shipZip")).sendKeys(bZip);
        // save shipping address
        driver.findElement(By.xpath("//input[@value='Save Shipping Info']")).click();
        // wait until Log out link is rendered
        WebElement dynamicElement3 = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log Out")));

        // Click Logout
        // driver.findElement(By.linkText("Log Out")).click();

        // Close driver
        // driver.close();
        System.out.println("=================");
        System.out.println("End CreateAccount");
        System.out.println("=================");

    }

}
