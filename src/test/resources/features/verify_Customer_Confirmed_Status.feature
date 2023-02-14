Feature: Confirm Status Functionality Verification

Scenario: Login as a Customer 
Given I am in Landing Home Page
When I Click on Loginn
Then I will be in Login Pagee
And Click Customer Login
Then I enter User Id "david@gmail.com"
And I enter Password "1234"
When I click Login Button
Then I will see Customer Home Page
Then I will click Order Product
Then I select product
And I enter order date
Then I click order Product button
Then I will see "order list" home Page
Then I click confirm button
Then refresh Url
Then I will see "confirmed" status
