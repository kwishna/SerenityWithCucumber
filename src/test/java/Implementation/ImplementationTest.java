package Implementation;

import Pages.PageOne;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ImplementationTest{
	
	PageOne one;
	
	@Given("User Browser Opens")
	public void user_Browser_Opens() {
		System.out.println(" :: Opennig URL");
	}

	@When("User Opens (.*)")
	public void user_Opens(String url) {
		
		one.opens(url);
	}

	@Then("User Enters Search Keyword (.*)")
	public void user_Enters_Search_Keyword(String keyword) {
	    
	    one.enterKeyword(keyword);
	}

	@Then("Hits Search Bar")
	public void hits_Search_Bar() {
	    
	   one.hitEnter();
	}

	@Then("Search Results Should Appear")
	public void search_Results_Should_Appear() {
	    
	    one.verifyResultCount();
	}

}
