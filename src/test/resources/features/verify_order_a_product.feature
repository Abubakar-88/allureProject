Feature: Verify order product Funcationalities

Scenario: Login as an Employee
Given I am in Landing Home Page
When I Click on Loginn
And Click Employee Login
Then I enter User Id "testpilot@gmail.com"
And I enter Password "1234"
When I click Login button
Then I will see Employee Home Page
When I click Product Order 
Then I select Camera
And I select date
And I click Order Product button
Then I will see Successfully Order