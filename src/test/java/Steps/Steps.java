package Steps;

import Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Steps {

    Login login = new Login();



    @Given("user navigate to automation web")
    public void user_navigate_to_automation_web()

    {
        login.Openbrowser();
    }

    @When("user click on signup Login button")
    public void user_click_on_signup_Login_button() throws InterruptedException
    {
        login.SignUp_Login_button().click();
    }

    @And("user Enter email address {string}")
    public void user_Enter_email_address(String email) throws InterruptedException
    {
      // نقل الData من هنا لل runner
        login.Email().sendKeys(email);
    }
    @And("user Enter Password {string}")
    public void user_Enter_Password(String Password) throws InterruptedException
    {
        login.pass().sendKeys(Password);
    }
    @And("user Enter click login button")
    public void user_Enter_click_login_button() throws InterruptedException
    {
        login.Login_button().click();
    }

    @Then("web will show error message {string}")
    public void web_will_show_error_message (String message) throws InterruptedException {
    String Expected=message;
    String Actual=login.Actual().getText();
    Assert.assertEquals(Actual,Expected);


    }
}










