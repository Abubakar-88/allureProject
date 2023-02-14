package step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;

import io.cucumber.java.en.Then;


public class Employee_Login extends Base {
	





	@Then("I will see {string}")
	public void i_will_see(String string) {
	    String s= getText(By.xpath("//div//h2[2]"));
	    assertEquals("Welcome Test",s);
	}


}
