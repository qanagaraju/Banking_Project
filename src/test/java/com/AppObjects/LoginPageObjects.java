package com.AppObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects   {
	
	public static WebDriver driver;
	//public static CaptureScreenClass capture = new CaptureScreenClass();
	
	@FindBy(name="user")WebElement username;
	@FindBy(name="pass")WebElement password;
	@FindBy(name="btnSubmit")WebElement submit;
	@FindBy(xpath="//*[@id=\"user_bar\"]/ul/li[1]/a")WebElement signout;
	@FindBy(id = "right_col_top_err")WebElement usermessage;
	
	
	
	
	
	public void getusername(String un) {
		
		String uname = "qatrainer";
		
		if(uname.equals(un)) {
			username.sendKeys(un);
			System.out.println("Verified");
		}else
		{
			System.out.println("not verified");
		}
		
		
	}
	
	
	public void getpassword(String pw) {
		password.sendKeys(pw);
		
	}
	
	public void getsubmit() {
		if(submit.isEnabled()) {
			submit.click();
			System.out.println("Clicking Login submit");
			
			
			try {
				String message = usermessage.getText();
				System.out.println("User Message is...."+"\t"+message);
				System.out.println("Login Fail");
				//capture.screenCapture(driver, "User Message");
				
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			
			
		}else
		{
			System.out.println("Does not performed");
		}
	}
	
	public void getsignout() {
		if(signout.isEnabled()) {
			
			try {
				
				signout.click();
				System.out.println("Login Success");
				//capture.screenCapture(driver, "SignOut success");
				
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
	}
	
	
	
	

}
