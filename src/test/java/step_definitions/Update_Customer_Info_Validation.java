package step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;

import io.cucumber.java.en.Then;


public class Update_Customer_Info_Validation extends  Base {
	
	@Then("Click CustomerLogin")
	public void click_CustomerLogin() {
	    click(By.xpath("//ul/li[2]"));
	}


	@Then("I will click My Profile")
	public void i_will_click_My_Profile() {
	   click(By.xpath("//a[text()='My Profile']"));
	 //div/h2
	}

	@Then("I will click update info")
	public void i_will_click_update_info() {
	 click(By.xpath("//button[@name='send']"));   
	}

	@Then("I see {string} page")
	public void i_see_page(String string) {
	    String s=getText(By.xpath("//div/h2"));
	    assertEquals("Update Customer Info",s);
	}

	@Then("I update contact")
	public void i_update_contact() {
	    clear(By.xpath("//input[@name=\"contact\"]"));
	    sendkeys(By.xpath("//input[@name=\"contact\"]"),"2555566");
	}

	@Then("I update address")
	public void i_update_address() {
	   clear(By.xpath("//input[@name=\"address\"]"));
	   sendkeys(By.xpath("//input[@name=\"address\"]"),"USA");
	}
	

	@Then("I will click refresh url")
	public void i_will_click_refresh_url() {
	    browser.navigate().refresh();
	}

	@Then("I will see updated contact")
	public void i_will_see_updated_contact() {
		getAttributeValue(By.xpath("//input[@name='contact']"),"2555566");
	    //String s=getText(By.xpath("//input[@name=\"contact\"]"));
	   // System.out.println("+++++++++++++"+s);
	    //assertEquals("2555566",s);
	}

	@Then("I will see updated address")
	public void i_will_see_updated_address() {
		/*
		 * String s=getText(By.xpath("//input[@value=\\\"USA\\\"]"));
		 * System.out.println("+++++++++++++"+s); assertEquals("USA",s);
		 */
		getAttributeValue(By.xpath("//input[@name='address']"),"USA");
	}


}
