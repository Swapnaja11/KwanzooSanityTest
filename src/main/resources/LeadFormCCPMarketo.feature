Feature: Lead form with Marketo

@leadformcreationmarketo
Scenario: Create and Load for with Marketo
	Given I have logged in to kwanzoo for marketo
	When I go to Template create Page for marketo
	Then I create a Leadform for marketo
		And I save Leadform Widget for marketo
		And I go to Run Campaign Page and Activate the Leadform for marketo
