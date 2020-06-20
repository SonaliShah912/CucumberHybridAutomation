package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserFactory {

        public static WebDriver driver;

        public static void startBrowser() {
            if (Utils.AutomationConstant.AutomationConstants.REMOTE_BROWSER == true) {
                System.out.println("Selenium Grid is running");
                MutableCapabilities sauceOptions = new MutableCapabilities();

                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setExperimentalOption("w3c", true);
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "80.0");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    //create remote websriver object and assign it to driver variable
                    driver = new RemoteWebDriver(new URL(Utils.AutomationConstant.AutomationConstants.SELENIUM_GRID_URL), browserOptions);
                } catch (MalformedURLException e) {
                    System.out.println("in exception");
                    e.printStackTrace();
                }
            } else {
                if (Utils.AutomationConstant.AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Firefox")) {
                    WebDriverManager.chromedriver().setup();
                    driver = new FirefoxDriver();
                } else if (Utils.AutomationConstant.AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("Chrome")) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                } else if (Utils.AutomationConstant.AutomationConstants.BROWSER_TYPE.equalsIgnoreCase("IE")) {
                    WebDriverManager.chromedriver().setup();
                    driver = new InternetExplorerDriver();
                }
            }
//        Utils.enterUrl();
            driver.get(Utils.AutomationConstant.AutomationConstants.baseURL);
//            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        public static void stopBrowser() {
            if (driver != null) {
                driver.close();
                driver.quit();
            }
        }

        public static WebDriver getDriver() {
            if (driver == null) {
                BrowserFactory.startBrowser();
            }
            return driver;
        }
    }


