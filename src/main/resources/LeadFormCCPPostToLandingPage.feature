Feature: Lead form with Post to Landing Page 

@leadformcreationposttolandingpage
Scenario: Create and load lead form with Post to Landing Page
	Given I have logged in to kwanzoo for Post to Landing Page
	When I go to Template create Page for Post to Landing Page
	Then I create a Leadform for Post to Landing Page
		And I save Leadform Widget for Post to Landing Page
		And I go to Run Campaign Page and Activate the Leadform for Post to Landing Page
