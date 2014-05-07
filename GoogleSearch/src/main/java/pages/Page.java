package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author terry.nweze
 */
public class Page {
	public WebDriver driver;

    public Page(){
    	driver = new FirefoxDriver();
    }
    
    public Page(WebDriver driver){
        this.driver = driver;
    }
    
    public String getTitle(){
        return driver.getTitle();
    }

}
