import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

    public static void main(String[] args){

        // Chrome drivers
        //System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Edge drivers
        System.setProperty("webdriver.edge.driver", "C:/dev/tools/msedgedriver.exe");
        WebDriver driver = new EdgeDriver(); //Launch Edge browser

        // FireFox drivers
        //System.setProperty("webdriver.Firefox.driver", "C:/dev/tools/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();

        // give website up to 10 seconds for pages to load
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // navigate to rentacpap.co
        driver.get("https://rentacpap.co/");

        //  | click | linkText=Log In |
        driver.findElement(By.linkText("Log In")).click();

        // wait until cEmail1 field shows up
        WebElement dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("cEmail1")));

        // enter email address
        driver.findElement(By.name("cEmail1")).sendKeys("ec1@easybreathe.com");
        //  enter password
        driver.findElement(By.id("userpwd")).sendKeys("E4syBr34th3");
        //  click Login id=button1
        driver.findElement(By.id("button1")).click();
    }
}

