Feature: Verify_Employee_Functionalities
  

  Scenario: Login as an Employee
Given I am in Landing Home Page
When I Click on Loginn
Then I will be in Login Pagee
And Click Employee Login
Then I enter User Id "testpilot@gmail.com"
And I enter Password "1234"
When I click Login button
Then I will see Employee Home Page
Then I click Apply Leave button
Then I will see "Apply Leave Form" Page
Then I write The reason
Then I write Start Date
Then I write End Date
And I click Submit button
Then I will See Leave Satus