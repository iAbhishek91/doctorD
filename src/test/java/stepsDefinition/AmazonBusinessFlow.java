package stepsDefinition;

import java.io.IOException;

import commonUtilities.Hook;
import commonUtilities.ReadPropertiesFile;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AmazonHomePage;

public class AmazonBusinessFlow{
	/**
	 * POINT-2:	this is one of test case or Step Definition to test the application.
	 * 	--	this file automatically calls Hook.java file for initialization.
	 * 	--	this is done by inheriting Hook.java.
	 * 	--	NOTE: driver is not defined on step definition class, it uses the driver of Hook.java and pass it between page objects
	 * @throws IOException 
	 * 
	 */

	//MyDriver mydriver = new MyDriver(); this statement is not working
	Hook myDriver = new Hook();
	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws IOException{
		myDriver.initSetup();//Null pointer exception is thrown if we dont write this statement.
		System.out.println("I am on Step Definition");
		AmazonHomePage pageObj = new AmazonHomePage(myDriver.driver);
		String username = ReadPropertiesFile.returnValueOfKey("loginPage.properties", "userName");
		String password = ReadPropertiesFile.returnValueOfKey("loginPage.properties", "password");
		pageObj
		.launchHomePage()
		.navigateToSignInPage()
		.enterAmazonCredential(username, password)
		.signInToAmazon();
	}

	@When("^I enter valid credential$")
	public void i_enter_valid_credential(){}

	@When("^I click on Login button$")
	public void i_click_on_Login_button(){}

	@Then("^I should be able to login to Amazon$")
	public void i_should_be_able_to_login_to_Amazon(){}

	@When("^I enter invalid credential$")
	public void i_enter_invalid_credential() {}

}
