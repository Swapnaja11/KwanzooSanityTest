Feature: Sales Insight report Program wise
@selectiveprogramsireport
Scenario: Sales Insight report with selective program
		  Given I have logged in to kwanzoo for selective program wise SIR 
		  When I go to Report tab to create selective program wise SIR 
	      Then I schedule new selective program wise Sales Insight report
		