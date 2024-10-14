package pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauceproductpage {
	WebDriver d;
	
  @FindBy(xpath="//*[@class='btn btn_primary btn_small btn_inventory ']")
  List<WebElement> addtocart1;
  
 // @FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
  //WebElement add;
  public Sauceproductpage(WebDriver d)
  {
	  this.d=d;
	  PageFactory.initElements(d, this);
  }
  
  public void addcart()
  {
	  //System.out.println("add to cart");
	 
	  for(WebElement cart:addtocart1)
	  {
		  //System.out.println("inside loop");
		  cart.click();
	  }
	 // add.click();
	  
  }
}	
