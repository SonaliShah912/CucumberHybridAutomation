package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class
createAnAccountPage extends BasePage {
    @FindBy(css = "#account-creation_form")
            WebElement createAccount;
    @FindBy(css ="#customer_firstname" )
    WebElement enterFirstName;
    @FindBy(css ="#customer_lastname" )
    WebElement enterLastName;
    @FindBy(css = "#passwd")
    WebElement enterPassword;
    @FindBy(css = "#city")
    WebElement enterCity;
    @FindBy (css = "#id_state")
    WebElement selectStateDropBOx;
    @FindBy(css = "#address1")
    WebElement enterAddressField;
    @FindBy(css = "#postcode")
    WebElement postcode;
    @FindBy(css = "#phone_mobile")
    WebElement phoneNumber;
    @FindBy(css = "#submitAccount")
    WebElement clickRegister;
    @FindBy(css = ".alert.alert-danger ol li")
    WebElement validationMessageBlock;
    public createAnAccountPage(){
        PageFactory.initElements(driver,this);
    }




    public boolean assertRegistrationPage() {
        return createAccount.isDisplayed();
    }

    public void enterFirstNameAndLastName(String firstName, String lastName) {
       enterFirstName.sendKeys(firstName);
       enterLastName.sendKeys(lastName);
    }


    public void enterPasswordAndCity(String password, String city) {
       enterPassword.sendKeys(password);
       enterCity.sendKeys(city);
    }

    public void selectState(String state) {
        WebElement selectFromDropboxState = selectStateDropBOx;

        Utils.selectFromListWithText(selectFromDropboxState,state);

    }

    public void enterAddress(String Address) {

        enterAddressField.sendKeys(Address);

    }
    public void EnterPostcodeAndPhone( String ZipCode, String MobileNo){
        postcode.sendKeys(ZipCode);
       phoneNumber.sendKeys(MobileNo);

    }
    public void selectRegister(){
       clickRegister.click();
    }


    public String getErrorMessage() {
        return validationMessageBlock.getText();
    }


}
