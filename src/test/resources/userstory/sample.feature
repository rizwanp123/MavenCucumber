@All
Feature: Bookstore application login functionality

	Background:
		* I hit the book store application

	# This is a comment line
	# but *

  @login
	Scenario: Login functionality
		When I enter the username
		And I enter the password
		And I click on login button
		
	@delete	
	Scenario Outline: Book Search
		When I delete the textbox text
		Then I click on delete button
		
		Examples:
			| book     |
			| Learning |
			| Pocket   |
			
	@someTag1	 	
	Scenario Outline: Book Search
		When I enter the text in search box "<book>"
		Then I click on search button
		
		Examples:
			| book     |
			| Learning |
			| Pocket   |
			
	@someTag2		
	Scenario Outline: Book Search
		When I enter the text in search box "<book>"
		Then I click on search button
		
		Examples:
			| book     |
			| Learning |
			| Pocket   |