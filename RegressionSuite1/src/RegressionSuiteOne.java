import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

public class RegressionSuiteOne {

    public static void main(String[] args) throws InterruptedException {

        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser
        // Launch web page
        driver.get("https://rentacpap.co/");
        // Maximize window
        driver.manage().window().maximize();


        // Sleep for a bit
        Thread.sleep(2000);
        // Close Browser
        driver.close();

    }

}
