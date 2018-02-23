@tag
Feature: Create and Load Banner
@BannerCreation
Scenario: Create a new Banner and Load it.
Given I have to login to Kwanzoo site
When I go to My campaign page
	And Select Smart banner option and Click on customize campaign
Then I create new banner 
	And I save Banner Widget
	And I go to Run Campaign Page and Activate the Banner
