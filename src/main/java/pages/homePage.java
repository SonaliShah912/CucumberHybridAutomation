package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends BasePage {

    public homePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#home-page-tabs")
    WebElement homePageAssertion;
    @FindBy(css = ".login")
    WebElement clickSignIn;

    public boolean isUserOnHomePage() {
       
     return homePageAssertion.isDisplayed();
    }
    public  void GotoAuthenticationPage(){
        clickSignIn.click();
    }
}
