package step_definitions;



import org.openqa.selenium.By;

import base.Base;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_Login_to_Verify_Order_A_Product extends Base {
	


	@When("I click Product Order")
	public void i_click_Product_Order() {
		click(By.xpath("//ul//li[4]"));
	}

	@Then("I select Camera")
	public void i_select_Camera() {
		 sendkeys(By.name("prodId"),"Camera");
	}

	@Then("I select date")
	public void i_select_date() {
		sendkeys(By.name("ordDate"),"29");
	}

	@Then("I click Order Product button")
	public void i_click_Order_Product_button() {
		click(By.xpath("//button[@class=\"btn btn--radius btn--green\"]"));
		//browser.switchTo().alert().accept();
	}

	@Then("I will see Successfully Order")
	public void i_will_see_Successfully_Order() {
	    
	}



}
