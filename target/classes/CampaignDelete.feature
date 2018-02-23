Feature: Creative comparison report
@deletecampaign
Scenario: delete created campaign
	Given I have logged in to kwanzoo for campaign deletion
	When I go to my-campaigns page
	Then I  deactivate campaign
	And I  delete campaign.
	