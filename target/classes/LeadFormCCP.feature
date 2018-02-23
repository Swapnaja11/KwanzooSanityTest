Feature: Lead form creation 
@LeadFormCCP
Scenario: Creat and Load LeadformCCP
Given I have to login to Kwanzoo
When I create new campaign
	And Select smart lead form option and Click on customize campaign
Then I create new lead form 
	And I save lead form settings
	And I go to Run Campaign Page and Activate the Campaign
	And I load campaign. 
