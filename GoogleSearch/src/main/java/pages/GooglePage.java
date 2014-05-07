package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author terry.nweze
 */
public class GooglePage extends Page {
	private String url = "http://www.google.co.uk";

	public GooglePage(WebDriver driver) {
		super(driver);
	}

	public String getUrl() {
		return this.url;
	}

	public void navigateTo() {
		// Navigate to the Google page
		driver.get(this.getUrl());
	}
	
	public void searchForQuery(String query) throws Throwable{
		
		// Enter text into the search input field.
		driver.findElement(By.id("gbqfq")).sendKeys(query);
		
		// Wait for a few seconds for the page to re-render
    	Thread.sleep(3000);
    	
    	// Invoke the submit/search button
    	driver.findElement(By.id("gbqfb")).click();
    }

}
