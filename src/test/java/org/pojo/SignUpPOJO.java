package org.pojo;

import org.base.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPOJO extends UtilityClass{
	
	public SignUpPOJO() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")
	private WebElement emTxt;
	
	
	public WebElement getEmTxt() {
		return emTxt;
	}

	@FindBy(name="pass")
	private WebElement pwdTxt;

	public WebElement getPwdTxt() {
		return pwdTxt;
	}
	
	
	
	
	
	

}
