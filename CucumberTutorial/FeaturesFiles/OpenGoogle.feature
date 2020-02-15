Feature: This is to check google search
Scenario: Google search scenario
	Given user is entering google.co.in
	When user is typing the search term "Vedhagiri"
	And enters the return key
	Then the user should see the search results
	 