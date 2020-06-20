package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class
AuthenticationPage extends BasePage {
    @FindBy(css = "#create-account_form")
    WebElement createAnAccountForm;
    @FindBy(css = "#login_form")
    WebElement signUpPanel;
    @FindBy(css = "#email_create")
    WebElement createEmail;
    @FindBy (css = "#SubmitCreate")
    WebElement clickCreateButton;
    @FindBy(css = "#email")
    WebElement enterEmail;
    @FindBy(css = "#passwd")
    WebElement enterPassword;
    @FindBy(css = "#SubmitLogin")
    WebElement clickSignIn;
    @FindBy(css = ".alert.alert-danger ol li")
    WebElement validationMessagesBlock;
    public AuthenticationPage() {
        PageFactory.initElements(driver, this);
    }
    public boolean isUserOnAuthenticationPage() {
        return createAnAccountForm.isDisplayed();
    }
    public boolean canUserSeeSignupPanel() {
        return signUpPanel.isDisplayed();
    }

    public void enterEmail(String email) {
        createEmail.sendKeys(email);
    }


    public void enterCredentials(String email, String password) {
        enterEmail.sendKeys(email);
        enterPassword.sendKeys(password);
    }
    public void selectSignIn() {
        clickSignIn.click();
    }

    public String getErrorMessage() {
        return  validationMessagesBlock.getText();
    }


    public void clickCreate() {
        clickCreateButton.click();

    }
}


