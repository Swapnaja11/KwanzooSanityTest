Feature: Creative comparison report
@ccreport
Scenario: Creative comparison report
		Given I have logged in to kwanzoo for CCR
	When I go to Report tab
	Then I genarate new report
		And I add email recipient 
		And I schedule report.
	