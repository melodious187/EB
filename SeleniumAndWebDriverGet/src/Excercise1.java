import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise1 {

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

        // different methods for opening a page
        // 1
        // driver.get("https://www.economist.com/");
        // 2
        String url = "https://www.economist.com/";
        //driver.get(url);
        // 3
        // driver.navigate().to(url);
        // 4
        driver.navigate().to("https://www.economist.com/");

        // get economist.com page title and title length, print both
        String ecTitle = driver.getTitle();
        int titleLength = ecTitle.length();
        System.out.println("Economist Page Title: " + ecTitle);
        System.out.println("Economist Page Title Length = " + titleLength + " character");

        // get economist page url and verify correct page opened
        String ecUrl = driver.getCurrentUrl();
        if (ecUrl.equals(url)) {
            System.out.println("Economist URL verification successful, correct page has been opened");
        } else System.out.println("Economist URL verification not successful");
        System.out.println("Economist page url = " + ecUrl);

        // get economist Source and Page Source length, print both
        String ecPageSrc = driver.getPageSource();
        int pgSrcLength = ecPageSrc.length();
        System.out.println("Economist page source length = " + pgSrcLength);
        //System.out.println("Economist Page Source : \n" + ecPageSrc);

        // refresh browser
        driver.navigate().refresh();

        driver.close();

    }

}
