package step_definitions;

import base.Base;
import org.openqa.selenium.By;
import static org.junit.Assert.*;


import io.cucumber.java.en.Then;


public class Verify_Confirm_Status_Functionalities extends Base {


	@Then("I will click Order Product")
	public void i_will_click_Order_Product() {
		click(By.xpath("//a[@href=\"productOrder.php?id=4\"]"));
	}

	@Then("I select product")
	public void i_select_product() {
		sendkeys(By.xpath("//select[@name=\"prodId\"]"), "Pencil");
	}

	
	@Then("I enter order date")
	public void i_enter_order_date() {
		sendkeys(By.xpath("//input[@name='ordDate']"), "12-01-2021");
		
	}

	@Then("I click order Product button")
	public void i_click_order_Product_button() {
		click(By.xpath("//button[text()='Order Product']"));
	}

	@Then("I will see {string} home Page")
	public void i_will_see_home_Page(String string) {
		String s=getText(By.xpath("//h1[@id='orderList-title']"));
		assertEquals("Order List",s);
	}

	@Then("I click confirm button")
	public void i_click_confirm_button() {
		click(By.xpath("//a[@href='orderSubmit.php?ordId=118&id=4']"));
	}

	@Then("refresh Url")
	public void refresh_Url() {
		browser.navigate().refresh();
		
	}

	@Then("I will see {string} status")
	public void i_will_see_status(String string) {
		String s=getText(By.xpath("//tbody/tr[15]/td[text()='Confirmed']"));
		System.out.println("complete "+ s);
		assertEquals("Confirmed",s);
	}
	
}
