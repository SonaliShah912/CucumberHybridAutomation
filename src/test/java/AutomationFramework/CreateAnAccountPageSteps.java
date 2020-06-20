package AutomationFramework;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateAnAccountPageSteps extends BasePage {
   createAnAccountPage createanaccountpage = new createAnAccountPage();

    @Given("^I am on Registration page$")
    public void assertionRegistrationPage()  {
        Assert.assertTrue(createanaccountpage.assertRegistrationPage());
    }

    @When("^I enter first name as (.*) and last name as (.*)$")
    public void enterFirstAndLastName(String firstName, String lastName)  {
       createanaccountpage.enterFirstNameAndLastName(firstName, lastName);
    }

    @And("^I enter password as (.*)and city as (.*)$")
    public void enterPasswordAndCity(String password, String city)  {
      createanaccountpage.enterPasswordAndCity(password,city);

    }


    @And("^I enter Address as (.*)$")
    public void enterAddress(String Address){
        createanaccountpage.enterAddress(Address);
    }


    @And("^I enter zip code as (.*) and mobile no as(.*)$")
    public void enterZIpCodeAndMobileNo(String ZipCode, String MobileNo) {
       createanaccountpage.EnterPostcodeAndPhone(ZipCode,MobileNo);
    }
    @And("^click register button$")
    public void clickRegisterButton(){

      createanaccountpage.selectRegister();
    }



    @Then("^I should not create an account and see validation message as (.*)$")

    public void ValidationMessage(String message) {

        Assert.assertEquals(message, createanaccountpage.getErrorMessage());
    }




    @Then("^I should be on create an account page$")
    public void iShouldBeOnCreateAnAccountPage() {
        Assert.assertTrue(createanaccountpage.assertRegistrationPage());
    }


    @And("^I select state as (.*)$")
    public void iSelectStateAs(String state) {
        createanaccountpage.selectState(state);
    }
}

