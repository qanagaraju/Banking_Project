package cucumber_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Step_Definition {
	
	static WebDriver driver;
	
	@Given("user launch browser")
	public void user_launch_browser() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.mycontactform.com/");
		
	}
	
	
	@When("user insert username")
	public void user_insert_username() {
	   
		driver.findElement(By.name("user")).sendKeys("tester");
		
	}
	
	@When("user insert password")
	public void user_insert_password() {
	   
		driver.findElement(By.name("pass")).sendKeys("admin");
	}
	
	
	@Then("user click login button")
	public void user_click_login_button() {
		
		driver.findElement(By.name("btnSubmit")).click();
	   
	}
	
	
	@Then("user close test")
	public void user_close_test() {
	   
		driver.close();
	}


}
