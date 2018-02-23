Feature: Lead form with Email cofiguration

@leadformcreationemail
Scenario: Create and load lead form with Email
	Given I have logged in to kwanzoo for email
	When I go to Template create Page for email
	Then I create a Leadform for email
		And I save Leadform Widget for email
