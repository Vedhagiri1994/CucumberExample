@DataDriven
Feature: This is the login feature for Orange HRM
Scenario: This is login scenario
	Given Go to login page
	When Enter the below credentials
	|userName	|passWord| 
	|Admin 		|admin123|
	And click login button