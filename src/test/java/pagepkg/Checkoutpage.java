package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
	
	WebDriver d;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a/span")
	WebElement cart1;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement check;
	
	public Checkoutpage(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d,this);
	}
	public void cartclick()
	{
		cart1.click();
	}
	public void chechkoutclick()
	{
		check.click();
	}

}
