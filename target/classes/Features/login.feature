Feature: Free CRM login feature
#Scenario: Free CRM login Test Scenario

#Given User is already on Login Page
#When Title of login page is Free CRM
#Then User enters "komaljotkaur91" and "Godblessme@123"
#Then User clicks on Login Button
#Then User is on Home Page 

Scenario Outline: Free CRM Login Test Scenario
Given User is already on Login Page
When Title of login page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on Login Button
Then User is on Home Page 
Then Close the Browser

Examples:
	| username | password |
	| komaljotkaur91 | Godblessme@123 |