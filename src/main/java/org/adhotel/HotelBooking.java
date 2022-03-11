package org.adhotel;

import java.util.Date;

import org.base.BaseClass;
import org.pagespom.LoginPage1;
import org.pagespom.LoginPage2;
import org.pagespom.LoginPage3;
import org.pagespom.LoginPage4;
import org.pagespom.LoginPage5;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HotelBooking extends BaseClass{
@BeforeClass
private void beforeClass() {
chromeLaunch();
impWait(10);
urlLaunch("https://www.adactinhotelapp.com/");
}
@AfterClass
private void afterClass() {
//quit();
}
@BeforeMethod
private void beforeMethod() {
Date d=new Date();
System.out.println("Before Time="+d);
}
@AfterMethod
private void afterMethod() {
Date d=new Date();
System.out.println("After Time="+d);
}

@Test(priority=0,invocationCount=1,enabled=true)
private void test1() throws InterruptedException {
SoftAssert x=new SoftAssert();
x.assertTrue(getCurrenturl().contains("adactin"),"Verify Url");

LoginPage1 l1=new LoginPage1();
sendKeys(l1.getName(), "AnithaGk");	
x.assertEquals(getAttribute(l1.getName()),"AnithaGk","Verify Name");
	
sendKeys(l1.getPassword(), "ZL0RZ1");	
x.assertEquals(getAttribute(l1.getPassword()), "ZL0RZ1","Verify Password");
	
click(l1.getLogin());	
staticWait(3000);	
x.assertTrue(getCurrenturl().contains("SearchHotel"),"Verify after login url");
x.assertAll();	
}

@Test(priority=1,enabled=true,invocationCount=1)
private void test2() throws InterruptedException {
SoftAssert x1=new SoftAssert();
LoginPage2 l2=new LoginPage2();

selectByIndex(l2.getLocations(), 1);	
x1.assertEquals(getAttribute(l2.getLocations()),"Sydney", "Verify locations");

selectByIndex(l2.getHotels(), 2);
x1.assertEquals(getAttribute(l2.getHotels()),"Hotel Sunshine", "verify Hotels");

selectByIndex(l2.getRoomType(), 1);
x1.assertEquals(getAttribute(l2.getRoomType()),"Standard", "Verify Room Type");

selectByIndex(l2.getNoOfRooms(), 2);
x1.assertEquals(getAttribute(l2.getNoOfRooms()),"2", "Verify No of Rooms");

selectByIndex(l2.getAdultsProom(), 2);	
x1.assertEquals(getAttribute(l2.getAdultsProom()),"2", "Verify Adults rooms");

selectByIndex(l2.getChildrensProom(), 1);	
x1.assertEquals(getAttribute(l2.getChildrensProom()),"1" ,"Verify children rooms");

click(l2.getSearch());	
staticWait(2000);
x1.assertTrue(getCurrenturl().contains("SelectHotel"),"Verify After hotel booking");	
x1.assertAll();		
}

@Test(priority=2,invocationCount=1,enabled=true)	
private void test3() throws InterruptedException {
LoginPage3 l3=new LoginPage3();
SoftAssert x2=new SoftAssert();	

click(l3.getRadiobtn());
click(l3.getContinuecli());

staticWait(3000);
x2.assertTrue(getCurrenturl().contains("BookHotel"),"Verify radiobtn to click");	
x2.assertAll();		
}

@Test(priority=3,invocationCount=1,enabled=true)	
private void test4() throws InterruptedException {
LoginPage4 l4=new LoginPage4(); 
SoftAssert x4=new SoftAssert();	

sendKeys(l4.getFirstName(), "Aniii");
x4.assertEquals(getAttribute(l4.getFirstName()), "Aniii","Verify First Name");

sendKeys(l4.getLastName(), "G");
x4.assertEquals(getAttribute(l4.getLastName()),"G", "Verify Last Name");

sendKeys(l4.getAddress(), "Tambaram,Chennai");
x4.assertEquals(getAttribute(l4.getAddress()),"Tambaram,Chennai", "Verify Address");

sendKeys(l4.getCreditCard(), "1234567890123456");	
x4.assertEquals(getAttribute(l4.getCreditCard()), "1234567890123456","Verify Card No");
	
selectByIndex(l4.getCerditType(),3);
//x4.assertEquals(getAttribute(l4.getCerditType()),"3", "Verify Credit Type");

selectByIndex(l4.getExpMonth(), 11);
x4.assertEquals(getAttribute(l4.getExpMonth()), "11","Verify Month");

selectByIndex(l4.getExpYear(), 12);	
x4.assertEquals(getAttribute(l4.getExpYear()),"2022", "Verify Year");

sendKeys(l4.getCcvNum(), "123");
x4.assertEquals(getAttribute(l4.getCcvNum()), "123","Verify CCv Num");

click(l4.getBooking());
staticWait(7000);
x4.assertTrue(getCurrenturl().contains(""),"Verify After booking");	
x4.assertAll();
}	


@Test(priority=4,enabled=true,invocationCount=1)	
private void test5() {
LoginPage5 l5=new LoginPage5();
moveToElement(l5.getOrderid());	
String attribute = getAttribute(l5.getOrderid());
System.out.println("orderId="+attribute);	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
