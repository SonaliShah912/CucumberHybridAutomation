package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class
MyAccountPage extends BasePage {
    @FindBy(css =".myaccount-link-list" )
    WebElement assertMyAccount;


    public MyAccountPage() {
        PageFactory.initElements(driver,this);
    }

    public boolean assertionMyAccountPage()
    {
       return assertMyAccount.isDisplayed();
    }
}
