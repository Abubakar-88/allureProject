package step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;

import io.cucumber.java.en.Then;


public class Employee_Login_And_Update_Info extends Base {
	
	@Then("I click My Profile")
	public void i_click_My_Profile() {
		click(By.xpath("//ul[@id=\"navli\"]/li[2]"));
	}

	@Then("I click Update Info")
	public void i_click_Update_Info() throws InterruptedException {
		click(By.xpath("//button[text()='Update Info']"));
		Thread.sleep(3000);
	}

	@Then("I update Contact")
	public void i_update_Contact() throws InterruptedException {
		clear(By.name("contact"));
		Thread.sleep(2000);
		sendkeys(By.name("contact"),"333333");
		Thread.sleep(3000);
	}


	@Then("I click refresh url")
	public void i_click_refresh_url() throws InterruptedException {
		browser.navigate().refresh();
		Thread.sleep(3000);
	}
	
	@Then("I will see sucessfully update")
	public void i_will_see_sucessfully_update() throws InterruptedException {
		Thread.sleep(2000);
		String s= getAttributeValue(By.xpath("//input[@name='contact']"), "value" );
	    assertEquals("333333",s); 
	}

	
}
