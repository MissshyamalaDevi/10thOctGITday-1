
Feature: To validate the login functionality of facebook

Background:
Given User need to enter invalid username and password using chrome browser

@Login @Smoke
Scenario: To validate the login by email and password
When User need to enter invalid username and password 
And Need to click login button
Then Wrong credential page need to be shown

@Smoke @Regression
Scenario: To validate the login by email and password 
When User need to enter valid username and invalid password 
And Need to click login button
Then Wrong credential page need to be shown

