package com.App_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.AppObjects.LoginPageObjects;
import com.AppTestCases.LoginTestCase;
import com.Project_Utilities.BrowserFactory;
import com.Project_Utilities.PropertyReader;



public class LoginAppService 
{
	
	public static LoginTestCase logintest;
	public static LoginPageObjects loginpage;
	public static WebDriver driver;
	public static BrowserFactory browser;
	//public static LoginPageObjects loginpage;
	
	static PropertyReader read;
	
	
	
	
	
	@BeforeSuite
	public void setupsuite() {
		browser=new BrowserFactory();
		read = new PropertyReader();
		
	}
	
	@BeforeTest
	public void startBrowser() {
		
		driver = browser.startbrowser(read.getappname(), read.getappurl());
		System.out.println("starting browser");
	}
	
	
	@Parameters({"username","password"})
	@Test(priority=1)
	public void verify_valid_login(String username,String password) {
		
		logintest=PageFactory.initElements(driver, LoginTestCase.class);
		logintest.insertusername(username).insertpassword(password).clicksubmit().clicksignout();
		System.out.println("starting browser");	
	}
	
	
	@Test(priority=2)
	public void verify_Invalid_login() {
		
		try {
			
			logintest=PageFactory.initElements(driver, LoginTestCase.class);
			logintest.insertusername("tester").insertpassword("admin").clicksubmit().clicksignout();
			System.out.println("starting browser");	
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	

	
	
	
	@AfterTest
	public void testDown() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
}
