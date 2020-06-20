package AutomationFramework;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class myAccountPageSteps extends BasePage {
    MyAccountPage myaccountPage = new MyAccountPage();

    @Then(value = "^I should be Logged in Successfully$")
    public void loggedIn() {
        myaccountPage.assertionMyAccountPage();


    }

    @And(value = "^I should be on my Account page$")
    public void assertionMyAccountPage() {
        Assert.assertTrue(myaccountPage.assertionMyAccountPage());

    }


    @Then("^I should create my account$")
    public void ShouldCreateMyAccount() {

        Assert.assertEquals("My account - My Store", Utils.getPageTitle());
    }

}


