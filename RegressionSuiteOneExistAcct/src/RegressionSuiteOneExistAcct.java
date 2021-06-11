import Utilities.GetFileName;
import Utilities.Log;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

//Import java.util.logging.Logger;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class RegressionSuiteOneExistAcct {

    public static void main(String[] args) throws InterruptedException {

        // Chrome drivers
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Edge drivers
//        System.setProperty("webdriver.edge.driver", "C:\\dev\\tools\\msedgedriver.exe");
//        WebDriver driver = new EdgeDriver(); //Launch Edge browser

        // FireFox drivers
//        System.setProperty("webdriver.Firefox.driver", "C:/dev/tools/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();

        // Set logging xml location
        System.setProperty("log4j.configurationFile","./Utilities/log4j2.xml");

        // Initial Logging messages
        Log.startTestCase("Regression Suite One Existing Account");

        // Maximize Window
        driver.manage().window().maximize();

        // Set new log file name based on date
        String logFileName = GetFileName.getFileNm();

        Log.info("----------------------------");
        Log.info("Starting Web Orders");
        Log.info("----------------------------");

        // Launch rentacpap.co (Change url for other websites)
        driver.get("https://rentacpap.co/");

        // Launch qa.easybreathe.com
//        driver.get("https://qa.easybreathe.com/");

        // Give the website up to 20 second to wait for each WebElement to be found
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // login to Account GS1Ex
        LogIn.logInEx(driver);

        // Call WebOrderPPCC
//        WebOrderPPCC.WebOrdPPCC(driver);

        // Call WebOrderCC *
        WebOrderCC.WebOrderCrCd(driver);

        // Call WebOrderGiftCard *
        WebOrderGiftCard.WebOrderGC(driver);

        // Call WebOrderPayPal

        // Call WebOrderECheck

        Log.info("---------------------------");
        Log.info("Ending Web Orders");
        Log.info("---------------------------");

        Log.info("-------------------------------");
        Log.info("Starting Phone Orders");
        Log.info("-------------------------------");

        // Login to DigiShop Pro
        DigiShopLogin.DigiLogin(driver);

        // Call PhoneOrderCC *
        PhoneOrderCC.PhoneOrdCC(driver);

        // Call PhoneOrderMailingCheck *
        PhoneOrderMailingCheck.PhoneOrdMailChk(driver);

        // Call PhoneOrderManualSplitPayment *
        PhoneOrderManualSplitPayment.PhoneOrdManSpPay(driver);

        // Call PhoneOrderNoPaymentRequired *
        PhoneOrderNoPaymentRequired.NoPayReq(driver);

        // Call PhoneOrderECheck *
        PhoneOrderECheck.PhoneOrdECheck(driver);

        // Call PhoneOrderGiftCard *
        PhoneOrderGiftCard.PhoneOrdGiftCard(driver);

        Log.info("----------------------------");
        Log.info("Ending Phone Orders");
        Log.info("----------------------------");

        // Copy logfile to new name
//        String newLogFile = GetFileName.getFileNm();
        File source = new File("E:\\GitHub\\EasyBreathe\\RegressionSuiteOneExistAcct\\logs\\regressionSuiteOneExistingAccount.log");
        File dest = new File("E:\\GitHub\\EasyBreathe\\RegressionSuiteOneExistAcct\\logs\\" + logFileName);
        try {
            GetFileName.copyLogFile(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Log.endTestCase("Regression Suite One Existing Account");

        // Close Browsers
        driver.quit();

    }


}
