import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

    public static void main(String[] args) {



        // Edge drivers
        //System.setProperty("webdriver.edge.driver", "C:/dev/tools/msedgedriver.exe");
        //WebDriver driver = new EdgeDriver(); //Launch Edge browser

        // FireFox drivers
        //System.setProperty("webdriver.Firefox.driver", "C:/dev/tools/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // open https://en.wikipedia.ORG/
        String wikiUrl = "https://en.wikipedia.org";
        driver.navigate().to(wikiUrl);

        // click on help page link using By.linkTest Help
        driver.findElement(By.linkText("Help")).click();

        // come back to home page using back command
        driver.navigate().back();

        // go back to help page using forward command
        driver.navigate().forward();

        // come back to home page using 'to' command
        driver.navigate().to(wikiUrl);

        // refresh the browser
        driver.navigate().refresh();

        // quite the browser
        driver.quit();

    }

}
