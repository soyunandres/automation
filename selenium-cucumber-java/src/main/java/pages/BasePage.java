package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

    protected static Map<String, Region> regions;
    //protected static Screen screen;
    //protected static Pattern pattern;

    static {
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
}
