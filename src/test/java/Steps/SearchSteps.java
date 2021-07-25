package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends BaseClass {
	

	@Given("I hit the book store books application")
	public void i_hit_the_book_store_books_application() {
		
	    driver.get("https://demoqa.com/books");
	}
	
	@When("I enter the text in search box {string}")
	public void i_enter_the_text_in_search_box(String text) {
	   driver.findElement(By.id("searchBox")).sendKeys(text);
	}
	
	@Then("I click on search button")
	public void i_click_on_search_button() {
	    driver.findElement(By.id("basic-addon2")).click();
	}




}
