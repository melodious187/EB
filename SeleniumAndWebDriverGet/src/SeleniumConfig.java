import com.beust.jcommander.IStringConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class SeleniumConfig {

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

        //Launch Facebook
        // driver.get("https://www.facebook.com/");
        // or you can use
        String baseUrl = "https://www.facebook.com/";
        driver.get(baseUrl);

        // get title
        String title = driver.getTitle();
        System.out.println("Title of page is: " + title);

        // get current url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current page url = " + currentUrl);

        //get page source
        String pageSource = driver.getPageSource();
        System.out.println("Page source = " + pageSource);

        //close (closes current window driver is working with) and quit (closes all windows and kills the session
        //driver.quit();
        driver.close();





    }

}
