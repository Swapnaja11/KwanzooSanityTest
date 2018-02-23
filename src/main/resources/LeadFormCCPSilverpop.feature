Feature: Lead form with Silverpop
@leadformcreationsilverpop
Scenario: Create and load lead form with Silverpop
	Given I have logged in to kwanzoo for silverpop
	When I go to Template create Page for silverpop
	Then I create a Leadform for silverpop
		And I save Leadform Widget for silverpop
		And I go to Run Campaign Page and Activate the Leadform for silverpop