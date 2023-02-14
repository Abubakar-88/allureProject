package step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Customer_Logout_Functionalities extends Base {



	@Then("Click Customer Loginn")
	public void click_Customer_Login() {
		click(By.xpath("//a[text()='Customer Login']"));

	}


	@When("I click Custoemr Login button")
	public void i_click_Login_Button() {
		click(By.xpath("//input[@name='login-submit']"));
	}

	@Then("I See Customer Homepagee")
	public void i_See_Customer_Homepage() {
		String s = getText(By.xpath("//div//h2[2]"));
		assertEquals("Welcome David", s);
	}


	@Then("I See Customer Login Pagee")
	public void i_See_Customer_Login_Page() {
		String s = getText(By.xpath("//h1[text()='Customer Login ']"));
		assertEquals("Customer Login", s);
	}

}
