package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import commonUtilities.MyDriver;

public class AmazonSignInPage extends VirtualSuperPage{
	
	/**
	 * @author Abhishek
	 * NOTE: [IMPORTANT] 	this wont work if we use Page Object framework
	 * 						this is because the driver is having a scope within the methods only
	 */
	@FindBy(how=How.ID,using= "ap_email") private WebElement userNameTextBox;
	@FindBy(how=How.ID,using= "ap_password") private WebElement passwordTextBox;
	@FindBy(how=How.ID,using= "signInSubmit") private WebElement submitButton;
	
	public AmazonSignInPage(WebDriver driver) {
		super(driver);
	}
	
	public AmazonSignInPage enterAmazonCredential(String username, String password){
		userNameTextBox.click();
		userNameTextBox.sendKeys(username);
		passwordTextBox.click();
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
		return PageFactory.initElements(driver, AmazonSignInPage.class);
	}
	
	public AmazonHomePage signInToAmazon(){
		submitButton.click();
		return PageFactory.initElements(driver, AmazonHomePage.class);
	}

}
