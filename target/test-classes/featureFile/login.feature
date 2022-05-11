@Login 
Feature: To validate Login functionality of the Facebook Application

Background:
Given User is in Facebook login page

@Smoke @Sanity
  Scenario: To validate Login page using invalid username and valid password
    
    When User have to enter invalid username and valid password
    |email|Selenium123@gamil.com|
    |username|Aarif|
    |password|Aarif7500|
    
    And User click the login button
    Then User should be in invalid credential page
    
    @Smoke @Regression
    Scenario: To validate Login page using invalid username and invalid password
    
    When User have to enter invalid username and invalid password
    
    |username|email|password|
    |Aarif|hard.aarif14@gmail.com|Lovely|
    |Noori|nooori@gmail.com|Noori|
    |Afrred|Afreed@gamil.com|Afreed|
    
    And User click the login button
    Then User should be in invalid credential page

    