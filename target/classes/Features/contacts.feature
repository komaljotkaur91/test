Feature: Free CRM Add Contacts feature

Scenario Outline: Free CRM Add New Contact Information Test Scenario
Given User is already on Login Page
When Title of login page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on Login Button
Then User is on Home Page 
Then User click on New Contacts
Then User adds information "<firstName>", "<lastName>" and "<company>"
Then Close the Browser

Examples:
	| username | password | firstName | lastName | company |
	| komaljotkaur91 | Godblessme@123 | inder | Benipal | BenipalCorp |
	| komaljotkaur91 | Godblessme@123 | Jazz | Singh | abc | 