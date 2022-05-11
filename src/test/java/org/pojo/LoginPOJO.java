package org.pojo;

import org.base.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends UtilityClass{
	
	public LoginPOJO() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement emailTxt;
	
	@FindBy(name="pass")
	private WebElement passTxt;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement loginbtn;

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	

}
