package pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.synth.Region;
import java.time.Duration;
import java.util.Map;
import java.util.TreeMap;

public class BasePage {
    protected static WebDriver driver;
    protected static WebDriverWait wait;

    protected static Duration durationtimeout;
    protected static Duration durationsleep;

    private Actions action;

    protected static Map<String, Region> regions;
    //protected static Screen screen;
    //protected static Pattern pattern;

    static {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        durationtimeout = Duration.ofSeconds(10);
        durationsleep = Duration.ofSeconds(100);
        wait = new WebDriverWait(driver,durationtimeout ,durationsleep);
        regions = new TreeMap<String, Region>();

    }

    public BasePage (WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,durationtimeout, durationsleep);
    }

    public static void navigateTo (String url){
        driver.get(url);

    }
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public void clickElement(String locator){
        Find(locator).click();
    }

    public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public void selectFromDropDownByValue(String locator, String valueToSelect){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(valueToSelect);


    }
    public void selectFromDropDownByIndex(String locator, int valueToSelect){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(valueToSelect);


    }
    public void selectFromDropDownByText(String locator, String valueToSelect){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByVisibleText(valueToSelect);


    }
    public void hoverOverElement(String locator){
        action.moveToElement(Find(locator));

    }

    public void doubleClickElement(String locator){
        action.doubleClick(Find(locator));
    }
    public void rightClickElement(String locator){
        action.contextClick(Find(locator));
    }
}
