package step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Common_Steps extends Base {
	@Given("I am in Landing Home Page")
	public void i_am_in_Landing_Page() {
		navigateURL("https://it.microtechlimited.com/");
		String s = getText(By.xpath("//div//h1['Welcome to MicroTech NA.']"));
		assertEquals("Welcome to MicroTech NA.", s);
	}

	@When("I Click on Loginn")
	public void i_Click_on_Login() {
		click(By.xpath("//a[@href=\"elogin.php\"]"));
	}

	@Then("I will be in Login Pagee")
	public void i_will_be_in_Login_Page() {
		String s = getText(By.xpath("//div//h1"));
		assertEquals("Employee Login", s);
	}

	@When("I click Login button")
	public void i_click_Login_button() {
	    click(By.xpath("//input[@name=\"login-submit\"]"));
	}
	@Then("I enter User Id {string}")
	public void i_enter_User_Id(String string) {
	   sendkeys(By.name("mailuid"),string);
	}

	@Then("I enter Password {string}")
	public void i_enter_Password(String string) {
		sendkeys(By.name("pwd"),string);
	}
	@Then("Click Employee Login")
	public void click_Employee_Login() {
	   
	    click(By.xpath("//a[@class='homered']"));
	}
	@Then("I will see Employee Home Page")
	public void i_will_see_Employee_Home_Page() {
		String s= getText(By.xpath("//div//h2[2]"));
	    assertEquals("Welcome Test",s);
	}
	
	@Then("I click submit button")
	public void i_click_submit_button() {
		click(By.xpath("//button[@class=\"btn btn--radius btn--green\"]"));
	}
	
	@Then("I will check \"Invalid username or password!\"")
	public void i_will_see_Employee_Home_Pagee() {
		String s= getText(By.xpath("//span[text()='Invalid username or password!']"));
		System.out.println("complete********** = " + s);
	    assertEquals("Invalid username or password!",s);
	}
	@Then("I Click Logout buttonn")
	public void i_Click_Logout_buttonn() {
		click(By.xpath("//a[text()='Log Out']"));
	}
	@When("I click Login Button")
	public void i_click_Login_Button() {
		click(By.name("login-submit"));
	}
	@Then("I will see Customer Home Page")
	public void i_will_see_Customer_Home_Page() {
	    String s= getText(By.xpath("//h2[text()='Welcome David']"));
	    assertEquals("Welcome David",s);
	}
	@Then("Click Customer Login")
	public void click_Customer_Login() {
		click(By.xpath("//a[@href=\"clogin.php\"]"));
		String customerLogin= getText(By.xpath("//div/h1"));
		assertEquals("Customer Login", customerLogin);		
	}
	
}
