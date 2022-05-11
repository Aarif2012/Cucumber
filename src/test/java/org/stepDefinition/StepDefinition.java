package org.stepDefinition;

import java.util.List;
import java.util.Map;

import org.base.UtilityClass;
import org.junit.Assert;
import org.pojo.ForgetPassword;
import org.pojo.LoginPOJO;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends UtilityClass {

	@Given("User have to enters login page through chromebrowser")
	public void user_have_to_enters_login_page_through_chromebrowser() {

		launchUrl("https://www.facebook.com/");

	}

	@Given("User have to click the forget password")
	public void user_have_to_click_the_forget_password() throws InterruptedException {

		ForgetPassword f = new ForgetPassword();
		clickWebElement(f.getForgetpassbtn());
		Thread.sleep(3000);

	}

	@When("User have to enter email or mobile number")
	public void user_have_to_enter_email_or_mobile_number() {

		ForgetPassword f = new ForgetPassword();
		passTxt(f.getTxtSearchBox(), "9799075555");

	}

	@Then("User have to click the search button")
	public void user_have_to_click_the_search_button() {

		ForgetPassword f = new ForgetPassword();
		clickWebElement(f.getSearchbutton());

	}

	@Given("User is in Facebook login page")
	public void user_is_in_Facebook_login_page() {

		launchUrl("https://www.facebook.com/");

	}

	@When("User have to enter invalid username and valid password")
	public void user_have_to_enter_invalid_username_and_valid_password(io.cucumber.datatable.DataTable d) {
	
		//1D Map
		
	Map<String, String> mp = d.asMap(String.class, String.class);
	
	String email = mp.get("username");
	String pass = mp.get("password");
	
		LoginPOJO l = new LoginPOJO();
		passTxt(l.getEmailTxt(), email);
		passTxt(l.getPassTxt(), pass);

	}

	@When("User have to enter invalid username and invalid password")
	public void user_have_to_enter_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
		
		
		List<Map<String, String>> mp = d.asMaps();
		String email = mp.get(1).get("username");
		String pass = mp.get(2).get("password");
		
		LoginPOJO l = new LoginPOJO();
		passTxt(l.getEmailTxt(), email);
		passTxt(l.getPassTxt(), pass);

	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String email, String pass) {
		LoginPOJO l = new LoginPOJO();
		passTxt(l.getEmailTxt(), email);
		passTxt(l.getPassTxt(), pass);

	}

	@When("User enters invalid username and valid password")
	public void user_enters_invalid_username_and_valid_password() {

		LoginPOJO l = new LoginPOJO();
		passTxt(l.getEmailTxt(), "Greens123@gmail.com");
		passTxt(l.getPassTxt(), "Aarif");
	}

	@When("User click the login button")
	public void user_click_the_login_button() throws InterruptedException {
		LoginPOJO l = new LoginPOJO();
		clickWebElement(l.getLoginbtn());
		Thread.sleep(3000);
	}

	@Then("User should be in invalid credential page")
	public void user_should_be_in_invalid_credential_page() {

		String url = driver.getCurrentUrl();
		Assert.assertTrue("To check the url", url.contains("privacy_mutation_token"));
		System.out.println("User should be in invalid credential page");
	}

}
