Feature: login to Amazon application

Scenario: login with valid credential
Given I am on the home page
When I enter valid credential
	And I click on Login button
Then I should be able to login to Amazon
 
