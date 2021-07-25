@searchFeature
Feature: Bookstore application search functionality

	Background:
		* I hit the book store books application

	@search	
	Scenario Outline: Book Search
		When I enter the text in search box "<book>"
		Then I click on search button
		
		Examples:
			| book     |
			| Learning |
			| Pocket   |