Feature: This is the login feature for Orange HRM
Scenario: This is login scenario
	Given user is on the login page
	When user is enters the valid credentials "Admin" and "admin123"
	And clicks the login button
	Then The user should see the home page
