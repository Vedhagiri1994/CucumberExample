@DataDriven
Feature: This is the login feature for Orange HRM
Scenario Outline: This is login scenario
	Given Procced to login page
	When User enter "<userName>" and passWord "<passWord>"
	And clicked button
	
	Examples:
	|userName	|passWord|  
	|Admin 		|admin123|
	|Admin 		|admin13|