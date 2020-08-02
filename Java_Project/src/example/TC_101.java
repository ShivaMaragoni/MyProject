package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_101
{
	public WebDriver driver;
	@Given("^Open HRMS application$")
	public void openbrowser(){
	System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("http://www.google.com/");
	}
	@When("^Typing User name and Password$")
	public void login(){
	System.out.println("Typing User name and Password");
	}
	@Then("^Login page should be shown$")
	public void closebrowser(){
	System.out.println("Login page should be shown");
	}
}
