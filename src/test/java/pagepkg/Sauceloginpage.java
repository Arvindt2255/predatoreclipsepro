package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sauceloginpage {
	
	WebDriver d;
	By username=By.xpath("//*[@id=\"user-name\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By loginbutton=By.xpath("//*[@id=\"login-button\"]");
	
	public Sauceloginpage(WebDriver d)
	{
		this.d=d;
	}
	
	public void setvalues(String user,String pass)
	{
	  d.findElement(username).clear();
	  d.findElement(username).sendKeys(user);	
	  d.findElement(password).clear();
	  d.findElement(password).sendKeys(pass);
	}
	
	public void login()
	{
		d.findElement(loginbutton).click();
	}

}
