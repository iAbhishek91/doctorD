package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import commonUtilities.MyDriver;

public class AmazonHomePage extends VirtualSuperPage {

	
	
	/**
	 * PageFactory	: Is used mainly because it allows us to define the webElement only once and used multiple times.
	 * 				Someone can define page factory as extension of page object framework.
	 * FindBy		: this annotation looks in HTML page
	 */
	@FindBy(how=How.ID,using="nav-link-yourAccount") private WebElement loginButton;
	
	public AmazonHomePage(WebDriver driver) {
		super(driver);
	}

	public AmazonSignInPage navigateToSignInPage(){
		loginButton.click();
		return PageFactory.initElements(driver, AmazonSignInPage.class);
		
	}
}
