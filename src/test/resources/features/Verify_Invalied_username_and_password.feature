Feature: Employee Login Confirmation Functionalities

Scenario: Login as an Employee
Given I am in Landing Home Page
When I Click on Loginn
Then I will be in Login Pagee
And Click Employee Login
Then I enter User Id "testpilot@gmail.com"
And I enter Password "1245"
When I click Login button
Then I will check "Invalid username or password!"
