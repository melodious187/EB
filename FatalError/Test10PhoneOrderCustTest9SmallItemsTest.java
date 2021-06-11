// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test10PhoneOrderCustTest9SmallItemsTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void test10PhoneOrderCustTest9SmallItems() {
    // Test name: Test10 PhoneOrderCustTest9SmallItems
    // Step # | name | target | value
    // 1 | open | https://rentacpap.co/secure/admin/index.php | 
    driver.get("https://rentacpap.co/secure/admin/index.php");
    // 2 | click | id=admin-login-box-middle | 
    driver.findElement(By.id("admin-login-box-middle")).click();
    // 3 | click | name=userId | 
    driver.findElement(By.name("userId")).click();
    // 4 | click | id=main | 
    driver.findElement(By.id("main")).click();
    // 5 | click | id=admin-login-box-middle | 
    driver.findElement(By.id("admin-login-box-middle")).click();
    // 6 | click | css=.admin-login-button > input | 
    driver.findElement(By.cssSelector(".admin-login-button > input")).click();
    // 7 | setWindowSize | 1575x860 | 
    driver.manage().window().setSize(new Dimension(1575, 860));
    // 8 | click | css=li:nth-child(1) > a > span | 
    driver.findElement(By.cssSelector("li:nth-child(1) > a > span")).click();
    // 9 | times | 20 | 
    Integer times = 20;
    for(int i = 0; i < times; i++) {
      // 10 | click | linkText=Phone Order | 
      driver.findElement(By.linkText("Phone Order")).click();
      // 11 | click | name=fName | 
      driver.findElement(By.name("fName")).click();
      // 12 | type | name=fName | ecart3
      driver.findElement(By.name("fName")).sendKeys("ecart3");
      // 13 | click | css=div:nth-child(4) > .label | 
      driver.findElement(By.cssSelector("div:nth-child(4) > .label")).click();
      // 14 | click | css=.input > .buttons > input:nth-child(1) | 
      driver.findElement(By.cssSelector(".input > .buttons > input:nth-child(1)")).click();
      // 15 | click | linkText=Select | 
      driver.findElement(By.linkText("Select")).click();
      // 16 | click | css=.buttons > input:nth-child(2) | 
      driver.findElement(By.cssSelector(".buttons > input:nth-child(2)")).click();
      // 17 | click | css=.input > .buttons > input:nth-child(1) | 
      vars.put("window_handles", driver.getWindowHandles());
      // 18 | storeWindowHandle | root | 
      driver.findElement(By.cssSelector(".input > .buttons > input:nth-child(1)")).click();
      // 19 | selectWindow | handle=${win5640} | 
      vars.put("win5640", waitForWindow(2000));
      // 20 | click | linkText=Parts and Accessories | 
      vars.put("root", driver.getWindowHandle());
      // 21 | click | css=.threeColumn > table:nth-child(1) td:nth-child(3) img | 
      driver.switchTo().window(vars.get("win5640").toString());
      // 22 | click | css=.listProduct:nth-child(2) .buy_now | 
      driver.findElement(By.linkText("Parts and Accessories")).click();
      // 23 | click | id=addtoCart4463 | 
      driver.findElement(By.cssSelector(".threeColumn > table:nth-child(1) td:nth-child(3) img")).click();
      // 24 | selectWindow | handle=${root} | 
      driver.findElement(By.cssSelector(".listProduct:nth-child(2) .buy_now")).click();
      // 25 | click | css=body | 
      driver.findElement(By.id("addtoCart4463")).click();
      // 26 | selectWindow | handle=${root} | 
      driver.switchTo().window(vars.get("root").toString());
      // 27 | click | id=continue-order | 
      driver.findElement(By.cssSelector("body")).click();
      // 28 | click | css=.input > .buttons > input | 
      driver.switchTo().window(vars.get("root").toString());
      // 29 | click | css=.input-standard:nth-child(6) > input | 
      driver.findElement(By.id("continue-order")).click();
      // 30 | click | css=.buttons > input:nth-child(2) | 
      driver.findElement(By.cssSelector(".input > .buttons > input")).click();
      // 31 | click | css=.braintree-method__label--small | 
      driver.findElement(By.cssSelector(".input-standard:nth-child(6) > input")).click();
      // 32 | click | name=note | 
      driver.findElement(By.cssSelector(".buttons > input:nth-child(2)")).click();
      // 33 | type | name=note | Empty Cart, Phone order, Cart3, small items, automated order
      driver.findElement(By.cssSelector(".braintree-method__label--small")).click();
      // 34 | click | id=submitBtn | 
      driver.findElement(By.name("note")).click();
      // 35 | click | css=body | 
      driver.findElement(By.name("note")).sendKeys("Empty Cart, Phone order, Cart3, small items, automated order");
      // 36 | end |  | 
      driver.findElement(By.id("submitBtn")).click();
      // 37 | click | linkText=Logout | 
      driver.findElement(By.cssSelector("body")).click();
    }
    driver.findElement(By.linkText("Logout")).click();
  }
}
