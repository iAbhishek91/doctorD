package commonUtilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Abhishek
 * POINT-1: define hook.java 
 * -->this file will be JUNIT file which will be used for initial setup and post procedure of the test.
 * INITIALIZING test:
 * 	--	instantiating WebDriver with any browser
 * 	--	deleting cookies
 * 	--	maximizing
 * 	--	navigate to the application under test
 * EXIT test:
 * 	--	closing the test.
 * NOTE: this class is not executed or called directly b JUNIT
 */
public class Hook extends MyDriver{
	
	@Before
	public void initSetup() throws IOException{
		System.out.println("I am on Before method");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
	}
		
	@After
	public void endTest(){
		System.out.println("I am on After method");
		driver.close();// closes the tab opened by JUnit
		driver.quit();// closes the browser opened by JUnit
	}
}
