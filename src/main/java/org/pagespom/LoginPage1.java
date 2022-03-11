package org.pagespom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 extends BaseClass{
	public LoginPage1() {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//input[@type='text']")	
private WebElement name;

@FindBy(xpath="//input[@id='password']")
private WebElement password;

@FindBy(xpath="//input[@type='Submit']")
private WebElement login;



public WebElement getName() {
	return name;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
