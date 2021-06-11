import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DigiShopLogin {
    static void DigiLogin(WebDriver driver) {

        // Launch DigiShop Pro login page
        driver.get("https://rentacpap.co/secure/admin/index.php");

        // Enter login
        driver.findElement(By.name("userId")).sendKeys("arath");

        // Enter password
        driver.findElement(By.name("password")).sendKeys("H=74mB11");
        driver.findElement(By.name("password")).submit();

    }

}

