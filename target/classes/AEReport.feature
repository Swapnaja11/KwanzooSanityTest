Feature: Account Engagement report
@aereport
Scenario: Account Engagement report
		Given I have logged in to kwanzoo for AER
	When I go to Report tab to create AER
	Then I genarate new Account Engagement report
		