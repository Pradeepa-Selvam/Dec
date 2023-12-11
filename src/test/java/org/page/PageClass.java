package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageClass extends BaseClass {
	
	public PageClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="email")
	private WebElement emailID;
	public WebElement getEmailID() {
		return emailID;
	}
	@FindBy(how=How.ID,using="passwd")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(how=How.XPATH,using="//button[@data-action='login']")
	private WebElement submit;
	public WebElement getlogin() {
		return submit;
	}
	
@FindBy(how=How.XPATH,using="//a[@class='tile-8 cakes']")
private WebElement cake;
public WebElement getCake() {
	return cake;
}
@FindBy(how=How.XPATH,using="//a[@data-item-name='Birthday Cakes']")
private WebElement birthdayCake;
public WebElement getbirthdayCake() {
	return birthdayCake;
}

@FindBy(how=How.XPATH,using="//img[@data-url='/p-fresh-fruit-almond-cake-half-kg--110227']")
private WebElement selectedCake;
public WebElement getselectedCake() {
	return selectedCake;
}
@FindBy(how=How.XPATH,using="//input[@placeholder=\'Pincode/Location\']")
private WebElement location;
public WebElement getlocation() {
	return location;
}

@FindBy(how=How.XPATH,using="//span[text()='Select Date']")
private WebElement selectdate;
public WebElement getselectdate() {
	return selectdate;
}
@FindBy(how=How.XPATH,using="//button[@data-index='1']") 
private WebElement dd;
public WebElement getdd() {
	return dd;
}
@FindBy(how=How.XPATH,using="//span[text()='Standard']")
private WebElement deliveryType;
public WebElement getdeliveryType() {
	return deliveryType;
}
@FindBy(how=How.ID,using="timepicker")
private WebElement deliveryTime;
public WebElement getdeliveryTime() {
	return deliveryTime;
}

@FindBy(how=How.XPATH,using="//input[@placeholder='Type here']")
private WebElement name;
public WebElement getnameOfCake() {
	return name;
}
@FindBy(how=How.XPATH,using="//img[@alt='Dry Fruit Combo']")
private WebElement addON;
public WebElement getaddON() {
	return addON;
}
@FindBy(how=How.XPATH,using="//img[@alt='Pink Paradise Roses Bouquet']")
private WebElement addON1;
public WebElement getaddON1() {
	return addON1;
}
@FindBy(how=How.ID,using="add-cart")
private WebElement addCart;
public WebElement getaddCart() {
	return addCart;
}
@FindBy(how=How.XPATH,using="//a[contains(text(),' Proceed To Checkout')]")
private WebElement checkout;
public WebElement getcheckout() {
	return checkout;
}
@FindBy(how=How.NAME,using="fname")
private WebElement fname;
public WebElement getfname() {
	return fname;
}
@FindBy(how=How.XPATH,using="//input[@name='saddr']")
private WebElement add1;
public WebElement getadd1() {
	return add1;
}
@FindBy(how=How.XPATH,using="//input[@name='saddr2']")
private WebElement add2;
public WebElement getadd2() {
	return add2;
}

@FindBy(how=How.XPATH,using="//input[@placeholder='Mobile Number']")
private WebElement no;
public WebElement getno() {
	return no;
}
@FindBy(how=How.XPATH,using="//input[@placeholder='Recipient Email Id']")
private WebElement email;
public WebElement getemail() {
	return email;
}
@FindBy(how=How.XPATH,using="//input[@placeholder='Enter tag name']")
private WebElement tagName;
public WebElement gettagName() {
	return tagName;
}
@FindBy(how=How.XPATH,using="//button[text()='SAVE']")
private WebElement save;
public WebElement getsave() {
	return save;
}
@FindBy(how=How.XPATH,using="//button[contains(text(),'Deliver')]")
private WebElement deliver;
public WebElement getdeliver() {
	return deliver;
}

}
