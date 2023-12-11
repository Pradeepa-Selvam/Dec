package org.test;



import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PageClass;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	
   @Test(priority=0)
	public void login(){
		try {
		getDriver();
		getUrl("https://www.igp.com/login");
		windMax();
		PageClass p=new PageClass();
		WebElement user=p.getEmailID();
		jsTextSend(excelRead(1,0),user);
		WebElement pass=p.getPassword();
		jsTextSend(excelRead(1,1),pass);
		WebElement submit=p.getlogin();
		capture("loginpage");
		submit.click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
	}

  @Test(priority=1)   
	public void selectCake(){
			try {
				PageClass p=new PageClass();	
				WebElement cake=p.getCake();
				cake.click();
				Thread.sleep(2000);
				WebElement cake2 = p.getbirthdayCake();
				cake2.click();
				Thread.sleep(2000);
				WebElement selectedCake = p.getselectedCake();
				scrollOption(selectedCake);
				Thread.sleep(2000);
				capture("cakeselection");
				selectedCake.click();
				Thread.sleep(2000);
		}catch(Exception e)
			{
			System.out.println(e.getMessage());
			}
		}
   @Test(priority=2)
		public void deliveryDetails(){
			try {
				PageClass p=new PageClass();
				WebElement pincode = p.getlocation();
				sendText(pincode,"600099");
				Thread.sleep(3000);	
				WebElement date1=p.getdd();
				jsclick(date1);
		
				WebElement type = p.getdeliveryType();
				jsclick(type);
				Thread.sleep(1000);
				WebElement time =p.getdeliveryTime();
				selectOption(time,2);
				Thread.sleep(2000);
				WebElement cakeName  = p.getnameOfCake();
				sendText(cakeName,"DHEEKSHIDHAN");
				Thread.sleep(2000);
				WebElement addON1 =p.getaddON();
				jsclick(addON1);
				WebElement addON2 =p.getaddON1();
				jsclick(addON2);
				capture("addtocart");
				WebElement addCart=p.getaddCart();
				addCart.click();
				Thread.sleep(3000);
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			}
   @Test(priority=3)
		public void orderSummary(){
			try {
				PageClass p=new PageClass();
				WebElement checkout=p.getcheckout();
				jsclick(checkout);
				Thread.sleep(3000);
				WebElement fname=p.getfname();
				jsTextSend(excelRead(3,1),fname);
				WebElement add1=p.getadd1();
				jsTextSend(excelRead(4,1),add1);
				WebElement add2=p.getadd2();
				jsTextSend(excelRead(5,1),add2);
				WebElement no=p.getno();
				jsTextSend(excelRead(6,1),no);
				WebElement email=p.getemail();
				jsTextSend(excelRead(7,1),email);
				WebElement tname=p.gettagName();
				jsTextSend(excelRead(8,1),tname);
				WebElement save=p.getsave();
				jsclick(save);
				Thread.sleep(2000);
				WebElement deliver=p.getdeliver();
				capture("ordered");
				jsclick(deliver);	
			
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			}
   
   }
	
		
	
	

