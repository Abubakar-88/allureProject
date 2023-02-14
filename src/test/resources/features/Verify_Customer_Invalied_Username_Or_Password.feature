Feature: Invalied Login Functionality Verification

Scenario: Login as a Customer 
Given I am in Landing Home Page
When I Click on Loginn
Then I will be in Login Pagee
And Click Customer Login
Then I enter User Id "david@gmail.com"
And I enter Password "1245"
When I click Login Button
Then I will check "Invalid username or password!"