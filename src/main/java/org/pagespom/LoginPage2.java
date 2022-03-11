package org.pagespom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2  extends BaseClass{
	public LoginPage2() {
		PageFactory.initElements(driver, this);
	}
	
@FindAll({@FindBy(xpath="//select[@name='location']"), @FindBy(id="location")})
private WebElement locations;
	
@FindAll({@FindBy(xpath="//select[@name='hotels']")  ,@FindBy(id="hotels")   })
private WebElement hotels;	

@FindAll({@FindBy(id="room_type")     ,@FindBy(name="room_type")   })
private WebElement roomType;	

@FindAll({@FindBy(name="room_nos") ,@FindBy(id="room_nos")   })	
private WebElement noOfRooms;	

@FindBy(name="adult_room")
private WebElement adultsProom;

@FindBy(name="child_room")
private WebElement childrensProom;

@FindBy(name="Submit")
private WebElement search;

//getters

public WebElement getLocations() {
	return locations;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getNoOfRooms() {
	return noOfRooms;
}

public WebElement getAdultsProom() {
	return adultsProom;
}

public WebElement getChildrensProom() {
	return childrensProom;
}

public WebElement getSearch() {
	return search;
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
