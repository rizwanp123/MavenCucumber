package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.Login;
import driver.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumSteps extends BaseClass {
	
	Login login; 

	@Given("I hit the book store application")
	public void i_hit_the_book_store_application() {
		driver.get("https://demoqa.com/login");
	}
	
	@When("I enter the username")
	public void i_enter_the_username() {
		login = PageFactory.initElements(driver, Login.class);
		login.enterUsername();
	}
	
	@When("I enter the password")
	public void i_enter_the_password() {
		login = PageFactory.initElements(driver, Login.class);
		login.enterPassword();
	}
	
	@When("I click on login button")
	public void i_click_on_login_button() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,350)");
        
		login = PageFactory.initElements(driver, Login.class);
		login.clickLoginButton();
	}
	
}
