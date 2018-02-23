Feature: Lead form with Eloqua 

@leadformcreationeloqua
Scenario: Create and load lead form with Eloqua
	Given I have logged in to kwanzoo for eloqua
	When I go to Template create Page for eloqua
	Then I create a Leadform for eloqua
		And I save Leadform Widget for eloqua
		And I go to Run Campaign Page and Activate the Leadform for eloqua
