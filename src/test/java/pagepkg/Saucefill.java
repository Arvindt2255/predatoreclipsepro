package pagepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucefill {
	
	WebDriver d;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement fn;
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement ln;
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement code;
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuebutton;
	@FindBy(xpath="//*[@id=\"finish\"]")
	WebElement finishbut;
	@FindBy(xpath="//*[@id=\"back-to-products\"]")
	WebElement backhome;
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement burg;
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	 public Saucefill(WebDriver d)
	 {
		 this.d=d;
		 PageFactory.initElements(d, this);
	 }
	 
	 public void setvalues(String firstn,String lastn,String pincode)
	 {
		fn.sendKeys(firstn);
		ln.sendKeys(lastn);
		code.sendKeys(pincode);
	 }
	 
	 public void continueclick()
	 {
		 continuebutton.click();
	 }
	 
	 public void finishclick()
	 {
		 finishbut.click();
	 }
	 public void backclick()
	 {
		 backhome.click();
	 }
	 
	 public void burgclick()
	 {
		 burg.click();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
	 }
	 
	 public void logclick()
	 {
		 logout.click();
	 }

}
