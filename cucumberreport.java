package cucumber_report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumberreport {

	WebDriver driver;
	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("email")).sendKeys("sradha");
		driver.findElement(By.name("pass")).sendKeys("1233");
	}

	@And("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("login")).click();
	}

	@Then("user can navigate to homepage")
	public void user_can_navigate_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.close();
	}
}
