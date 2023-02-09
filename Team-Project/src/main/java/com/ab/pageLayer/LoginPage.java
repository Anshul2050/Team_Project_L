package com.ab.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//This is login page functionality check
		@FindBy(css = "span.mark")
		WebElement dashBoard;
		public void dashBoard() {
			
			
			dashBoard.click();
		}

	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement login_btn;
	
	@FindBy(xpath ="//input[@id='Email']")
	private WebElement email_txtbx;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password_txtbx;
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement login_btn1;

	public void clickOnLoginButton()
	{
		login_btn.click();
	}
	public void enterEmailID(String email)
	{
		email_txtbx.sendKeys(email);
		
	}
	public void enterPassword(String password)
	{
		password_txtbx.sendKeys(password);
	}
	public void clickOnLoginButton1()
	{
		login_btn1.click();
	}
	

	
}
