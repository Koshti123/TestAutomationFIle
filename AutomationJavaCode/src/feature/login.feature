@Regression
Feature: Login Page Feture
	I want to use this template for my loginPage feature file
  
	Background: Pre Condition
		Given I am the user of an application

	@test-1
	Scenario: To validate valid login scenario
		When User enter valid username 
		And User enter valid password 
		And User click on login button
		Then User should be able to login successfully

	@test-2
	Scenario: To validate invalid login scenario
		When User enter invalid username 
		And User enter invalid password 
		And User click on login button
		Then User should not be able to login successfully