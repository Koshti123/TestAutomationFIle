package stepdefinationfile;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclass.LoginPage;

public class LoginPageStepDefination {

	
	LoginPage lp = new LoginPage();
	
	@Given("^I am the user of an application$")
	public void i_am_the_user_of_an_application() throws Throwable {
	    lp.openURL();
	}

	@When("^User enter valid username$")
	public void user_enter_valid_username() throws Throwable {
	    lp.enterUsername();
	}

	@When("^User enter valid password$")
	public void user_enter_valid_password() throws Throwable {
	    lp.enterPassword();
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	   lp.clickLoginButton();
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    lp.verifyLogin();
	}

	@When("^User enter invalid username$")
	public void user_enter_invalid_username() throws Throwable {
	    lp.enterUsername();
	}

	@When("^User enter invalid password$")
	public void user_enter_invalid_password() throws Throwable {
	    lp.enterPassword();
	}

	@Then("^User should not be able to login successfully$")
	public void user_should_not_be_able_to_login_successfully() throws Throwable {
	    lp.verifyLogin();
	}


}