package step_definitions;

import static org.junit.Assert.assertEquals;


import org.openqa.selenium.By;

import base.Base;

import io.cucumber.java.en.Then;


public class Admin_Login_And_Alert_Massage_Handle extends Base {
	

	@Then("Click Admin Login")
	public void click_Admin_Login() {
	    click(By.xpath("//ul//li[4]"));
	}


	@Then("I will see Admin Home Page")
	public void i_will_see_Admin_Home_Page() {
		String s=getText(By.xpath("//h2[text()='Employee Leaderboard ']"));
		assertEquals("Employee Leaderboard",s); 
	}

	@Then("I click Customer button")
	public void i_click_Customer_button() {
		click(By.xpath("//ul//li[3]"));
	}

	@Then("I will see Registration Customer Info")
	public void i_will_see_Registration_Customer_Info() throws InterruptedException {
		Thread.sleep(3000);
		
		String s=getText(By.xpath("//h2[text()='Registration Customer Info']"));
		assertEquals("Registration Customer Info",s);
	}

	@Then("I enter first name")
	public void i_enter_first_name()  {
		
		sendkeys(By.name("firstName"),"joe");
		
	}

	@Then("I enter last name")
	public void i_enter_last_name()  {
	
		sendkeys(By.name("lastName"),"Baiden");
		
	}

	@Then("I enter email")
	public void i_enter_email()  {
	
		sendkeys(By.name("email"),"abc@gmail.com");
		
	}

	@Then("I enter birthdate")
	public void i_enter_birthdate() {
		sendkeys(By.name("birthday"),"28-01-2000");
		
		
	}

	@Then("I select gender")
	public void i_select_gender()  {
		click(By.xpath("//span[@class='select2-selection__arrow']"));
		
		
	}
	
	
	@Then("I enter gender")
	public void i_enter_gender()  {
		click(By.xpath("//ul[@class=\"select2-results__options\"]//li[3]")); 
		
	}

	@Then("I enter contact number")
	public void i_enter_contact_number()  {
		
		sendkeys(By.name("contact"),"01234567");
		
	    
	}

	@Then("I enter addresss")
	public void i_enter_addresss()  {
		sendkeys(By.name("address"),"bd");
		
	}





}
