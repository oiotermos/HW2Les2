package myprojects.automation.assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.plugin2.util.BrowserType;

import java.io.File;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    private static String BROWSER = String.valueOf(BrowserType.DEFAULT);

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {
        // TODO return  WebDriver instance
//        throw new UnsupportedOperationException("Method doesn't return WebDriver instance");
        switch(BROWSER){
            case "firefox":
                System.setProperty("webdriver.gecko.driver", new File((BaseScript.class.getResource("/geckodriver.exe").getFile())).getPath());
                return new FirefoxDriver();
            default:
                System.setProperty("webdriver.chrome.driver", new File((BaseScript.class.getResource("/chromedriver.exe").getFile())).getPath());
                return new ChromeDriver();
        }
    }
}
