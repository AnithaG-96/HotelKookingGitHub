package org.adhotel;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FindAllLocators  extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	
chromeLaunch();
impWait(10);
urlLaunch("http://adactinhotelapp.com/");

//----------------------------------------------------
WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
a.sendKeys("AnithaGk");	
	
WebElement b = driver.findElement(By.xpath("//input[@id='password']"));	
b.sendKeys("ZL0RZ1");	
	
WebElement c = driver.findElement(By.xpath("//input[@type='Submit']"));	
c.click();	
//asserttrue("SearchHotel")	
//--------------------------------------------	
WebElement d = driver.findElement(By.xpath("//select[@name='location']"));	//id=location
Select s=new Select(d);	
s.selectByIndex(1);	
	
WebElement e = driver.findElement(By.xpath("//select[@name='hotels']"));	//id=hotels
Select s1=new Select(e);
s1.selectByIndex(2);	
	
WebElement f = driver.findElement(By.name("room_type"));	                        //id=room_type
Select s2=new Select(f);
s2.selectByIndex(1);
	
WebElement g = driver.findElement(By.name("room_nos"));	                   //id=room_nos
Select s3=new Select(g);
s3.selectByIndex(2);

WebElement h = driver.findElement(By.name("adult_room"));                               //class=search_combobox
Select s4=new Select(h);
s4.selectByIndex(2);

WebElement i = driver.findElement(By.name("child_room"));                             //class=search_combobox
Select s5=new Select(i);
s4.selectByIndex(1);

WebElement j = driver.findElement(By.name("Submit"));                          //class=reg_button
j.click();
//asserttrue=SelectHotel
//===============================================================================================================

WebElement k = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
k.click();
WebElement l = driver.findElement(By.xpath("//input[@name='continue']"));                                      //class=reg_button
l.click();
//assertt=BookHotel
//=========================================================

WebElement m = driver.findElement(By.name("first_name"));           //class=reg_input
m.sendKeys("Aniiiii");

WebElement n = driver.findElement(By.name("last_name"));              ///reg_input=class
n.sendKeys("G");

WebElement o = driver.findElement(By.xpath("//textarea[@name='address']"));   //cls=txtarea
o.sendKeys("Tambaram,chennai");

WebElement p = driver.findElement(By.name("cc_num"));  //cls=reg_input
p.sendKeys("1234567890123456");

WebElement q = driver.findElement(By.name("cc_type"));               //cls=select_combobox
Select ss=new Select(q);
ss.selectByIndex(3);

WebElement r = driver.findElement(By.name("cc_exp_month"));                //cls=select_combobox2
Select ss1=new Select(r);
ss1.selectByIndex(11);

WebElement t = driver.findElement(By.name("cc_exp_year"));              //cls=select_combobox2
Select ss2=new Select(t);
ss2.selectByIndex(12);

WebElement u = driver.findElement(By.name("cc_cvv"));       //cls=reg_input
u.sendKeys("134");

WebElement v = driver.findElement(By.name("book_now"));       //xpath=(//input[@type='button'])[1]
v.click();

//aassrt=BookingConfirm
//==============================================================================

staticWait(5000);
WebElement w = driver.findElement(By.xpath("(//input[@type='text'])[16]"));//name=order_no
moveToElement(w);
String mm = w.getAttribute("innerText");
System.out.println(mm);











}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
