package cucumber_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Contact_Step_Definition {
	
	static WebDriver driver;
	
	
	@Given("user launch home page")
	public void user_launch_home_page() {
	    
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.mycontactform.com/");
		
	}
	
	@When("user clicks on sampleforms")
	public void user_clicks_on_sampleforms() {
		
		driver.findElement(By.linkText("Sample Forms")).click();
	}
	

	@When("user enters subject")
	public void user_enters_subject() {
		
		driver.findElement(By.name("subject")).sendKeys("Selenium");
		
	}   
	
	
	@When("user enters email id")
	public void user_enters_email_id() {
		driver.findElement(By.name("email")).sendKeys("tester@gmail.com");
	}  
	
	@When("user enters textfield data")
	public void user_enters_textfield_data() {
		driver.findElement(By.name("q1")).sendKeys("java language");
	}   
	
	@Then("user close browser")
	public void user_close_browser() {
		driver.close();
	}
	


}
