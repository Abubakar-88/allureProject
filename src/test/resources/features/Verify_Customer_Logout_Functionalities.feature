Feature: Verify_Customer_Logout_Functionalities 



Scenario: Login as an Customer
Given I am in Landing Home Page
When I Click on Loginn
Then I will be in Login Pagee
And Click Customer Loginn
Then I enter User Id "david@gmail.com"
And I enter Password "1234"
When I click Custoemr Login button
Then I See Customer Homepagee
Then I Click Logout buttonn
Then I See Customer Login Pagee
