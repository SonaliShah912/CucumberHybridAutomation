package AutomationFramework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class homePageSteps {
    homePage homepage = new homePage();


    @Given("^I am on Homepage$")
    public void IAmOnHomepage() {
      Assert.assertTrue( homepage.isUserOnHomePage());


    }

    @When("^I click on SignIn link$")
    public void _ClickSignInLink() {
        Utils.waitForPageLoad();

      homepage.GotoAuthenticationPage();
    }

}
