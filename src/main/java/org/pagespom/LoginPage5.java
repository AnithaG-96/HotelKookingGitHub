package org.pagespom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage5  extends BaseClass{
	public LoginPage5() {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="(//input[@type='text'])[16]")
private WebElement orderid;




public WebElement getOrderid() {
	return orderid;
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
