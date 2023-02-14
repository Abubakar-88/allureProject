Feature: Verify Admin login and alert massage Handle

Scenario: Alert Massage Handle
Given I am in Landing Home Page
When I Click on Loginn
Then I will be in Login Pagee
And Click Admin Login
Then I enter User Id "admin@gmail.com"
And I enter Password "admin"
When I click Login button
Then I will see Admin Home Page
Then I click Customer button
Then I will see Registration Customer Info
Then I enter first name
And I enter last name
And I enter email
And I enter birthdate
And I select gender
And I enter gender
And I enter contact number
And I enter addresss
Then I click submit button

