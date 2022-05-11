package org.pojo;

import org.base.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPassword extends UtilityClass{
	
	public ForgetPassword() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgetpassbtn;
	
	@FindBy(xpath="//input[@placeholder=\"Email address or mobile number\"]")
	private WebElement txtSearchBox;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement searchbutton;

	public WebElement getForgetpassbtn() {
		return forgetpassbtn;
	}

	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	
}
