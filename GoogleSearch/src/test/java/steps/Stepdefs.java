package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GooglePage;
import pages.Page;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author terry.nweze
 */
public class Stepdefs {
	
	WebDriver driver;
	
	@Given("^I am on the Google page$")
	public void i_am_on_the_Google_page() throws Throwable {
		// Create an instance of the GooglePage object
		GooglePage page = new GooglePage(driver);
		
		// Navigate to the Google Search page within a browser 
        page.navigateTo();
        
        // verify the correct page is displayed
        assertEquals("Google", page.getTitle());
	}

	@When("^I type \"(.*?)\"$")
	public void i_type(String text) throws Throwable {
		// Create an instance of the GooglePage object
		GooglePage page = new GooglePage(driver);
		
		// enter and submit a search term
        page.searchForQuery(text);
	}

	@Then("^I should see results for \"(.*?)\"$")
	public void i_should_see_results_for(String text) throws Throwable {
		// Wait a few seconds for the search results page to load
		Thread.sleep(3000);
		
		// Create an instance of the GooglePage object
		GooglePage page = new GooglePage(driver);
		
		// Verify that the correct page is displayed
    	assertEquals(text + " - Google Search", page.getTitle());
	}
	
	@Before
	public void startUp(){
		// Creates a new Firefox WebDriver object
		// This method will be called before every test
		driver = new FirefoxDriver();
	}
	
	@After
	public void tearDown(){
		// Closes the WebDriver object.
		// This method will be called after every test
		driver.quit();
	}

}
