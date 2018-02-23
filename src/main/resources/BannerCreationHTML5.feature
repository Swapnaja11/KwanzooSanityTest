@tag
Feature: Create and Load HTML5 Banner 
@BannerCreationWithHTML5
Scenario: Create a new HTML5 Banner and Load it.
Given I have to login to Kwanzoo site for HTML banner
When I go to My campaign page for Smart banner selection
	And Select Smart banner option and customize campaign
Then I create new HTML banner 
	And I save HTML Banner Widget
	And I go to Run Campaign Page and Activate the HTML Banner