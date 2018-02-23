Feature: Program overview report
@poreport
Scenario: Program overview report
		Given I have logged in to kwanzoo for POR
	When I go to Report tab to create POR
	Then I genarate new program overview report
		