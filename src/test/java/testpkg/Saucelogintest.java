package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Checkoutpage;
import pagepkg.Saucefill;
import pagepkg.Sauceloginpage;
import pagepkg.Sauceproductpage;
import utilities.Excelutils;

public class Saucelogintest {

	WebDriver d;
	
	@BeforeTest
	public void test()
	{
		d=new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		d.manage().window().maximize();
	}
	
	@Test
	public void verifyLoginWithValidCred () throws Exception

	{
		Sauceloginpage p1 = new Sauceloginpage(d);
		Sauceproductpage  s=new Sauceproductpage(d);
		Checkoutpage c=new Checkoutpage(d);
		Saucefill f=new Saucefill(d);

	// Reading the data from excel file by the specified path

	            String xl = "D:\\Downloads common\\saucedemo.xlsx";

	            String Sheet = "Sheet1";

	            int rowCount = Excelutils.getRowCount(xl, Sheet);

	            for (int i=1;i<rowCount-1;i++)

	            {

	                        String UserName=Excelutils.getCellValue(xl, Sheet, i, 0);
                               System.out.println("username---"+UserName);
	                        String Pwd=Excelutils.getCellValue(xl, Sheet, i, 1);
                             System.out.println("password---"+Pwd);
	                        //Passing Username and password as parameters
	                        p1.setvalues(UserName, Pwd);
                         //Submitting the data by clicking on login button                   
                             p1.login();
	                        
	                        
	                        
	                        String expectedurl="https://www.saucedemo.com/inventory.html";
	          			  String actualurl= d.getCurrentUrl();
	          			  
	          			     if(actualurl.equals(expectedurl))
	          			     {
	          			    	System.out.println("pass");
	          			    	s.addcart();
	          			    	c.cartclick();
	          			    	c.chechkoutclick();
	          			    	f.setvalues("Arvind", "T", "680562");
	          			    	f.continueclick();
	          			    	f.finishclick();
	          			    	f.backclick();
	          			    	f.burgclick();
	          			    	f.logclick();
	          			     }
	          			     else
	          			     {
	          			    	System.out.println("fail");
	          			     }
	                         

	                        
	            }
}
}

