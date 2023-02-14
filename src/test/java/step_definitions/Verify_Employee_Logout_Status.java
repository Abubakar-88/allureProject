package step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;

import io.cucumber.java.en.Then;


public class Verify_Employee_Logout_Status extends Base {
	


	
	@Then("I See Employee Homepage")
	public void i_will_see_Employee_Home_Page() {
		String s= getText(By.xpath("//div//h2[2]"));
	    assertEquals("Welcome Test",s);
	}
	

	@Then("I See Employee Login Page")
	public void i_See_Employee_Login_Page() {
		String s= getText(By.xpath("//h1[text()='Employee Login ']"));
	    assertEquals("Employee Login",s);
		
	}

}