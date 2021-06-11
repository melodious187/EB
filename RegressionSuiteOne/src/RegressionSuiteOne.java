import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class RegressionSuiteOne {

    public static void main(String[] args) throws InterruptedException {
        // Chrome drivers
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Edge drivers
        // System.setProperty("webdriver.edge.driver", "C:\\dev\\tools\\msedgedriver.exe");
        // WebDriver driver = new EdgeDriver(); //Launch Edge browser

        // FireFox drivers
        //System.setProperty("webdriver.Firefox.driver", "C:/dev/tools/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        // Maximize Window
        driver.manage().window().maximize();

        // navigate to rentacpap.co
        driver.get("https://rentacpap.co/");

        // Give the website up to 10 second to wait for each WebElement to be found
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Call CreateAccount
        CreateAccount.newAccount(driver);

        // Call WebOrderCC - needs debugging
        // WebOrderCC.WebOrderCrCd(driver);

        // Call WebOrderGiftCard
        WebOrderGiftCard.WebOrderGC(driver);

        // ======================
        // Start the Phone Orders
        // ======================
        // Login to DigiShop Pro
        DigiShopLogin.DigiLogin(driver);

        // PhoneOrderCC
        // PhoneOrderCC.PhoneOrdCC(driver);

        // display browser for 5 seconds
        Thread.sleep(5000);

        // Close Browsers
        driver.close();


    }

}
