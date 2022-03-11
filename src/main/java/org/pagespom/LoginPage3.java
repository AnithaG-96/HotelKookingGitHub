package org.pagespom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage3 extends BaseClass {

	public LoginPage3() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//input[@name='radiobutton_0']")	
private WebElement radiobtn;

@FindBy(xpath="//input[@name='continue']")
private WebElement continuecli;



public WebElement getRadiobtn() {
	return radiobtn;
}

public WebElement getContinuecli() {
	return continuecli;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
