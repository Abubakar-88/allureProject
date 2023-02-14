Feature: Verify Logout Functionalities

Scenario: Login as an Employee
Given I am in Landing Home Page
When I Click on Loginn
Then I will be in Login Pagee
Then I enter User Id "testpilot@gmail.com"
And I enter Password "1234"
When I click Login button
Then I See Employee Homepage
Then I Click Logout buttonn
Then I See Employee Login Page
