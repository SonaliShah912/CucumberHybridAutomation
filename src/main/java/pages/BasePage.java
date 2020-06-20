package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class BasePage {


    public static String baseUrl = "http://automationpractice.com/index.php";
    public static String browserName = "remote";
    public static WebDriver driver;
    public static String gridURL = "https://SonuShah975:c734ec2e-3441-4315-8c90-21b4e7f3c88c@ondemand.eu-central-1.saucelabs.com:443/wd/hub";


    public void openBrowser(String browserName, String url) {
        if(browserName.equalsIgnoreCase("chrome")) {
            //Chrome Browser
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if(browserName.equalsIgnoreCase("firefox")) {
            //Firefox Browser
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if(browserName.equalsIgnoreCase("ie")) {
            //IE Browser
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else if(browserName.equalsIgnoreCase("edge")) {
            //MS Edge Browser
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if(browserName.equalsIgnoreCase("safari")) {
            //Safari Browser
            System.setProperty("webdriver.safari.driver", "src/main/resources/safaridriver");
            driver = new SafariDriver();
        } else if (browserName.equalsIgnoreCase("remote")){
            MutableCapabilities sauceOptions = new MutableCapabilities();

            ChromeOptions browserOptions = new ChromeOptions();
            browserOptions.setExperimentalOption("w3c", true);
            browserOptions.setCapability("platformName", "Windows 10");
            browserOptions.setCapability("browserVersion", "80.0");
            browserOptions.setCapability("sauce:options", sauceOptions);
            try {
                new RemoteWebDriver(new URL(gridURL),browserOptions);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }


        }
        else {
            //Chrome Browser
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();
    }
}


