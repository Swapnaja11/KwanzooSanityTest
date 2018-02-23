Feature: Sales Insight report
@sireport
Scenario: Sales Insight report
		Given I have logged in to kwanzoo for SIR
	When I go to Report tab to create SIR
	Then I genarate new Sales Insight report
		