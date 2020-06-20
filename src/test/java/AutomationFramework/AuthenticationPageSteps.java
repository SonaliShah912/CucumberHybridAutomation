package AutomationFramework;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class AuthenticationPageSteps extends BasePage {
    AuthenticationPage authenticationPage = new AuthenticationPage();


    @Then("^I should be on Authentication page$")
    public void AssertionAuthenticationPage() {
        Assert.assertTrue(authenticationPage.isUserOnAuthenticationPage());

    }

    @And("^I should see SignUp panel$")
    public void AssertionSignUpPanel() {
        Assert.assertTrue(authenticationPage.canUserSeeSignupPanel());
    }

    @When("^I Enter Email as (.*)$")
    public void enterEmailAdd(String emailAdd) {
        authenticationPage.enterEmail(emailAdd);


    }
    @When("^I enter EmailId as (.*) and password as (.*)$")
    public void enterCredentialsField(String userName, String password) {
        authenticationPage.enterCredentials(userName, password);
    }
    @And(value = "^I click signIn$")
    public void clickSighIn() {
        authenticationPage.selectSignIn();
    }



    @Then(value = "^I should not be login$")
    public void iShouldNotBeLogin() {

//        Assert.assertEquals("Login - My Store", driver.getTitle());
            Assert.assertTrue (authenticationPage.isUserOnAuthenticationPage());
        }




    @And("^I should see validation message as (.*)$")
    public void iShouldSeeValidationMessageAs(String message) {
        authenticationPage.getErrorMessage();
        Assert.assertEquals(message,authenticationPage.getErrorMessage());

    }


    @And("^I click create an account$")
    public void ClickCreateAnAccount() {
        authenticationPage.clickCreate();
    }
}



