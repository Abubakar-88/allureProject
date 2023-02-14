package step_definitions;

import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;

import base.Base;

import io.cucumber.java.en.Then;


public class Verify_Employee_Apply_Leaves extends Base{

	
	@Then("I click Apply Leave button")
	public void i_click_Apply_Leave_button() {
	    click(By.xpath("//ul/li[6]/a"));
	}

	@Then("I will see {string} Page")
	public void i_will_see_Page(String string) {
		String s= getText(By.xpath("//h2[text()='Apply Leave Form']"));
	    assertEquals("Apply Leave Form",s);
		
	}

	@Then("I write The reason")
	public void i_write_The_reason() {
		sendkeys(By.xpath("//input[@name='reason']"),"For Illness"); 
	}
	@Then("I write Start Date")
	public void i_write_Start_Date() {
		sendkeys(By.xpath("//input[@name='start']"),"2022-01-05");  
	}

	@Then("I write End Date")
	public void i_write_End_Date() {
		sendkeys(By.xpath("//input[@name='end']"),"2022-01-07");  
	}

	@Then("I click Submit button")
	public void i_click_Submit_button() {
	   
		click(By.xpath("//button[@type='submit']"));
		
	}

	@Then("I will See Leave Satus")
	public void i_will_See_Leave_Satus() {
	  
		String s= getText(By.xpath("//tbody/tr[13]/td[5]"));
	    assertEquals("3",s);
	}

}
