package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;

public class PageOne extends PageObject {
	
	/*
	 * @FindBy(name="q") WebElement searchBox;
	 * 
	 * @Managed(uniqueSession=true) WebDriver driver;
	 */
	
	public void opens(String url) {
//		System.out.println("URL - "+url);
//		open();
		System.out.println("OPENS");
	}
	
	public void enterKeyword(String keyword) {
		
//		searchBox.sendKeys(keyword);
		System.out.println("ENTER KEYWORD");
	}
	
	public void hitEnter() {
		
//		$("//*[@name='btnK']").submit();
		System.out.println("HIT ENTER");
	}
	
	public void verifyResultCount() {
		
//		assert ( findAll("//div[@class='r']").size() > 0 );
		System.out.println("VERIFY");
	}
}
