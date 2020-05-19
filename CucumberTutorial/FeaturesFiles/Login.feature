@SimpleLogin@DataDriven
Feature: Valid Login
@Positive
Scenario: Positive scenario
	Given user is on login page
	When user is enters the valid username and password
	And clicks on the login button
	Then The user should be navigate to home page

@Negative
Scenario: Negative scenario
	Given user is on login page
	When user is enters the valid username and password
	And clicks on the login button
	Then The user should be navigate to home page
