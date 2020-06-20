package Utils;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    public static void waitForPageLoad(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public static void selectFromListWithText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }


    public static String getPageTitle() {
        return driver.getTitle();
    }

}


