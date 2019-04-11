Feature: Free CRM new deal feature

Scenario: Free CRM Create a new Deal Test Scenario
Given User is already on Login Page
When Title of login page is Free CRM
Then User enters username and password
| username | password |
| komaljotkaur91 | Godblessme@123 |
Then User clicks on Login Button
Then User is on Home Page 
Then User moves to new deal page
Then User enters deals details
| Title | Company | Probability |
| komal | TD      | 100         |
| car   | honda   | 99          |
| home  | remax   | 98          |
Then Close the Browser