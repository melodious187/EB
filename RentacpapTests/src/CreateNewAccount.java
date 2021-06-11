import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;
import java.util.Scanner;


public class CreateNewAccount {

    public static void main(String[] args) {

        // Chrome drivers
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Edge drivers
        //System.setProperty("webdriver.edge.driver", "C:/dev/tools/msedgedriver.exe");
        //WebDriver driver = new EdgeDriver(); //Launch Edge browser

        // FireFox drivers
        //System.setProperty("webdriver.Firefox.driver", "C:/dev/tools/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        // give website up to 10 seconds for pages to load
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // ----------------------------------------------
        // ----------------- start test -----------------
        // ----------------------------------------------
        // navigate to rentacpap.co
        driver.get("https://rentacpap.co/");

        // get account name
        String acName = askForAcct();
        System.out.println("Account name = " + acName);


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
        driver.findElement(By.name("email")).sendKeys("Test1@easybreathe.com");
        // enter password
        driver.findElement(By.name("password")).sendKeys("E4syBr34th3");
        // re-enter password
        driver.findElement(By.name("password2")).sendKeys("E4syBr34th3");
        // Click Create an Account
        driver.findElement(By.xpath("//input[@value=\'Create an Account\']")).click();

        driver.close();
    }

    public static String askForAcct() {
        String acctName = "TEMP";
        boolean notEnd = false;
        Scanner accObj = new Scanner(System.in); //create a scanner object
        while (notEnd = !acctName.equals("END")){
            System.out.println("Please Enter Account Name, end with 'END':");
            acctName = accObj.nextLine(); //read user input
            //System.out.println("Account name entered = " + acctName);
            //System.out.println("boolean notEND = " + notEnd);
        }
        return acctName;

    }

}
