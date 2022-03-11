package org.pagespom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage4 extends BaseClass{

	public LoginPage4() {
		PageFactory.initElements(driver, this);
	}
@FindBy(name="first_name")	
private WebElement firstName;

@FindAll({@FindBy(name="last_name"), @FindBy(xpath="(//input[@type='text'])[12]") })
private WebElement lastName;	

@FindBy(xpath="//textarea[@name='address']")
private WebElement address;	

@FindBy(name="cc_num")
private WebElement creditCard;

@FindBy(name="cc_type")
private WebElement CerditType;

@FindBy(name="cc_exp_month")
private WebElement expMonth;

@FindBy(name="cc_exp_year")
private WebElement expYear;

@FindBy(name="cc_cvv")
private WebElement ccvNum;

@FindBy(name="book_now")
private WebElement booking;




public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCreditCard() {
	return creditCard;
}
public WebElement getCerditType() {
	return CerditType;
}
public WebElement getExpMonth() {
	return expMonth;
}
public WebElement getExpYear() {
	return expYear;
}
public WebElement getCcvNum() {
	return ccvNum;
}
public WebElement getBooking() {
	return booking;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
